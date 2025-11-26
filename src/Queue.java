
public class Queue<T> {
    private ListRecord head;
    private ListRecord tail;


    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue( T obj ) {
        if( obj != null ) {
            ListRecord newRecord = new ListRecord(obj);
            if (head == null) {
                head = newRecord;
                tail = newRecord;
            } else {
                tail.next = newRecord;
                tail = newRecord;
            }
        }
    }

    public T dequeue() {
        if( isEmpty() )  {
            return null;
        } else {
            ListRecord tmp = head;
            head = head.next;
            tmp.next = null;

            if (isEmpty()) {
                tail = null;
            }

            return tmp.data;
        }
    }

    public int getLength() {
        int len = 0;
        ListRecord rec = head;
        while (rec != null){
            len++;
            rec = rec.next;
        }
        return len;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private class ListRecord {
        public T data;
        public ListRecord next;

        public ListRecord ( T obj ) {
            data = obj;
        }
    }

}
