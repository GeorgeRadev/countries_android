package org.game.countries;

import android.content.Context;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Game {
    static final int MAX_QUESTIONS = 100;
    static final int OPTIONS_COUNT = 4;

    private static boolean hasEnded() {
        return answered && (currentIndex >= MAX_QUESTIONS - 1);
    }

    public static boolean isEnded(Context context) {
        boolean result = hasEnded();
        if (result) {
            updateStatistics(context);
        }
        return result;
    }

    public static enum QuizType {FLAG, CAPITAL, COUNTRY, MAP}

    static int success;
    static int currentIndex;
    static int correctAnswer;
    static int selectedAnswer;
    static int[] questionIndexes;
    static boolean answered;
    static QuizType questionType;
    static String title;
    static String question;
    static String questionImage;
    static String[] options = new String[OPTIONS_COUNT];

    static String[] questionTypePrefix = new String[]{
            "Which country does this flag belongs to?",
            "Which is the capital of ",
            "is the capital of which country?",
            "Which country is this?"};

    static void newQuiz() {
        success = 0;
        currentIndex = -1;
        correctAnswer = 0;
        answered = false;
        questionType = QuizType.FLAG;

        // create permutations
        final int len = DB.dbStrings.length;
        int[] permutations = new int[len];
        for (int i = 0; i < len; i++) {
            permutations[i] = i;
        }
        for (int i = 0; i < 999; i++) {
            int ix1 = (int) (Math.random() * len);
            int ix2 = (int) (Math.random() * len);
            int t = permutations[ix1];
            permutations[ix1] = permutations[ix2];
            permutations[ix2] = t;
        }
        questionIndexes = permutations;
        updateTitle();
        generateQuestion();
    }


    static void updateTitle() {
        title = String.format("Quizz %d(%d) of %d", currentIndex + 1, success, MAX_QUESTIONS);
    }

    static void generateQuestion() {
        if (hasEnded()) {
            return;
        }
        currentIndex++;
        {
            int type = (int) (Math.random() * QuizType.values().length);
            if (type == 0) {
                questionType = QuizType.FLAG;
            } else if (type == 1) {
                questionType = QuizType.CAPITAL;
            } else if (type == 2) {
                questionType = QuizType.COUNTRY;
            } else {
                questionType = QuizType.MAP;
            }
        }

        int resId;
        switch (questionType) {
            case FLAG:
                question = questionTypePrefix[0];
                questionImage = "quiz_flag_" + DB.dbStrings[questionIndexes[currentIndex]][2];
                break;
            case CAPITAL:
                question = questionTypePrefix[1] + "\n" + DB.dbStrings[questionIndexes[currentIndex]][0] + " ?";
                questionImage = null;
                break;
            case COUNTRY:
                question = DB.dbStrings[questionIndexes[currentIndex]][1] + "\n" + questionTypePrefix[2];
                questionImage = null;
                break;
            case MAP:
                question = questionTypePrefix[3];
                questionImage = "quiz_location_" + DB.dbStrings[questionIndexes[currentIndex]][0];
                break;
        }

        // generate answers
        correctAnswer = (int) (Math.random() * OPTIONS_COUNT);
        int[] selection = new int[OPTIONS_COUNT];
        for (int i = 1; i < OPTIONS_COUNT; i++) {
            selection[i] = -1;
        }
        selection[0] = currentIndex;
        fillRandomSelection(selection);
        for (int i = 0; i < OPTIONS_COUNT; i++) {
            switch (questionType) {
                case CAPITAL:
                    options[(i + correctAnswer) % OPTIONS_COUNT] = DB.dbStrings[questionIndexes[selection[i]]][1];
                    break;
                default:
                    options[(i + correctAnswer) % OPTIONS_COUNT] = DB.dbStrings[questionIndexes[selection[i]]][0];
                    break;
            }
        }

        updateTitle();
        answered = false;
    }

    static void fillRandomSelection(int[] options) {
        int ix = 0;
        while (ix < options.length) {
            if (options[ix] != -1) {
                ix++;
                continue;
            }
            int r = (int) (Math.random() * questionIndexes.length);
            int i = ix - 1;
            for (; i >= 0; i--) {
                if (r == options[i]) {
                    break;
                }
            }
            if (i == -1) {
                options[ix] = r;
                ix++;
            }
        }
    }

    static void generateAnswer(int choice) {
        selectedAnswer = choice;
        if (choice == correctAnswer) {
            success++;
        }

        updateTitle();
        answered = true;
    }


    static final String filename = "statistics.bin";

    // current,  max
    public static int[] getStatistics(Context context) {
        int[] result = new int[]{0, 0};
        FileInputStream fis = null;
        try {
            fis = context.openFileInput(filename);
            DataInputStream scanner = new DataInputStream(fis);
            result[0] = scanner.readInt();
            result[1] = scanner.readInt();
        } catch (Exception e) {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException i) {
                    i.printStackTrace();
                }
            }
            e.printStackTrace();
        }
        return result;

    }

    private static void updateStatistics(Context context) {
        int[] stats = getStatistics(context);
        stats[0] = success;
        if (stats[1] < success) {
            stats[1] = success;
        }
        FileOutputStream fos = null;
        try {
            fos = context.openFileOutput(filename, Context.MODE_PRIVATE);
            DataOutputStream writer = new DataOutputStream(fos);
            writer.writeInt(stats[0]);
            writer.writeInt(stats[1]);
        } catch (Exception e) {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException i) {
                    i.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }
}
