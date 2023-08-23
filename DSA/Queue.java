package dsa;

class queuefun
{
    int size ;
    int array[];
    int front;
    int rear;
    
    public queuefun(int size)
    {
        this.size = size;
        array = new int [size];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data)
    {
        if (!isFull())
        {
            if(front==-1 && rear==-1)
            {
                ++front;
                ++rear;
                array [rear] = data;
            } 
            else
            {
                rear++;
                array [rear] = data;
            }
        }
        else
        {
            System.out.println(" Queue is full");
        }
    }
    public int dequeue()
    {
        if (!isEmpty())
        {
            int data = array [front];
            front ++;
            return data;
        }
        else if(front == rear)
        {
            System.out.println(array[front]);
            front = rear = -1;
            return array[front];
        }
        else
        {
            System.out.println("Queue is empty");
            return 0;
        }
    }
    public boolean isFull()
    {
        return (rear == array.length -1);
    }
    public boolean isEmpty()
    {
        if(front > rear)
        {
            System.out.println("Queue is empty");
            return true;
        }
        else
        {
            return false;
        }
    }
    public int peek()
    {
        return array [front];
    }
}
public class Queue {
    public static void main(String[] args) {
        queuefun qu = new queuefun(10);
        qu.enqueue(9);
        qu.enqueue(5);
        qu.enqueue(1);
        qu.enqueue(15);
        qu.enqueue(3);
        System.out.println("Element at the top of the stack: " + qu.peek());
        while (!qu.isEmpty())
        {
            int data = qu.dequeue();
            System.out.println(data);
        }
        System.out.println("Queue full: " + qu.isFull());
        System.out.println("Queue empty: " + qu.isEmpty());
    }
}
