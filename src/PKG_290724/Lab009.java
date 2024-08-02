package PKG_290724;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        // write a program name age salary and print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double sal = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
    }
}
