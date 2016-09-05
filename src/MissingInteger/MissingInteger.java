package MissingInteger;

import java.util.ArrayList;

class MissingInteger {
    public int solution(int[] A) {
        ArrayList<Integer> nums = new ArrayList<>();
        int missingNum = 1;
        if(A.length == 1){
            if(A[0] == 1)
                missingNum = 2;
        }
        else{
            for(int a: A){
                if(a <=A.length && a >= 0)
                    nums.add(a);
            }
            for(int i = 1; i < nums.size(); i++){
                if(!(nums.contains(i))){
                    missingNum = i;
                    break;
                }
            }
        }
        return missingNum;
    }
}
