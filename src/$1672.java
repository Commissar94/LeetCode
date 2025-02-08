public class $1672 {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }


    public static int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int[] account : accounts) {
            int curMax = 0;
            for (int i : account) {
                curMax += i;
            }
            if (curMax >= max) max = curMax;
        }
        return max;
    }
}
