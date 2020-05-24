package uf05.ejercicio.circulo;

import Circulo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Principal {

    ArrayList<Circulo> arraycirculo = new ArrayList<Circulo>();
    
    public static void main(String[] args) {
        Principal app = new Principal();
        app.start();

    }
    
    public void start(){
        double radio;
        do{
            radio = radioRandom();
            if(radio>=0.1){
                arraycirculo.add(new Circulo(radio));
            }            
        }while(radio>=0.1);
        
    }
    
    public double radioRandom(){
        return Math.random();
    }
    
  
    
}

