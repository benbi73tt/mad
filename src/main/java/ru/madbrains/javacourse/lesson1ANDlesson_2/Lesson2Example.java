package ru.madbrains.javacourse.lesson1ANDlesson_2;

public class Lesson2Example {
    public static void main(String[] args){
        Employer employer = new Employer();
        employer.setName("Sergey Kalashnikov");
        employer.setAge(30);
        System.out.println(employer);
        employer.work();

        Employer employer2 = new Employer();
        employer.setName( "Anton Burmistrov");
        employer.setAge(21);
        System.out.println(employer2);
        employer.work();

        Employer employer3 = new Employer("artem ananichev",20);
        System.out.println(employer3);
        employer3.work();
    }
}
