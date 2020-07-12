package com.benz.algo;

class Node{

    Node l_link;
    int data;
    Node r_link;
}

public class BsTree{

    Node root;

    public BsTree()
    {
        root=null;
    }

    public void insert(int data)
    {
        Node temp=new Node();
        temp.data=data;
        temp.l_link=null;
        temp.r_link=null;

        if(root==null)
            root=temp;
        else
        {
            Node curr,p;
            p=null;

            curr=root;
            while(curr!=null)
            {
                p=curr;
                if(temp.data>curr.data)
                    curr=curr.r_link;
                else
                    curr=curr.l_link;

            }
            if(temp.data>p.data)
                p.r_link=temp;
            else
                p.l_link=temp;
        }
    }
}
