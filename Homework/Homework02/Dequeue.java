/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  Dequeue.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-10-22
 * Description:  Creates dequeue using frontQ and backQ 
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class Dequeue extends Queue {

  private  Queue frontQ;
  private  Queue backQ;
//  private  int   maxSize;

  public Dequeue(int n) { //constructor
//    maxSize = n;
    frontQ = new Queue(n);
    backQ = new Queue(n);
  }

  /*
    @param queue value to be inserted
    @return Queue; returns reversed queue
  */
  public Queue reverseQ(Queue name) {
    long[] contents = name.queArray;
    Queue temp = new Queue(name.maxSize);
    for (int i = contents.length-1; i >= 0; i--) {
      int k = 0;
      temp.insert(contents[i]);
      k++;
    }
    return temp;
  }

  /*
    @param long value to be inserted
    @return void; adds value to left of queue and reverses to update frontQ
  */
  public void insertLeft(long j) {
   backQ.insert(j);
   frontQ = reverse(Q);
  }

  /*
    @param long value to be inserted
    @return void; adds value to right of queue and reverses to update backQ
  */
  public void insertRight(long j) {
   frontQ.insert(j);
   backQ = reverseQ(frontQ);
  }

  /*
    @return long; removes left value in backQ and updates frontQ
  */
  public long removeLeft() {
    // removeAt() function in Queue
    // will always remove first element in queue
    backQ.remove(j);
    frontQ = reverse(Q);
  }

  /*
    @return long; removes right value in frontQ and updates backQ
  */
  public long removeRight() {
    // removeAt() function in IntLinkedList
    // will always remove last element in queue
    frontQ.remove(j);
    backQ = reverseQ(frontQ);
  }

  /*
    @return boolean; returns true if queue is empty
  */
  public boolean isEmpty() {
    return ( (frontQ.nItems==0 ) && (backQ.nItems==0) );
  }

  /*
    @return boolean; returns true if queue is full
  */
  public boolean isFull() {
   return ( (frontQ.nItems==maxSize ) && (backQ.nItems==maxSize) );
  }
}
