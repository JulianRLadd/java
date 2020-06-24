import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static CellPhone myPhone = new CellPhone("3456528744");

    public static void main(String[] args) {
        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("(Press 0 for options)");
            System.out.println("Enter choice:");
            int action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 0:
                    printActions();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    System.out.println("Shutting off. Goodbye!");
                    quit = true;
                    break;
                default:
                    System.out.println("Choose another action.");
                    break;
            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contacts name:");
        String name = scan.nextLine();
        System.out.println("Enter new contacts number:");
        String phone = scan.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (myPhone.addNewContact(newContact)) {
            System.out.println("New Contact added: name = " + name + ", phone =" + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = myPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scan.nextLine();
        System.out.println("Enter new contacts number:");
        String newNum = scan.nextLine();
        Contact newContact = Contact.createContact(newName, newNum);
        if (myPhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = myPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (myPhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted contact.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = myPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + "'s phone number is "
                + existingContactRecord.getPhoneNumber());
    }

    private static void printActions() {
        System.out.println("Hello! Welcome to your new cell phone!");
        System.out.println("Select from the following options:");
        System.out.println("0 - Print Options");
        System.out.println("1 - Print Contact List");
        System.out.println("2 - Add New Contact");
        System.out.println("3 - Update Contact");
        System.out.println("4 - Remove Contact");
        System.out.println("5 - Search Contact");
        System.out.println("6 - Quit");
    }
}