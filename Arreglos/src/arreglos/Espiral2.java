/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Skarton
 */
public class Espiral2 {
    
    
    public static void main(String[] args) {
        
        int[][] matriz= new int[5][5];
        int n=1;
        
        for (int x = 0; x <= 5; x++) {
            for (int y = x; y <= 4 - x; y++) {
                matriz[x][y] = n;
                n++;
            }
        }
        
        
        

        
        for(int i=0;i<5;i++){
	    System.out.println();
	    for(int j=0;j<5;j++){
		System.out.print(matriz[i][j]+"\t");
	    }
	}
        
    }
    
}
