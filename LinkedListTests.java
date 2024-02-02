import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testToString1() {
        LinkedList test = new LinkedList();
        test.append(1);

        assertEquals(test.toString(), "1 ");
    }

    @Test
    public void testToString2() {
        LinkedList test = new LinkedList();

        assertEquals(test.toString(), "");
    }

    @Test
    public void testPrepend() {
        LinkedList test = new LinkedList();
        test.prepend(1);

        assertEquals(test.toString(), "1 ");
    }

    @Test
    public void testPrepend2() {
        LinkedList test = new LinkedList();
        test.prepend(1);
        test.prepend(2);

        assertEquals(test.toString(), "2 1 ");
    }

    @Test
    public void testAppend1() {
        LinkedList test = new LinkedList();
        test.append(3);

        assertEquals(test.toString(), "3 ");
    }
    
    @Test
    public void testAppend2() {
        LinkedList test = new LinkedList();
        test.append(3);
        test.append(4);

        assertEquals(test.toString(), "3 4 ");
    }

    @Test
    public void testAppend3() {
        LinkedList test = new LinkedList();
        test.append(3);
        test.append(4);
        test.append(5);

        assertEquals(test.toString(), "3 4 5 ");
    }

    @Test
    public void testFirst1() {
        LinkedList test = new LinkedList();
        test.append(3);

        assertEquals(3, test.first());
    }

    @Test
    public void testFirst2() {
        LinkedList test = new LinkedList();
        test.append(3);
        test.prepend(6);

        assertEquals(6, test.first());
    }

    @Test
    public void testLast1() {
        LinkedList test = new LinkedList();
        test.append(3);

        assertEquals(3, test.last());
    }

    @Test
    public void testLast2() {
        LinkedList test = new LinkedList();
        test.append(3);
        test.prepend(6);

        assertEquals(3, test.last());
    }

    @Test
    public void testLast3() {
        LinkedList test = new LinkedList();
        test.append(3);
        test.prepend(6);
        test.prepend(5);
        test.prepend(4);
        test.prepend(7);

        assertEquals(3, test.last());
    }

    @Test
    public void testLength1() {
        LinkedList test = new LinkedList();
        test.append(3);

        assertEquals(1, test.length());
    }

    @Test
    public void testLength2() {
        LinkedList test = new LinkedList();
        test.append(3);
        test.prepend(6);

        assertEquals(2, test.length());
    }

    @Test
    public void testLength3() {
        LinkedList test = new LinkedList();
        test.append(3);
        test.prepend(6);
        test.prepend(5);
        test.prepend(4);
        test.prepend(7);

        assertEquals(5, test.length());
    }
}
