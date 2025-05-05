package com.shiv.thread;

public class ThreadDemo extends Thread {
	
	public void run(){
		System.out.print("running");
	}
	
	public static void main(String args[]){
		ThreadDemo t = new ThreadDemo();
		t.start();
	}

}

