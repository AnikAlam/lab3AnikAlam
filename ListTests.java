import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests implements StringChecker {
    public boolean checkString(String s) {
        return s.contains("cats");
    }

    @Test
    public void testFilter() {
        List<String> testList = new ArrayList<>();
        testList.add("wowza");
        StringChecker sc = new ListTests();
        assertArrayEquals(new String[]{ "cats" }, ListExamples.filter(testList, sc).toArray());
    }

    // @Test
    // public void testMerge() {
    // }
}