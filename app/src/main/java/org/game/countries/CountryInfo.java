package org.game.countries;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountryInfo extends AppCompatActivity {
    // index into DB.dbStrings
    static final String EXTRA_COUNTRY_INDEX = "countryIndex";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int index = getIntent().getIntExtra(EXTRA_COUNTRY_INDEX, -1);
        if (index < 0 || index >= DB.dbStrings.length) {
            finish();
            return;
        }
        String[] country = DB.dbStrings[index];
        getSupportActionBar().setTitle(country[0]);

        TextView name = findViewById(R.id.countryInfoName);
        name.setText(country[0]);
        TextView capital = findViewById(R.id.countryInfoCapital);
        capital.setText(country[1]);

        setImage(R.id.countryInfoFlag, DB.QUIZ_FLAG_PREFIX + country[2]);
        setImage(R.id.countryInfoMap, DB.QUIZ_LOCATION_PREFIX + country[2]);
    }

    private void setImage(int viewId, String drawableName) {
        ImageView image = findViewById(viewId);
        int resId = DB.getResourceByName(getBaseContext(), drawableName);
        if (resId == 0) {
            // not every country has every image (see DBImagesTest.KNOWN_MISSING)
            image.setVisibility(View.INVISIBLE);
        } else {
            image.setImageResource(resId);
        }
    }

    public void ok(View view) {
        finish();
    }
}
