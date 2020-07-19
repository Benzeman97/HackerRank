package com.benz.algo;


import com.benz.algo.pattern.RegExDemo;

public class Program {

    public int factorial(int x)
    {

      if(x<=1)
            return 1;
      else if(x==2)
          return 2;
        else
            return x*factorial(x-1);
    }

    public static void main(String[] args)
    {
        /* int x=0;
         Program program=new Program();
         int factorial=program.factorial(x);
        System.out.println("The factorial of "+x+" is "+factorial);*/
/*        int x=10;
        Program program=new Program();
        program.fun(x,x++);
        System.out.println(x);//11*/

//   MergeSort merge=new MergeSort();
//
//         merge.display();

        Program program=new Program();

        /*QuickSort quickSort=new QuickSort();
        int[] arr={12,44,32,76,33};

        quickSort.quickSort(arr,0,(arr.length-1));
        program.display(arr);*/

        /*ShellSort shellSort=new ShellSort();
        int[] arr={73,24,45,62,22,19,46,53,22,67};

        shellSort.shellSort(arr);*/

    /*FactoryMain factory=new FactoryMain();
     factory.display();*/


//
//      Phone phone=new PhoneBuilder().setDisplay(5.6).setCamera(16).setOs("Android")
//              .setProcessor("snapdragon").setRam(8).builder();
//
//        System.out.println(phone);

//        University university=new University();
//        university.doWork();

        /*TreeTest compositeTree=new TreeTest();
        compositeTree.display();*/

      /*  Prototype prototype=new Prototype();
        try {
            prototype.display();
        }catch (CloneNotSupportedException cx)
        {
            cx.printStackTrace();
        }*/

      /*Tube tube=new Tube();
      tube.display();*/

      BsTree bsTree=new BsTree();
      bsTree.opearate();

        /*RegExDemo reg=new RegExDemo();
        reg.pattern();*/



    }

/*    public static <T> Class<?> typeOf(final T value) {
        return value.getClass();
    }*/

    public void display(int[] arr)
    {
        for(int x:arr)
            System.out.print(x+"\t");
    }

    public void fun(int x,int y)//10,10/20,10/30,10/40,10/50,10
    {
        if(x>40)
            return;
        x+=y;//20
        fun(x,y);
        System.out.println(x);//50,40,30,20
    }
}
