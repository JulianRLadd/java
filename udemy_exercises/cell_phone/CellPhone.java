import java.util.ArrayList;
import java.util.Scanner;

public class CellPhone {

    private ArrayList<Contact> contactList;
    private String myNumber;

    public CellPhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already created");
            return false;
        }
        this.contactList.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " wasn't in the list.");
            return false;
        } else if(findContact(newContact.getName())!=-1){
            System.out.println("Contact with name "+newContact.getName()+ " already exists");
            return false;
        }
        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " has been replace by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + "wasn't in the list.");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contact.getName() + "was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.contactList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.contactList.size(); i++) {
            System.out.println((i + 1) + "." + this.contactList.get(i).getName() + "->"
                    + this.contactList.get(i).getPhoneNumber());
        }
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contactList.get(position);
        }
        return null;
    }



}
