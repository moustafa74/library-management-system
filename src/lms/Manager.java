/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mostafa
 */
public class Manager extends Person {

    public Manager(int ID, String firstName, String lastName, String userName, String password) {
        super(ID, firstName, lastName, userName, password);
    }
    public static ArrayList<Publication> Booklist = new ArrayList<Publication>();
    public static ArrayList<Publication> Magazinelist = new ArrayList<Publication>();
    public static ArrayList<Publication> Bookletlist = new ArrayList<Publication>();
    public static ArrayList<Publication> borrower_book = new ArrayList<Publication>();
    public static ArrayList<Publication> borrower_magazine = new ArrayList<Publication>();
    public static ArrayList<Publication> borrower_booklet = new ArrayList<Publication>();
    public static ArrayList<LocalDate> borrowerB_date = new ArrayList();
    public static ArrayList<LocalDate> borrowerM_date = new ArrayList();
    public static ArrayList<LocalDate> borrowerBL_date = new ArrayList();

    public static void add_book(int Id, String name, String author, String publisher, int number, boolean if_borrowed) {

        boolean ifexsist = false, id = false;
        for (int i = 0; i < Booklist.size(); i++) {
            if (Booklist.get(i).Id == Id && Booklist.get(i).name.equals(name)) {
                Booklist.get(i).NumberOfThisBook += number;
                ifexsist = true;
                break;
            } else if (Booklist.get(i).Id == Id && !Booklist.get(i).name.equals(name)) {
                id = true;
                break;
            }
        }
        if (id) {
            JOptionPane.showMessageDialog(null, "The operation failed..,plaese enter diffrent Id");
        } else {
            if (!ifexsist) {
                Booklist.add(new Book(Id, name, author, publisher, number, if_borrowed));
            }
            JOptionPane.showMessageDialog(null, "The operation completed successfully");
        }

    }

    public static void add_Magazine(int Id, String name, String author, String publisher, int number, boolean if_borrowed) {

        boolean ifexsist = false, id = false;
        for (int i = 0; i < Magazinelist.size(); i++) {
            if (Magazinelist.get(i).Id == Id && Magazinelist.get(i).name.equals(name)) {
                Magazinelist.get(i).NumberOfThisBook += number;
                ifexsist = true;
                break;
            } else if (Magazinelist.get(i).Id == Id && !Magazinelist.get(i).name.equals(name)) {
                id = true;
                break;
            }
        }
        if (id) {
            JOptionPane.showMessageDialog(null, "The operation failed..,plaese enter diffrent Id");
        } else {
            if (!ifexsist) {
                Magazinelist.add(new Magazine(Id, name, author, publisher, number, if_borrowed));
            }
            JOptionPane.showMessageDialog(null, "The operation completed successfully");
        }

    }

    public static void add_booklest(int Id, String name, String author, String publisher, int number, boolean if_borrowed) {

        boolean ifexsist = false, id = false;
        for (int i = 0; i < Bookletlist.size(); i++) {
            if (Bookletlist.get(i).Id == Id && Bookletlist.get(i).name.equals(name)) {
                Bookletlist.get(i).NumberOfThisBook += number;
                ifexsist = true;
                break;
            } else if (Bookletlist.get(i).Id == Id && !Bookletlist.get(i).name.equals(name)) {
                id = true;
                break;
            }
        }
        if (id) {
            JOptionPane.showMessageDialog(null, "The operation failed..,plaese enter diffrent Id");
        } else {
            if (!ifexsist) {
                Bookletlist.add(new Booklet(Id, name, author, publisher, number, if_borrowed));
            }
            JOptionPane.showMessageDialog(null, "The operation completed successfully");
        }

    }

    public static void delete_Book(int id) {
        boolean iffound = false;
        for (int i = 0; i < Booklist.size(); i++) {
            if (Booklist.get(i).Id == id) {
                Booklist.remove(i);
                iffound = true;
                break;
            }
        }
        if (!iffound) {
            JOptionPane.showMessageDialog(null, "the book is not exist deleted");
        } else if (!Booklist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The operation completed successfully");
        } else {
            JOptionPane.showMessageDialog(null, "the book is deleted and list is empty ");

        }

    }

    public static void delete_magazine(int id) {
        boolean iffound = false;
        for (int i = 0; i < Magazinelist.size(); i++) {
            if (Magazinelist.get(i).Id == id) {
                Magazinelist.remove(i);
                iffound = true;
                break;
            }
        }
        if (!iffound) {
            JOptionPane.showMessageDialog(null, "the Magazine is not exist to be deleted");
        } else if (!Magazinelist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The operation completed successfully");

        } else {
            JOptionPane.showMessageDialog(null, "the Magazine is deleted and list is empty ");
        }
    }

