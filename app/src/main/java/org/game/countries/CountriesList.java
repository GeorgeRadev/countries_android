package org.game.countries;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class CountriesList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_list);
        getSupportActionBar().setTitle("Countries List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.listCountries);
        CountriesListAdapter adapter = new CountriesListAdapter(this, R.layout.countries_list_row, DB.dbStrings);
        listView.setAdapter(adapter);
    }
}