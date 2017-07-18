package com.aletsRdz.matriz;

public class Matriz{
	public static void main(String[] args) {
		int n = 1;
		int[][] miMatriz = new int[4][4];
		for(int i=0; i<miMatriz.length; i++) 
		{
			for(int j=0; j<miMatriz.length; j++) {
				miMatriz[i][j]= (n++)*2 ;
			}	
			
		}
		
		for(int i=0; i<miMatriz.length; i++) 
		{
			for(int j=0; j<miMatriz.length; j++)
				System.out.print(miMatriz[i][j] +  " ");
				System.out.println();

		}
		
	
	}
}