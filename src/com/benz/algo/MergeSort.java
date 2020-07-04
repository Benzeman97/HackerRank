package com.benz.algo;

public class MergeSort {


    public void display()
    {
        int[] arr={83,24,205,40,35};

        arr = mergeSort(arr);

        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
    }

    public int[] mergeSort(int[] arr)
    {
        int n=arr.length;

        if(n<2)
            return arr;
        else
        {
            int mid=(n-1)/2;
            int nL,nR;
            nL=mid+1;
            nR=n-(mid+1);

            int[] left=new int[nL];
            int[] right=new int[nR];

            for(int i=0;i<=mid;i++)
                left[i]=arr[i];

            for(int i=mid+1;i<n;i++)
                right[i-(mid+1)]=arr[i];

            mergeSort(left);
            mergeSort(right);

            return merge(left,right,arr);


        }
    }
    public int[] merge(int[] left,int[] right,int[] arr)
    {
        int nL,nR;
        nL=left.length; nR=right.length;

        int i,j,k;
        i=j=k=0;

        while (i<nL && j<nR)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i+=1;
            }else{
                arr[k]=right[j];
                j+=1;
            }
            k++;
        }
        while (i<nL)
        {
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<nR)
        {
            arr[k]=right[j];
            j+=1;
            k++;
        }
        return arr;
    }
}
