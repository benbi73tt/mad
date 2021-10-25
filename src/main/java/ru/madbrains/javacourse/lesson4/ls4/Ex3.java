package ru.madbrains.javacourse.lesson4.ls4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Ex3 {
    private static List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable = () -> someFunc();
        Future<Integer> integerFuture = executorService.submit(callable); //вызов в потоках
        Future<Integer> integerFuture2 = executorService.submit(callable);

        System.out.println(integerFuture.get());//выполнение текущего потока блокируется до тех пора пока
        //не выполнится поток someFunc() и не вернет результат
        System.out.println(integerFuture2.get());

        executorService.shutdown(); // завершить работу
    }

    private static synchronized int someFunc(){
        IntStream.range(0,100).forEach(i -> nums.add(nums.get(nums.size() - 1) + 1));

        return nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}

