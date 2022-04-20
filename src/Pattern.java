import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		
		int [] a= {1,2,3};
		int [] b= {4,5,6};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+b[i]);
		}

	}
}
