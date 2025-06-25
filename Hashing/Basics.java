import java.util.*;

public class Basics {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		//Insertion
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		//Size
		System.out.println("Size of map:"+ map.size());

		System.out.println(map);

		//Update
		map.put("sachin",25);

		System.out.println(map);

		//Find
		System.out.print("Enter a key:");
		String key = sc.nextLine();
		if (map.containsKey(key)) {
			System.out.println(key+":"+map.get(key));			
		}else{
			System.out.println("Invalid Key!");
		}

		//Remove
		System.out.print("Enter a key to remove:");
		key = sc.nextLine();
		map.remove(key);
		System.out.println(map);

		//Insertion with caution
		map.putIfAbsent("Ravi", 35); //will add
		map.putIfAbsent("vishal", 15); //won't add/update
		System.out.println(map);

		//Iterating over values
		System.out.println("Values: ");
		for(var i : map.values()){
			System.out.print(i+" ");
		}
		System.out.println();

		//Iterate over map
		for(var e : map.entrySet()){
			System.out.printf("Age of %S is %d \n", e.getKey(), e.getValue());
		}
		sc.close();
	}
}
