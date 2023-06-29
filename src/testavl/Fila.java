/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testavl;

/**
 *
 * @author icalc
 */
public interface Fila {
  public int size();
  public boolean qIsEmpty();
  public boolean qIsFull();
  public Object front() throws QueueEmptyException;
  public void enQueue(Object element) throws QueueFullException;
  public Object deQueue() throws QueueEmptyException;    
}


