package dto;

public class Student {
	
	private String name;
	private int[] scores;	// index 0 = 영졸 점수
							// index 1 =성졸 점수
							// index 2 =채플 점수
							// index 3 =전공 점수
							// index 4 =교양 점수
	
	
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