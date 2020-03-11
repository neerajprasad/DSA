package interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobleInteger {
    public int nobelValue(Integer arr[]){
        Collections.sort(Arrays.asList(arr));
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]==arr[i+1]){
                continue;
            }
            if(arr[i]==arr.length-i-1){
                return 1;
            }
        }
        if(arr[arr.length-1]==0){
            return 1;
        }
        return -1;
    }
    public int nobelValue(List<Integer> A){
        Collections.sort(A);
        for (int i = 0; i <A.size()-1 ; i++) {
            if(A.get(i).equals(A.get(i +1))){
                continue;
            }
            if(A.get(i)==A.size()-i-1){
                return 1;
            }
        }
        if(A.get(A.size()-1)==0){
            return 1;
        }
        return -1;
    }
}
