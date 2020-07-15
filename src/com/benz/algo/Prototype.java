package com.benz.algo;

import java.util.ArrayList;
import java.util.List;

class Book{
    private int bid;
    private String bname;

    public int getBid() {
        return bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
}

class BookShop implements Cloneable{

    private String shop_name;
    private List<Book> books;

    public BookShop() {
        books=new ArrayList<>();
    }

    public String getShop_name() {
        return shop_name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks()
    {
        for(int i=1;i<=10;i++)
        {
            Book book=new Book();
            book.setBid(1000+i);
            book.setBname("Book "+book.getBid());
            this.getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shop_name='" + shop_name + '\'' +
                ", books=" + books +
                '}';
    }

    public BookShop cloneBookShop()
    {
        BookShop bsc=new BookShop();
       this.getBooks().forEach(book->bsc.getBooks().add(book));
      //  this.getBooks().stream().map(book->bsc.getBooks().add(book));
          return bsc;
    }
}

public class Prototype{

    public void display() throws CloneNotSupportedException {
        BookShop bs1=new BookShop();
        bs1.setShop_name("Veyangalla Book Shop");
        bs1.loadBooks();

        BookShop bs2= bs1.cloneBookShop();
        bs2.setShop_name("Agalawatta Book Shop");
        bs2.loadBooks();
        bs2.getBooks().remove(1);

        System.out.println(bs1);
        System.out.println(bs2);;
    }
}
