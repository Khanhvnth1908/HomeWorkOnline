package Test;

import java.util.*;

public class ContactList {
    List<Contact> contactList = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addContact() {
        String name;
        String phone;
        System.out.print("Enter new contact name: ");
        name = in.next();
        System.out.print("Enter phone number: ");
        phone = in.next();
        Contact contact = new Contact(name, phone);
        contactList.add(contact);
        System.out.println("New contact added: " + contact);
    }

    public void updateContact() {
        String contactName;
        System.out.print("Enter old contact name: ");
        contactName = in.next();
        int c = 0;
        Iterator<Contact> contactIterator = contactList.iterator();
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            if (contact.name.equals(contactName)) {
                String name2,phone2;
                System.out.print("Enter new contact name: ");
                name2 = in.next();
                System.out.print("Enter new contact phone: ");
                phone2 = in.next();
                contact.name = name2;
                contact.phone = phone2;
                System.out.println("Updated contact: " + contact);
                c++;
            }
        }
        if (c == 0) {
            System.out.println("This contact not found \n");
        }
    }

    public void removeContact() {
        String contactName;
        System.out.print("Enter contact name: ");
        contactName = in.next();
        int c = 0;
        Contact removeContact = null;
        Iterator<Contact> contactIterator = contactList.iterator();
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            if (contact.name.equals(contactName)) {
                removeContact = contact;
                c++;
            }
        }
        if (c == 0) {
            System.out.println("This contact not found \n");
        }else {
            contactList.remove(removeContact);
            System.out.println("Removed contact \n");
        }
    }

    public void searchContact() {
        String contactName;
        System.out.print("Enter contact name: ");
        contactName = in.next();
        int c = 0;
        Iterator<Contact> contactIterator = contactList.iterator();
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            if (contact.name.equals(contactName)) {
                System.out.println(contact);
                c++;
            }
        }
        if (c == 0) {
            System.out.println("This contact not found \n");
        }
    }

    public void printList() {
        System.out.println("Contact List");
        Iterator<Contact> contactIterator = contactList.iterator();
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            System.out.println(contact);
        }
    }
}
