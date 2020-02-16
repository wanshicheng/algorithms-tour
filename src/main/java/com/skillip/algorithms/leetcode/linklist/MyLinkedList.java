/**
 * *@Copyright: 2019 www.pingshiedu.tech inc . All rights reserved.
 * *注意：本内容仅限于评师教育内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.skillip.algorithms.leetcode.linklist;

/**
 * *@job_name:  com.skillip.algorithms.leetcode.linklist
 * *@author:    wansh
 * *@create_time:  2020/2/15 15:39
 */
public class MyLinkedList {
    int size = 0;
    Node first;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) x = x.next;
        return x.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (first != null) {
            Node x = first;
            first = new Node(val);
            first.next = x;
        } else {
            first = new Node(val);
        }
        size = size + 1;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node x = first;
        for (int i = 0; i < size - 1; i++) x = x.next;
        x.next = new Node(val);
        size = size + 1;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        // 忘记处理第一个node
        if (index == 0) {
            first = new Node(val);
        } else {
            Node x = first;
            for (int i = 0; i < index - 1; i ++) {
                x = x.next;
            }
            Node node = new Node(val);
            if (x.next != null) node.next = x.next;
            x.next = node;
            size = size + 1;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        // 忘记删除第一个节点了
        if (index == 0) {
            first = first.next;
        } else {
            Node x = first;
            for (int i = 0; i < index - 1; i++) {
                x = x.next;
            }
            if (x.next != null) x.next = x.next.next;
            size = size - 1;
        }
    }

    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */