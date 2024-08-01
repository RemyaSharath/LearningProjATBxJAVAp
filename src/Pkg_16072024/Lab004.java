package Pkg_16072024;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        //Grade calculator
        //Find inputs
           //Enter score and answer should be char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        float score = sc.nextFloat();
        String grade;
        if(score >= 90) {
            grade = "A";
        }
                    else if(score >= 80 && score <= 89){
                        grade = "B";
                        }
                    else if(score >= 70 && score <= 79) {
            grade = "C";
        }
            else if (score >= 60 && score <= 69) {
            grade = "D";
        }
            else {
                grade = "Fail";
        }
        System.out.println("Grade is " + grade);
    }
}
