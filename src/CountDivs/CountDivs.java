package CountDivs;

class CountDivs {
    public int solution(int A, int B, int K) {
        int numDivs = (B / K) - (A / K);
        if(A%K == 0)
            numDivs++;
        return numDivs;
    }
}
