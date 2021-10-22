package ru.madbrains.javacourse.lesson3.lesson_3;

import ru.madbrains.javacourse.lesson3.Employer;

public class QA extends Employer<ITRole> {

    public QA(String name, int age){
        super(name, age, ITRole.QA);
    }
    public void work(){
        System.out.println(this.getName() + " is testing");
    }
}
