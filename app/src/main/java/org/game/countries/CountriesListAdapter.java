package org.game.countries;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.ArrayList;

public class CountriesListAdapter extends ArrayAdapter<String[]> implements SectionIndexer {
    private Context context;
    private int resource;
    private Integer[] sectionPositions;
    private String[] sections;

    public CountriesListAdapter(@NonNull Context context, int resource, @NonNull String[][] data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;

        ArrayList<String> alphaArray = new ArrayList<>();
        ArrayList<Integer> indexArray = new ArrayList<>();

        char lastChar = 0;
        for (int i = 0; i < data.length; i++) {
            char c = data[i][0].charAt(0);
            if (c != lastChar) {
                alphaArray.add(String.valueOf(c));
                indexArray.add(i);
                lastChar = c;
            }
        }
        sections = alphaArray.toArray(new String[alphaArray.size()]);
        sectionPositions = indexArray.toArray(new Integer[indexArray.size()]);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource, parent, false);
        {
            TextView text = convertView.findViewById(R.id.countryListRawName);
            text.setText(getItem(position)[0]);
        }
        {
            TextView text = convertView.findViewById(R.id.countryListRawText);
            text.setText(getItem(position)[1]);
        }
        {
            ImageView image = convertView.findViewById(R.id.countryListRawImage);
            int resId = 0;
            try {
                resId = DB.getFlag(context, getItem(position)[0]);
                //resId = DB.getResourceByName(context, "quiz_flag_"+getItem(position)[2]);
                //resId = DB.getResourceByName(context, "quiz_location_"+getItem(position)[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            image.setImageResource(resId);
        }
        return convertView;
    }


    public int getPositionForSection(int section) {
        return sectionPositions[section];
    }

    public int getSectionForPosition(int position) {

        for (int i = sectionPositions.length - 1; i >= 0; i--) {
            if (position >= sectionPositions[i]) {
                return i;
            }
        }
        return 0;
    }

    public Object[] getSections() {
        return sections;
    }
}
