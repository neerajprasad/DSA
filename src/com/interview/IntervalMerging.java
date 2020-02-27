package java.interview;

import java.util.ArrayList;
import java.util.Collections;

public class IntervalMerging {
    public static void main(String ares[]) {
        ArrayList<Interval> interval = new ArrayList<>();
        interval.add(new Interval(1,2));
        interval.add(new Interval(3,5));
        interval.add(new Interval(4,8));
        interval.add(new Interval(9,10));
        for (Interval intervalaa:mergerInterval(interval)
             ) {
            System.out.println(intervalaa);
        }
    }

    private static ArrayList<Interval> mergerInterval(ArrayList<Interval> interval) {
        if(interval.size()<0)
        {
            return null;
        }
//        new interval lst
        ArrayList<Interval> newInterval = new ArrayList<>();
        Collections.sort(interval,(o1, o2) -> (o1.start-o2.start) );
//        1,1,4,10
        int start=interval.get(0).end,end=interval.get(0).end;
        for (int index=0;index<=interval.size();index++){
            if(index==0){
                start = interval.get(index).start;
                end= interval.get(index).end;
            }
            else if(index!=interval.size()){
                if(interval.get(index).start<=end){
                    end = (interval.get(index).end > end) ? interval.get(index).end : end;
                }else{
                    newInterval.add(new Interval(start,end));
                    start = interval.get(index).start;
                    end= interval.get(index).end;
                }
            }
            else{
                newInterval.add(new Interval(start,end));
            }
        }
        return newInterval;
    }

}

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}