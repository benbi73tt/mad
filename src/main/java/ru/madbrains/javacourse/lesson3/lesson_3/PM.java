package ru.madbrains.javacourse.lesson3.lesson_3;

import ru.madbrains.javacourse.lesson3.Employer;

public class PM extends Employer<ITRole> {

    public PM(String name, int age){
        super(name, age, ITRole.PM);
    }
    public void work(){
        System.out.println(this.getName() + " is managing project");
    }
}
