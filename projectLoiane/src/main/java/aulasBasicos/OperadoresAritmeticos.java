/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso2;

/**
 *
 * @author danielstark
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {

        int x = 10;
        int y = 35;
        
        System.out.println("resultado: " + (x+y));
        System.out.println("resultado: " + (x-y));
        System.out.println("resultado: " + (x/y));
        System.out.println("resultado: " + (x%y));
        
        boolean resultado1 = (x == 10)  && (y == 35);
        System.out.println("Valor x é AND valor y é - resultado: " + resultado1);
        
        
         boolean resultado2 = (x == y)  || (y == x);
        System.out.println("Valor x é OR valor y é - resultado: " + resultado2);
        
        
    }
}
