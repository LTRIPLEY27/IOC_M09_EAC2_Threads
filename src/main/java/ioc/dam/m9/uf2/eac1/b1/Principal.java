/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioc.dam.m9.uf2.eac1.b1;

/**
 *
 * @author Isabel C.
 */
public class Principal {

	public static void main(String[] args) {

		Client one = new Client("Client 1", 20);
		Client two = new Client("Client 2", 50);
		//INSTANCIACIÓN DEL SORTIDOR

		Sortidor sortidor = new Sortidor("SORTIDOR 1 ");
		Sortidor sortidor2 = new Sortidor("SORTIDOR 2 ");

		long tempsInicial = System.currentTimeMillis();

		//LLAMADO AL MÉTODO PROCESAR
		sortidor.processarCompra(one, tempsInicial);
		sortidor2.processarCompra(two, tempsInicial);

	}
}