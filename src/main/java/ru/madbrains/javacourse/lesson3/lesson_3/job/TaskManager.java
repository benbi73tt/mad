package ru.madbrains.javacourse.lesson3.lesson_3.job;

import java.util.ArrayList;
import java.util.List;

public class TaskManager <T extends Job>{
    List<T> tasks = new ArrayList<>();

    public void addTask(T task){
        tasks.add(task);
    }

    public void run() throws InterruptedException {
        while(true){
            tasks.forEach(task -> task.run());
            Thread.sleep(1000);
        }

    }

}
