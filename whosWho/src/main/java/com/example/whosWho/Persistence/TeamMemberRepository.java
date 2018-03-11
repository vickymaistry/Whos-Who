package com.example.whosWho.Persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.whosWho.Domain.TeamMember;

@Repository
public interface TeamMemberRepository extends CrudRepository<TeamMember,Long> {
	
	 List<TeamMember> findAll();
	
	 Optional<TeamMember> findById( @PathVariable Long id);
	
	@SuppressWarnings("unchecked")
	 TeamMember save(@PathVariable TeamMember teamMember);
	
	 void deleteById(@PathVariable Long id);

}