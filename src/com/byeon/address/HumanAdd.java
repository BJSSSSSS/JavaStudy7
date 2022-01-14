package com.byeon.address;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class HumanAdd {
	
	private Scanner sc;
	
	public HumanAdd() {
		sc = new Scanner(System.in);
	}
	
	//이름을 입력받아서 같은 이름이 있는 HumanDTO의 인덱스 번호 찾기
	//찾아서 삭제
	//리턴 삭제 여부
	public String humanDelete(List<HumanDTO> ar) {
		System.out.println("삭제할 사람의 이름을 입력하세요 : ");
		// 보통은 이름이 아닌 그 사람을 특정할 수 있는거로 한다
		// 이름은 중복이 충분히 가능하기 때문
		String name = sc.next();
		String delete = null;
		for(int i=0; i<ar.size(); i++) {
			if(name.equals(ar.get(i).getName())) {
				ar.remove(i);
				delete = "삭제완료!";
				break;
			}
		}
		return delete;
	}
	
	
	//이름을 입력받아서 같은 이름이 있는 HumanDTO 찾아서 리턴
	public HumanDTO searchHuman(List<HumanDTO> ar) {
		System.out.println("이름을 입력");
		String name = sc.next();
		
		HumanDTO humanDTO = null;
		
		for(int i=0; i<ar.size(); i++) {

			if(name.equals(ar.get(i).getName())) {
				humanDTO = ar.get(i);
				break;
			}	
		}
		return humanDTO;
	}
	
	public HumanDTO addHuman() {
		
		//ArrayList<HumanDTO> ar = new ArrayList<>();
		Calendar ca = Calendar.getInstance();
		
		HumanDTO humanDTO = new HumanDTO();

		System.out.println("이름 입력 : ");
		humanDTO.setName(sc.next());
		
		System.out.println("별명 입력 : ");
		humanDTO.setNick(sc.next());
		
		System.out.println("이메일 입력 : ");
		humanDTO.setEmail(sc.next());
		
		System.out.println("전화번호 입력 : ");
		humanDTO.setTel(sc.next());
		
		boolean flag = true;
		while(flag) {
			
			System.out.println("생년월일 입력 ex)20001224 : ");
			String birth = sc.next(); //20001224
			
			int checkBox = birth.length()-birth.replaceAll("[-*^&%)($#@!=.]", "").length();
			
			if(birth.length() == 8 && checkBox <= 0) {
				int y = Integer.parseInt(birth.substring(0,4));
				int m = Integer.parseInt(birth.substring(4,6));
				int d = Integer.parseInt(birth.substring(6));
				ca.set(y, m-1, d, 0, 0, 0);
				humanDTO.setBirthday(ca);
				flag = false;
			}
			
			if(flag) {
				System.out.println("생년월일을 형식에 맞게 재작성 해주십시오");
			}
			
		}
		return humanDTO;
		
	}//addHuman 끝

}




