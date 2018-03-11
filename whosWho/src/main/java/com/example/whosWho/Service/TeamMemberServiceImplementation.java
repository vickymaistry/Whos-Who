package com.example.whosWho.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.whosWho.Domain.TeamMember;
import com.example.whosWho.Persistence.TeamMemberRepository;

@Service
public class TeamMemberServiceImplementation implements TeamMemberService{

	private TeamMemberRepository teamMemberRepo;
	
	@Autowired
	public TeamMemberServiceImplementation(TeamMemberRepository teamMemberRepo){
		this.teamMemberRepo = teamMemberRepo;
	}

	@Override
	public TeamMember getTeamMemberById(Long id) {
		Optional<TeamMember> optionalTeamMember = teamMemberRepo.findById(id);
		if(!optionalTeamMember.isPresent()){
			return null;
		}
		return optionalTeamMember.get();
	}

	@Override
	public List<TeamMember> getAllTeamMembers() {
		return teamMemberRepo.findAll();
	}

	@Override
	public TeamMember addTeamMember(TeamMember teamMember) {
		return teamMemberRepo.save(teamMember);
	}

	@Override
	public void deleteTeamMember(Long id) {
		teamMemberRepo.deleteById(id);
		
	}
	
}
