public class stack{
    protected int[] data;
    private  static final int DEFAULT_SIZE=10;
    int ptr=-1;

    public stack(int size)
    {
        this.data=new int[size];
    }

    public stack()
    {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Size is full cannot insert");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        return data[ptr];
    }

    public boolean isFull()
    {
        return ptr==data.length-1;
    }

    public boolean isEmpty()
    {
        return ptr==-1;
    }
}