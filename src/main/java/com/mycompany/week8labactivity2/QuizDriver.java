package com.mycompany.week8labactivity2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sound Room
 */
public class QuizDriver {

    //this one runs title screen and passes in the QUESTION OBJECT ARRAY
    //title screen runs the main gui and passses in the same QUESTION OBJECT ARRAY
    public static void main(String[] args) throws FileNotFoundException {

        //read in the questions and add their text to an arraylist
        ArrayList<String> questionLines = new ArrayList<String>();

        //reading in the questions
        try {

            File myFile = new File("quiz_single_line.txt");
            Scanner scanner = new Scanner(myFile);

            while (scanner.hasNextLine()) {

                String questionText = scanner.nextLine();
                questionLines.add(questionText);

            }

        } catch (FileNotFoundException e) {
            
            System.out.println("ERROR - FILE NOT FOUND");
        }

        //loop through lines and split them individually, and create a question object and add it to this array
        ArrayList<Question> Questions = new ArrayList<Question>();

        //a counter var to keep track to add to the quiz object
        int counter = 1;
        
        //looping through the lines and making them their own question objects
        for (String q : questionLines) {

            ArrayList<String> componentsList = new ArrayList<>(Arrays.asList(q.split(", ")));

            String questionText = componentsList.get(0);
            String option1 = componentsList.get(1);
            String option2 = componentsList.get(2);
            String option3 = componentsList.get(3);
            String option4 = componentsList.get(4);
            String correctAnswer = componentsList.get(5);

            Question question = new Question(questionText, option1, option2, option3, option4, correctAnswer, counter, false, 0);

            Questions.add(question);

            counter += 1;
        }

        //shuffle the questions array
        Collections.shuffle(Questions);
        
        //run title screen and pass in questions, and from there run gui app and pass in questions
        TitleScreenGUI titleScreenRun = new TitleScreenGUI(Questions);        
        
    }

}
