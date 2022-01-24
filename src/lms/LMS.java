/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Mostafa
 */
public class LMS {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "welcome to library management system..");
        String option;
        boolean ON = true;
        while (ON) {

            option = JOptionPane.showInputDialog("Choose number :\n"
                    + "1- Manager .\n"
                    + "2- Student . \n"
                    + "3- close program .\n");
            if (option == null) {
                JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                continue;
            }
            switch (option) {
                case "1":// for manager functions
                {
                    int id = 1;
                    boolean f ;
                    do {
                        try {
                            id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your ID: "));
                            if (id <= 0) {
                                f = false;
                                JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                            } else {
                                f = true;
                            }
                        } catch (NumberFormatException e) {
                            f = false;

                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                        }
                    } while (!f);

                    String manager_fname;
                    boolean f1;
                    do {
                        try {
                            manager_fname = JOptionPane.showInputDialog("Enter your first name: ");
                            if (manager_fname.length() == 0) {
                                throw new Exception();
                            } else {
                                for (int i = 0; i < manager_fname.length(); i++) {
                                    if (!(manager_fname.charAt(i) >= 'A' && manager_fname.charAt(i) <= 'Z' || manager_fname.charAt(i) >= 'a' && manager_fname.charAt(i) <= 'z')) {
                                        throw new Exception();
                                    }
                                }
                            }
                            f1 = true;
                        } catch (Exception e) {
                            f1 = false;
                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                        }
                    } while (!f1);
                    String manager_lname = "";
                    boolean f2;
                    do {
                        try {
                            manager_lname = JOptionPane.showInputDialog("Enter your last name: ");
                            if (manager_lname.length() == 0) {
                                throw new Exception();
                            } else {
                                for (int i = 0; i < manager_lname.length(); i++) {
                                    if (!(manager_lname.charAt(i) >= 'A' && manager_lname.charAt(i) <= 'Z' || manager_lname.charAt(i) >= 'a' && manager_lname.charAt(i) <= 'z')) {
                                        throw new Exception();
                                    }
                                }
                            }
                            f2 = true;
                        } catch (Exception e) {
                            f2 = false;
                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                        }
                    } while (!f2);
                    String manager_User;
                    boolean f3;
                    do {
                        try {
                            manager_User = JOptionPane.showInputDialog("Enter Your User name : ");
                            if (manager_User.length() == 0) {
                                f3 = false;
                                JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                            } else {
                                f3 = true;
                            }
                        } catch (NullPointerException ex) {
                            f3 = false;
                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                        }
                    } while (!f3);
                    String manager_Pass = "";
                    boolean f4;
                    do {
                        try {
                            manager_Pass = JOptionPane.showInputDialog("Enter Your Password : ");
                            if (!manager_Pass.equals("1234")) {
                                f4 = false;
                                JOptionPane.showMessageDialog(null, "Please Enter a correct password");
                            } else {
                                f4 = true;
                            }
                        } catch (NullPointerException ex) {
                            f4 = false;
                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                        }
                    } while (!f4);
                    Manager m = new Manager(id, manager_lname, option, manager_lname, manager_Pass);
                    boolean back = true;
                    while (back) {
                        String opretion = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                + "1- add Publication . \n"
                                + "2- delete Publication . \n"
                                + "3- search about Publication . \n"
                                + "4- Modify in a specific Publication . \n"
                                + "5- Show all Publication lists . \n"
                                + "6- Show borrowed list Publication . \n"
                                + "7- show all over-period borrowed publication  . \n"
                                + "8- Back to main list . \n");
                        if (opretion == null) {
                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                            continue;
                        }
                        switch (opretion) {
                            case "1":// too add book
                            {
                                int Pub_id = 1;
                                boolean f5;
                                do {
                                    try {
                                        Pub_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your Publication_ID: "));
                                        if (Pub_id <= 0) {
                                            f5 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                        } else {
                                            f5 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f5 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    }
                                } while (!f5);
                                String Publication_name = "";
                                boolean f6;
                                do {
                                    try {
                                        Publication_name = JOptionPane.showInputDialog("Enter the Publication name YOU want to add: ");
                                        if (Publication_name.length() == 0) {
                                            f6 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f6 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f6 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f6);
                                String p_author = "";
                                boolean f12;
                                do {
                                    try {
                                        p_author = JOptionPane.showInputDialog("Enter the author name of publication YOU want to add: ");
                                        if (p_author.length() == 0) {
                                            f12 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f12 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f12 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f12);
                                String p_publisher = "";
                                boolean f13;
                                do {
                                    try {
                                        p_publisher = JOptionPane.showInputDialog("Enter the Publisher name of publication YOU want to add: ");
                                        if (p_publisher.length() == 0) {
                                            f13 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f13 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f13 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f13);
                                int Pub_Quantatiy = 1;
                                boolean f7 = false;
                                do {
                                    try {
                                        Pub_Quantatiy = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your Publication_quantatiy: "));
                                        if (Pub_Quantatiy <= 0) {
                                            throw new Exception();
                                        } else {
                                            f7 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f7 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    } catch (Exception e) {
                                        f7 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f7);
                                boolean ok = false;
                                while (!ok) {
                                    String add_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (add_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (add_type) { //to choose the type of the publication
                                        case "1": {
                                            Manager.add_book(Pub_id, Publication_name, p_author, p_publisher, Pub_Quantatiy, false);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            Manager.add_Magazine(Pub_id, Publication_name, p_author, p_publisher, Pub_Quantatiy, false);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            Manager.add_booklest(Pub_id, Publication_name, p_author, p_publisher, Pub_Quantatiy, false);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "2"://to delete book
                            {
                                int Pub_id = 1;
                                boolean f5;
                                do {
                                    try {
                                        Pub_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the  Publication_ID you want to delete: "));
                                        if (Pub_id <= 0) {
                                            f5 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                        } else {
                                            f5 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f5 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    }
                                } while (!f5);
                                boolean ok = false;
                                while (!ok) {
                                    String delete_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (delete_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (delete_type) { //to choose the type of the publication
                                        case "1": {
                                            Manager.delete_Book(Pub_id);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            Manager.delete_magazine(Pub_id);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            Manager.delete_BookLet(Pub_id);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }

                            case "3": // to search 
                            {
                                String book_name = "";
                                boolean f11;
                                do {
                                    try {
                                        book_name = JOptionPane.showInputDialog("Enter the name of Publication: ");
                                        if (book_name.length() == 0) {
                                            f11 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f11 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f11 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f11);
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            Manager.search_book(book_name);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            Manager.search_magazine(book_name);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            Manager.search_booklet(book_name);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }

                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "4":// to modify
                            {
                                int Pub_id1 = 1;
                                boolean f5;
                                do {
                                    try {
                                        Pub_id1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your Publication_ID You want to modify: "));
                                        if (Pub_id1 <= 0) {
                                            f5 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                        } else {
                                            f5 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f5 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    }
                                } while (!f5);
                                int Pub_id = 1;
                                boolean f6;
                                do {
                                    try {
                                        Pub_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your Publication_ID You want to modify to: "));
                                        if (Pub_id <= 0) {
                                            f6 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                        } else {
                                            f6 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f6 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    }
                                } while (!f6);
                                String Publication_name = "";
                                boolean f8;
                                do {
                                    try {
                                        Publication_name = JOptionPane.showInputDialog("Enter the Publication name You want to modify to: ");
                                        if (Publication_name.length() == 0) {
                                            f8 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f8 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f8 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f8);
                                String p_author = "";
                                boolean f12;
                                do {
                                    try {
                                        p_author = JOptionPane.showInputDialog("Enter the author name of publication YOU want to modify to: ");
                                        if (p_author.length() == 0) {
                                            f12 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f12 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f12 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f12);
                                String p_publisher = "";
                                boolean f13;
                                do {
                                    try {
                                        p_publisher = JOptionPane.showInputDialog("Enter the Publisher name of publication YOU want to modify to: ");
                                        if (p_publisher.length() == 0) {
                                            f13 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f13 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f13 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f13);
                                int Pub_Quantatiy = 1;
                                boolean f7 = false;
                                do {
                                    try {
                                        Pub_Quantatiy = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your Publication_quantatiy You want to modify to: "));
                                        if (Pub_Quantatiy <= 0) {
                                            throw new Exception();
                                        } else {
                                            f7 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f7 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    } catch (Exception e) {
                                        f7 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f7);

                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            Manager.Modify_book(Pub_id1, Pub_id, Publication_name, p_author, p_publisher, Pub_Quantatiy);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            Manager.Modify_Magazine(Pub_id1, Pub_id, Publication_name, p_author, p_publisher, Pub_Quantatiy);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            Manager.Modify_booklet(Pub_id1, Pub_id, Publication_name, p_author, p_publisher, Pub_Quantatiy);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "5": {// to show PUBLICATION list
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            Manager.Show_BookList();
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            Manager.Show_MagazineList();
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            Manager.Show_Bookletlist();
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "6": {//show borrow list
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            m.Show_borrowBlist();
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            m.Show_borrowerMlist();
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            m.Show_borrowerBLlist();
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "7": {//show all over period
                                LocalDate Ld = LocalDate.now();
                                boolean b1;
                                do {
                                    int return_day = 1;
                                    boolean f6;
                                    do {
                                        try {
                                            return_day = Integer.parseInt(JOptionPane.showInputDialog("Enter the current Day: "));
                                            f6 = true;
                                        } catch (NumberFormatException e) {
                                            f6 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        }
                                    } while (!f6);
                                    int return_Month = 1;
                                    boolean f9 = true;
                                    do {
                                        try {
                                            return_Month = Integer.parseInt(JOptionPane.showInputDialog("Enter the current Month: "));
                                            f9 = true;
                                        } catch (NumberFormatException e) {
                                            f9 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } catch (DateTimeException ex) {
                                            JOptionPane.showMessageDialog(null, ex);
                                        }

                                    } while (!f9);
                                    int return_Year = 1;
                                    boolean f7;
                                    do {
                                        try {
                                            return_Year = Integer.parseInt(JOptionPane.showInputDialog("Enter the current Year: "));
                                            if(return_Year<2020)
                                            {
                                             JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                             f7=false;
                                            }
                                            else
                                            f7 = true;
                                        } catch (NumberFormatException e) {
                                            f7 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        }

                                    } while (!f7);
                                    try {
                                        Ld = LocalDate.of(return_Year, return_Month, return_day);
                                        b1 = true;
                                    } catch (DateTimeException ex) {
                                        b1 = false;
                                        JOptionPane.showMessageDialog(null, ex.getMessage());
                                    }
                                } while (!b1);
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            m.all_over_periodB(Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            m.all_over_periodM(Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            m.all_over_periodBL(Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }

                                break;
                            }
                            case "8": {
                                back = false;
                                break;
                            }
                            default: {
                                JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                            }
                        }
                    }
                    break;
                }
                case "2":// for Student functions
                {
                    int s_id = 1;
                    boolean f;
                    do {
                        try {
                            s_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your ID: "));
                            if (s_id <= 0) {
                                f = false;
                                JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                            } else {
                                f = true;
                            }
                        } catch (NumberFormatException e) {
                            f = false;

                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                        }
                    } while (!f);
                    String Student_fname = "";
                    boolean f1;
                    do {

                        try {
                            Student_fname = JOptionPane.showInputDialog("Enter your First name: ");
                            if (Student_fname.length() == 0) {
                                throw new Exception();
                            } else {
                                for (int i = 0; i < Student_fname.length(); i++) {
                                    if (!(Student_fname.charAt(i) >= 'A' && Student_fname.charAt(i) <= 'Z' || Student_fname.charAt(i) >= 'a' && Student_fname.charAt(i) <= 'z')) {
                                        throw new Exception();
                                    }
                                }
                            }
                            f1 = true;
                        } catch (Exception e) {
                            f1 = false;
                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                        }
                    } while (!f1);
                    String Student_lname = "";
                    boolean f3;
                    do {
                        try {
                            Student_lname = JOptionPane.showInputDialog("Enter your Last Name: ");
                            if (Student_lname.length() == 0) {
                                throw new Exception();
                            } else {
                                for (int i = 0; i < Student_lname.length(); i++) {
                                    if (!(Student_lname.charAt(i) >= 'A' && Student_lname.charAt(i) <= 'Z' || Student_lname.charAt(i) >= 'a' && Student_lname.charAt(i) <= 'z')) {
                                        throw new Exception();
                                    }
                                }
                            }
                            f3 = true;
                        } catch (Exception e) {
                            f3 = false;
                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                        }
                    } while (!f3);
                    String Student_Uname = "";
                    boolean f2;
                    do {
                        try {
                            Student_Uname = JOptionPane.showInputDialog("Enter Your User name: ");
                            if (Student_Uname.length() == 0) {
                                f2 = false;
                                JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                            } else {
                                f2 = true;
                            }
                        } catch (NullPointerException ex) {
                            f2 = false;
                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                        }
                    } while (!f2);
                    Student s1 = new Student(s_id, Student_fname, Student_lname, Student_Uname);
                    boolean back = true;
                    while (back) {
                        String opretion = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation

                                + "1- search about publication . \n"
                                + "2- To Borrrow publication . \n"
                                + "3- TO return publication . \n"
                                + "4-Show all Publication lists . \n"
                                + "5- Back to main list . \n");
                        if (opretion == null) {
                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                            continue;
                        }
                        switch (opretion) {
                            case "1": // to search 
                            {
                                String book_name = "";
                                boolean f4;
                                do {
                                    try {
                                        book_name = JOptionPane.showInputDialog("Enter the name of Publication: ");
                                        if (book_name.length() == 0) {
                                            f4 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f4 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f4 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f4);
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }

                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            Manager.search_book(book_name);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            Manager.search_magazine(book_name);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            Manager.search_booklet(book_name);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "2": {//to borrow book
                                int b_id = 1;
                                boolean f5;
                                do {
                                    try {
                                        b_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your Publication_ID: "));
                                        if (b_id <= 0) {
                                            f5 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                        } else {
                                            f5 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f5 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    }
                                } while (!f5);
                                String book_name = "";
                                boolean f4;
                                do {
                                    try {
                                        book_name = JOptionPane.showInputDialog("Enter the name of Publication: ");
                                        if (book_name.length() == 0) {
                                            f4 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f4 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f4 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f4);
                                LocalDate Ld = LocalDate.now();
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            s1.borrow_Book(b_id, book_name, s_id, Student_fname, Student_lname, Student_Uname, Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            s1.borrow_Magazine(b_id, book_name, s_id, Student_fname, Student_lname, Student_Uname, Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            s1.borrow_Booklet(b_id, book_name, s_id, Student_fname, Student_lname, Student_Uname, Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "3": { //to return Publication
                                int b_id = 1;
                                boolean f5;
                                do {
                                    try {
                                        b_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Your Publication_ID: "));
                                        if (b_id <= 0) {
                                            f5 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                        } else {
                                            f5 = true;
                                        }
                                    } catch (NumberFormatException e) {
                                        f5 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid number");
                                    }
                                } while (!f5);
                                String book_name = "";
                                boolean f4;
                                do {
                                    try {
                                        book_name = JOptionPane.showInputDialog("Enter the name of Publication: ");
                                        if (book_name.length() == 0) {
                                            f4 = false;
                                            JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                        } else {
                                            f4 = true;
                                        }
                                    } catch (NullPointerException ex) {
                                        f4 = false;
                                        JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                    }
                                } while (!f4);
                                boolean b3 = true;
                                LocalDate Ld = LocalDate.now();
                                do {
                                    boolean bool = false;
                                    do {
                                        int return_day = 1;
                                        boolean f6;
                                        do {
                                            try {
                                                return_day = Integer.parseInt(JOptionPane.showInputDialog("Enter the current Day: "));
                                                f6 = true;
                                            } catch (NumberFormatException e) {
                                                f6 = false;
                                                JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                            }
                                        } while (!f6);
                                        int return_Month = 1;
                                        boolean f9;
                                        do {
                                            try {
                                                return_Month = Integer.parseInt(JOptionPane.showInputDialog("Enter the current Month: "));
                                                f9 = true;
                                            } catch (NumberFormatException e) {
                                                f9 = false;
                                                JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                            }

                                        } while (!f9);
                                        int return_Year = 1;
                                        boolean f7;
                                        do {
                                            try {
                                                return_Year = Integer.parseInt(JOptionPane.showInputDialog("Enter the current Year: "));
                                                 f7 = true;
                                            } catch (NumberFormatException e) {
                                                f7 = false;
                                                JOptionPane.showMessageDialog(null, "Please Enter a valid Input");
                                            }

                                        } while (!f7);
                                        try {
                                            Ld = LocalDate.of(return_Year, return_Month, return_day);
                                            if (Ld.compareTo(LocalDate.now()) < 0) {
                                                bool = false;
                                                JOptionPane.showMessageDialog(null, "Please Enter a valid date");
                                            } else {
                                                bool = true;
                                            }
                                            b3 = true;
                                        } catch (DateTimeException ex) {
                                            b3 = false;
                                            JOptionPane.showMessageDialog(null, ex.getMessage());
                                        }
                                    } while (!bool);
                                } while (!b3);
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            s1.return_book(b_id, book_name, Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            s1.return_Magazine(b_id, book_name, Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            s1.return_booklet(b_id, book_name, Ld);
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "4": {
                                boolean ok = false;
                                while (!ok) {
                                    String search_type = JOptionPane.showInputDialog("Choose number :\n" //to choose opreation
                                            + "1- book \n"
                                            + "2- magazine \n"
                                            + "3- booklet \n"
                                            + "4- to cancle opreation  \n");
                                    if (search_type == null) {
                                        JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        continue;
                                    }
                                    switch (search_type) { //to choose the type of the publication
                                        case "1": {
                                            Manager.Show_BookList();
                                            ok = true;
                                            break;
                                        }
                                        case "2": {
                                            Manager.Show_MagazineList();
                                            ok = true;
                                            break;
                                        }
                                        case "3": {
                                            Manager.Show_Bookletlist();
                                            ok = true;
                                            break;
                                        }
                                        case "4": {
                                            ok = true;
                                            break;
                                        }
                                        default: {
                                            JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                                        }
                                    }
                                }
                                break;
                            }
                            case "5": {
                                back = false;
                                break;
                            }
                            default: {
                                JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                            }
                        }

                    }
                    break;
                }
                case "3":// to close porogram
                {
                    JOptionPane.showMessageDialog(null, "BYE :hugging: ");
                    System.exit(0);
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                }
            }
        }

    }

}
