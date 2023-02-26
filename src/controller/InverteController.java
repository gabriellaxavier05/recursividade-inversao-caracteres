package controller;

public class InverteController {
	
	//função recursiva
	public String invertePalavra(String v) {
		if (v.length() <= 1) {
			return v; //caso base. se a palavra informada tiver 1 letra ou nada, é retornado v 
		}
		
		char p = v.charAt(0);
		char u = v.charAt(v.length() - 1);
		String mi = invertePalavra(v.substring(1, v.length() - 1));
		return u + mi + p;
		
		/*
		 * Os passos acima retiram a 1a e a última letra da palavra informada. Depois, tendo as retirado, chama a 
		 * própria função para concatenar o que foi tirado. Ao final, retorna a última letra, a(s) letra(s) do meio e a primeira.
		 * Tudo de trás para frente.
		 */
	}
	
}
