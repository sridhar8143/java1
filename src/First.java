
import java.util.*;
public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b= {{9,8,7},{6,5,4},{3,2,1}};
		int [][] c= {{},{},{}};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<i;j++) {
			c[i][j]=a[i][j]+b[i][j];	
			}
		
			System.out.println(c);
	}

	}
}
