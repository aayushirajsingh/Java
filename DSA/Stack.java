package dsa;

class stackfun
{
    private int size ;
    private int[] intArray;
    private int top;
    
    public stackfun (int size)
    {
        this.size = size;
        intArray = new int[10];
        top = -1;
    }
    public void push (int data)
    {
        if(!isFull())
        {
            intArray [++top] = data;
        }
        else 
        {
            System.out.println("Stack is full cannot add data");
        }
    }
    public int pop()
    {
        return intArray [top--];
    }
    public int peek()
    {
        return intArray [top];
    }
    public boolean isFull()
    {
        return (top==(size - 1));
    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
}
public class Stack {
    public static void main(String[] args) {
        stackfun st = new stackfun(10);
        st.push(9);
        st.push(5);
        st.push(1);
        st.push(15);
        st.push(3);
        System.out.println("Element at the top of the stack: " + st.peek());
        while (!st.isEmpty())
        {
            int data = st.pop();
            System.out.println(data);
        }
        System.out.println("Stack full: " + st.isFull());
        System.out.println("Stack empty: " + st.isEmpty());
    }
}