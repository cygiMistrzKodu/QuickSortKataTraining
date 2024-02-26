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
        assertEquals(asList(1, 2), sort(asList(1, 2)));
        assertEquals(asList(1, 2), sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));

    }

    private List<Integer> sort(List<Integer> list) {

        if (list.size() <= 1)
            return list;
        else if (list.size() == 2) {
            int first = list.get(0);
            int second = list.get(1);
            if (first > second) {
                return asList(second, first);
            } else {
                return asList(first, second);
            }

        } else {
            return list;
        }

    }
}
