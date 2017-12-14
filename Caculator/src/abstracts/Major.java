package abstracts;

import java.util.List;

import dto.Score;
import dto.Student;
import ifs.StudentInterface;

public abstract class Major implements StudentInterface{
	
	/** 졸업시 필요한 항목 리스트 */
	private Score[] availableList = {Score.SCORE1,
									Score.SCORE2,
									Score.SCORE3,
									Score.SCORE4,
									Score.SCORE5,
									};

	@Override
	public boolean isGraduation(Student student) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<Student> getGraduationList(List<Student> studentList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Student> getGraduationFailList(List<Student> studentList) {
		// TODO Auto-generated method stub
		return null;
	}
}
