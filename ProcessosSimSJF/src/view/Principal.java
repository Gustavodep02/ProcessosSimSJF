package view;



import java.util.Arrays;

import controller.ThreadSJF;

public class Principal {

	public static void main(String[] args) {
	
		int [] tempo = new int[20];
		for(int i = 0; i<20;i++) {
			tempo[i] = (int) (Math.random()*117) + 4;
			
		}
		Arrays.sort(tempo);
		for(int j = 0;j<20;j++) {
			Thread t = new ThreadSJF(j+1,tempo[j] );
			t.start();
		}
	}

}
