package dto;

public enum Score {
	
	SCORE1("¿µÁ¹",60,0),
	SCORE2("¼ºÁ¹",60,1),
	SCORE3("Ã¤ÇÃ",60,2),
	SCORE4("Àü°ø",60,3),
	SCORE5("±³¾ç",60,4),
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
