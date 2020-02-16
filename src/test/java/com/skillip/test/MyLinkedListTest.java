/**
 * *@Copyright: 2019 www.pingshiedu.tech inc . All rights reserved.
 * *注意：本内容仅限于评师教育内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.skillip.test;

import com.skillip.algorithms.leetcode.linklist.MyLinkedList;
import org.junit.Test;

/**
 * *@job_name:  com.skillip.test
 * *@author:    wansh
 * *@create_time:  2020/2/16 18:02
 */
public class MyLinkedListTest {
    @Test
    public void myTest() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(0);
        System.out.println(myLinkedList.get(0));


    }

}
