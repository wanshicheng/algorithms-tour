/**
 * *@Copyright: 2019 www.pingshiedu.tech inc . All rights reserved.
 * *注意：本内容仅限于评师教育内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.skillip.algorithms.leetcode.p344;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * *@job_name:  com.skillip.algorithms.leetcode.p344
 * *@author:    wansh
 * *@create_time:  2020/2/6 17:27
 */
class Solution {
    public void reverseString(char[] s) {
        helper(0, s.length - 1, s);
    }

    private void helper(int start, int end, char[] s) {
        if (start > end) {
            return;
        }
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;

        List<Integer> list = asList(1, 2);
    }
}
