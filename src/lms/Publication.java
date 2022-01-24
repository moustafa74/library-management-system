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
public abstract class Publication {

    protected int Id;
    protected String name;
    protected String author;
    protected String Publisher;
    protected int NumberOfThisBook;
    protected boolean if_borrowed;

    public Publication(int Id, String name, String author, String Publisher, int NumberOfThisBook, boolean if_borrowed) {
        this.Id = Id;
        this.name = name;
        this.author = author;
        this.Publisher = Publisher;
        this.NumberOfThisBook = NumberOfThisBook;
        this.if_borrowed = if_borrowed;
    }
    public Publication(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public int getNumberOfThisBook() {
        return NumberOfThisBook;
    }

    public void setNumberOfThisBook(int NumberOfThisBook) {
        this.NumberOfThisBook = NumberOfThisBook;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

     public boolean isIf_borrowed() {
        return if_borrowed;
    }

    public void setIf_borrowed(boolean if_borrowed) {
        this.if_borrowed = if_borrowed;
    }

    @Override
    public String toString() {
        return  "-Id=" + Id + "\n-name=" + name + "\n-author=" + author + "\n-Publisher=" + Publisher + "\n-NumberOfThisBook=" + NumberOfThisBook + "\n-if_borrowed=" + if_borrowed +"\n";
    }


}
