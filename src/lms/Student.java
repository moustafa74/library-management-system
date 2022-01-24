/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Mostafa
 */
public class Student extends Person {

    public static ArrayList<Person> borrowerB = new ArrayList<Person>();
    public static ArrayList<Person> borrowerM = new ArrayList<Person>();
    public static ArrayList<Person> borrowerBL = new ArrayList<Person>();

    public Student(int ID, String firstName, String lastName, String userName) {
        super(ID, firstName, lastName, userName);

    }

    public  void borrow_Book(int id, String name, int ids, String fName, String lName, String uName, LocalDate d1) {
        if (Manager.search_bookFOR_Borrow(id, name, d1) == true) {
            JOptionPane.showMessageDialog(null, "The operation completed successfully You must return this Book before :" + d1.plusDays(20));
            borrowerB.add(new Student(ids, fName, lName, uName));
        } else {
            JOptionPane.showMessageDialog(null, "NOt Exist");
        }

    }

    public  void borrow_Magazine(int id, String name, int ids, String fName, String lName, String uName, LocalDate d1) {
        if (Manager.search_magazineFOR_Borrow(id, name, d1) == true) {
            JOptionPane.showMessageDialog(null, "The operation completed successfully You must return this Book before :" + d1.plusDays(12));
            borrowerM.add(new Student(ids, fName, lName, uName));
        } else {
            JOptionPane.showMessageDialog(null, "NOt Exist");
        }

    }

    public  void borrow_Booklet(int id, String name, int ids, String fName, String lName, String uName, LocalDate d1) {
        if (Manager.search_bookletFOR_Borrow(id, name, d1)) {
            JOptionPane.showMessageDialog(null, "The operation completed successfully You must return this Book before :" + d1.plusDays(12));
            borrowerBL.add(new Student(ids, fName, lName, uName));
        } else {
            JOptionPane.showMessageDialog(null, "NOt Exist");
        }

    }

    public static String show_borrowerB(int i) {

        String s_b = "";
        s_b += "-student ID: " + borrowerB.get(i).ID + "\n" + "-Student first Name: " + borrowerB.get(i).firstName + "\n" + "-Student Last Name : " + borrowerB.get(i).lastName + "\n"
                + "-Student User Name: " + borrowerB.get(i).userName + "\n";

        return s_b;

    }

    public static String show_borrowerBL(int i) {

        String s_b = "";
        s_b += "-student ID: " + borrowerBL.get(i).ID + "\n" + "-Student first Name: " + borrowerBL.get(i).firstName + "\n" + "-Student Last Name : " + borrowerBL.get(i).lastName + "\n"
                + "-Student User Name: " + borrowerBL.get(i).userName + "\n";

        return s_b;

    }

    public static String show_borrowerM(int i) {

        String s_b = "";
        s_b += "-student ID: " + borrowerM.get(i).ID + "\n" + "-Student first Name: " + borrowerM.get(i).firstName + "\n" + "-Student Last Name : " + borrowerM.get(i).lastName + "\n"
                + "-Student User Name: " + borrowerM.get(i).userName + "\n";

        return s_b;

    }

   public  void return_book(int P_id, String P_name, LocalDate d2) {
       int x=Manager.return_book1(P_id, P_name, d2);
        switch (x) {
            case -30:
                
                JOptionPane.showMessageDialog(null, "the final bill is : 20 L.E");
                JOptionPane.showMessageDialog(null, "The operation completed successfully:");
                break;
            case -31:
                JOptionPane.showMessageDialog(null, "NOT FOUND !"+"\n"+"please enter the correct book");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You will have to pay a fine :" + Manager.paymentSystem(x, "book",1)+" L.E" + "for the delay in returning this book" + "\n" + "Therefore, the final bill will be :" + Manager.paymentSystem(x, "book",2)+ " L.E" + "\n");
                JOptionPane.showMessageDialog(null, "The operation completed successfully:");
                break;
        }
    }
    public  void return_Magazine(int P_id, String P_name, LocalDate d2) {
       int x=Manager.return_Magazine1(P_id, P_name, d2);
        switch (x) {
            case -30:
                JOptionPane.showMessageDialog(null, "the final bill is : 20 L.E");
                JOptionPane.showMessageDialog(null, "The operation completed successfully:");
                break;
            case -31:
                JOptionPane.showMessageDialog(null, "NOT FOUND !"+"\n"+"please enter the correct Magazine");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You will have to pay a fine :" + Manager.paymentSystem(x, "Magazine",1)+" L.E" + "for the delay in returning this Magazine" + "\n" + "Therefore, the final bill will be :" + Manager.paymentSystem(x, "Magazine",2)+ " L.E" + "\n");
                JOptionPane.showMessageDialog(null, "The operation completed successfully:");
                break;
        }
    }
    public  void return_booklet(int P_id, String P_name, LocalDate d2) {
       int x=Manager.return_Booklet1(P_id, P_name, d2);
        switch (x) {
            case -30:
                JOptionPane.showMessageDialog(null, "the final bill is : 20 L.E");
                JOptionPane.showMessageDialog(null, "The operation completed successfully:");
                break;
            case -31:
                JOptionPane.showMessageDialog(null, "NOT FOUND !"+"\n"+"please enter the correct booklet");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You will have to pay a fine :" + Manager.paymentSystem(x, "booklet",1)+" L.E" + "for the delay in returning this booklet" + "\n" + "Therefore, the final bill will be :" + Manager.paymentSystem(x, "booklet",2)+ " L.E" + "\n");
                JOptionPane.showMessageDialog(null, "The operation completed successfully:");
                break;
        }
    }
}
