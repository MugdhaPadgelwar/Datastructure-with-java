public class stackMain {
    public static void main(String[] args) throws Exception
    {
        stack list=new stack(6);
        list.push(9);
        list.push(67);

        System.out.println(list.pop());
        System.out.println(list.pop());
    }
    
}
