package MaxCounters;

//import java.util.Arrays;
class MaxCounters {
    public int[] solution(int N, int[] A) {
        int max = 0;
        int[] counters = new int[N];

        for(int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= N) {
                counters[A[i] - 1]++;
                if (max < counters[A[i] - 1])
                    max = counters[A[i] - 1];
            }
            else if (A[i] == N + 1) {
                // Arrays.fill(counters, max);
                for (int j = 0; j < N; j++)
                    counters[j] = max;
            }
        }
        return counters;
    }
}