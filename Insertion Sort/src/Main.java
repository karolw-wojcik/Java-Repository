public class Main {
    public static void insertionSort(int[] arr)
    {
        for(int i=1;i< arr.length;i++)
        {
            int v = arr[i];
            int j = i;

            while(j > 0 && arr[j-1] > v)
            {
                j--;
            }

            arr[j] = v;
        }
    }

    public static void main(String [] args)
    {
        int[] arr= {5,4,2,3,7,5,2,0};
        insertionSort(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }



    }
}
