package org.game.countries;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    Button[] buttons = new Button[4];

    Drawable redButton;
    Drawable greenButton;
    Drawable roundedButton;

    //sounds
    static MediaPlayer soundCorrect;
    static MediaPlayer soundWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buttons[0] = findViewById(R.id.choice1);
        buttons[1] = findViewById(R.id.choice2);
        buttons[2] = findViewById(R.id.choice3);
        buttons[3] = findViewById(R.id.choice4);

        redButton = getBaseContext().getResources().getDrawable(R.drawable.redbutton, getTheme());
        greenButton = getBaseContext().getResources().getDrawable(R.drawable.greenbutton, getTheme());
        roundedButton = getBaseContext().getResources().getDrawable(R.drawable.roundedbutton, getTheme());


        soundCorrect = MediaPlayer.create(getBaseContext(), R.raw.correct);
        soundWrong = MediaPlayer.create(getBaseContext(), R.raw.wrong);
        updateUI();
    }

    void updateUI() {
        getSupportActionBar().setTitle(Game.title);
        TextView quizzQuestion = findViewById(R.id.quizzQuestion);
        ImageView imageView = findViewById(R.id.quizzImage);

        quizzQuestion.setText(Game.question);
        int resId;
        switch (Game.questionType) {
            case FLAG:
                resId = DB.getResourceByName(getBaseContext(), Game.questionImage);
                imageView.setImageResource(resId);
                imageView.clearColorFilter();
                break;
            case CAPITAL:
            case COUNTRY:
                imageView.setColorFilter(getBaseContext().getResources().getColor(R.color.light_gray, getTheme()));
                break;
            case MAP:
                resId = DB.getResourceByName(getBaseContext(), Game.questionImage);
                imageView.setImageResource(resId);
                imageView.clearColorFilter();
                break;
        }

        for (int i=0;i<4;i++){
            buttons[i].setText(Game.options[i]);
            buttons[i].setBackground(roundedButton);
        }

        if(Game.answered){
            if(Game.selectedAnswer == Game.correctAnswer){
                //guess right
                buttons[Game.correctAnswer].setBackground(greenButton);
                soundCorrect.start();
            }else{
                //guess wrong
                buttons[Game.correctAnswer].setBackground(greenButton);
                buttons[Game.selectedAnswer].setBackground(redButton);
                soundWrong.start();
            }
        }
    }

    void select(int choice) {
        if(Game.isEnded(getBaseContext())){
            finish();
            return;
        }
        if (Game.answered) {
            // new question
            Game.generateQuestion();
            updateUI();
        } else {
            // check
            Game.generateAnswer(choice);
            updateUI();
        }
    }

    public void choice1(View view) {
        select(0);
    }

    public void choice2(View view) {
        select(1);
    }

    public void choice3(View view) {
        select(2);
    }

    public void choice4(View view) {
        select(3);
    }
}