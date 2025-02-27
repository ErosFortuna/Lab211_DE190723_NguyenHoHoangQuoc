/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class ContactList {
    private ArrayList<Contact> contacts;
    
    public ContactList(){
        contacts=new ArrayList();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    
    public void removeContact(Contact contact){
        contacts.remove(contact);
    }
    
    
}
