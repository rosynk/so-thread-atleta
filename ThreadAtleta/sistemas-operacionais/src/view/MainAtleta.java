package view;

import java.util.concurrent.Semaphore;
import controller.ThreadAtleta;

public class MainAtleta {
	public static void main(String[] args) {
		
		Semaphore tiro = new Semaphore(5);
		
		for (int idAtleta = 0 ; idAtleta < 4 ; idAtleta++) {
			Thread TAtleta = new ThreadAtleta(idAtleta, tiro);
			TAtleta.start();
		}
	}
}
