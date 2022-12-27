package programmers.a_1_level;

public class Solution131705 {

    public static int solution(int[] number) {
        int count = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0)
                        ++count;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number));

        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(number2));

        int[] number3 = {-1, 1, -1, 1};
        System.out.println(solution(number3));
    }
}
