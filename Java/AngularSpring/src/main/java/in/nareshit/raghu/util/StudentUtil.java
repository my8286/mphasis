package in.nareshit.raghu.util;

import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;

@Component
public class StudentUtil {

	public void mapToActualObject(Student actual, Student student) {
		if(student.getName()!=null)
			actual.setName(student.getName());
		actual.setFee(student.getFee());
		actual.setCourse(student.getCourse());
		if(student.getEmail()!=null)
			actual.setEmail(student.getEmail());
		actual.setAddr(student.getAddr());
	}

}
