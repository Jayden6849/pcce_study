package day09;

public class Solution02 {

    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_strings.length; i++) {
            answer = answer.concat(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }

        return answer;
    }

}
