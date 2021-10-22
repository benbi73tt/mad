package ru.madbrains.javacourse.lesson3;

import java.util.Objects;

public class ITCompany extends EntityManager<Employer> {
    private String name;

    public ITCompany(String companyName, int maxExampleCount){
        super(maxExampleCount, Employer.class);
        this.name = companyName;
    }

    public void startWork(){
        for(int i = 0; i<this.getSize(); i++){
            Employer[] workers = this.getEntities();
            Employer worker = workers[i];
            worker.work();
            System.out.println(worker.getName() + " is "+ worker.getRole());
        }
    }
    public String getName(){return name;}

    @Override
    public String toString(){
        return "ITCompany {"+
                "name = '" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ITCompany company= (ITCompany) o;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
