package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá galera".charAt(0));
		
		String s = "Boa tarde";
		
		System.out.println(s + "!!!");
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		var nome = "Pedro";
		var sobrenome = "Orlando";
		var idade = 33;
		var salario = 1300.50;
		
		// em caso de um print muito longo é melhor formatar do que usar println 
		System.out.printf("nome: %s %s%n", nome, sobrenome);
		
		String frase = String.format("nome: %s %s", nome, sobrenome);
		System.out.println(frase);
	}
}
