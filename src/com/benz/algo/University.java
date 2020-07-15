package com.benz.algo;

interface Pen{
    void write(String str);
}
public class University {

    public void doWork() {
        AssignmentWork assignmentWork = new AssignmentWork();
        Pen p = new PenAdapter();
        assignmentWork.setPen(p);
        assignmentWork.work("I am bit tired to write an assignment");
    }


}

class AssignmentWork{
     private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void work(String str)
    {
        pen.write(str);
    }
}

class PilotPen{

    public void note(String str)
    {
        System.out.println(str);
    }
}
class PenAdapter implements Pen{

      PilotPen pp;

      public PenAdapter()
      {
          pp=new PilotPen();
      }

    @Override
    public void write(String str) {
         pp.note(str);
    }
}
