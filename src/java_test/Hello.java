package java_test;
import java.util.*;

public class Hello {
	public static void main (String args[]){
	      Scanner sc = new Scanner(System.in);
	      int M, N;
	      M = sc.nextInt();
	      N = sc.nextInt();

	      int c = 0;
	      int d = 0;
	      for (int i = 0; i <= N; i++){
	    	  if( i*i >= M && i*i <= N){
	    		  if( c == 0){
	    			  d = i*i;
	    		  }
	    	  c = c + i*i; 
	    	  }
	      }
	      if(c != 0){
	      System.out.println(c);
	      System.out.println(d);
	      }else{
	    	  System.out.println(-1);
	      }
	      //System.out.println(M);
	}
}
