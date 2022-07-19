/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repaso2;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Repaso2 {

    public static void main(String[] args) {
        
        //String x = "anita lava la tina";
        
        Scanner sc = new Scanner(System.in);
        double[] v = new double[100];
        int i=0;
        
        boolean validarEstado = true;
        
        while(validarEstado == true)
        {
            System.out.println("Que desea hacer?\n 1. agregar numero\n 2. calcular minimo \n 3. salir");
            int op = Integer.parseInt(sc.nextLine());
            
            switch (op) {
                case 1:
                    System.out.println("Digite numero:");
                    v[i] = Double.parseDouble(sc.nextLine());
                    i++;
                    break;
                case 2:
                    int iMinimo = encontrarMinimo(v, i);
                    System.out.println("El minimo es: " + v[iMinimo]);
                    break;
                case 3:
                    validarEstado = false;
                    break;
                default:
                    validarEstado = false;
            }
        }
        
        //System.out.println("Es palindrome: " + esPalindrome(x) );
    }
    
    public static boolean esPalindrome(String x)
    {
       
        char[] xVector = x.toCharArray();
        
        boolean esPalindrome = true;
        
        for (int i = 0; i < xVector.length/2; i++) 
        {
            if(xVector[i] != xVector[xVector.length -1 -i])
            {
                esPalindrome = false;
            }
        }
        
        return esPalindrome;
    }
    
    // [5,6,7,10,2,-1,3,5]
    
    public static int encontrarMinimo(double[] v, int n)
    {
        double x = v[0];
        int j=0;
        for (int i = 0; i < n; i++) 
        {
            if(v[i] <= x)
            {
                x = v[i];
                j=i;
            }
        }
        return j;
    }
}
