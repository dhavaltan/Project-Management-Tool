package com.dtan.projectmanagementtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtan.projectmanagementtool.model.Project;
import com.dtan.projectmanagementtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		
		return projectRepository.save(project);
		
	}
}
