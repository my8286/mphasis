package in.nareshit.raghu.service;

import java.util.List;
import java.util.Optional;
import in.nareshit.raghu.model.Student;

public interface IStudentService {
	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Integer id);
	Optional<Student> getOneStudent(Integer id);
	List<Student> getAllStudents();
	boolean isStudentExist(Integer id);

	
}
