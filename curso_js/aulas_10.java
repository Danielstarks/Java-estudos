
package curso_js;

import java.util.Scanner;

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
