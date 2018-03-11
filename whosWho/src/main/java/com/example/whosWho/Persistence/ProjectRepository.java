package com.example.whosWho.Persistence;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.whosWho.Domain.Project;


@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
	
	 List<Project> findAll();
	
	 Optional<Project> findById(@PathVariable Long id);
	
	 @SuppressWarnings("unchecked")
	 Project save(@PathVariable Project project);
	
	 void delete(@PathVariable Project project);

}