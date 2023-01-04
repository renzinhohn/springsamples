package com.renzo.quickstart.java8training.zsamples00;

import com.renzo.quickstart.java8training.zsamples00.interfaces.Auto;
import com.renzo.quickstart.java8training.zsamples00.interfaces.OperacionBinariaEntera;
import com.renzo.quickstart.java8training.zsamples00.interfaces.OperacionUnariaEntera;

public class Test {

	public static void main(String[] args) {		

		System.out.println("kilometersTraveled by AutoAudi: "+new AutoAudi().running());
		Integer kilometersTraveled = new Auto() {		
			@Override
			public Integer running() {
				int b = 0;
				for (int i = 0; i < 10; i++) {			
					b++;
					
				}
				System.out.println("Auto is running...!");
				return b;
			}
		}.running();
		System.out.println("kilometersTraveled by Auto: "+kilometersTraveled);		
	}
	
	public void testing() {		
		//OperacionUnariaEntera operacionUnaria = x -> x+x;
		//OperacionBinariaEntera operacionBinaria = (x,y) -> x+y;
		//Runnable runnable = () -> System.out.println("Hello World!");
		
		OperacionUnariaEntera operacionUnariaA = x -> x+x+x;
		OperacionUnariaEntera operacionUnariaB = x -> {return x+x+x;};
		OperacionUnariaEntera operacionUnariaC = x -> {int r=x+x+x+x;return r+r;};
		
		OperacionBinariaEntera operacionBinariaA = (x,y) -> x+y;
		OperacionBinariaEntera operacionBinariaB = (x,y) -> {return x+y;};
		OperacionBinariaEntera operacionBinariaC = (x,y) -> {int r=x+y+x+y;return r+r;};
		
		Thread threadA = new Thread(() -> System.out.println("Hello World! #1"));
		
		Runnable runnableB = () -> System.out.println("Hello World! #2");
		Thread threadB = new Thread(runnableB);
		
		Thread threadC = new Thread(getRunnable());
	}
	
	private Runnable getRunnable() {
		return () -> System.out.println("Hello World! #3");
	}
}

/*
 * new Thread(new Runnable() {
 * 
 * @Override public void run() { for (int i = 0; i < 10; i++) {
 * System.out.println("printing: "+i); }
 * 
 * } }).start();
 */