package com.example.whosWho.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.whosWho.Domain.Project;
import com.example.whosWho.Persistence.ProjectRepository;

@RestController
public class ProjectController {
	
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@RequestMapping(value = "/projects",method = RequestMethod.GET)
	public List<Project> getAllProjects(){
		
		return projectRepository.findAll();
	}

}
