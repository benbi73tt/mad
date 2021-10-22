package ru.madbrains.javacourse.lesson1ANDlesson_2;

public class Employer {
    private String name;
    private int age;

    public Employer(){

    }

    public Employer(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void work(){
        System.out.println(this.name + " is working");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
