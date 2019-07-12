

/*import java.io.*;
import java.util.*;
public class SimpleString {
    public static void main(String args[] ) throws Exception {

    	Scanner scan = new Scanner(System.in);
    	String s= scan.next();
    	char[] ch = s.toCharArray();
    	int flag = 0;
    	for(int i = 1; i<ch.length; i++) {
    		if(ch[i] == ch[i-1]) {
    			flag ++;
    		}
    		else {
    		for(int j = flag;j>=1;	j =j-2) {
    			ch[j-1] = ch[i];
    		
    		 }
    	   }
    	}
    	System.out.print(String.valueOf(ch));
    	
    	scan.close();

   }
}
*/


import java.io.*;
import java.util.*;
public class SimpleString {
    public static void main(String args[] ) throws Exception {

    	Scanner sc = new Scanner(System.in);
    	StringBuilder str = new StringBuilder(sc.next().trim());
    	
    	int s = 0;
    	for(int i=0;i<str.length()-1; i++){
    	    if(str.charAt(i)==str.charAt(i+1))
    	    {
    	        char c1 = str.charAt(i);
    	        char c2 = c1;
    	        if(i>0)
    	            c2 = str.charAt(i-1);
    	        while(str.charAt(s)==c1||str.charAt(s)==c2)
    	        {
    	            if(s>=str.length()-1)
    	                s=0;
    	             else
    	                s +=1;
    	        }
    	        str.setCharAt(i,str.charAt(s));
    	    }
    	}
    	
    	System.out.print(str.toString());
	}
}
		
		
		
		
		
		
