package ifs;

/**
 * 계산기의 기능을 정의 하는 인터페이스
 * @author Administrator
 *
 */
public interface CalculInterface {

	int sum(int x, int y);
	
	int minus(int x, int y);
	
	int mul (int x, int y);
	
	double average(int[] scores);
	
	int sumAll(int[] scores);
}
