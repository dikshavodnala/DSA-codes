public class CLL{
    public static void main(String args[])
    {
        CircularLL list=new CircularLL();
        list.insert(23);
        list.insert(64);
        list.insert(9);
        list.insert(12);
        list.insert(89);
        list.delete(64);
        list.display();
    }
}