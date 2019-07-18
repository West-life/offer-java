package offer2016;

import java.util.Arrays;
import java.util.Vector;


/**
 * 字典树的节点数据结构
 * @author Administrator
 *
 */
class TrieNode{
	Vector<String> bwords=new Vector<String>();
	TrieNode[] next=new TrieNode[26];
}

public class TireTree {
	
	public static void insert(TrieNode root,String wd){
		if(wd==null||wd.length()==0){
			return;
		}
		char[] a=wd.toCharArray();
		Arrays.sort(a);
		TrieNode current=root;
		for(int i=0;i<wd.length();i++){
			if(current.next[a[i]-'a']==null){
				TrieNode tn=new TrieNode();
				current.next[a[i]-'a']=tn;
			}
			current=current.next[a[i]-'a'];
		}
		current.bwords.add(wd);
	}
	
	public static boolean searchNode(TrieNode root,String wd){
		if(root==null){
			return false;
		}
		char[] a=wd.toCharArray();
		Arrays.sort(a);
		int i;
		for(i=0;i<wd.length();i++){
			if(root.next[a[i]-'a']==null){
				break;
			}
			root=root.next[a[i]-'a'];
		}
		if(i==wd.length()){
			for(int j=0;j<root.bwords.size();j++){	
				System.out.print(root.bwords.get(j)+" ");
			}
			return true;
		}
		return false;
	}
	
	public static void findBrother(){
		TrieNode root=new TrieNode();
		
		insert(root, "yu");
		insert(root, "hehao");
		insert(root, "ehhao");
		insert(root, "ehh");
		insert(root, "hhaeo");
		insert(root, "abc");
		insert(root, "vb");
		insert(root, "hehoa");
		insert(root, "hoeha");
		insert(root, "vba");
		
		searchNode(root,"oheha");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findBrother();
	}

}
