package com.jmk.project.service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jmk.enums.Status;
import com.jmk.project.model.Project;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectMgmtServiceTest {
	
	private Project project;
	
	@Autowired
	private ProjectMgmtService projectMgmtService;
	
	@Before
	public void setUp() {
		project=new Project();
		project.setName("Construction");
		project.setCode("DNC");
		project.setManager("Rajiv");
		project.setStatus(Status.A);
		project.setDescription("ProjectDescription");
		project.setStartDate(LocalDate.now());
		project.setCreatedOn(Timestamp.from(Instant.now()));
		project.setWhenModified(Timestamp.from(Instant.now()));
	}
	
	@Test
	public void testCreateProject() {
		project=projectMgmtService.saveProject(project);
		Assert.assertNotNull(project);
		
	}

	@Test
	public void testFindProjectByCode() {
		project=projectMgmtService.findProjectByCode("DNC");
		Assert.assertNotNull(project);
		
	}

}
