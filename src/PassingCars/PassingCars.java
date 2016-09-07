package PassingCars;

class PassingCars {
    public int solution(int[] A) {
        int numPairs = 0;
        int zeroCount = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] == 0)
                zeroCount++;
            else{
                numPairs = numPairs + zeroCount;
                if(numPairs > 1000000000){
                    numPairs = -1;
                    break;
                }
            }
        }
        return numPairs;
    }
}
