package _2.lab2.task7;

import java.util.Scanner;
class Book{
    private String Author;
    private String bookName;
    private int year;

    Book(){}

    public Book(String author, String bookName, int year) {
        Author = author;
        this.bookName = bookName;
        this.year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Автор: "+this.Author+"\n"+
                "Название: "+ this.bookName+"\n"+
                "Год выпуска: "+this.year;
    }
}class BookShelf {
    private Book[] shelf;
    private int n;
    private Book book;

    BookShelf(){}

    BookShelf(int n){
        Book shelf[]=new Book[n];
    }

    BookShelf(Book book, int n) {
        this.shelf[this.n]= this.book;
    }

    public Book getShelf(int i){
        return shelf[i];
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getN() {
        return n;
    }

    public void add(Book book, int i){
        this.shelf[i]=book;
    }


    public void setN(int n) {
        this.n = n;
    }


    public Book searchMin(){
        int g = Integer.MAX_VALUE;
        Book smallbook = new Book("fqewedd","fddwef",10);
        for(int i =0;i<this.n;i++){
            if(this.shelf[i].getYear()<g){
                g=this.shelf[i].getYear();
                smallbook=this.shelf[i];
            }
        }
        return smallbook;
    }

    public Book searchMax(){
        int g =Integer.MIN_VALUE;
        Book bigbox = new Book("dffwerd","fdwerfd",10);
        for(int i=0;i<this.n;i++){
            if(this.shelf[i].getYear()<g){
                g=this.shelf[i].getYear();
                bigbox=this.shelf[i];
            }
        }
        return bigbox;
    }

    public void sort(){
        for(int i =0;i<shelf.length;i++){
            int pos=i;
            int min=shelf[i].getYear();
            Book minE = shelf[i];
            for (int j=i+1;j<shelf.length;j++){
                if(shelf[j].getYear()<min){
                    pos = j;
                    min = shelf[j].getYear();
                }
            }
            shelf[pos]=shelf[i];
            shelf[i]=minE;
        }
    }

    public String toString(){
        return this.n+")"+this.shelf[this.n];
    }

}
public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int n=in.nextInt();
        BookShelf bookShelf = new BookShelf(n);

        for (int i =0;i<n;i++){
            String name = in.next();
            String nameBook=in.next();
            int year = in.nextInt();
            Book book = new Book(name,nameBook,year);
            bookShelf.add(book,i);
        }

        for(int i =0; i<n;i++){
            System.out.println(bookShelf.getBook());
        }
    }
}
