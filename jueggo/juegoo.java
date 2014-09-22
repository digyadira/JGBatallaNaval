/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jueggo;

/**
 *
 * @author yadira
 */

import java.util.Scanner;

/**
 *
 * @author chuy
 */
public class juegoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        int suma;
        int cont=0;
        Scanner nuevo=new Scanner(System.in);
        String[][] i=new String[5][5];
        
       for(int q=0;q<5;q++){
       for(int j=0;j<5;j++){
       i[q][j]=" - ";
       }
       }
       
        for(int q=0;q<5;q++){
            System.out.println();
       for(int j=0;j<5;j++){
    System.out.print(i[q][j]);
       }
       }
     
      while(cont<3){
         System.out.println("ingrese las coordenada en y:");
        y=nuevo.nextInt();
         System.out.println("ingrese las coordenada en x:");
        x=nuevo.nextInt();
      
        if(y==3 && x==3){
           
            String disparo=" X ";
        i[y][x]=disparo; 
          for(int q=0;q<5;q++){
            System.out.println();
       for(int j=0;j<5;j++){
    System.out.print(i[q][j]);
       }
       }
           System.out.println("has ganado!!");
          break;
        }else{
            try{
          String disparo=" O ";
        i[y][x]=disparo;   
       System.out.println();
         for(int q=0;q<5;q++){
            System.out.println();
       for(int j=0;j<5;j++){
    System.out.print(i[q][j]);
       }
       }
            System.out.println("has fallado");
            suma=x+y;
            cont++;
         
        }
        
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("posicion fuera de rango!!");
        }
      }
      
    }
    
    }
}

