/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.csmc123;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.EmptyStackException;
import junit.framework.TestCase;

/**
 *
 * @author chromalix
 */
public class StackTest extends TestCase {

    private Stack<String> s;

    public void setUp() {
        s = new Stack<String>();
    }

    public void testPush() {
        s.push("Shampoo");
        assertEquals("added items first:", "Shampoo", s.peek());
        s.push("Shampoo1");
        assertEquals("added items second:", "Shampoo1", s.peek());
        s.push("Shampoo2");
        assertEquals("added items third:", "Shampoo2", s.peek());
    }

    public void testPop() {
        s.push("Shampoo");
        s.push("Shampoo1");
        s.push("Shampoo2");
        assertEquals("added items first:", "Shampoo2", s.pop());
        assertEquals("added items second:", "Shampoo1", s.pop());
        assertEquals("peek test:", "Shampoo", s.peek());
        assertEquals("added items third:", "Shampoo", s.pop());
    }

    public void testPeek() {
        s.push("Shampoo");
        s.push("Shampoo1");
        s.push("Shampoo2");
        assertEquals("last item:", "Shampoo2", s.peek());
    }

    public void testPopEmpty() {
        try {
            s.pop();
            fail("Should have thrown an exception!");
        } catch (EmptyStackException e) {
            // expected!
        }
    }

    public void testPeekEmpty() {
        try {
            s.peek();
            fail("Should have thrown an exception!");
        } catch (EmptyStackException e) {
            // expected!
        }
    }

    public void testPopMoreThan() {
        s.push("Shampoo");
        s.push("Shampoo1");
        s.push("Shampoo2");
        s.pop();
        s.pop();
        s.pop();
        try {
            s.pop();
            fail("Should have thrown an exception!");
        } catch (EmptyStackException e) {
            // expected!
        }
    }

    public void testPeekMoreThan() {
        s.push("Shampoo");
        s.push("Shampoo1");
        s.push("Shampoo2");
        s.pop();
        s.pop();
        s.pop();
        try {
            s.peek();
            fail("Should have thrown an exception!");
        } catch (EmptyStackException e) {
            // expected!
        }
    }

    public void testPushplusplus() {
        s.push("Shampoo1");
        s.push("Shampoo2");
        s.push("Shampoo3");
        s.push("Shampoo4");
        s.push("Shampoo5");
        s.push("Shampoo6");
        s.push("Shampoo7");
        s.push("Shampoo8");
        s.push("Shampoo9");
        s.push("Shampoo10");
        s.push("Shampoo11");
        s.push("Shampoo12");
        s.push("Shampoo13");
        s.push("Shampoo14");
        s.push("Shampoo15");
        s.push("Shampoo16");
        s.push("Shampoo17");
        assertEquals("last item:", "Shampoo17", s.peek());

    }

}
