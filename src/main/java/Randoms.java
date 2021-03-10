import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    private static List<Integer> randoms = new ArrayList<>();
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Randoms addRandoms(int random) {
        randoms.add(random);
        return null;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int nextPosition = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
          return randoms.get(nextPosition++);

            }

            @Override
            public void remove() {

            }

            @Override
            public void forEachRemaining(Consumer<? super Integer> action) {

            }

        };
    }
}