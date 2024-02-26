import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;

public class SortTest {
    @Test
    public void testSort() {

        assertEquals(asList(), sort(asList()));
        assertEquals(asList(1), sort(asList(1)));
        assertEquals(asList(1,2), sort(asList(1,2)));
        assertEquals(asList(1,2), sort(asList(2,1)));

    }

    private List<Integer> sort(List<Integer> list) {
        return list;
    }
}
