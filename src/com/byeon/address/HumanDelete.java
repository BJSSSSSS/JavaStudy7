

package com.byeon.address;

import java.util.List;
import java.util.Scanner;

public class HumanDelete {
	
	private Scanner sc;
	
	public HumanDelete() {
		sc = new Scanner(System.in);
	}
	
	public HumanDTO humanDelete(List<HumanDTO> ar) {
		HumanDTO humanDTO = null;
		System.out.println("삭제할 사람의 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i=0; i<ar.size(); i++) {
			if(name.equals(ar.get(i).getName())) {
				humanDTO = ar.remove(i);
			}
		}
		return humanDTO;
	}
}


