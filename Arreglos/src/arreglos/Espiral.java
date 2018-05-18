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
public class Espiral {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz= new int[10][10];
        int n=5; //Matriz cuadrada 8x8
        int inicio=0;
        int nlimite=n-1;
        int c=1;
        while(c<=(n*n)){
            for(int i=inicio; i<=nlimite; i++){
                matriz[inicio][i]=c++;
            }
//            for(int i=inicio+1; i<=nlimite; i++){
//                matriz[i][nlimite]=c++;
//            }
//            for(int i=nlimite-1;i>=inicio; i--){
//                matriz[nlimite][i]=c++;
//            }
//            for(int i=nlimite-1;i>=inicio+1;i--){
//                matriz[i][inicio]=c++;
//            }
//            inicio = inicio+1;
//            nlimite = nlimite-1;
        }
        for(int i=0;i<n;i++){
	    System.out.println();
	    for(int j=0;j<n;j++){
		System.out.print(matriz[i][j]+"\t");
	    }
	}
    }
}
