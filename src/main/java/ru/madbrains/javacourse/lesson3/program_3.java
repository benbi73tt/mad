package ru.madbrains.javacourse.lesson3;

import ru.madbrains.javacourse.lesson3.lesson_3.Developer;
import ru.madbrains.javacourse.lesson3.lesson_3.PM;
import ru.madbrains.javacourse.lesson3.lesson_3.QA;


public class program_3 {
    public static void main (String[] args){
        Employer pm = new PM("Sergey kislynov",23);
        Employer qa = new QA("Yulia Shamraeva",27);
        Employer developer = new Developer("Tom Richards",33,"java");
       // developer.work();

//        List<Worker> workers = Arrays.asList(pm,qa,developer);
//        workers.stream().forEach(worker -> worker.work());
        
        ITCompany company = new ITCompany("MadBrains", 100);
        company.addEntities(pm);
        company.addEntities(qa);
        company.addEntities(developer);
        company.startWork();

        ITCompany company2 = new ITCompany("MadBrains",100);
        //System.out.println(company.toString());
        System.out.println("company: " + company);
        System.out.println(company.equals(company2));
    }
}
