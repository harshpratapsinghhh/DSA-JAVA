// Stack follows last in first out.
package Stack;

public class Stack{
  private LiztNode top;
  private int length;
  prvate class ListNode{
    private int data;
    private ListNodee next;
    public ListNode(int data){
      this.data = data;
    }
  }
  public Stack(){
    top = null;
    length = 0;
  }
  public int length(){
    return length;
  }
  public boolean isEmpty(){
    return length==0;
  }
}
