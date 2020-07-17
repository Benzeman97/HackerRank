package com.benz.algo;

import java.util.Scanner;

class Node{

    Node l_link;
    int data;
    Node r_link;
}

public class BsTree{

    Node root;
    Scanner sc;


    public BsTree()
    {
        root=null;
        sc=new Scanner(System.in);
    }

    public void opearate()
    {
        while(true) {
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Search");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter a data to insert");
                    int i_data = sc.nextInt();
                    insert(i_data);
                    break;
                case 2:
                    System.out.println("Enter a data to remove");
                    int r_data = sc.nextInt();
                    remove(root, r_data,root);
                    break;
                case 3:
                    inOrder(root);break;
                case 4:
                    System.out.println("Enter a data to search");
                    int s_data=sc.nextInt();
                    search(root,s_data);break;
                default:
                    System.exit(8);
            }
        }
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

    public Node findMinFromRight(Node node)
    {
        while(node.l_link!=null)
            node=node.l_link;
        return node;
    }

    public Node remove(Node curr,int data,Node p) {

        if (curr == null)
            return curr;
        else if (data < curr.data) {
            p = curr;
            remove(curr.l_link, data, p);
        } else if (data > curr.data) {
            p = curr;
            remove(curr.r_link, data, p);
        } else {
            if (curr.l_link == null && curr.r_link == null) {
                if (curr == p.l_link) {
                    p.l_link = null;
                    return curr;
                } else if (curr == p.r_link) {
                    p.r_link = null;
                    return curr;
                }
            }
            if (curr.r_link == null && curr.l_link != null) {
                if (curr == p.r_link)
                    p.r_link = curr.l_link;
                else if(curr==p.l_link)
                    p.l_link=curr.l_link;
                return curr;
            }
            if (curr.l_link == null && curr.r_link != null) {
                if (curr == p.r_link)
                    p.r_link = curr.r_link;
                if(curr==p.l_link)
                    p.l_link=curr.r_link;
                return curr;
            } else if(curr.l_link!=null && curr.r_link!=null)
            {
                Node least=findMinFromRight(curr.r_link);
                if(curr==p.l_link) {
                    least.l_link=curr.l_link;
                    p.l_link=least;
                    curr=null;
                }
                else if(curr==p.r_link) {
                    least.l_link=curr.l_link;
                    p.l_link=least;
                    curr=null;
                }
                return curr;
            }
        }
        return curr;
    }

    public void search(Node curr,int data) {
        if (curr == null)
            System.out.println("No node(s) in the tree");
        else if (data < curr.data)
            search(curr.l_link, data);
        else if (data > curr.data)
            search(curr.r_link, data);
        else {
            if (curr.data == data)
                System.out.println(data + " has been found");
        }
    }

   /* public Node remove(Node root,int data)
    {
        Node curr=root;
        if(curr==null)
            return curr;
        if(data<curr.data)
            remove(curr.l_link,data);
        else if(data>curr.data)
            remove(curr.r_link,data);
        else
        {
              if(curr.l_link==null && curr.r_link==null)
                  curr=null;
              else if(curr.r_link==null)
                  curr=curr.l_link;
              else if(curr.l_link==null)
                  curr=curr.r_link;
              else {
                  Node temp = findMinFromRight(curr.r_link);
                  curr.data = temp.data;
                  curr.r_link = remove(curr.r_link, temp.data);
              }

        }
        return curr;
    }*/

    public void inOrder(Node root)
    {
        Node temp=root;
        if(temp.l_link!=null)
            inOrder(temp.l_link);
        System.out.print(temp.data+"\t");
        if(temp.r_link!=null)
            inOrder(temp.r_link);

        System.out.print("\n");
    }
}
