package Test;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Staring phone..." +
                "\n" +
                "Available actions:\n" +
                "press\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "Choose your action:\n");
        int n;
        ContactList c1 = new ContactList();
        Scanner in = new Scanner(System.in);
        do {
            do {
                System.out.println("Enter action: (6 to show available action)");
                n = in.nextInt();
            }while (n < 0 || n > 6);
            switch (n) {
                case 1:
                    c1.printList();
                    break;
                case 2:
                    c1.addContact();
                    break;
                case 3:
                    c1.updateContact();
                    break;
                case 4:
                    c1.removeContact();
                    break;
                case 5:
                    c1.searchContact();
                    break;
                case 6:
                    System.out.println("Staring phone..." +
                            "\n" +
                            "Available actions:\n" +
                            "press\n" +
                            "1 - to print contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query if an existing contact exists\n" +
                            "Choose your action:\n");
                    break;
            }
        }while (n != 0);
    }
}
