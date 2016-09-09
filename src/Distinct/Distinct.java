package Distinct;

import java.util.Set;
import java.util.HashSet;

class Distinct {
    public int solution(int[] A) {
        Set<Integer> distinct = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            //distinct.add(Math.abs(A[i]));  -> Results in same as code below but not optimal
            if(A[i] < 0)
                distinct.add(A[i]*-1);
            else distinct.add(A[i]);
        }
        return distinct.size();

    }
}