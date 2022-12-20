package programmers.a_1_level;

import java.util.stream.IntStream;

public class Solution70128 {

    public static int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                .map(index -> a[index] * b[index])
                .sum();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(solution(a, b));

        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(solution(a2, b2));
    }
}
