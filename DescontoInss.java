import java.util.Scanner;
public class DescontoInss {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		int i=1;
		double salario, desc;
		while (i<=4) {
			System.out.println ("Digite o salário do "+i+"° funcionário:");
			salario=ler.nextDouble();
			if (salario <2000.00) {
				desc=(salario*8.5)/100;
				System.out.println ("O desconto do INSS é R$ "+desc);
			}else {
				desc=(salario*11)/100;
				System.out.println ("O desconto do INSS é de R$ "+desc);
			}
			i++;
		}
		ler.close();
	}

}
