package _2.lab2.task1;

public class Author{
private String name;
private String email;
private char gender;

public void Author(String n, String em, char gen){
        name = n;
        email = em;
        gender = gen;
        }
public String getName(){
        return name;
        }
public String getEmail(){
        return email;
        }

public void setName(String newName){
        name = newName;
        }
public void setGender(char newGender){
        gender=newGender;
        }
public void setEmail(String newEmail){
        email = newEmail;
        }
public String toString(){
        return "Имя:"+name+"\n"+"Почта:"+email+"\n"
        +"Гендер: "+gender;
        }
        }
