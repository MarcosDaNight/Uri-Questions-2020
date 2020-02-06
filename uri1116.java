import java.util.Scanner;
import java.util.Locale;
public class uri1116 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x,y,n,i;
		double divisao;
		
		n = sc.nextInt();
		
		for (i=0;i<n;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y != 0) {
				divisao = (double) x/y;
				System.out.printf("%.1f%n",divisao);
			}
			else {
				System.out.println("divisao impossivel");
			}
		}
		
		sc.close();
	}

}
