package Programs;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfStrings {
	public static void main(String[] args) {
	
		String Paragraph = "learning to code is learning to create and innovate and learning to code is learning";
		String[] arr = Paragraph.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		for(String s:arr) {
			if(hm.containsKey(s))
				hm.put(s, hm.get(s)+1);
		else {
			hm.put(s, 1);
		}
	}
		for(Map.Entry<String,Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
}
}