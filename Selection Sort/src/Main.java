public class Main {

    public static void swap(int [] arr, int i, int j)
    {
        int a1 = arr[i];
        arr [i] = arr[j];
        arr[j] = a1;
    }

    public static void selectionSort(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            swap(arr, min, i);
        }

    }


    public static void main (String [] args)
    {
        int[] arr = {5,4,3,6,2,1,0,8,5,3,4};

        selectionSort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print("  ");
        }
    }
}
