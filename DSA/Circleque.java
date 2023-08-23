package dsa;
class cirquefun
{
    int size;
    int array[];
    int front;
    int rear;
    
    public cirquefun(int size)
    {
        this.size = size;
        array = new int [5];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data)
    {
        if (front == -1 && rear == -1)
        {
            front = rear = 0;
            array[rear] = data;
        }
        else if ((rear+1)%size == front)
        {
            System.out.println("Queue is full");
        }
        else
        {
            rear=(rear+1)%size;
            array[rear]= data;
        }
    }
    public void dequeue()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue is empty");
        }
        else if(front == rear)
        {
            System.out.println(array[front]);
            front = rear = - 1;
        }
        else
        {
            System.out.println(array[front]);
            front = (front+1)% size;
        }
    }
    public void display()
    {
        int i = front;
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Queue is: ");
            while(i!=rear)
            {
                System.out.println(array[i]);
                i = (i+1)%size;
            }
            System.out.println(array[rear]);
        }
    }
    public int peek()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println(array[front]);
        }
        return array[front];
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
}
public class Circleque {
    public static void main(String[] args) {
        cirquefun ci = new cirquefun(5);
        ci.enqueue(2);
        ci.enqueue(-8);
        ci.enqueue(3);
        ci.enqueue(0);
        ci.enqueue(5);
        ci.display();
        System.out.println("Element at the top of the stack: " + ci.peek());
        ci.dequeue();
        ci.enqueue(6);
        ci.enqueue(10);
        ci.display();
        System.out.println("Queue full: " + ci.isFull());
        System.out.println("Queue empty: " + ci.isEmpty());
    }
}