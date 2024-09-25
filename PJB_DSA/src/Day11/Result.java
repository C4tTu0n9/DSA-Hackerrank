package Day11;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Result {

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        // Write your code here
        if (llist == null) {
            llist = new DoublyLinkedListNode(data);
            return llist;
        }
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (llist.data >= data) {
            newNode.next = llist;
            llist.prev = newNode;
            return newNode;
        }
        DoublyLinkedListNode current = llist;
        while (true) {
            if (current.data > data) {
                newNode.next = current;
                current.prev.next = newNode;
                newNode.prev = current.prev;
                current.prev = newNode;
                break;
            }
            if (current.next == null) {
                current.next = newNode;
                newNode.prev = current;
                break;
            }
            current = current.next;
        }
        return llist;
    }


    /* Day 11 - 4
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */

    public static List<Integer> waiter(List<Integer> number, int q) {
        // Write your code here
        int n = 2;
        BigInteger a = new BigInteger(String.valueOf(n));
        Stack<Integer> nInArr = new Stack<>();
        Stack<Integer> nOutArr = new Stack<>();
        List<Integer> result = new ArrayList<>();
        while (q-- > 0) {
            if (a.isProbablePrime(10)) {
                nOutArr.clear();
                for (int j = number.size() - 1; j >= 0; ) {
                    if (number.get(j) % a.intValue() == 0) {
                        nInArr.push(number.get(j));
                        number.remove(number.get(j));
                        if (j == number.size()) {
                            j--;
                        }
                    } else if (q != 0) {
                        nOutArr.push(number.get(j));
                        number.remove(number.get(j));
                        j--;
                    } else {
                        j--;
                    }
                }
                number.addAll(nOutArr);
                for (int i = 0; i < nInArr.size(); i++) {
                    result.add(nInArr.pop());
                    i--;
                }
            }
            n++;
            a = new BigInteger(String.valueOf(n));
        }
        result.addAll(number);
        return result;
    }



    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        // Write your code here
        //1 - 2 - 3 - 4
        if(llist == null){
            return null;
        }
        DoublyLinkedListNode rem = llist.prev;
        llist.prev = llist.next;
        llist.next = rem;
        if(llist.prev == null){
            return llist;
        }
        return reverse(llist.prev);
    }


    public static final int ALPHABET_CNT = 26;

    static boolean isAnagrams(String s1, String s2) {

        char[] chCnt1 = new char[ALPHABET_CNT];
        char[] chCnt2 = new char[ALPHABET_CNT];


        for (int i = 0, n = s1.length(); i < n; i++) {
            chCnt1[s1.charAt(i) - 97] += 1;
            chCnt2[s2.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < ALPHABET_CNT; i++) {
            if (chCnt1[i] != chCnt2[i]) {
                return false;
            }
        }

        return true;
    }
    static int sherlockAndAnagrams(String s) {
        int cnt = 0;
        for (int i = 1, n = s.length(); i < n; i++) {
            List<String> subsetList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i + j <= n) {
                    subsetList.add(s.substring(j, i + j));
                }
            }

            for (int k = 0, size = subsetList.size(); k < size; k++) {
                for (int l = k + 1; l < size; l++) {
                    if (isAnagrams(subsetList.get(k), subsetList.get(l))) {
                        cnt++;
                    }
                }
            }
        }


        return cnt;
    }
}