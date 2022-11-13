package _2.lab2.task4;

import java.util.ArrayList;

public class Shop{
    private String PC;
    private ArrayList<String> models;
    Shop(String PC){
        models = new ArrayList<>();
        this.PC=PC;
    }
    Shop(){
        models = new ArrayList<>();
    }
    public String getPC(){
        return PC;
    }
    public void setPC(String PC){
        this.PC=PC;
    }
    public void delPC(String a){
        models.remove(a);
    }
    public void add(String a){
        models.add(a);
    }

    public void getList(){
        for(int i = 0; i<models.size();i++){
            System.out.println(models.get(i));
        }
    }

    public boolean find(String a) {
        if (models.contains(a)){
            return true;
        } else {
            return false;
        }
    }
}
