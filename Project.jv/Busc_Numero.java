
import java.util.Scanner;

public class Busc_Numero {
    
    public static void main(String[] args) {
        
      int[] vetor = new int[5];
      
      for (int i = 0; i < vetor.length; i++){
          vetor[i] = i * 2;
          System.out.println(vetor[i]);
      } 
      System.out.println("Qual numero vc busca ? \n");
        
      Scanner leitor = new Scanner(System.in);
      
      int buscado = leitor.nextInt();
      
      boolean achou = false;
      
      int inicio = 0;
      int fim = vetor.length -1;
      int meio;
      
      while(inicio <= fim){
      meio = (int) (inicio + fim) / 2;
      if(vetor[meio] == buscado){
          
          achou = true;
          break;
        } else{  
          if (vetor[meio] < buscado){
              inicio = meio + 1;
              
          }else{
               fim = meio -1;
          }
      }
      if (achou == true){
          System.out.println("Número encontrado!!");
      }else{
          System.out.println("Número nao encontrado!!");
      }
    }
        
    
    
    }
}