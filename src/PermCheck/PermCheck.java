package PermCheck;
import java.util.*;

class PermCheck {
    public int solution(int[] A) {
        int largest = 0;
        int result = 0;
        boolean duplicate = false;
        for(int a: A){
            if(a >= largest)
                largest = a;
        }
        Set<Integer> nums = new HashSet<>();
        for(int a: A){
            if(a <= largest){
                if(!nums.contains(a))
                    nums.add(a);
                else
                    duplicate = true;
            }
        }
        if(nums.size() == largest && !duplicate)
            result = 1;
        return result;
    }
}
