package prj5;

import student.TestCase;

/**
 * Tests the Node class.
 * 
 * @author Jonathan Rukaj (jrukaj)
 * @version 6.30.19
 */
public class NodeTest extends TestCase {

    private Node<String> first;
    private Node<String> mid;
    private Node<String> last;


    /**
     * Sets up the test fixture.
     */
    public void setUp() {
        first = new Node<String>("First");
        mid = new Node<String>("Mid");
        last = new Node<String>("Last");
        
        mid.setNext(last);
        mid.setPrev(first);
        first.setNext(mid);
        last.setPrev(mid);
    }


    /**
     * Tests the getData() method, ensuring the correct values are returned.
     */
    public void testGetData() {
        assertEquals("First", first.getData());
        assertEquals("Mid", mid.getData());
        assertEquals("Last", last.getData());
    }


    /**
     * Tests the next() method, ensuring the correct Nodes are returned.
     */
    public void testNext() {
        assertEquals(mid, first.next());
        assertEquals(last, mid.next());
    }


    /**
     * Tests the prev() method, ensuring the correct Nodes are returned.
     */
    public void testPrev() {
        assertEquals(mid, last.prev());
        assertEquals(first, mid.prev());
    }


    /**
     * Tests the setNext() method.
     */
    public void testSetNext() {
        assertEquals(mid, first.next());
        assertEquals(last, mid.next());

        last.setNext(mid);
        mid.setNext(first);

        assertEquals(mid, last.next());
        assertEquals(first, mid.next());
    }


    /**
     * Tests the setNext() method.
     */
    public void testSetPrev() {
        assertEquals(first, mid.prev());
        assertEquals(mid, last.prev());

        last.setPrev(first);
        first.setPrev(mid);

        assertEquals(mid, first.prev());
        assertEquals(first, last.prev());
    }
}
