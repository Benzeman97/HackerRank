package com.benz.algo;

public class QuickSort {

    public void quickSort(int[] arr,int min,int max)
    {
         if(min>=max)
         return;
         else
         {
             int pi=partition(arr,min,max);
             quickSort(arr,min,pi-1);
             quickSort(arr,pi+1,max);
         }

    }

    public int partition(int[] arr,int min,int max)
    {
        int j=min-1;
        int pivot=max;

        for(int i=min;i<max;i++)
        {
            if(arr[i]<=arr[pivot]) {
                j += 1;
                swap(j, i, arr);
            }

        }
        swap((j+1),pivot,arr);
        return (j+1);
    }

    public void swap(int x,int y,int[] arr)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }



}
