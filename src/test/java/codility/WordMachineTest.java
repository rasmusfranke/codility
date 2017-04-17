package codility;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordMachineTest {
    WordMachine machine;

    @Before
    public void init(){
        machine = new WordMachine();
    }

    @Test
    public void push(){
        assertEquals(1, machine.solution("1"));
    }

    @Test
    public void pop(){
        assertEquals(1, machine.solution("1 2 POP"));
    }

    @Test
    public void dup(){
        assertEquals(1, machine.solution("1 DUP POP"));
    }

    @Test
    public void add(){
        assertEquals(2, machine.solution("1 1 +"));
    }

    @Test
    public void sub(){
        assertEquals(2, machine.solution("1 3 -"));
    }

    @Test
    public void combination(){
        assertEquals(7, machine.solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }

    @Test
    public void addOverflow(){
        assertEquals(-1, machine.solution(String.format("%d 1 +", 0xFFFFF)));
    }

    @Test
    public void subUnderflow(){
        assertEquals(-1, machine.solution("1 0 -"));
    }

    @Test
    public void emptyStack(){
        assertEquals(-1, machine.solution("5 6 + -"));
    }
}
