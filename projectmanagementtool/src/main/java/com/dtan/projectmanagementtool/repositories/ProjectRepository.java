package com.dtan.projectmanagementtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dtan.projectmanagementtool.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
