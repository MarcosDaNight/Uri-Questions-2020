import java.util.Scanner;
public class uri1153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i,num,fat;
		
		num = sc.nextInt();
		fat = 1;
		
		for (i=1;i<=num;i++) {
			
			fat = fat * i;
			
		}
		System.out.println(fat);
		sc.close();
	}

}
