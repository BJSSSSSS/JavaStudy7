

package com.byeon.address;

//import java.util.Iterator;
import java.util.List;

public class HumanView {

	//문자열을 받아서 출력하는 메서드
	public void humanView(String delete) {
		
		if(delete.equals("삭제 쿄쿄쿄쿄")){
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패!");
		}
		
	}
	
	
	// 보통은 클래스를 만들때 같은 기능을 하는것들을 묶어준다
	
	public void humanView(HumanDTO humanDTO) {
		
		if(humanDTO != null) {
			System.out.println("이름 : " + humanDTO.getName());
			System.out.println("별명 : " + humanDTO.getNick());
			System.out.println("이메일 : " + humanDTO.getEmail());
			System.out.println("전화번호 : " + humanDTO.getTel());
			System.out.println("생일 : " + humanDTO.getBirthday());
			System.out.println();
		}else {
			System.out.println("정보가 없다");
		}
		
	}
	
	
	
//	public boolean humanFind(List<HumanDTO> ar) {
//		System.out.println("검색할 사람의 이름을 입력하세요 : ");
//		// 보통은 이름이 아닌 그 사람을 특정할 수 있는거로 한다
//		// 이름은 중복이 충분히 가능하기 때문
//		String name = sc.next();
//		boolean check = true;
//		
//		for(int i=0; i<ar.size(); i++) {
//			HumanDTO humanDTO = ar.get(i);
//			
//			if(name.equals(ar.get(i).getName())) {
//				System.out.println("이름 : " + humanDTO.getName());
//				System.out.println("별명 : " + humanDTO.getNick());
//				System.out.println("이메일 : " + humanDTO.getEmail());
//				System.out.println("전화번호 : " + humanDTO.getTel());
//				System.out.println("생일 : " + humanDTO.getBirthday());
//				System.out.println();
//				check = false;
//			}	
//		}
//		return check;
//	}
	
	
	
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








