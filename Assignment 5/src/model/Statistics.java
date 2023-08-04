/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 5
DUE 8/3/23
SUBMITTED 8/3/23
 */
package model;

public class Statistics{
    private int[] lowScores = new int[5];
    private int[] highScores = new int[5];
    private float[] avgScores = new float[5];

    //methods to find low, avg, high scores from file and store them in arrays
    public void findLow(Student[] students){
        //find the lowest score and store it in an array named lowScores.
        for(int i = 0; i < 5; i++) {
            int minScore = students[0].getScores()[i];
            for(int j = 1; j < students.length; j++){
                int currentScore = students[j].getScores()[i];
                if(currentScore < minScore){
                    minScore = currentScore;
                }
            }
            lowScores[i] = minScore;
        }
    }

    public void findHigh(Student[] students) {
        //find the highest score and store it in an array named highScores.
        for(int i = 0; i < 5; i++) {
            int maxScore = students[0].getScores()[i];
            for(int j = 1; j < students.length; j++) {
                int currentScore = students[j].getScores()[i];
                if(currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }
            highScores[i] = maxScore;
        }
    }

    public void findAvg(Student[] students){
        //find the average score for each quiz and store it in an array named avgScores.
        for(int i = 0; i < 5; i++){
            int totalScore = 0;
            for(int j = 0; j < students.length; j++){
                totalScore += students[j].getScores()[i];
            }
            avgScores[i] = (float) totalScore / students.length;
        }
    }

    // Add methods to print values of instance variables if needed.

    public void print(Student[] students, int option){
        // 0 - prints student data, 1 - print low scores, 2 - print high scores, 3 - print avg, 4 - print all (including student data and statistics)
        // Implement this method based on the option provided.
        //Using switch method for each case
        switch(option){
            case 0:
                System.out.printf("%s\n","Stud Qu1 Qu2 Qu3 Qu4 Qu5");
                for(Student student : students){
                    System.out.printf("%d%s",student.getSID()," ");
                    int[] scores = student.getScores();
                    for (int score : scores){
                        System.out.printf("%d%s",score, " ");
                    }
                    System.out.println();
                }
                break;
            case 1: //low scores only
                System.out.printf("%s","Low Score ");
                for(int lowScore : lowScores){
                    System.out.printf("%d%s",lowScore," ");
                }
                System.out.println();
                break;
            case 2: //high scores only
                System.out.printf("%s","High Score ");
                for(int highScore : highScores){
                    System.out.printf("%d%s",highScore," ");
                }
                System.out.println();
                break;
            case 3: //avg scores only
                System.out.printf("%s","Average ");
                for(float avgScore : avgScores){
                    System.out.printf("%.2f%s",avgScore," "); //setprecision to 2
                }
                System.out.println();
                break;
            case 4: //all info by calling the print method again and using cases 0-3
                print(students, 0);
                print(students, 1);
                print(students, 2);
                print(students, 3);
                break;
            default: //in case passed argument is not a valid case option
                System.out.println("Invalid option: " + option);
        }
    }
}
