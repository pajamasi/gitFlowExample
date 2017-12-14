package ifs;

import java.util.List;

import dto.Student;

/**
 * �л� ���� ������ ó���ϴ� �޼ҵ带 ������ �������̽�
 * @author Administrator
 *
 */
public interface StudentInterface {

	boolean isGraduation(Student student);
	
	List<Student> getGraduationList(List<Student> studentList);
	
	List<Student> getGraduationFailList(List<Student> studentList);
}
