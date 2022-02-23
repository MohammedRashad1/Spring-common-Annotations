package com.ibs.training.Spring_common_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("${college.name}")
	private String collegeName;

	@Autowired
	private Principle principle;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;



	public void test() {
		principle.showDetails();
		teacher.teach();
		System.out.println("College Name is: " + collegeName);
		System.out.println("Testing Fine..!");

	}

}
