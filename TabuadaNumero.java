import java.util.Scanner; 
public class TabuadaNumero {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		int i=1, num, tab;
		System.out.println ("Digite um número para mostrar sua tabuada:");
		num=ler.nextInt ();
		while (i<=10) {
			tab=num*i;
			System.out.println (num+" X "+i+" = "+tab);
			i++;
		}
		ler.close ();
	}
}
