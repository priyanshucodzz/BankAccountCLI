package Multithreading;


public class SharedData {
    int number=0;

    synchronized void add(int num){
        number += num;
    }
    synchronized void sub(int num){
        number -= num;
    }
}