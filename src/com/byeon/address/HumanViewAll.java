

package com.byeon.address;

import java.util.ArrayList;
import java.util.Iterator;

public class HumanViewAll {

	public void humanView(ArrayList<HumanDTO> ar) {
		
		Iterator<HumanDTO> it = ar.iterator();
		
		while(it.hasNext()) {
			HumanDTO humanDTO = it.next();
			System.out.println(humanDTO.getName());
			System.out.println(humanDTO.getNick());
			System.out.println(humanDTO.getEmail());
			System.out.println(humanDTO.getTel());
			System.out.println(humanDTO.getBirthday());
			
		}
		
		
		
		
		
	}
	
	
	
}








