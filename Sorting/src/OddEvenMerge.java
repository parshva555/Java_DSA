public class OddEvenMerge {
    public static void batchsort(int a[], int l, int r) {
        int n = r-l+1;

        for (int p=1; p<n; p+=p)
            for (int k=p; k>0; k/=2)
                for (int j=k%p; j+k<n; j+=(k+k))
                    for (int i=0; i<n-j-k; i++)
                        if ((j+i)/(p+p) == (j+i+k)/(p+p))
                            exch(a, l+j+i, l+j+i+k);
    }

    public static void main(String[] args) {
        int a[] = new int[] {2, 4, 3, 4, 6, 5, 3};

        batchsort(a, 0, a.length - 1);

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void exch(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
