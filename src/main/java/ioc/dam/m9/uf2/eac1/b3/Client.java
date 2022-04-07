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
class Client extends Thread {
 private static final int MAX_DELAY = 2000; 
 private static final int MAX_COST = 100; 
 private int id; 
 private Sortidor Sortidor;
 
 Client (int id, Sortidor Sortidor) {  
     this.id = id;
   this.Sortidor = Sortidor; 
 }
 
 public void run() { 

     /*
     try {
         
       
        
        } catch (InterruptedException e) {    
            e.printStackTrace();  
        } */
    }
 }