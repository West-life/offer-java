package offer2016;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int N = cin.nextInt();
            StringBuffer sb=new StringBuffer();
            while(N-->0){
            	int eachN = cin.nextInt();
            	while(eachN-->0){
            		sb.append(cin.next());
            		sb.append(",");
            	}
            }
            String[] str=sb.toString().split(",");
            int K=cin.nextInt();
            TreeSet<myWord> queue=getMostK(str,K);
            while(!queue.isEmpty()){
            	myWord word=queue.pollFirst();
            	System.out.println(word.getVal()+" "+word.getCount());
            }
        }
    }
    public static TreeSet<myWord> getMostK(String str[],int k){
    	Map<String ,Integer> maps=new HashMap<String ,Integer>();
    	for(int i=0;i<str.length;i++){
    		if(maps.containsKey(str[i])){
    			maps.put(str[i],maps.get(str[i])+1);
    		}else{
    			maps.put(str[i],1);
    		}
    	}
    	TreeSet<myWord> queue=new TreeSet<myWord>(new myComparator());
    	for(Map.Entry<String ,Integer> entry:maps.entrySet()){
    		if(queue.size()<k){
    			queue.add(new myWord(entry.getKey(),entry.getValue()));
    		}else{
    			if(entry.getValue()>queue.last().getCount()){
    				queue.pollLast();
    				queue.add(new myWord(entry.getKey(),entry.getValue()));
    			}else if(entry.getValue()==queue.last().getCount()){
    				if(entry.getKey().compareTo(queue.last().getVal())<0){
    					queue.pollLast();
        				queue.add(new myWord(entry.getKey(),entry.getValue()));
    				}
    			}
    		}
    	}
    	return queue;
    }
}

class myComparator implements Comparator<myWord>{
	@Override
	public int compare(myWord o1, myWord o2) {
		// TODO Auto-generated method stub
		if(o1.getCount()<o2.getCount()){
			return 1;
		}else if(o1.getCount()>o2.getCount()){
			return -1;
		}else{
			return o1.getVal().compareTo(o2.getVal());
		}
	}
} 

class myWord{
	int count;
	String val;
	public myWord(String val,int count){
		this.count=count;
		this.val=val;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	
}