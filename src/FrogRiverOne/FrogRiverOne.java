package FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

class FrogRiverOne {
    public int solution(int X, int[] A) {
        int earliest = -1;
        Set<Integer> numbers = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            if(A[i] <= X){
                numbers.add(A[i]);
                if(numbers.size() == X){
                    earliest = i;
                    break;
                }
            }
        }
        return earliest;
    }
}
