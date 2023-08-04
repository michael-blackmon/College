/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 5
DUE 8/3/23
SUBMITTED 8/3/23
 */
package util;

import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Util{
    private String fname;

    public Util(String filename){
        this.fname = filename;
    }

    public Student[] readFile(){
        // This instance method reads the file and builds the student array.
        // Open the file using FileReader Object.
        // In a loop read a line using readLine method.
        // Tokenize each line using StringTokenizer Object.
        // Each token is converted from String to Integer using parseInt method.
        // Values are then saved in the right property of the Student Object.
        Student[] students = new Student[40];

        try(FileReader file = new FileReader(fname);
             BufferedReader buff = new BufferedReader(file)){

            // Read and skip the header line
            buff.readLine();

            String line;
            int index = 0;
            while((line = buff.readLine()) != null && index < 40){
                StringTokenizer st = new StringTokenizer(line);
                Student student = new Student();
                student.setSID(Integer.parseInt(st.nextToken()));
                int[] scores = new int[5];
                for(int i = 0; i < 5; i++){
                    scores[i] = Integer.parseInt(st.nextToken());
                }
                student.setScores(scores);
                students[index++] = student;
            }
        } catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
        return students;
    }
}
