
public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=153;
      int t=a;
      int sum=0;
      while(a>=1) {
    	  int k=a%10;
    	  sum+=(k*k*k);
    	  a=a/10;
    			  
      }System.out.println(sum);
      if (sum==t) 
      {
    	  System.out.println("yes");
      }
      else
    	  System.out.println("no");
	}

}
