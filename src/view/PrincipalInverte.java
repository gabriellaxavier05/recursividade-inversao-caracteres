package view;

import controller.InverteController;

public class PrincipalInverte {

	public static void main(String[] args) {

		//instanciando a classe controller e criando um objeto a partir dela
		InverteController i = new InverteController();

		//chamando a função recursiva
		String v = "loving";
		String vi = i.invertePalavra(v);
		System.out.println("A palavra " + v + " invertida fica: " + vi);
		

	}

}
