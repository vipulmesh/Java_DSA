/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
if (head == null || head.next == null || head.next.next == null) {
    return new int[]{-1, -1};
}

ListNode prev = head;
ListNode curr = head.next;
ListNode forward = curr.next;
        int i=1;
        List<Integer> criticalPts = new ArrayList<>();
        while(curr!=null && forward!=null){
            //chk for localmaxima 
            if(curr.val>prev.val && curr.val > forward.val){
                criticalPts.add(i);
            }
            //chk for  localminima
            if(curr.val<prev.val && curr.val<forward.val){
                criticalPts.add(i);
            }
            curr =curr.next;
            prev=prev.next;
            forward=forward.next;
            i=i+1;
        }

        if(criticalPts.size()<2){
            return new int[] {-1,-1};
        }
        //crtical pts are ready
        int minDist =Integer.MAX_VALUE;

        for(int j=1; j<criticalPts.size(); j++){
            minDist=Math.min(minDist, criticalPts.get(j)- criticalPts.get(j-1));

        }
        int maxDist=criticalPts.get(criticalPts.size()-1)-criticalPts.get(0);

        return new int[]{minDist,maxDist};
    }
}