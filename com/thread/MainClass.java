package com.thread;

public class MainClass {
public static void main(String[] args) {
	MyThread mt=new MyThread();
	mt.start();
	mt.m1();
}
}
