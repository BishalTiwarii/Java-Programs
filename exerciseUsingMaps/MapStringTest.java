package exerciseUsingMaps;

import java.util.Map;
import java.util.HashMap;


public class MapStringTest {

	public static void main(String[] args) {
		
		//program to find number of alphabets present in the sentence
		
		String str="This is an awesome occassion"+"This has never happened before";
		Map<Character,Integer> occurances=new HashMap<>();
        char[] characters=str.toCharArray();
       for(char character:characters)
       {
    	   Integer integer=occurances.get(character);
    	   if (integer==null) {
    		   occurances.put(character, 1);
    	   }
    	else {
    			   occurances.put(character,integer+1);
    		   }
		}
    	  System.out.println(occurances);   
	}			
		}
	


