/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioc.dam.m9.uf2.eac1.b1;

/**
 *
 * @author Usuari
 */
public class Sortidor {

	private String nom;

	// Constructor, getter y setter


	public Sortidor(String nom) {
		this.nom = nom;
	}

	//MÉTODOS DE ACCESO

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	//PARÁMETRO CLIENTE Y TIEMPO
	public void processarCompra(Client client, long timeStamp) {
		//long timeFinished;
		System.out.println("El sortidor " + this.nom + " COMENCA A DISPENSAR CARBURANT AL CLIENT: " + client.getNom() + " EN EL Temps: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");

		for (int i = 0; i < client.getNumLitres(); i++) {
			//System.out.println("Processat " + (i + 1) + " litres  ->Temps: "+ (((System.currentTimeMillis() - timeStamp) / 1000) + i) + " seg");
			System.out.println("Processat " + (i + 1) + " litres  ->Temps: "+ (System.currentTimeMillis() - timeStamp)  + " seg");
		}

		System.out.println("El sortidor " + this.nom + " HA FINALIZADO: " + client.getNom() + " EN EL Temps: " + (System.currentTimeMillis() - timeStamp) + " seg");
		timeStamp = (System.currentTimeMillis() - timeStamp);
	}

	private void esperarXsegons(int segons) {
		try {
			Thread.sleep((segons * 1000)/(segons*2)); //POR  DEFECTO EL HILO DUERME * 2
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}