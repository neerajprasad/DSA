package interview.string.patternSearch;

import java.util.ArrayList;

public class GenerateParenthesis {

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        new GenerateParenthesis().dfs(result,"",3,3);
        result.stream().forEach(System.out::println);
    }
    public void dfs(ArrayList<String> result, String s, int left, int right){
        if(left > right)
            return;

        if(left==0&&right==0){
            result.add(s);
            return;
        }

        if(left>0){
            dfs(result, s+"(", left-1, right);
        }

        if(right>0){
            dfs(result, s+")", left, right-1);
        }
    }
}
