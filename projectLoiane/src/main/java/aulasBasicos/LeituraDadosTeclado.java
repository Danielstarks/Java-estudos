package aulasBasicos;



import java.util.Scanner;

/**
 *
 * @author danielstark
 */
public class LeituraDadosTeclado {
    
    public static void main(String[] args) {
        
       try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: "+ nomeCompleto);
        
          System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu nome completo é: "+ primeiroNome);
        
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + "anos!!");
      }
        
       
    }
}
