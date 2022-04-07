/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioc.dam.m9.uf2.eac1.b2;

/**
 *
 * @author Usuari
 */
public class SortidorThread extends Thread {

	private String nom;

	private Client client;

	private long initialTime;

	// Constructor, getter & setter

   
         
        
	@Override
	public void run() {
                
              
	}

	void esperarXsegons(int segons) {
		try {
			Thread.sleep((segons * 1000)/(segons*2));
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

}
}
