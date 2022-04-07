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
public class Sortidor{
 
 private static final int MAX_TIME = 1000;
 
class Node {        
    int client;
    Node sig;    
}        

Node arrel, fons; 

 public Sortidor() {        
     arrel=null;
     fons=null;    
     }        
 
 private boolean buida (){        
     if (arrel == null)            
         return true;
         else            
         return false;    
 }
 
 synchronized public void esperar (int id_client) throws InterruptedException    
 {             
     
    }
 
    synchronized public void atendre (int pagament) throws InterruptedException    {        
       
        
    }
 
  synchronized public void imprimir() {        
      Node reco=arrel;        
      while (reco!=null) {            
          System.out.print(reco.client+"-");            
          reco=reco.sig;        
          }        
          System.out.println();    
  } 
}
  
