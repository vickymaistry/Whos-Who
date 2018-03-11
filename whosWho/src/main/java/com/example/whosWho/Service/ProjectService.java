package com.example.whosWho.Service;

import java.util.List;

import com.example.whosWho.Domain.Project;

public interface ProjectService {
	
	List<Project> getAllProjects();
	
	Project getProjectById(Long id);
	
	Project addProject(Project project);

	void deleteProject(Project project);
}
