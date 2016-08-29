package Conversor;

import java.util.HashMap;
import java.util.Map;

public class Conversor {

	@SuppressWarnings("serial")
	private static Map<Character, Integer> tabela = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public Conversor() {

	}

	public int conversao(String r) {
		int acumulador = 0;
		int ultimoVizinhoDaDireita = 0;

		for (int i = r.length() - 1; i >= 0; i--) {
			// pega o inteiro referente ao simbolo atual
			int atual = tabela.get(r.charAt(i));

			// se o da direita for menor, o multiplicaremos
			// por -1 para torná-lo negativo
			int multiplicador = 1;
			if (atual < ultimoVizinhoDaDireita)
				multiplicador = -1;
			acumulador += tabela.get(r.charAt(i)) * multiplicador;

			// atualiza o vizinho da direita
			ultimoVizinhoDaDireita = atual;
		}
		return acumulador;
	}

}
