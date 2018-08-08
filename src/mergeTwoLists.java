/**
 * 融合兩個排序過的連結串列為一個新的連結串列後回傳。
 * 範例：
 *	[1,2,2,3] + [1,3] = [1,1,2,2,3,3]
 * @author black
 *
 */
public class mergeTwoLists{
	public static void main(String[] args){
		Solution Solution = new Solution();
		ListNode node1 = new ListNode(-1);
		ListNode node2 = new ListNode(-1);
		ListNode result = new ListNode(-1);
		node1.addnode(1);
		node1.addnode(2);
		node1.addnode(4);
		node2.addnode(1);
		node2.addnode(3);
		node2.addnode(4);
		result = Solution.mergeTwoLists(node1, node2);
		result.printlist();
	}	
}