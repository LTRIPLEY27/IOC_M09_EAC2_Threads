/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioc.dam.m9.uf2.eac1.b3;
import java.util.Random;

/**
 *
 * @author Usuari
 */
public class Benzinera { 
    public static void main(String[] args) throws InterruptedException {
        
    
   //int N = Integer.parseInt (args[0]);    
   int N=3;
   Sortidor Sortidor[] = new Sortidor[N];   
   for (int i= 0; i < N; i++){    
       Sortidor[i]= new Sortidor();   
   }
   
   //int M = Integer.parseInt (args[1]);   
   int M=20;
   Client clients[] = new Client[M];
    int j=0;
    for (int i= 0; i < M; i++){    // Seleccionem en quina Sortidor es situarà  
    j = new Random().nextInt(N);     
    clients[i]= new Client(i,Sortidor[j]);    
    clients[i].start();   
    }
   try {    
    for (int i= 0; i < M; i++){      
        clients[i].join();    
        }   
    } catch (InterruptedException ex) {
        
        System.out.println("Fil principal interrumput.");  
    }   
   
        System.out.println("Benzinera tancada.");   
        System.out.println("Guanys: " + Resultats.guanys);   
        System.out.println("Tiemps mig d'espera: " +    (Resultats.temps_espera / Resultats.clients_atessos));                 
    } 
}
