package com.example.whosWho.Service;

import java.util.List;

import com.example.whosWho.Domain.TeamMember;

public interface TeamMemberService {

	
	List<TeamMember> getAllTeamMembers();
	
	TeamMember getTeamMemberById(Long id);
	
	TeamMember addTeamMember(TeamMember teamMember);
	
	void deleteTeamMember(Long id); 
}