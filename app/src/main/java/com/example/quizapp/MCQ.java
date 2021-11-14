package com.example.quizapp;

import java.text.CollationElementIterator;

public class MCQ {

    public String question[] = {
      "أ ة ",
      "ع ح",
            "غ خ",
            "ق",
            "ك ",
            "ج ش ى",
            "ض",
            "ل  ",
            "ن ",
            "ر ",
            "ط د ت ",
            "ظ  ذ  ث ",
            "ص ز س",
            "م ن ",
            "ف",
            "ب",
            "م",
            "و ",
            "باَ بوُ بىِ"

    };
    private String options[][]={
            {"Sound produced from the End of Throat",
                    "Sound produced from the Middle of Throat",
                    "Sound produced from the Start of Throat",
                    "Base of Tongue which is near Uvula touching the mouth roof"
            },
            {"Sound produced from the Middle of Throat",
                    "Sound produced from the Start of Throat",
                    "Base of Tongue which is near Uvula touching the mouth roof",
                    "Portion of Tongue near its base touching the roof of mouth"
            },
            {
                    "Sound produced from the Start of Throat",
                    "Base of Tongue which is near Uvula touching the mouth roof",
                    "Portion of Tongue near its base touching the roof of mouth",
                    "Tongue touching the center of the mouth roof"
            },
            {
                    "Base of Tongue which is near Uvula touching the mouth roof",
                    "Portion of Tongue near its base touching the roof of mouth",
                    "Tongue touching the center of the mouth roof",
                    "One side of the tongue touching the molar teeth"
            },
            {
                    "Portion of Tongue near its base touching the roof of mouth",
                    "Tongue touching the center of the mouth roof",
                    "One side of the tongue touching the molar teeth",
                    "Rounded tip of the tongue touching the base of the frontal 8 teeth"
            },
            {
                    "Tongue touching the center of the mouth roof",
                    "One side of the tongue touching the molar teeth",
                    "Rounded tip of the tongue touching the base of the frontal 8 teeth",
                    "Rounded tip of the tongue touching the base of the frontal 6 teeth"
            },
            {
                    "One side of the tongue touching the molar teeth",
                    "Rounded tip of the tongue touching the base of the frontal 8 teeth",
                    "Rounded tip of the tongue touching the base of the frontal 6 teeth",
                    "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth"
            },
            {
                    "Rounded tip of the tongue touching the base of the frontal 6 teeth",
                    "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth",
                    "Tip of the tongue touching the base of the front 2 teeth",
                    "Tip of the tongue touching the tip of the frontal 2 teeth"
            },
            {
                    "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth",
                    "Tip of the tongue touching the base of the front 2 teeth",
                    "Tip of the tongue touching the tip of the frontal 2 teeth",
                    "Tip of the tongue comes between the front top and bottom teeth"
            },
            {
                    "Tip of the tongue touching the base of the front 2 teeth",
                    "Tip of the tongue touching the tip of the frontal 2 teeth",
                    "Tip of the tongue comes between the front top and bottom teeth",
                    "While pronouncing the ending sound of  م  or ن , bring the vibration to the nose"
            },
            {
                "Tip of the tongue touching the tip of the frontal 2 teeth",
                    "Tip of the tongue comes between the front top and bottom teeth",
                    "While pronouncing the ending sound of  م  or ن , bring the vibration to the nose",
                    "Tip of the two upper jaw teeth touches the inner part of the lower lip"
            },
            {
                    "Tip of the tongue comes between the front top and bottom teeth",
                    "While pronouncing the ending sound of  م  or ن , bring the vibration to the nose",
                    "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                    "Inner part of the both lips touch each other"
            },
            {
                    "While pronouncing the ending sound of  م  or ن , bring the vibration to the nose",
                    "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                    "Inner part of the both lips touch each other",
                    "Outer part of both lips touch each other"
            },
            {
                    "Tip of the two upper jaw teeth touches the inner part of the lower lip",
                    "Inner part of the both lips touch each other",
                    "Outer part of both lips touch each other",
                    "Outer part of both lips touch each other"
            },
            {
                    "Inner part of the both lips touch each other",
                    "Outer part of both lips touch each other",
                    "Rounding both lips and not closing the mouth",
                    "Mouth empty space while speaking words",
            },
            {
                    "Inner part of the both lips touch each other",
                    "Outer part of both lips touch each other",
                    "Rounding both lips and not closing the mouth",
                    "Mouth empty space while speaking words",
            },
            {
                    "Inner part of the both lips touch each other",
                    "Outer part of both lips touch each other",
                    "Rounding both lips and not closing the mouth",
                    "Mouth empty space while speaking words",
            },
            {
                    "Inner part of the both lips touch each other",
                    "Outer part of both lips touch each other",
                    "Rounding both lips and not closing the mouth",
                    "Mouth empty space while speaking words",
            },
            {
                    "Inner part of the both lips touch each other",
                    "Outer part of both lips touch each other",
                    "Rounding both lips and not closing the mouth",
                    "Mouth empty space while speaking words",
            }

    };
    private String answers[]={
      "Sound produced from the End of Throat",
      "Sound produced from the Middle of Throat",
            "Sound produced from the Start of Throat",
            "Base of Tongue which is near Uvula touching the mouth roof",
            "Portion of Tongue near its base touching the roof of mouth",
            "Tongue touching the center of the mouth roof",
            "One side of the tongue touching the molar teeth",
                    "Rounded tip of the tongue touching the base of the frontal 8 teeth",
            "Rounded tip of the tongue touching the base of the frontal 6 teeth",
            "Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth",
            "Tip of the tongue touching the base of the front 2 teeth",
            "Tip of the tongue touching the tip of the frontal 2 teeth",
            "Tip of the tongue comes between the front top and bottom teeth",
            "While pronouncing the ending sound of  م  or ن , bring the vibration to the nose",
            "Tip of the two upper jaw teeth touches the inner part of the lower lip",
            "Inner part of the both lips touch each other",
            "Outer part of both lips touch each other",
            "Rounding both lips and not closing the mouth",
            "Mouth empty space while speaking words",

    };

    public String getQuestion(int a) {
        String q = question[a];
        return q;
    }

    public String getOption1(int a) {
        String c = options[a][0];
        return c;
    }
    public String getOption2(int a) {
        String c = options[a][1];
        return c;
    }
    public String getOption3(int a) {
        String c = options[a][2];
        return c;
    }
    public String getOption4(int a) {
        String c = options[a][3];
        return c;
    }

    public String getAnswers(int a) {
        String ans = answers[a];
        return ans;
    }

}
