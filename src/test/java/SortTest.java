import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;

public class SortTest {
    @Test
    public void testSort() {

        assertEquals(asList(), sort(asList()));

    }

    private List<Integer> sort(List<Integer> list) {
        return new ArrayList<>();
    }
}
