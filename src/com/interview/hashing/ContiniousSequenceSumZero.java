package interview.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContiniousSequenceSumZero {


    public int sumZeroLength(List<Integer> list){
        int sumLength=0;
        int sum=0;
        HashMap<Integer,Integer> map= new HashMap<>();
//        corner case
        if(list.size()<=0)
            return 0;
        int count=0;
        for (Integer value:list) {
            sum +=value;

            if(value==0 && sumLength==0){
                sumLength=1;
            }
            if(sum==0)
                sumLength=count+1;
            if( map.get(sum)!=null){
                sumLength = Math.max(sumLength,count-map.get(sum));
            }else
                map.put(sum,count);

            count++;
        }


        return sumLength;
    }

    public List<Integer> isSumZero(List<Integer> A){
        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int k=0,l=0,ak=0,al=0;
        int prevSum=0;
        map.put(0,-1);
        for (int i = 0; i <A.size() ; i++) {
            prevSum += A.get(i);

            if(map.containsKey(prevSum)){
                if(i-map.get(prevSum)>k-l){
                    k=map.get(prevSum);
                    l=i;
                    if(al==0){

                        ak=map.get(prevSum);

                        al=i;
                    }else if(al+2==i){
                        ak=k;
                        al=l;
                    }
                }

            }else {
                map.put(prevSum,i);
            }
        }
        for (int i = ak+1; i <=al ; i++) {
            result.add(A.get(i));
        }


        return result;
    }
    public ArrayList<Integer> lszero(List<Integer> A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int start = -1, end = -1;
        int sum = 0;
        for(int i=0; i<A.size(); i++){
            sum+=A.get(i);
            if(sum==0){
                if(i+1>max){
                    max = i+1;
                    start = 0;
                    end = i;
                }
            }
            else if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                if(i-map.get(sum)>max){
                    max = i-map.get(sum);
                    start = map.get(sum)+1;
                    end = i;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(start==-1||end==-1){
            return ans;
        }
        for(int j = start; j<=end; j++){
            ans.add(A.get(j));
        }
        return ans;
    }
}
