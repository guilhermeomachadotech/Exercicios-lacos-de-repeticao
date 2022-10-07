import java.util.Scanner;
public class PrecoVenda {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		double custo, margem, pv, porcen;
		String resposta="s";
		while (resposta.equalsIgnoreCase("s")) {
			System.out.println ("Digite o custo do produto:");
			custo=ler.nextDouble();
			System.out.println ("Digite a margem de lucro do produto:");
			margem=ler.nextDouble();
			porcen=(custo/100)*margem;
			pv=custo+porcen;
			System.out.println ("O preço de venda é de R$ "+pv);
			System.out.println ("Deseja continuar? Digite S para sim e N para não:");
			resposta=ler.next();
		}
		ler.close();
	}
}
