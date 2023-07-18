public class stackMain {
    public static void main(String[] args) throws Exception
    {
        stack list=new Dynamicstack(15);
        
        list.push(90);
        list.push(50);
        list.push(34);
        list.push(65);
        list.push(87);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.peek());
       
        

    }
    
}
