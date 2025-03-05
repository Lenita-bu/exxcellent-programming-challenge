package de.exxcellent.challenge.utilities;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class DataProcessor {
    public static <E> String getSmallestSpread(List<E> lst,
                                               ToIntFunction<E> getValue1,
                                               ToIntFunction<E> getValue2,
                                               Function<E, String> getElement) {
        int minSpread = Math.abs(getValue1.applyAsInt(lst.get(0)) - getValue2.applyAsInt(lst.get(0)));
        String elementWithSmallestSpread = getElement.apply(lst.get(0));

        for (E element : lst) {
            int currSpread = Math.abs(getValue1.applyAsInt(element) - getValue2.applyAsInt(element));
            if (currSpread < minSpread) {
                minSpread = currSpread;
                elementWithSmallestSpread = getElement.apply(element);
            }
        }
        return elementWithSmallestSpread;
    }
}
