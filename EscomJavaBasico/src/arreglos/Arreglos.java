/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Alumno
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // asi se declara un arreglo modo #1
//        int arregloEntero [] = {1,2,3,4,5,6,7,8,9,10};
       
       // asi se declara un arreglo modo #2
//        int [] arregloEntero  = {1,2,3,4,5,6,7,8,9,10};
        
        // asi se declara un arreglo modo #3
        int [] [] arregloEntero = new int [10] [10];
        int n = 1;
        
        // asi se declara ciclo for
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
            arregloEntero [i] [j] = n;
            n++;
            }
        }
        
        for (int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                System.out.print("\t" + arregloEntero [i] [j]);
            }
            System.out.println("");
        }
        

        //System.out.println("Termino el ciclo for");
    }
    
}
