package com.mycompany.ch12;

import java.awt.Toolkit;
import java.util.Iterator;

public class BeepPrintThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread thread = new Thread(new Runnable() {
			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					System.out.println("kim");
//					toolkit.beep();
//					try { Thread.sleep(500);} catch (Exception e) {}
//				}
//				
//			}
//		});
		
//		thread.start();
		
//		방법2
//		Runnable runnable = new BeepRunnable();
//		Thread thread = new Thread(runnable);
//		
//		thread.start();
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("kim");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {}
//		}
		
		Thread thread = new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					System.out.println("kim");
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();

	}

}
