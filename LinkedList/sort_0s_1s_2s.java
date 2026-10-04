public class sort_0s_1s_2s {

class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}


class Solution {
    public ListNode sortList(ListNode head) {
       ListNode temp = head;
       int zeroC =0;
       int oneC=0;
       int twoC=0;
       while (temp != null) {
            if(temp.data==0){
                zeroC++;
            }
            else if(temp.data==1){
                oneC++;
            }
            else{
                twoC++;
            }
            temp = temp.next;
        }
        ListNode trav =head;
        while(trav !=null){
            if(zeroC>0){
                trav.data=0;
                zeroC--;
            }
            else if(oneC>0){
                trav.data=1;
                oneC--;
            }
            else{
                trav.data=2;
                twoC--;

            }
            trav=trav.next;
        }
        return head;
    }
}
}


/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode zeroHead = new ListNode(-1);
        ListNOde zeroTail = zeroHead;
        ListNode oneHead = new ListNode(-1);
        ListNOde oneTail = oneHead;
        ListNode twoHead = new ListNode(-1);
        ListNOde twoTail = twoHead;


        ListNode temp =head;
        while(temp!=null){
            if(temp.data ==0){
                ListNode nodeToInsert;
                temp =temp.next;
                zeroTail.next=nodeToInsert;
                zeroTail=nodeToInsert;

            }
            else if(temp.data==1){
                ListNode nodeToInsert;
                temp =temp.next;
                oneTail.next=nodeToInsert;
                oneTail=nodeToInsert;
            }
            else if(temo.data==2){
                ListNode nodeToInsert;
                temp =temp.next;
                twoTail.next=nodeToInsert;
                twoTail=nodeToInsert;
            }
        }
        //now all my 3 sublist are ready to  join 
        //lets join 
        zeroTail.next =(oneHead.next!=null)? oneHead.next: twoHead.next;

        //manully delete the zeroHead
        zeroHead =zeroHead.next;
        //return hrad of modified ll
        return zeroHead;
    }
}