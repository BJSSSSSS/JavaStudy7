package com.byeon.address;

import java.util.ArrayList;
import java.util.HashMap;

public class AddressMain {

	public static void main(String[] args) {
		
		HumanMenu humanMenu = new HumanMenu();
		
		humanMenu.menu();
	
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();

		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		
		map.put("a", ar);
		map.put("b", ar2);
		
		
		
	}

}
