package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterString {
	
	public static void main(String[] args) {
		System.out.println("please enter the string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] ch = input.toCharArray();
		sc.close();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
