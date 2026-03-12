package reverse;
import java.util.Scanner;
public class reverse {
//This programs reverses the digits of the given number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program reverses the digits of given number ");
		for(;;) {
		System.out.println("Enter a number: ");
		int rev=0;
		int a = sc.nextInt();
		int temp =a;
		System.out.println("Entered number: "+temp);
		while (temp!=0) {
			int digit = temp%10;
			rev=rev*10 + digit;
			temp=temp/10;
			
		}
		System.out.println("Reversed number: "+rev);
		System.out.println("Do you want to continue (Y/N): ");
		char b=Character.toUpperCase(sc.next().charAt(0));
		if (b=='N') {
			System.out.println("Thank you ");
			break;
		}
		

	}
		sc.close();
	}

}
