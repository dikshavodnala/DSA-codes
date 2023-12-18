public class DoublyLL{
   private Node head;
   private Node tail;
   private int size;

   public LinkedList(){
       this.size=0;
   }

    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
    }
    public void insertLast(int val)
    {
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if(head==null)
        {
         node.prev=null;
         head=node;
         return;
        }
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==val)
        {
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    public Node find(int value)
    {
            Node node=head;
           while(node!=null)
           {
            if(node.val==value)
            {
                return node;
            }
            node=node.next;
           }
           return null;
    }
    public void insertAfter(int after,int val)
    {
      Node p=find(after);

      if(p==null)
      {
        System.out.println("does not exist");
        return;
      }
      Node node=new Node(val);
      node.next=p.next;
      p.next=node;
      node.prev=p;
      if(node.next!=null)
      {
        node.next.prev=node;
      }
    }
    public int deleteFirst()
    {
        int val=head.val;
        if(head==null)
        {
            tail=null;
        }
       
        if(head==tail)
        {
            tail=null;
            head=null;
            return val;
        }
        Node node=head;
        head=head.next;
        head.prev=null;
        node.next=null;
        size--;
        return node.val;
    
    }
    public int deleteLast(){
        int val=head.val;
        if(head==null)
        {
            tail=null;
        }
        if(head==tail){
            head=null;
            tail=null;
            return val;
        }

        Node node=tail;
        tail=tail.prev;
        tail.next=null;
        node.prev=null;
        
        return node.val;
    }
    
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val, Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
}