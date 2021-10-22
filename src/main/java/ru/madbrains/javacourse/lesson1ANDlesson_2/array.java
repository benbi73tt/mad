package ru.madbrains.javacourse.lesson1ANDlesson_2;

public class array {
    public static void main(String[] args){
        int [] myArray = new int[10];
        for(int i=0;i<myArray.length;i++){
            myArray[i]=i+1;
            System.out.println(myArray[i]);
        }
        for (int a:myArray){
            System.out.println(a+""+myArray[a]);
        }
    }
}
