package testavl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icalc
 */
public class ArrayQueue implements Fila {
  public static final int CAPACITY = 1000;
  private int capacity;
  private Object q[];
  private int begin, end;

  public ArrayQueue(){
    this(CAPACITY);
  }
  public ArrayQueue( int cap ){
    capacity = cap;
    q = new Object[capacity];
  }
  public int size(){
    return (capacity - begin + end);
  }    
  
  public boolean qIsEmpty(){
    return (begin == end);  
  }
  
  public boolean qIsFull(){
    return (size() == capacity -1);  
  }
  
  public Object front() throws QueueEmptyException{
    if (qIsEmpty())
      throw new QueueEmptyException("Queue Empty");
    return q[begin];  
  }
  
  @Override
  public void enQueue(Object element) throws QueueFullException{
    if (qIsFull()) 
      throw new QueueFullException("Queue Full");
    q[end] = element;
    end = (end+1) % capacity;  
  }
  
  @Override
  public Object deQueue() throws QueueEmptyException{
    if (qIsEmpty())
      throw new QueueEmptyException("Queue Empty");
    Object temp = q[begin];
    q[begin]= null;
    begin = (begin+1) % capacity;
    return temp;   
  }
}


