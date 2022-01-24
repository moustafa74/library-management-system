/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

/**
 *
 * @author Mostafa
 */
public abstract class Person {
   protected int ID;
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;

    public Person(int ID, String firstName, String lastName, String userName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public Person(int ID, String firstName, String lastName, String userName, String password) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
