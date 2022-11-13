package _2.lab2.task1;

import java.lang.*;
import java.util.Scanner;




public class TestAuthor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String n = "Шилдт";
        String em = "ih@mail.uk";
        char gen= 'M';
        Author auth = new Author();
        auth.Author(n,em,gen);
        System.out.println(auth.toString());
    }
}
