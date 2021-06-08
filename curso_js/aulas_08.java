
package curso_js;

import java.util.Scanner;


public class aulas_08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("Informe o valor da base ?");
        base = input.nextDouble();
        
        System.out.println("Informe valor da altura ?");
        altura = input.nextDouble();
        
        areaRetangulo = base * altura;
        
        System.out.println("A area de um retangulo da base =" + base);
        System.out.println("e altura" + altura);
        System.out.println("é " + areaRetangulo);
        
        System.out.println("");
    }
}
