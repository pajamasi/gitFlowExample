package dto;

public class Student {
	
	private String name;
	private int[] scores;	// index 0 = ���� ����
							// index 1 =���� ����
							// index 2 =ä�� ����
							// index 3 =���� ����
							// index 4 =���� ����
	
	
	private Student(){
		
	}
	
	public Student(String name, int[] scores){
		this.name = name;
		this.scores=scores;
	}
	
	public String getName() {
		return name;
	}
	
	public int[] getScores(){
		return this.scores;
	}
}