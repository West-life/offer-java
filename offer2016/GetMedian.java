package offer2016;

import java.util.*;
public class Solution {
    private Comparator<Integer> revCmp=new Comparator<Integer>(){
        public int compare(Integer num1,Integer num2){
            return num2.compareTo(num1);
        }
    };
    private PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
    private PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(15,revCmp);
    private int elementNum=0;
    public void Insert(Integer num) {
    	if(elementNum%2==0){
            minHeap.add(num);
        }else{
            maxHeap.add(num);
        }
        elementNum++;
        if(!maxHeap.isEmpty()&&maxHeap.peek()>minHeap.peek()){
            minHeap.add(maxHeap.poll());
            maxHeap.add(minHeap.poll());
        }
    }

    public Double GetMedian() {
        if(!maxHeap.isEmpty()&&elementNum%2==0){
            return new Double((maxHeap.peek()+minHeap.peek()))/2;
        }else{
            return new Double(minHeap.peek());
        }
    }
}