import java.util.Scanner;
public class Sumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        for (int i=1;i<=a;i++) {
        	sum+=i;
        	
        }System.out.println(sum);
	}

}
