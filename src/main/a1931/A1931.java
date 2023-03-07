package main.a1931;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A1931 {

}

class Solution {
    public static int solution(int[][] arr) {
        int answer = 0;
        List<Time> timeList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                Time time = new Time(arr[i][0], arr[i][1]);
                timeList.add(time);
            }
        }
        Collections.sort(timeList, new TimeCompare());

        int et = 0;


        for(int i = 0; i<timeList.size(); i++){
            if (timeList.get(i).st >= et ){
                et = timeList.get(i).et;
                answer+=1;
            }
        }
        return answer;
    }
}

class Time {
    int st;
    int et;

    public Time(int st, int et) {
        this.st = st;
        this.et = et;
    }

}

class TimeCompare implements Comparator<Time> {
    int ret = 0;

    @Override
    public int compare(Time time, Time t1) {
        if(time.et == t1.et){
            return time.st - t1.st;
        }
        return time.et - t1.et;
    }
}

