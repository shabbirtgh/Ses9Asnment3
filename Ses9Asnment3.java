package myPack;

import java.util.*;

public class Ses9Asnment3 {

	public static void main(String[] args) 
	{
		Map<Integer, String> m = new LinkedHashMap<>();
		m.put(1, "Acadgild");
		m.put(2, "Shabbir");
		m.put(3, "Madhu");
		m.put(4, "Ram");
		m.put(6, "Suman");
		m.put(10, "Manoj");
		m.put(15, "Sachin");
		Set<Integer> keys = m.keySet();
		System.out.println("Names of the Employess are :  ");
		for(int i : keys)
		{
			System.out.println(" "+m.get(i));
		}

	}

}
