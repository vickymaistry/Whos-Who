package com.example.whosWho.Controllers;


import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.whosWho.Domain.TeamMember;
import com.example.whosWho.Service.TeamMemberService;

@RestController
@CrossOrigin
public class TeamMemberController {
	
	@Autowired
	private TeamMemberService teamMemberService;
	
	
	@RequestMapping(value = "/getMembers",method = RequestMethod.GET)
	public List<TeamMember> getAllTeamMembers(){
		return teamMemberService.getAllTeamMembers();
	}
	

	@RequestMapping(value = "/getMemberById/{id}",method = RequestMethod.GET)
	public TeamMember findTeamMemberById(@PathVariable Long id){
		
		
		
		return teamMemberService.getTeamMemberById(id);	
	}
	
	
	@RequestMapping(value = "/addTeamMember",method = RequestMethod.POST)
	public void addTeamMember(@RequestBody TeamMember teamMember){
		
		teamMemberService.addTeamMember(new TeamMember(teamMember.getFirstName(),teamMember.getLastName(),
				                       teamMember.getFunFact(),teamMember.getPhotoUrl()));
		
		
		
	}
	
	@RequestMapping(value = "/deleteTeamMemberById/{id}",method = RequestMethod.GET)
	public void deleteTeamMember(@PathVariable Long id){
		teamMemberService.deleteTeamMember(id);
		
	}
	
	
//	public void saveImage(MultipartFile multipartFile,String fileName) throws IllegalStateException, IOException{
//		
//		String destination = "http://127.0.0.1:8887/" + fileName;//file.getOriginalFileName();
//		File currentFile = new File(destination);
//		multipartFile.transferTo(currentFile);
//	}	
//	

}

	
	
	
	
	
	
	
	
	
	
	
	
	

