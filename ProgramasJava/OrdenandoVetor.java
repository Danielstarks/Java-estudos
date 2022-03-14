
import java.util.Scanner;


public class OrdenandoVetor {
    
    public static void main(String[] args) {
        
        int Base;
        int vetor[];
        int auxiliar;
        boolean Orden = true;
        boolean Decr = false;
     
        Scanner input = new Scanner(System.in);  
        
        // Preenxer o vetor.
        System.out.println("Qual a quantidade de elementos para o vetor ? \n ");                          
        Base = input.nextInt();
      // ordenando o vetor.
        vetor = new int[Base];
        for(int i = 0; i < Base; i++){
            System.out.println("\nInforme o  " + (i + 1) +  " Valor e aperte Enter para continuar: " );
            vetor[i] = input.nextInt();
        } 
        // condição de true ou false.
          if(Orden = Base > 1){
              
              System.out.println("Ordem Crecente !! " + Orden);
          }else{ 
              if ( Decr = Base < -1){
            
              System.out.println("Ordem Decrecente!!" + Decr);
          }
          
         }
          
        //i = 5
        //j = 10
        //[10,5,19,20]
        for(int i = 0; i < Base; i++){
            
            // trocamos os valores do vetor caso posição i seja menor que j.
            for(int j = 0; j < Base; j++){
                
                if(vetor[i] < vetor[j]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
                
            }
            
        }
        for (int k = 0; k <  Base; k++){
            System.out.println(vetor[k]);
        }
     }  
}

