package controller;

import java.util.concurrent.Semaphore;

public class ThreadSJF extends Thread{
	Semaphore semaforo = new Semaphore(1);
	int processo ;
	private int tempo;
	public ThreadSJF(int processo, int tempo) {
		this.processo = processo;
		this.tempo = tempo;
	}
	
	@Override
	public void run() {
		try {
		semaforo.acquire();
		processar();
		}catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}finally {
			semaforo.release();
		}
		System.out.println("Processo "+processo+" finalizado em "+tempo+" segundos");
	}
	
	public void processar() {
        try {
            Thread.sleep(tempo*1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
