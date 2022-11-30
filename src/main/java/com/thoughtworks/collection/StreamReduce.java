package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce((a,b) -> b%2==0 ? a : b)
                .get();
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce(words.get(0), (a,b) -> b.length()>a.length() ? b : a);
    }

    public int getTotalLength(List<String> words) {
        return words.stream().reduce(0, (a, b) ->a + b.length(), Integer::sum);
    }
}
