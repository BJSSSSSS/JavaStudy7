

package com.byeon.address;

import java.util.List;
import java.util.Scanner;

public class HumanFind {
	
	private Scanner sc;
	
	public HumanFind() {
		sc = new Scanner(System.in);
	}

	public boolean humanFind(List<HumanDTO> ar) {
		System.out.println("검색할 사람의 이름을 입력하세요 : ");
		String name = sc.next();
		boolean check = true;
		
		for(int i=0; i<ar.size(); i++) {
			HumanDTO humanDTO = ar.get(i);
			
			if(name.equals(ar.get(i).getName())) {
				System.out.println("이름 : " + humanDTO.getName());
				System.out.println("별명 : " + humanDTO.getNick());
				System.out.println("이메일 : " + humanDTO.getEmail());
				System.out.println("전화번호 : " + humanDTO.getTel());
				System.out.println("생일 : " + humanDTO.getBirthday());
				System.out.println();
				check = false;
			}	
		}
		return check;
	}
}





