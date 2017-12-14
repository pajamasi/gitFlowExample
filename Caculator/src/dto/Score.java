package dto;

public enum Score {
	
	SCORE1("����",60,0),
	SCORE2("����",60,1),
	SCORE3("ä��",60,2),
	SCORE4("����",60,3),
	SCORE5("����",60,4),
	;
	
	
	private String subject;
	private int score;
	private int index;
	
	Score(String subject, int score, int index){
		this.subject = subject;
		this.score = score;
		this.index = index;
	}
}
