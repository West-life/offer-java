package offer2016;

import java.util.*;
public class Solution {
    public static ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(num==null||num.length==0||size>num.length||size==0){
            return ans;
        }
        Deque<Integer> deque=new LinkedList<Integer>();
        
        for(int i=0;i<size;i++){
            while(!deque.isEmpty()&&num[i]>=num[deque.peekLast()]){
            	deque.pollLast();
            }
            deque.offer(i);
        }
        for(int i=size;i<num.length;i++){
        	ans.add(num[deque.peek()]);
            if(i-deque.peekFirst()>=size){
                deque.poll();
            }
            while(!deque.isEmpty()&&num[i]>=num[deque.peekLast()]){
            	deque.pollLast();
            }
            deque.offer(i);
        }
        ans.add(num[deque.poll()]);
        return ans;
    }
}