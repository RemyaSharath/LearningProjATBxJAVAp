package PKG_290724;

import java.util.Scanner;

public class Lab007 {
    // Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
//Triangle 3 sides

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        System.out.println("c");
        int c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println("Equilateral");
        } else if (a != b && a != c) {
            System.out.println("Scalene");
        }

        }
    }
