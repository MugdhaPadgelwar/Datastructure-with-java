public class QueueMain {
    public static void main(String[] args) throws Exception
    {
        CustomQueue list=new CustomQueue(5);
        list.push(90);
        list.push(12);
        list.push(34);
        list.push(67);
        list.push(21);
        list.push(100);
        list.display();
        list.pop();
        list.display();
    }
    
}
