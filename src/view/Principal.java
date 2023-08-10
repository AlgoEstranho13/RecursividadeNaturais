package view;
import controller.NaturaisControle;

public class Principal {
	
	public static void main(String arqs[]) {
		NaturaisControle NC = new NaturaisControle();
		int N = 5;
		
		System.out.println("A soma dos naturais até "+N+" é: "+NC.somaNatu(N));
	}

}
