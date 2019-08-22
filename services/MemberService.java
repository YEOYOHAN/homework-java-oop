package com.bitcamp.services;

import com.bitcamp.domains.MemberBean;

/**
 * 요구사항(기능 정의)
 * (사용자기능)
 * 1. 회원 가입
 * 2. 마이페이지
 * 3. 비번을 수정하는 기능
 * 4. 회원 탈퇴
 * **********
 * (관리자기능)
 * 5. 회원목록
 * 6. 아이디검색
 * */
public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService() {
		members = new MemberBean[5];
		count = 0;
	}
	
	public String join(MemberBean param) {
		String msg = "회원 가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	
	public String getMyPage(MemberBean param) {
		return param.toString();
	}
 String changPassword(MemberBean param) {
		String msg = "비번이 변경되었습니다.";
		return msg;
	}

	public String withdrawal(MemberBean param) { 
	String msg = "회원탈퇴 되었습니다.";
	return msg;
	}

	public String list() {
		String msg = "";
		for(int i=0; i<count; i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	}

	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if(id.equals(members[i].getId())) {
				member = members[i];
			}
		}
		return member;
	}
	
}