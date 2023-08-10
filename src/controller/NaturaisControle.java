package controller;

public class NaturaisControle {

	public static int somaNatu(int N) {
		//Condição de parada -> Quando N for subtraído até ser 0 ou o número lido for negativo
		if (N<=0)
		{
			return 0;
		}
		else
		{
			//O próximo passo é chamado através da soma do valor atual de N mais o resultado da função de N-1
			int soma = N + somaNatu((N-1));
			return soma;
		}
	}

}
