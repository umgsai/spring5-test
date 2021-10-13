package com.umgsai.spring5.test.linkedlist;

public class Main {

    public static void main(String[] args) {
        Node head = new Node();
        head.setValue(0);

        Node temp = head;
        for (int i = 1; i < 11; i++) {
            Node node = new Node();
            node.setValue(i);

            temp.setNext(node);
            temp = node;
        }

        temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }

        Node newHead = reverse(head);
        temp = newHead;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    /**
     * 单链表翻转
     */
    public static Node reverse(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }
}
