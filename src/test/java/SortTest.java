import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        assertEquals(asList(1, 2, 3), sort(asList(1, 3, 2)));
        assertEquals(asList(1, 2, 3), sort(asList(3, 2, 1)));
        assertEquals(asList(1, 2, 3, 4), sort(asList(1, 2, 3, 4)));
        assertEquals(asList(1, 2, 3, 4), sort(asList(2, 1, 3, 4)));
        assertEquals(asList(1, 2, 3, 4), sort(asList(4, 3, 2, 1)));

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

            int middle = list.get(0);

            List<Integer> lessers = list.stream().filter(x -> x < middle).collect(Collectors.toList());
            List<Integer> greaters = list.stream().filter(x -> x > middle).collect(Collectors.toList());


            List<Integer> result = new ArrayList<>();
            result.addAll(sort(lessers));
            result.add(middle);
            result.addAll(sort(greaters));

            return result;
        }

    }
}
