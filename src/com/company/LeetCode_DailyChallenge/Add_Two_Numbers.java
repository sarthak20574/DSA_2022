package com.company.LeetCode_DailyChallenge;

public class Add_Two_Numbers {

    //2. Add Two Numbers
    //https://leetcode.com/problems/add-two-numbers/
    //https://www.youtube.com/watch?v=wgFPrzTjm7s&ab_channel=NeetCode

    // add the last digit of the 1st given no. with the last digit of the 2nd given no. and note down the carry, move to the 2nd last digit of the nos. and do the same thing....careful when the adding digits of different lengths and the remaining carry at the end like in 100 + 900 = 1000 the 2 nos are 3 digits long but the answer is 4 digits long

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode extra = new ListNode(0);

            ListNode temp = extra;
            int carry = 0;

            while (l1 != null || l2 != null || carry > 0) {

                int x = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;

                carry = x / 10;
                x = x % 10;

                temp.next = new ListNode(x);
                temp = temp.next;

                l1 = l1 != null ? l1.next : null;
                l2 = l2 != null ? l2.next : null;
            }

            return extra.next;

        }
    }
}