    public static void delete_BookLet(int id) {
        boolean iffound = false;
        for (int i = 0; i < Bookletlist.size(); i++) {
            if (Bookletlist.get(i).Id == id) {
                Bookletlist.remove(i);
                iffound = true;
                break;
            }
        }
        if (!iffound) {
            JOptionPane.showMessageDialog(null, "the Booklet is not exist to be deleted");
        } else if (!Bookletlist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The operation completed successfully");

        } else {
            JOptionPane.showMessageDialog(null, "the booklet is deleted and list is empty ");
        }
    }

    public static void search_book(String name) {
        String Search_result = "NOt Exist";
        String listing = "";
        boolean find = false;
        int t = 1;
        for (int i = 0; i < Booklist.size(); i++) {
            if (Booklist.get(i).name.equals(name)) {
                Search_result = "Book Exist";
                listing += (t) + Booklist.get(i).toString();
                t++;
                find = true;

            }

        }
        if (find) {
            JOptionPane.showMessageDialog(null, Search_result + "\n" + listing);
        } else {
            JOptionPane.showMessageDialog(null, Search_result);
        }
    }

    public static void search_magazine(String name) {
        String Search_result = "NOt Exist";
        String listing = "";
        boolean find = false;
        int t = 1;
        for (int i = 0; i < Magazinelist.size(); i++) {
            if (Magazinelist.get(i).name.equals(name)) {
                Search_result = "Magazine Exist";
                listing += t + Magazinelist.get(i).toString();
                t++;
                find = true;
                break;
            }

        }
        if (find) {
            JOptionPane.showMessageDialog(null, Search_result + "\n" + listing);
        } else {
            JOptionPane.showMessageDialog(null, Search_result);
        }
    }

    public static void search_booklet(String name) {
        String Search_result = "NOt Exist";
        String listing = "";
        boolean find = false;
        int t = 1;
        for (int i = 0; i < Bookletlist.size(); i++) {
            if (Bookletlist.get(i).name.equals(name)) {
                Search_result = "booklet Exist";
                listing += t + Bookletlist.get(i).toString();
                t++;
                find = true;
                break;
            }

        }
        if (find) {
            JOptionPane.showMessageDialog(null, Search_result + "\n" + listing);
        } else {
            JOptionPane.showMessageDialog(null, Search_result);
        }
    }

    public static void Modify_book(int id1, int id2, String Name, String author, String publisher, int Number) {
        String listing = "";
        int q = 0;
        boolean find = false;
        for (int i = 0; i < Booklist.size(); i++) {
            if (Booklist.get(i).Id == id1) {
                Booklist.get(i).Id = id2;
                Booklist.get(i).name = Name;
                Booklist.get(i).author = author;
                Booklist.get(i).Publisher = publisher;
                Booklist.get(i).NumberOfThisBook = Number;
                q = i;
                find = true;
                break;
            }
        }
        if (find) {

            listing += Booklist.get(q).toString();

            JOptionPane.showMessageDialog(null, listing);
        } else {
            JOptionPane.showMessageDialog(null, "ID book You entered Is not Exist");
        }
    }

    public static void Modify_booklet(int id1, int id2, String Name, String author, String publisher, int number) {
        String listing = "";
        boolean find = false;
        int q = 0;
        for (int i = 0; i < Bookletlist.size(); i++) {
            if (Bookletlist.get(i).Id == id1) {
                Bookletlist.get(i).Id = id2;
                Bookletlist.get(i).name = Name;
                Bookletlist.get(i).author = author;
                Bookletlist.get(i).Publisher = publisher;
                Bookletlist.get(i).NumberOfThisBook = number;
                q = i;
                find = true;
                break;
            }
        }
        if (find) {
            listing += Bookletlist.get(q).toString();

            JOptionPane.showMessageDialog(null, listing);
        } else {
            JOptionPane.showMessageDialog(null, "ID Booklet You entered Is not Exist");
        }
    }

