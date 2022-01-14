

package com.byeon.address;

import java.util.Iterator;
import java.util.List;

public class HumanViewAll {

	public void humanView(List<HumanDTO> ar) {
		
		for(int i=0; i<ar.size(); i++) {
			HumanDTO humanDTO = ar.get(i);
			System.out.println("이름 : " + humanDTO.getName());
			System.out.println("별명 : " + humanDTO.getNick());
			System.out.println("이메일 : " + humanDTO.getEmail());
			System.out.println("전화번호 : " + humanDTO.getTel());
			System.out.println("생일 : " + humanDTO.getBirthday());
			System.out.println();
		}
		
		
//		Iterator<HumanDTO> it = ar.iterator();
//		
//		while(it.hasNext()) {
//			HumanDTO humanDTO = it.next();
//			System.out.println("이름 : " + humanDTO.getName());
//			System.out.println("별명 : " + humanDTO.getNick());
//			System.out.println("이메일 : " + humanDTO.getEmail());
//			System.out.println("전화번호 : " + humanDTO.getTel());
//			System.out.println("생일 : " + humanDTO.getBirthday());
//			System.out.println();
//		}
		
		
		
		
		
	}
	
	
	
}








