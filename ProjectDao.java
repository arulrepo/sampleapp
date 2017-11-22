package com.dashboard.app.dao;

import java.util.List;

import com.dashboard.app.model.Project;


public interface ProjectDao {

	Project findById(int id);
	
	Project findByName(String sso);
	
	void save(Project project);
	
	void deleteByName(String sso);
	
	List<Project> findAllProjects();

}

