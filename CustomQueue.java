public class CustomQueue {

    private int[] data;
    private static final int DEAFAULT_SIZE=10;
    int end=0;

    public CustomQueue()
    {
        this(DEAFAULT_SIZE);
    }

    public CustomQueue(int size)
    {
        this.data=new int[size];
    }

    public boolean isFull()
    {
        return end == data.length;
    }

    public boolean isEmpty()
    {
        return end==0;
    }

    public boolean push(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end]=item;
        end++;
        return true;
    }

    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        int removed=data[0];
        for(int i=1;i<end;i++)
        {
            data[i-1]=data[i];
           
        }
        end--;
        return removed;

    }
    public void display() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
    
    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }

        return data[0];
    }
}