    public static void Modify_Magazine(int id1, int id2, String Name, String author, String publisher, int number) {
        String listing = "";
        boolean find = false;
        int q = 0;
        for (int i = 0; i < Magazinelist.size(); i++) {
            if (Magazinelist.get(i).Id == id1) {
                Magazinelist.get(i).Id = id2;
                Magazinelist.get(i).name = Name;
                Magazinelist.get(i).author = author;
                Magazinelist.get(i).Publisher = publisher;
                Magazinelist.get(i).NumberOfThisBook = number;
                find = true;
                break;
            }
        }
        if (find) {

            listing += Magazinelist.get(q).toString();

            JOptionPane.showMessageDialog(null, listing);
        } else {
            JOptionPane.showMessageDialog(null, "ID book You entered Is not Exist");
        }
    }

    public static void Show_BookList() {
        String listing = "";
        int t = 1;
        boolean ifexixst = false;
        if (!Booklist.isEmpty()) {
            for (int i = 0; i < Booklist.size(); i++) {
                if (!Booklist.get(i).if_borrowed) {
                    listing += t + Booklist.get(i).toString();
                    t++;
                    ifexixst = true;
                }
            }
            if (!ifexixst) {
                JOptionPane.showMessageDialog(null, "NO available books all are borrowed ");
            } else {
                JOptionPane.showMessageDialog(null, listing);
            }

        } else {
            JOptionPane.showMessageDialog(null, "the booklist is empty ");

        }
    }

    public static void Show_MagazineList() {
        String listing = "";
        boolean ifexixst = false;
        int t = 1;
        if (!Magazinelist.isEmpty()) {
            for (int i = 0; i < Magazinelist.size(); i++) {
                if (!Magazinelist.get(i).if_borrowed) {
                    listing += t + Magazinelist.get(i).toString();
                    t++;
                    ifexixst = true;
                }
            }
            if (!ifexixst) {
                JOptionPane.showMessageDialog(null, "NO available Magazine all are borrowed ");
            } else {
                JOptionPane.showMessageDialog(null, listing);
            }

        } else {
            JOptionPane.showMessageDialog(null, "the Magazinelist is empty ");
        }
    }

    public static void Show_Bookletlist() {
        String listing = "";
        boolean ifexixst = false;
        int t = 1;
        if (!Bookletlist.isEmpty()) {
            for (int i = 0; i < Bookletlist.size(); i++) {
                if (!Bookletlist.get(i).if_borrowed) {
                    listing += t + Bookletlist.get(i).toString();
                    ifexixst = true;
                    t++;
                }
            }
            if (!ifexixst) {
                JOptionPane.showMessageDialog(null, "NO available Booklets all are borrowed ");
            } else {
                JOptionPane.showMessageDialog(null, listing);
            }

        } else {
            JOptionPane.showMessageDialog(null, "the bookletlist is empty ");
        }
    }

    public static boolean search_bookFOR_Borrow(int idb, String nameb, LocalDate d1) {

        for (int i = 0; i < Booklist.size(); i++) {
            if (Booklist.get(i).Id == idb && Booklist.get(i).name.equals(nameb) && !Booklist.get(i).if_borrowed) {
                if (Booklist.get(i).NumberOfThisBook > 1) {
                    Booklist.get(i).NumberOfThisBook--;
                } else {
                    Booklist.get(i).if_borrowed = true;
                }
                d1 = d1.plusDays(20);
                borrowerB_date.add(d1);
                borrower_book.add(new Book(idb, nameb));
                return true;
            }
        }
        return false;
    }

    public static boolean search_magazineFOR_Borrow(int idb, String nameb, LocalDate d1) {

        for (int i = 0; i < Magazinelist.size(); i++) {
            if (Magazinelist.get(i).Id == idb && Magazinelist.get(i).name.equals(nameb) && !Magazinelist.get(i).if_borrowed) //&& Magazinelist.get(i).name.equals(nameb))
            {
                if (Magazinelist.get(i).NumberOfThisBook > 1) {
                    Magazinelist.get(i).NumberOfThisBook--;
                } else {
                    Magazinelist.get(i).if_borrowed = true;
                }
                d1 = d1.plusDays(12);
                borrowerM_date.add(d1);
                borrower_magazine.add(new Magazine(idb, nameb));
                return true;
            }
        }
        return false;
    }

    public static boolean search_bookletFOR_Borrow(int idb, String nameb, LocalDate d1) {
        for (int i = 0; i < Bookletlist.size(); i++) {
            if (Bookletlist.get(i).Id == idb && Bookletlist.get(i).name.equals(nameb) && !Bookletlist.get(i).if_borrowed) {
                if (Bookletlist.get(i).NumberOfThisBook > 1) {
                    Bookletlist.get(i).NumberOfThisBook--;
                } else {
                    Bookletlist.get(i).if_borrowed = true;
                }
                d1 = d1.plusDays(12);
                borrowerBL_date.add(d1);

                borrower_booklet.add(new Booklet(idb, nameb));
                return true;
            }
        }
        return false;

    }

