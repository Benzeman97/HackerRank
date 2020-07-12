package com.benz.algo;

import org.w3c.dom.ls.LSOutput;

public interface OS {
    void spec();
}

class Android implements OS{

    @Override
    public void spec() {
        System.out.println("Most Powerful");
    }
}

class IOS implements OS{

    @Override
    public void spec() {
        System.out.println("Most Secured");
    }
}

class Windows implements OS{

    @Override
    public void spec() {
        System.out.println("I am about to die");
    }
}

class FactoryMain{

    public void display()
    {
        OperatorSystemFactory operatorSystemFactory=new OperatorSystemFactory();
        OS os=operatorSystemFactory.getInstance("windows");
        os.spec();
    }
}

class OperatorSystemFactory{

    public OS getInstance(String os_name)
    {
        if(os_name.equalsIgnoreCase("open"))
            return new Android();
        else if(os_name.equalsIgnoreCase("secured"))
            return new IOS();
        else
            return new Windows();
    }
}