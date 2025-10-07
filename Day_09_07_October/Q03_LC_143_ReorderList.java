class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;

        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int i = 0, j = list.size() - 1;
        boolean turn = true;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (i <= j) {
            if (turn) {
                curr.next = list.get(i++);
            } else {
                curr.next = list.get(j--);
            }
            curr = curr.next;
            turn = !turn;
        }

        curr.next = null;
        head = dummy.next;
    }
}
