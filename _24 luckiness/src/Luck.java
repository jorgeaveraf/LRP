public class Luck {

    public static int calculateLuckiness(int number) {
        int[] digitCount = new int[10];

        int minDigit = Integer.MAX_VALUE;
        int maxDigit = Integer.MIN_VALUE;

        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            minDigit = Math.min(minDigit, digit);
            maxDigit = Math.max(maxDigit, digit);
            number /= 10;
        }

        int nMin = 0;
        int nMax = 0;

        for (int i = 0; i < digitCount.length; i++) {
            while (digitCount[i] > 0) {
                if (i == minDigit) {
                    nMin = nMin * 10 + i;
                }
                if (i == maxDigit) {
                    nMax = nMax * 10 + i;
                }
                digitCount[i]--;
            }
        }

        return nMax - nMin;
    }
}
