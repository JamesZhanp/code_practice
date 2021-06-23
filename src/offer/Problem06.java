package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2021 - 06 - 21 16:49
 */
public class Problem06 {
    public int[] reversePrint(ListNode head){
        int length = 0;
        ListNode currentNode = head;
        while(head != null){
            length ++;
            head = head.next;
        }
        int[] result = new int[length];
        while (currentNode != null){
            result[length - 1] = currentNode.val;
            currentNode = currentNode.next;
            length--;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node4.next = null;
        node3.next = node4;
        node2.next = node3;
        node1.next = node2;

        Problem06 problem06 = new Problem06();
        int[] result = problem06.reversePrint(node1);
        System.out.println(result);

    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
