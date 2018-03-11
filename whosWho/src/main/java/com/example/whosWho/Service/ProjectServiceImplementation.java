package com.example.whosWho.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.whosWho.Domain.Project;
import com.example.whosWho.Persistence.ProjectRepository;

@Service
public class ProjectServiceImplementation implements ProjectService {

		private ProjectRepository projectRepo;
		
		@Autowired
		public ProjectServiceImplementation(ProjectRepository projectRepo){
			this.projectRepo = projectRepo;
			
		}

		@Override
		public List<Project> getAllProjects() {	
			return projectRepo.findAll();
			
		}

		@Override
		public Project getProjectById(Long id) {
			Optional<Project> optionalProject = projectRepo.findById(id);
			if(!optionalProject.isPresent() )
				return null;
			return optionalProject.get();
		}

		@Override
		public Project addProject(Project project) {
			return projectRepo.save(project);
		}

		@Override
		public void deleteProject(Project project) {
			projectRepo.delete(project);
			
		}
	
	
}
