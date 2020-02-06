import java.util.Scanner;
public class uri1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x,n,i,cont;
		
		n = sc.nextInt();
		cont = 0;
		
		if (n<10000) {
			for (i=0;i<n;i++) {
				x = sc.nextInt();
				if (x > Math.pow(-10, 7) && x < Math.pow(10, 7)) {
					if (x >= 10 && x <= 20) {
						cont++;
					}
				}
				
			
			}
		}
		System.out.println(cont + " " + "in");
		System.out.println(n - cont + " " + "out");
		sc.close();
	}

}
