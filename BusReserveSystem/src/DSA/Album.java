package DSA;

import java.util.*;

public   class Album{
    

	int price;
	int gb;
	boolean touch;
	public String toString() {
		return " "+this.price+" "+this.gb+" "+this.touch;
	}
	public Album(int price, int gb, boolean touch) {
		// TODO Auto-generated constructor stub
		this.price=price;
		this.gb=gb;
		this.touch=touch;
		
	}
	
}