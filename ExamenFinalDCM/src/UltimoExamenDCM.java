
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio
 */
public class UltimoExamenDCM {
     public void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public int[][] transformada08DCM(int dimen, int NumInit){
         System.out.println("Ejercicio 8: ");
          int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                   if (j>=i){
                       matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
    public int[][] transformada24DCM(int dimen, int NumInit){
         System.out.println("Ejercicio 24: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = matriz[0].length-1; i>=0; i--) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) {
                    matriz[j][i]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
                    for (int[] matriz1 : matriz) {
                        matriz1[i] = NumInit;
                        NumInit++;
                        contador++;
                    }
            } 
            } contador=0;         
    return matriz;
    }
    
    public int[][] transformada25DCM(int dimen, int NumInit){
         System.out.println("Ejercicio 25: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
         for (int[] matriz1 : matriz) {
             if (contador%2==0) {
                 for (int j = 0; j< matriz.length; j ++) {
                     matriz1[j] = NumInit;
                     NumInit++;
                     contador++;
                 }
             } else {
                 for (int j = matriz[0].length-1; j>=0; j--) {
                     matriz1[j] = NumInit;
                     NumInit++;
                     contador++;
                 }
             }
         }
contador=0;         
    return matriz;
    }
    public int [][] transformado27DCM(int xy, int num){
        int matriz[][] = new int [xy][xy];
        int y=0;
        for (int x = matriz.length-1; x >= 0; x--) {
            if(y>=0/*y!=-1*/){
                for (y = matriz[0].length-1; y >= 0; y--) {
//                    System.out.println("["+x+"]["+y+"] = "+ num++ +"\t");
                    matriz[x][y] = num++;
                }
            }else{
                for (y = 0; y < matriz[0].length; y++) {
//                    System.out.println("["+x+"]["+y+"] = "+ num++ +"\t");
                    matriz[x][y] = num++;
                }
            }
        }
        return matriz;
    }
     public int [][] transformado35(int xy, int num){
        int matriz[][] = new int [xy][xy];
        int x,x1,x2,y,y1,y2;
        for (x = matriz.length-1; x >= matriz.length/2; x--) {
            for (y = (xy-1)-x; y <= x; y++) {
                matriz[x][y] = num++;
            }
            for (x1 = y-2; x1 >= (xy-1)-x; x1--) {
                matriz[x1][x] = num++;
            }
            for (y1 = y-2; y1 >= (xy-1)-x; y1--) {
                matriz[x1+1][y1] = num++;
            }
            for (x2 = y1+2; x2 < y-1; x2++) {
                matriz[x2][y1+1] = num++;
            }
        }
        return matriz;
    }
     public static void main(String[] args) {
               Scanner o=new Scanner(System.in);
               ExamenDCM  or=new ExamenDCM();
               System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
               Scanner leer=new Scanner(System.in);
               int opcion =leer.nextInt();
               System.out.println("Ingrese la dimencion de la matriz: ");
               int din=o.nextInt();
               System.out.println("Ingrese el numero de inicio: ");
               int ini=o.nextInt();
               System.out.println("\n");
               while (opcion!=0) {            
               switch(opcion){
               case 1: or.imprimir(or.transformada08DCM(din, ini)) ; break;
               case 2: or.imprimir(or.transformada24DCM(din, ini));break;
               case 3: or.imprimir(or.transformada25DCM(din, ini)); break;
               case 4: or.imprimir(or.transformada27DCM(din, ini)); break;
               case 5: or.imprimir(or.transformada35DCM(din, ini)); break;
            
               default: System.out.println("Opción Inválida!!");break;
               }  
               System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
               opcion =leer.nextInt();
        }
    }
    
}
