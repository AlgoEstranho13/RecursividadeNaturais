package controller;

public class NaturaisControle {

	public static int somaNatu(int N) {
		//Condi��o de parada -> Quando N for subtra�do at� ser 0 ou o n�mero lido for negativo
		if (N<=0)
		{
			return 0;
		}
		else
		{
			//O pr�ximo passo � chamado atrav�s da soma do valor atual de N mais o resultado da fun��o de N-1
			int soma = N + somaNatu((N-1));
			return soma;
		}
	}

}
