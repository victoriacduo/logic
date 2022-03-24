package exerciciosmatriz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Ex6 {

	 public static void main(String[] args) {
	        int[][]mega = new int[5][5];
	        int[][]numero = new int[5][5];
	        Random gerador = new Random();
	        
	        List<Integer> lista = new ArrayList<>(99);
	        for (int i = 1; i <= 99; i++) {
	            lista.add(i);
	        }
	        Collections.shuffle(lista);
	        lista = lista.subList(0, 5);
	        
	        for(int x=0; x<5; x++) {
	            for(int y=0; y<5; y++) {
	                mega[x][y] = gerador.nextInt(90) + 1;
	            }   
	        }
	        for(int x=0; x<5; x++) {
	            for(int y=0; y<5; y++) {
	                System.out.print(mega[x][y] + " ");
	            }
	            System.out.println();
	        }
	    }
	 
	 
	 
	 	public void teste() {
	 		int[] indice = new int[10];
	 		
	 		for(int i = 0; i < indice.length; i++) {
	 			
	 		}
	 	}
	}