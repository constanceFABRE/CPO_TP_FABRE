/*
* Constance FABRE
Exercice 3 TP0
Vendredi 20 septembre 2024
 */

package com.mycompany.exo3_tp0;

import java.util.Scanner;

/**
 *
 * @author constancefabre
 */
public class EXO3_TP0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        int operande1;
        int operande2;
        int result;
       
        operateur = 0;
        operande1 = 0;
        operande2 = 0;
        result = 0;
       
       
        System.out.println("Please enter the operator:");
        System.out.println("1) Add");
        System.out.println("2) Substract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Modulo");
       
        operateur = sc.nextInt();
        if (operateur<1 && operateur>5){
            System.out.println("Please enter the operator:");
        }
       
       
        System.out.println("Please enter the first number:");
        operande1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        operande2 = sc.nextInt();
       
       
        if (operateur==1){
            result = operande1 + operande2;
        }
       
        if (operateur==2){
            result = operande1 - operande2;
        }
       
        if (operateur==3){
            result = operande1 * operande2;
        }
       
        if (operateur==4){
            result = operande1 / operande2;
        }
       
        if (operateur==5){
            result = operande1 % operande2;
        }
       
       
        System.out.println("The result is :"+ result);
    }
   
}
