import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTests {
    public List<String> generateList() {
        ArrayList<String> generated = new ArrayList<>();

        generated.add("test");
        generated.add("test 2");
        generated.add("zest");
        generated.add("AAAA");
        generated.add("djiawdjkAHAfa");
        generated.add("list");
        generated.add("not A list");
        generated.add("not a list");

        return generated;
    }

    @Test
    public void testFilter() {
        List<String> check = generateList();

        List<String> expected = new ArrayList<String>();
        expected.add("AAAA");
        expected.add("djiawdjkAHAfa");
        expected.add("not A list");

        assertEquals(expected, ListExamples.filter(check, new CheckHasA()));
    }

    @Test
    public void testMerge() {
        List<String> listA = Arrays.asList("aaa", "aab", "cde", "zzzz");
        List<String> listB = Arrays.asList("abc", "cce", "cde", "zzzzz", "zzzzzzz");

        List<String> expected = Arrays.asList("aaa", "aab", "abc", "cce", "cde", 
                                              "cde", "zzzz", "zzzzz", "zzzzzzz");

        assertEquals(expected, ListExamples.merge(listA, listB));
    }

    @Test
    public void testMerge2() {
        List<String> listA = Arrays.asList("aaa", "aab", "cde", "zzzz");
        List<String> listB = Arrays.asList("abc", "cce", "cde", "zzzzz", "zzzzzzz");

        List<String> expected = Arrays.asList("aaa", "aab", "abc", "cce", "cde", 
                                              "cde", "zzzz", "zzzzz", "zzzzzzz");

        assertEquals(expected, ListExamples.merge(listB, listA));
    }
}

class CheckHasA implements StringChecker {
    @Override
    public boolean checkString(String s) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'A')
                return true;
        }

        return false;
    }
}
