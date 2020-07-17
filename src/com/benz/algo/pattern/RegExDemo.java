package com.benz.algo.pattern;

import java.util.regex.*;

public class RegExDemo {

    public void pattern()
    {
        int count=0;
        Pattern p=Pattern.compile("ab");

        Matcher m=p.matcher("ababbaba");

        while(m.find())
        {
            count+=1;
            System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
        }
        System.out.println("The number of occurences "+count);

    }
}
