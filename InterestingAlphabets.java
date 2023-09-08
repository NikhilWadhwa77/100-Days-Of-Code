import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {

		ArrayList<ArrayList<Character>> ls = new ArrayList<>();
		for(int i = 0; i < N; i++){
			ls.add(new ArrayList<>());
		}

		for(int i = 0; i < N; i++){
			for(int j = 0; j <= i; j++){
				char result = (char)(64+N-i+j);
				ls.get(i).add(result);
				
			}
			System.out.println();
		}

		return ls;
	}
}
