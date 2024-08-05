package collection05;

import collection04.StudentScoreSorter;

import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Do you want to perform sorting based on:\n1. Name\n2. Id\n3. Score");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                //Collections.sort(list, new StudentNameSorter());
                break;
            case 2:
                //Collections.sort(list, new StudentIdSorter());
                break;
            case 3:
                //Collections.sort(list, new StudentScoreSorter());
                break;
            default:

        }
    }
}
