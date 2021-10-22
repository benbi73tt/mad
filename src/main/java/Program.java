import ru.madbrains.javacourse.lesson1ANDlesson_2.Developer;
import ru.madbrains.javacourse.lesson1ANDlesson_2.Employer;

public class Program {
    public static void main(String[] args){
        Employer employer = new Employer();
        employer.work();

        Developer developer = new Developer("Igor Petrov",26);
        developer.setLanguage("Java");
        developer.work();
        developer.writeCode();

    }

}