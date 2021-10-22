package ru.madbrains.javacourse.lesson3.lesson_3;


import ru.madbrains.javacourse.lesson3.Employer;

public class Developer extends Employer<ITRole> {
    private String language;

    public String getLanguage() {
        return language;
    }

    public Developer(String name, int age, String language){
        super(name,age, ITRole.Developer);
        this.language = language;
    }

    @Override
    public void work(){
        writeCode();
    }

    private void writeCode(){
        System.out.println(this.getName() + " is writing " + this.language+ " code");
    }

    public String toString(){
        return "Developer {" +
                "name = '" + this.getName() + '\'' +
                " age = '" + this.getAge() + '\'' +
                ", language = " + language +
                '}';
    }
}
