package ru.madbrains.javacourse.lesson1ANDlesson_2;

public class Developer  extends Employer {
    private String language;

    public Developer(){
    }

    public Developer(String name, int age){
        super(name,age);
    }

    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return language;
    }

    public void writeCode(){
        System.out.println(this.getName() + " is writing " + this.language+ " code");
    }
}
