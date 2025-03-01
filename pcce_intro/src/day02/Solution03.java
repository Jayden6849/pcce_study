package day02;

public class Solution03 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		
		int numer = numer1 * denom2 + numer2 * denom1;
		int denom = denom1 * denom2;
		
		int gcd = gcd(numer, denom);
		
		numer /= gcd;
		denom /= gcd;
		
		answer[0] = numer;
		answer[1] = denom;
		
        return answer;
    }
	public int gcd(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}
}
