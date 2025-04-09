public boolean search(int key){
  ListNode current = head;
while(current!=null){
  if(current.data== key){
    return true;
  }
  current = current.next;
}
return false;
}
