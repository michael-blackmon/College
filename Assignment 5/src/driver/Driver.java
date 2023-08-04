/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 5
DUE 8/3/23
SUBMITTED 8/3/23
 */
package driver;

import model.Student;
import model.Statistics;
import util.Util;

//Beginning of program
public class Driver{
    public static void main(String[] args){
        Student[] lab2;
        Util u = new Util("D:\\College\\2023SUM\\Java D035A\\Assignments\\Assignment5\\src\\studentDat.txt");
        // Populates the student array from studentDat.txt data
        lab2 = u.readFile();

        // Check if the student array is fully populated
        int studentCount = 0;
        for(Student student : lab2){
            if(student != null){
                studentCount++;
            } else{
                break;
            }
        }

        //trim array to the actual number of students
        Student[] students = new Student[studentCount];
        System.arraycopy(lab2, 0, students, 0, studentCount);

        Statistics statLab2 = new Statistics();
        //first calculates low
        statLab2.findLow(students);
        //second calculates high
        statLab2.findHigh(students);
        //third calculates average
        statLab2.findAvg(students);
        //pass option to print method based on which case you wish to print
        statLab2.print(students, 4);
    }
}
