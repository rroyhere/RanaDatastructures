package com.github.linkedlist;

public class App {

    public static void main(String args[]){

        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeB.data = 7;

        Node nodeD = new Node();
        nodeB.data = 8;

        //linking the nodes
        nodeA.objNextNode = nodeB;
        nodeB.objNextNode = nodeC;
        nodeC.objNextNode = nodeD;

        //find the size of the linkedlist from this node onwards

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));

    }

    public static int listLength(Node node){

        int length = 0;
        Node currentNode = node;
        while(currentNode != null){
            length ++;
            currentNode = currentNode.objNextNode;
        }
        return length;
    }
}
