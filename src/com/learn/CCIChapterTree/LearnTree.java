package com.learn.CCIChapterTree;

class Node {
    Node left, right;
    int data;


    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new Node(data);
            } else {
                right.insert(data);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data)
            return true;
        else if (value < data) {
            if (left == null)
                return false;
            else {
                return left.contains(value);
            }
        } else {
            if (right == null)
                return false;
            else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
}

public class LearnTree {

    public static void main(String[] args) {
        Node n = new Node();
        n.insert(5);
        n.insert(9);
        System.out.println(n.contains(3));
        n.printInOrder();

    }

}
