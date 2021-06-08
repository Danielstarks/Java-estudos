
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class buscaSequencial {
   

	ArrayList<Integer> dados = new ArrayList<>();
	Map<Integer, Integer> tabelaIndexada;
	
	public buscaSequencial() {
        this.tabelaIndexada = new HashMap <>();
		Random random = new Random();
		
		for (int  i = 0; i <= 1000; i++) {
			dados.add(random.nextInt(1000));
			
		}
		Collections.sort(dados); 
		
		for(int i= 100; i <= 1000; i+=100) {
			tabelaIndexada.put(i, dados.get(i));
		}
	}
	
	public int buscaTabelaIndexada (int elemento) {
		for(Integer chave : tabelaIndexada.keySet()) {
			if(tabelaIndexada.get(chave) > elemento) {
				return chave;
			}
			
		}
		return -1;
	}
	public int busca(int elemento) {
		int posicaoMaxima = buscaTabelaIndexada(elemento);
		if(posicaoMaxima < 0) return -1;
		for(int i = (posicaoMaxima -100); i < posicaoMaxima; i++) {
			if(dados.get(i) == elemento) {
				return i;
			}
		}
		return -1;
	}
}    


 





