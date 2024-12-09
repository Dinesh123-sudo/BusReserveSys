package DSA;

import java.util.*;


public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Album a=new Album(1000,5,true);
     Album a1=new Album(5000,3,true);
     Album a2=new Album(2000,9,false);
     ArrayList<Album> al=new ArrayList<>();
     al.add(a);
     al.add(a1);
     al.add(a2);
     compares c=new compares();
     Collections.sort(al,c);
     System.out.print(al);

     }
        
}
