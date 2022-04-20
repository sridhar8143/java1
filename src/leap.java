import java.util.*;
public class leap {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		int a= obj.nextInt();
		if (((a%4==0) && (a%100!=0))|| (a%400==0))
			System.out.println("lp");
		else
			System.out.println("np");

	}

}
