package aulasBasicos;



import java.util.Scanner;

/**
 *
 * @author danielstark
 */
public class IfElse {
    
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Entre com sua idade: ");
            int idade = scan.nextInt();
            
            if(idade >= 18){
            System.out.println("É maior de Idade.");
            } else{
                System.out.println("É menor de Idade.");
            }
        }
    }

}