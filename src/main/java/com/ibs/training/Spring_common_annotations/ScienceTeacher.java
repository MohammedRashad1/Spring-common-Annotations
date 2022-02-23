package com.ibs.training.Spring_common_annotations;


import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("My Name is David");
		System.out.println("Iam Your Science Teacher");

	}

}
