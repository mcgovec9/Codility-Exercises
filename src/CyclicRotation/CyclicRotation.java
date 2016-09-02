package CyclicRotation;

public class CyclicRotation {
    public static int[] solution(int[] A, int k) {
        if (A == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < k; i++) {
            for (int j = A.length - 1; j > 0; j--) {
                int temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
        }
        return A;
    }
}


