public class missing {
    static int getMissingNo (int K[], int N)
    {
        int i, total;
        total = (N + 1) * (N + 2) / 2;
        for (i = 0; i < N; i++)
            total -= K[i];
        return total;


    }
    public static void main (String args[])
    {
        int K[] = {1,2,4,5,6};
        int miss = getMissingNo(K, 5);
        System.out.println(miss);

    }



}
