/**
 * 讀取L1目前的值與L2目前的值比較，如果L1.val < L2.val，將當前的L1節點加入新的連結串列(result)，然後L1指向下一個節點。
 * 如果L1.val > L2.val較小，則把L2當前的節點加到temp，直到L1或L2一方為null則停止比較，並且將另外一邊剩下的節點加入temp。
 * @author black
 *
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		ListNode l3;
		if(l1.val < l2.val)
		{
			l3 = l1;
			l1 = l1.next;			
		}
		else
		{
			l3 = l2;
			l2 = l2.next;
		}
		ListNode temp = new ListNode(-1);
		temp.next = l3;
		while(l1!=null && l2!=null)
			if(l1.val < l2.val)
			{
				l3.next = l1;
				l3 = l3.next;
				l1 = l1.next;
			}
			else
			{
				l3.next = l2;
				l3 = l3.next;
				l2 = l2.next;
			}
		if(l1!=null)	l3.next = l1;
		if(l2!=null)	l3.next = l2;	
		return temp.next;
    }
/*
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    if(l1 == null) return l2;
	    if(l2 == null) return l1;
	    
	    if(l1.val < l2.val){
	    	l1.next = mergeTwoLists(l1.next, l2);
	        return l1;
	    }else{
	    	l2.next = mergeTwoLists(l1, l2.next);
	        return l2;
	    }
	    
	}
*/
}
