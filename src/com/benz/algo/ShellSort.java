package com.benz.algo;

public class ShellSort {

    public void shellSort(int[] arr)
    {
        int n=arr.length;

        for(int gap=n/2;gap>0;gap=gap/2)
        {
            for(int i=gap;i<n;i++)
            {
                int temp=arr[i];
                int j;

                for(j=i;j>=gap && arr[j-gap]>temp;j=j-gap)
                {
                    arr[j]=arr[j-gap];
                }
                 arr[j]=temp;
            }
        }
          show(arr);
    }

    public void show(int[] display)
    {
        for(int x:display)
            System.out.print(x+"\t");
    }
}
