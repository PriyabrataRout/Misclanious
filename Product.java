package com.mine.DS_ALGO;

import java.util.Scanner;

public class Product {
	public void produce() throws InterruptedException {
		Thread.sleep(100);
		synchronized (this) {
			System.out.println("production running");
			wait();
			System.out.println("Production Resumed");
		}

	}

	public void consume() throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		synchronized (this) {
			System.out.println("Conumer running");
			scan.nextLine();
			System.out.println("key pressed");
			notify();
			Thread.sleep(100);
		}

	}
}

