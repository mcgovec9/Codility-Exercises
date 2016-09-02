package OddOccurencesInArray;

public class OddOccurencesInArray {
    public int solution(int[] A) {
        int unpaired = 0;
        for (int number : A) {
            unpaired ^= number;    //xor operator used to find odd element if exists
        }
        return unpaired;
    }
}
