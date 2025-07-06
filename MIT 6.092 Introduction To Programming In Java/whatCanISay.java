public class whatCanISay {

    public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < values.length; i++)
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        return minIndex;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx = getMinIndex(values);
        for (int i = 0; i < values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 ||
                    values[i] < values[secondIdx])
                secondIdx = i;
        }
        return secondIdx;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 1, 4, 1 };
        System.out.println(getSecondMinIndex(arr));
    }
}
