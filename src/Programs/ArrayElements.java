package Programs;

import java.util.HashMap;
import java.util.Map;

public class ArrayElements {
	
	public static void main(String[] args) {
		int [] arr = {10,2,3,4,5,5,3,2,4,567,8,7,5,89,9,10};
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i:arr) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}
			else {
				hm.put(i,1);
			}
		}
		for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}

}
