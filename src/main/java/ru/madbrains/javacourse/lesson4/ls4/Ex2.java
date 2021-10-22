package ru.madbrains.javacourse.lesson4.ls4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Ex2 {
    private static volatile int a = 0; // volatile - чаще кэширование,
    // но не исключает возникновение отличаемое от истиннного значение
    private static AtomicInteger b = new AtomicInteger(0);//использовать для операций между потоками

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                 {
                    //for(int i = 0;i < 10;i++)
                    IntStream.range(0,10).forEach(i->b.incrementAndGet());
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                {

                    IntStream.range(0,10).forEach(i->b.decrementAndGet());

                }
            }
        });
        System.out.println(Thread.currentThread().getName());
//        Thread.sleep(5000);
        thread.start();
        thread2.start();


        thread.join();
        thread2.join();
        System.out.println(b);
    }
}

