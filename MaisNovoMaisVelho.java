import java.util.Scanner;
public class MaisNovoMaisVelho {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		String nome;
		String nomeVelho;
		String nomeNovo;
		int idade , idadeVelho, idadeNovo, i=1;
		System.out.println ("Digite o nome do primeiro usu�rio:");
		nome=ler.next();
		System.out.println ("Digite a idade do primeiro usu�rio:");
		idade=ler.nextInt();
		nomeVelho=nome;
		nomeNovo=nome;
		idadeVelho=idade;
		idadeNovo=idade;
		while (i<=9) {
			System.out.println ("Digite o nome do outro usu�rio:");
		}
	}
}
