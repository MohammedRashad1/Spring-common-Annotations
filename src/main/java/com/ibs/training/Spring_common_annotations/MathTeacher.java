package com.ibs.training.Spring_common_annotations;

import org.springframework.stereotype.Component;

@Component

public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("My Name is John");
		System.out.println("Iam Your Maths Teacher");

	}

}