    public void Show_borrowBlist() {
        String listing = "";

        if (!borrower_book.isEmpty()) {
            for (int i = 0; i < borrower_book.size(); i++) {
                LocalDate x = borrowerB_date.get(i).minusDays(20);
                listing += (i + 1) + "-Book ID: " + borrower_book.get(i).Id + "\n" + "-Book Name: " + borrower_book.get(i).name + "\n" + Student.show_borrowerB(i) + "-TIME :" + x + "\n" + "-The day must This book return :" + borrowerB_date.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, listing);
        } else {
            JOptionPane.showMessageDialog(null, "the booklist is empty ");

        }
    }

    public void Show_borrowerMlist() {
        String listing = "";
        if (!borrower_magazine.isEmpty()) {
            for (int i = 0; i < borrower_magazine.size(); i++) {
                LocalDate x = borrowerM_date.get(i).minusDays(12);
                listing += (i + 1) + "-Magazine ID: " + borrower_magazine.get(i).Id + "\n" + "-Magazine Name: " + borrower_magazine.get(i).name + "\n" + Student.show_borrowerM(i) + "-TIME :" + x + "\n" + "-The day must This Magazine return :" + borrowerM_date.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, listing);
        } else {
            JOptionPane.showMessageDialog(null, "the booklist is empty ");

        }
    }

    public void Show_borrowerBLlist() {
        String listing = "";
        if (!borrower_booklet.isEmpty()) {
            for (int i = 0; i < borrower_booklet.size(); i++) {
                LocalDate x = borrowerBL_date.get(i).minusDays(12);
                listing += (i + 1) + "-Booklet ID: " + borrower_booklet.get(i).Id + "\n" + "-Booklet Name: " + borrower_booklet.get(i).name + "\n" + Student.show_borrowerBL(i) + "-TIME :" + x + "\n" + "-The day must This Booklet return :" + borrowerBL_date.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, listing);
        } else {
            JOptionPane.showMessageDialog(null, "the booklist is empty ");

        }
    }

    public void all_over_periodB(LocalDate d2) {
        String show = "";
        int t = 1;
        boolean ifempty = true;
        for (int i = 0; i < borrowerB_date.size(); i++) {
            if (d2.compareTo(borrowerB_date.get(i)) > 0) {
                LocalDate x = borrowerB_date.get(i).minusDays(20);
                show += (t) + "-Book ID: " + borrower_book.get(i).Id + "\n" + "-Book Name: " + borrower_book.get(i).name + "\n" + Student.show_borrowerB(i) + "-TIME :" + x + "\n" + "the day must return this book :" + borrowerB_date.get(i) + "\n";
                t++;
                ifempty = false;
            }
        }
        if (ifempty) {
            JOptionPane.showMessageDialog(null, "No Over Period Books ");
        } else {
            JOptionPane.showMessageDialog(null, show);
        }
    }

    public void all_over_periodM(LocalDate d2) {
        String show = "";
        int t = 1;
        boolean ifempty = true;
        for (int i = 0; i < borrowerM_date.size(); i++) {
            if (d2.compareTo(borrowerM_date.get(i)) > 0) {
                LocalDate x = borrowerM_date.get(i).minusDays(12);
                show += (t) + "-Book ID: " + borrower_magazine.get(i).Id + "\n" + "-Book Name: " + borrower_magazine.get(i).name + "\n" + Student.show_borrowerM(i) + "-TIME :" + x + "\n" + "the day must return this magazine :" + borrowerM_date.get(i) + "\n";
                t++;
                ifempty = false;
            }
        }
        if (ifempty) {
            JOptionPane.showMessageDialog(null, "No Over Period Magaizne ");
        } else {
            JOptionPane.showMessageDialog(null, show);
        }
    }

    public void all_over_periodBL(LocalDate d2) {
        String show = "";
        int t = 1;
        boolean ifempty = true;
        for (int i = 0; i < borrowerBL_date.size(); i++) {
            if (d2.compareTo(borrowerBL_date.get(i)) > 0) {
                LocalDate x = borrowerBL_date.get(i).minusDays(12);
                show += (t) + "-Book ID: " + borrower_booklet.get(i).Id + "\n" + "-Book Name: " + borrower_booklet.get(i).name + "\n" + Student.show_borrowerBL(i) + "-TIME :" + x + "\n" + "the day must return this booklet :" + borrowerBL_date.get(i) + "\n";
                t++;
                ifempty = false;
            }
        }
        if (ifempty) {
            JOptionPane.showMessageDialog(null, "No Over Period Booklet ");
        } else {
            JOptionPane.showMessageDialog(null, show);
        }
    }

