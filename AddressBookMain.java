package com.bridgelabz.AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter address:");
        String address = scanner.nextLine();

        System.out.println("Enter city:");
        String city = scanner.nextLine();

        System.out.println("Enter state:");
        String state = scanner.nextLine();

        System.out.println("Enter zip code:");
        String zip = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        addressBook.addContact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        // other methods for managing contacts in the address book
    }
}

