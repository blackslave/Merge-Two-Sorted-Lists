public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { this.val = x; }
    public void addnode(int a)
	{
		ListNode newnode = new ListNode(a);
		if(this.next==null) 
		{
			this.next = newnode;
			return;
		}
		ListNode tmp = this.next;
		while(tmp.next !=null)
		{
			tmp = tmp.next;
		}
		tmp.next = newnode;
	}
    public void printlist()
	{
		ListNode tmp = this.next;
		while(tmp!=null)
		{
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}