    public static int return_book1(int b_id, String b_name, LocalDate d2) {

        for (int i = 0; i < borrower_book.size(); i++) {
            if (borrower_book.get(i).Id == b_id && borrower_book.get(i).name.equals(b_name)) {
                borrower_book.remove(i);
                for (int j = 0; j < Booklist.size(); j++) {
                    if (Booklist.get(j).Id == b_id && Booklist.get(i).name.equals(b_name) && !Booklist.get(i).if_borrowed) {
                        Booklist.get(j).NumberOfThisBook++;
                        break;
                    } else if (Booklist.get(j).Id == b_id && Booklist.get(i).name.equals(b_name) && Booklist.get(i).if_borrowed) {
                        Booklist.get(i).if_borrowed = false;
                    }
                }
                Student.borrowerB.remove(i);
                if (d2.compareTo(borrowerB_date.get(i)) > 0) {
                    LocalDate e1 = borrowerB_date.get(i);
                    borrowerB_date.remove(i);
                    return (int) ChronoUnit.DAYS.between(e1, d2);
                }
                borrowerB_date.remove(i);
                return -30;

            }

        }
        return -31;
    }

    public static int return_Magazine1(int b_id, String b_name, LocalDate d2) {

        for (int i = 0; i < borrower_magazine.size(); i++) {
            if (borrower_magazine.get(i).Id == b_id && borrower_magazine.get(i).name.equals(b_name)) {
                borrower_magazine.remove(i);

                for (int j = 0; j < Magazinelist.size(); j++) {
                    if (Magazinelist.get(j).Id == b_id && Magazinelist.get(i).name.equals(b_name) && !Magazinelist.get(i).if_borrowed) {
                        Magazinelist.get(j).NumberOfThisBook++;
                        break;
                    } else if (Magazinelist.get(j).Id == b_id && Magazinelist.get(i).name.equals(b_name) && Magazinelist.get(i).if_borrowed) {
                        Magazinelist.get(i).if_borrowed = false;
                        break;
                    }
                }
                Student.borrowerM.remove(i);
                if (d2.compareTo(borrowerM_date.get(i)) > 0) {
                    LocalDate e1 = borrowerM_date.get(i);
                    borrowerM_date.remove(i);
                    return (int) ChronoUnit.DAYS.between(e1, d2);
                }
                borrowerM_date.remove(i);
                return -30;

            }

        }
        return -31;
    }

    public static int return_Booklet1(int b_id, String b_name, LocalDate d2) {

        for (int i = 0; i < borrower_booklet.size(); i++) {
            if (borrower_booklet.get(i).Id == b_id && borrower_booklet.get(i).name.equals(b_name)) {
                borrower_booklet.remove(i);
                for (int j = 0; j < Bookletlist.size(); j++) {
                    if (Bookletlist.get(j).Id == b_id && Bookletlist.get(i).name.equals(b_name) && !Bookletlist.get(i).if_borrowed) {
                        Bookletlist.get(j).NumberOfThisBook++;
                        break;
                    } else if (Bookletlist.get(j).Id == b_id && Bookletlist.get(i).name.equals(b_name) && Bookletlist.get(i).if_borrowed) {
                        Bookletlist.get(i).if_borrowed = false;
                        break;
                    }
                }
                Student.borrowerBL.remove(i);
                if (d2.compareTo(borrowerBL_date.get(i)) > 0) {
                    LocalDate e1 = borrowerBL_date.get(i);
                    borrowerBL_date.remove(i);
                    return (int) ChronoUnit.DAYS.between(e1, d2);
                }
                borrowerBL_date.remove(i);
                return -30;

            }

        }
        return -31;
    }

    public static int paymentSystem(int Delay, String name_type, int Type) {
        switch (name_type) {
            case "book":
                if (Type == 1) {
                    return Delay * 2;// one day Delay : 2 L.E
                } else {
                    return ((Delay * 2) + 20);// total bill
                }
            case "Magazine":
                if (Type == 1) {
                    return Delay * 3;// one day Delay : 3 L.E
                } else {
                    return ((Delay * 3) + 15);// total bill
                }
            default:
                if (Type == 1) {
                    return Delay * 4;// one day Delay : 4 L.E
                } else {
                    return ((Delay * 4) + 10);// total bill
                }
        }
    }
}
