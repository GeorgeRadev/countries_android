package org.game.countries;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setScore();
    }

    public void setScore(){
        int[] stats = Game.getStatistics(getBaseContext());
        {
            TextView best = findViewById(R.id.bestScore);
            best.setText(String.format("%d of %d (%d%%)", stats[1], Game.MAX_QUESTIONS, ((stats[1] * 100) / Game.MAX_QUESTIONS)));
        }
        {
            TextView best = findViewById(R.id.lastScore);
            best.setText(String.format("%d of %d (%d%%)", stats[0], Game.MAX_QUESTIONS, ((stats[0] * 100) / Game.MAX_QUESTIONS)));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        setScore();
    }

    public void openWorldMap(View view){
        Intent intent = new Intent(this, WorldMap.class);
        startActivity(intent);
    }

    public void openCountriesList(View view) {
        Intent intent = new Intent(this, CountriesList.class);
        startActivity(intent);
    }

    public void startQuizz(View view) {
        Game.newQuiz();
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}