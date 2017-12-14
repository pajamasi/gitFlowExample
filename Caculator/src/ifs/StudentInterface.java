package ifs;

import java.util.List;

import dto.Student;

/**
 * 학생 관련 정보를 처리하는 메소드를 정의한 인터페이스
 * @author Administrator
 *
 */
public interface StudentInterface {

	boolean isGraduation(Student student);
	
	List<Student> getGraduationList(List<Student> studentList);
	
	List<Student> getGraduationFailList(List<Student> studentList);
}
