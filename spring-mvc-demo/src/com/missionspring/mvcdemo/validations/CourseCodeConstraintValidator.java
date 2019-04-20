package com.missionspring.mvcdemo.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		this.coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String course, ConstraintValidatorContext validationContext) {
		
		
		boolean result = false;
		
		if(course != null) {			
			result = course.startsWith(coursePrefix);
		} else {
			result = true;
		}
		return result;
	}

}
