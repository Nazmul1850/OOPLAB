package Array;

public class SumAvg {
    private int[] nums;

//    Constructor
    public SumAvg(int[] nums) {
        this.nums = nums;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public double sumAvg() {
        return sum()/(double)nums.length;

    }
}
