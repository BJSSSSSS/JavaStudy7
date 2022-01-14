package com.byeon.address;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanMenu {
	
	private Scanner sc;
	
	public HumanMenu() {
		sc = new Scanner(System.in);
	}//기본생성자 끝
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언들...]){}
	public void menu() {
		
		boolean check = true;
		HumanAdd humanAdd = new HumanAdd();
		HumanViewAll humanViewAll = new HumanViewAll();
		HumanFind humanFind = new HumanFind();
		HumanDelete humanDelete = new HumanDelete();
		ArrayList<HumanDTO> ar = new ArrayList<>();
		
		while(check) {
			System.out.println("1. 전체 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 프로그램 종료");
			
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1:
				System.out.println("전체 명단 출력!");
				if(ar.size() == 0) {
					System.out.println("출력할 명단이 없습니다.");
				}else {
					humanViewAll.humanView(ar);
				}
				break;
			
			case 2:
				System.out.println("정보 검색!");
				if(ar.size() == 0) {
					System.out.println("출력할 명단이 없습니다.");
				}else {
					check = humanFind.humanFind(ar);
					if(check) {
						System.out.println("검색할 사람의 이름이 없습니다.");
						System.out.println();
					}
				}
				break;
				
			case 3:
				System.out.println("명단 추가!");
				HumanDTO humanDTO = humanAdd.addHuman();
				ar.add(humanDTO);
				break;
				
			case 4:
				System.out.println("명단 삭제!");
				HumanDTO humanDTO2 = humanDelete.humanDelete(ar);
				if(humanDTO2 != null) {
					System.out.println("삭제 성공!");
				}else {
					System.out.println("삭제 실패ㅠ");
				}
				break;
				
			case 5:
				System.out.println("프로그램 종료!");
				check = false;
				break;
				
			default:
				System.out.println("1 ~ 5번 사이의 숫자 선택!");
				break;
			
			}
			
		}

	}
	
}
