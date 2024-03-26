package controller;

import java.util.concurrent.Semaphore;

public class ThreadAtleta extends Thread {
	
	private int idAtleta;
	private Semaphore tiro;
	
	
	public ThreadAtleta (int idAtleta, Semaphore tiro) {
		this.idAtleta = idAtleta;
		this.tiro = tiro;
	}
	
	public void run () {
		corrida();
	}
	
	public void tiro() {
		
	}
	
	public void ciclismo() {
		int distanciaTotal = 5000;
		int correr = (int)((Math.random() * 41) + 20);
		int distanciaPercorrida = 0;
		
		
		while (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += correr;
			
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("O atleta #" + idAtleta + " pedalou por: " + distanciaPercorrida + "m. ****");
		}
		
		System.out.println("O atleta #" + idAtleta + " chegou na linha de chegada do triatlo!");
		
	}
	
	public void corrida() {
		int distanciaTotal = 3000;
		int correr = (int)((Math.random() * 21) + 10);
		int distanciaPercorrida = 0;
		
		
		while (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += correr;
			
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("O atleta #" + idAtleta + " correu por: " + distanciaPercorrida + "m. -----");
		}
		
		System.out.println("O atleta #" + idAtleta + " chegou na linha de chegada da corrida!");
		ciclismo();	
	}
}
