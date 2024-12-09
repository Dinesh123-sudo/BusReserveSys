package DSA;

import java.util.Comparator;

public class compares implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Album Q=(Album)o1;
		Album Q1=(Album)o2;
		if(Q.price>Q1.price) {
			return -1;
		}
		else if(Q1.price<Q.price) {
			return +1;
		}
		return 0;
	}

}
