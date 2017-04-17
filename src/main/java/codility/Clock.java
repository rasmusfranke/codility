package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Clock {
    public String solution(int A, int B, int C, int D) {
        List<Integer> values = new ArrayList<>(Arrays.asList(new Integer[]{A, B, C, D}));
        try {
            int h1 = maxInRange(values, 2);
            values.remove(values.indexOf(h1));

            int h2 = maxInRange(values, h1 == 2 ? 3 : 9);
            values.remove(values.indexOf(h2));

            int m1 = maxInRange(values, 6);
            values.remove(values.indexOf(m1));

            int m2 = maxInRange(values, 9);
            values.remove(values.indexOf(m2));

            return String.format("%d%d:%d%d", h1, h2, m1, m2);
        } catch (Exception e) {
            return "NOT POSSIBLE";
        }
    }

    public int maxInRange(List<Integer> values, int max) {
        return values.stream().filter(i -> i <= max).max(Comparator.naturalOrder()).get();
    }
}
