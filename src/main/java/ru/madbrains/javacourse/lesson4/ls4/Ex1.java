package ru.madbrains.javacourse.lesson4.ls4;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Ex1 {
    private static long a=0;
    private static Semaphore sem = new Semaphore(1);
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                   // synchronized (Ex1.class){
                    // if (sem.tryAcquire()){//если удалось занять текущий симофор
                    lock.lock();
                    if(a % 2 == 0) System.out.println(a);
                    lock.unlock();
                    //    sem.release();//можем освободить
                    //}
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    //synchronized (Ex1.class){
                    //   if (sem.tryAcquire()){//если удалось занять текущий симофор
                    lock.lock();
                    a++;
                    lock.unlock();
                    //sem.release();//можем освободить
                    //}
                }
            }
        });
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
        thread.start();
        thread2.start();


        thread.join();
        thread2.join();
    }
}
