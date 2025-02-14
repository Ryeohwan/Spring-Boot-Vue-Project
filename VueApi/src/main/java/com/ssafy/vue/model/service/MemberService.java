package com.ssafy.vue.model.service;

import com.ssafy.vue.model.MemberDto;
import com.ssafy.vue.model.SecureMemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String userid) throws Exception;
	public void saveRefreshToken(String userid, String refreshToken) throws Exception;
	public Object getRefreshToken(String userid) throws Exception;
	public void deleRefreshToken(String userid) throws Exception;
	public boolean modifyMember(MemberDto memberDto) throws Exception;
	public boolean joinMember(MemberDto memberDto) throws Exception;
	public MemberDto findMember(String userid) throws Exception;

	public SecureMemberDto getSecure(String userid) throws Exception;
	public void secureMember(SecureMemberDto secureMemberDto) throws Exception;
	
}
