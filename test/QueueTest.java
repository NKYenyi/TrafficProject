import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Commuter ctr = new Commuter(1, 10.0);
        Queue<Commuter> queue = new Queue<Commuter>();
        queue.enqueue( ctr );
        assertTrue( queue.getLength() == 1 );
    }

    @Test
    void dequeue() {
        Commuter ctr = new Commuter(1, 10.0 );
        Queue<Commuter> queue = new Queue<Commuter>();
        queue.enqueue( ctr );
        Commuter ctrdeq = queue.dequeue();
        assertTrue( ctr.getId() == ctrdeq.getId() );
    }

    @Test
    void isEmpty() {
        Commuter ctr = new Commuter(1, 10.0);
        Queue<Commuter> queue = new Queue<Commuter>();
        queue.enqueue( ctr );
        queue.dequeue();
        assertTrue( queue.isEmpty() );
    }
}