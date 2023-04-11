package bishal;

import java.util.Map;
import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		
	map.put(100, "Bishal");
	map.put(101,"Neel");
	map.put(102, "Martin");
	map.put(103,"John");
	map.put(104, "Surya");
	map.put(105,"Smith");
	
	System.out.println(map);
	System.out.println(map.containsKey(100));
	map.putIfAbsent(106,"Rim");
    System.out.println(map);
    map.replace(100,"Ben");
    System.out.println(map);
    map.keySet();
    map.values();
	   
	}

}
