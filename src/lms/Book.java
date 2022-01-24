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
public class Book extends Publication{

    
    public Book(int Id, String name, String author, String Publisher, int NumberOfThisBook, boolean if_borrowed) {
        super(Id, name, author, Publisher, NumberOfThisBook, if_borrowed);
    }

    

    
    public Book(int Id, String name) {
        super(Id, name);
    }
}
