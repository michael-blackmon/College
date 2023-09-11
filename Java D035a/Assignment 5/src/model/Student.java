/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 5
DUE 8/3/23
SUBMITTED 8/3/23
 */
package model;

public class Student{
    //define attributes
    private int SID;
    private int[] scores = new int[5];

    public Student(){
        //default constructor
    }

    //getters and setters
    public int getSID(){
        return SID;
    }

    public void setSID(int SID){
        this.SID = SID;
    }

    public int[] getScores(){
        return scores;
    }

    public void setScores(int[] scores){
        this.scores = scores;
    }
}

