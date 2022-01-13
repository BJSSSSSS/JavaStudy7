package com.byeon.address;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanAdd {
	
	private Scanner sc;
	
	public HumanAdd() {
		sc = new Scanner(System.in);
	}
	
	public HumanDTO addHuman() {
		
		//ArrayList<HumanDTO> ar = new ArrayList<>();
		
		HumanDTO humanDTO = new HumanDTO();

		System.out.println("이름 입력 : ");
		humanDTO.setName(sc.next());
		
		System.out.println("별명 입력 : ");
		humanDTO.setNick(sc.next());
		
		System.out.println("이메일 입력 : ");
		humanDTO.setEmail(sc.next());
		
		System.out.println("전화번호 입력 : ");
		humanDTO.setTel(sc.next());
		
		System.out.println("생년월일 입력 : ");
		humanDTO.setBirthday(sc.next());
		
		return humanDTO;
		
	}//addHuman 끝

}




