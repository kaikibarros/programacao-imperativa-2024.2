package fundamentos;

public class notacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia Tribuna X";
		s = s.replace("X", "Pernambuco");
		s = s.toUpperCase();
		s = s.concat("!!");
		
		System.out.println(s);
		// atenção: os  8 tipos primitivos não recebem a notação ponto
	}
}
