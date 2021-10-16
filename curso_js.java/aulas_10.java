
package curso_js.java;

import java.util.Scanner;

// Calculo da Area de uma circunferência.

public class aulas_10 {
    
    public static void main(String[] args) {
        
        
        final double PI = 3.14;
         Scanner input = new Scanner(System.in);
         
        System.out.println("Informe o valor do Raio ?");
        double raio = input.nextDouble();
        
        double area = raio * raio * PI;
        
        System.out.println("O valor da area é :" + area);
    }
}
