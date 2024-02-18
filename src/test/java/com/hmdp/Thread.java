package com.hmdp;

public class Thread {
    public static void main(String[] args) {
        java.lang.Thread t1=new java.lang.Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

    }



}
