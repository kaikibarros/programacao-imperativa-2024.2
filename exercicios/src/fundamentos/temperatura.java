package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		// F - 32 x 5/9 = C
		 final double fator = 5.0/9;
		 final int ajuste = 32 ;
		 double F = 86;
		 double Celsius = (F - ajuste) * fator;
		 System.out.println("O resultado é " + Celsius +" Celsius" );
	}
}