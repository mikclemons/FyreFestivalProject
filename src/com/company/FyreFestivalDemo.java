package com.company;
import java.util.Scanner;


public class FyreFestivalDemo {

    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        int userInput = 0;

        RegistrationFormLibrary libray = new RegistrationFormLibrary();
        boolean running = true;
        do {


            System.out.println("Welcome to Fyre Festival! \n" +
                    "\nFestival Atendees: Press 1 To Register! " +
                    "\nAdministrators: Press 2");
            userInput = newScanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Please enter your name:");
                    newScanner.nextLine();
                    String userName = newScanner.nextLine();

                    System.out.println("Please enter your address:");
                    String userAddress = newScanner.nextLine();

                    System.out.println("Please enter your email:");
                    String userEmail = newScanner.nextLine();

                    System.out.println("Please enter your arrival date:");
                    String userArrivalDate = newScanner.nextLine();

                    System.out.println("Please enter any special requests:");
                    String userSpecialRequests = newScanner.nextLine();

                    RegistrationForm form = new RegistrationForm(userName, userAddress, userEmail, userArrivalDate, userSpecialRequests);
                    form.setName(userName);
                    form.setAddress(userAddress);
                    form.setEmail(userEmail);
                    form.setArrivalDate(userArrivalDate);
                    form.setSpecialRequest(userSpecialRequests);

                    System.out.println("Here is your completed registration form:");
                    System.out.println(form.printDetails());
                    libray.addToLibrary(form);
                    System.out.println("\nYour unique ID number is:");
                    System.out.println(" ");

                    break;

            }


        }while (running);


        }
    }


