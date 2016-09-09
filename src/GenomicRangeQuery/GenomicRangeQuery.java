package GenomicRangeQuery;

class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        String nucleotide = "ACGT";
        int [] minimals = new int [P.length];
        int currentMin = 4;
        for(int i = 0; i < P.length; i++){
            while(P[i] <= Q[i]){
                for(int j = 0; j < 4; j++){
                    if(S.charAt(P[i]) == nucleotide.charAt(j)){
                        if(currentMin > j+1)
                            currentMin = j+1;
                    }
                }
                P[i]++;
            }
            minimals[i] = currentMin;
            currentMin = 4;
        }
        return minimals;
    }
}



























