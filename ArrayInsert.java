class Insert {
    public void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + "");
        }
    }

    public static void update(int[] A, int item, int k) {
        A[k - 1] = item;
    }

    public static void search(int[] A, int item) {
        int j = 0;
        int find = 0;
        while (j < A.length) {
            if (A[j] == item) {
                find = j;
                break;
            }
            j++;
        }
        System.out.println(find);
    }

    public static int[] insert(int A[], int num, int place) {
        int[] B = new int[A.length + 1];
        B[place] = num;
        return B;
    }

    public static void main(String args[]) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7 };
        search(A, 3);

        update(A, 8, 7);
        search(A, 8);

    }

}
