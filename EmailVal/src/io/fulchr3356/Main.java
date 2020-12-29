package io.fulchr3356;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        EmployeeCollection employeeCollection = new EmployeeCollection();
        employeeCollection.add("email1@email.com");
        employeeCollection.add("email2@email.com");
        employeeCollection.add("email3@email.com");
        employeeCollection.add("email4@email.com");
        employeeCollection.add("email5@email.com");


        label:
        while(true) {
            System.out.println("Enter email to search array\nEnter 0 to exit program\nEnter 1 to print all emails\nEnter 2 to add new email");
            input = scanner.nextLine();
            switch (input) {
                case "0":
                    break label;
                case "1":
                    employeeCollection.printAll();
                    break;
                case "2":
                    System.out.println("Enter new email:");
                    employeeCollection.add(scanner.nextLine());
                    break;
                default:
                    System.out.println((employeeCollection.findbyEmail(input)) ? "Email found" : "Email not found");
                    break;
            }
        }


    }
}
