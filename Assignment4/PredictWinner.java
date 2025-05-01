public class PredictWinner {

    public boolean helper(int nums[], int start, int end, boolean playerOneTurn, int scorePlayerOne,
            int scorelayerTwo) {

        if (start > end) {
            if (scorePlayerOne > scorelayerTwo)
                return true;

            return false;
        }
        if (playerOneTurn) {
            boolean c1 = helper(nums, start + 1, end, false, scorePlayerOne + nums[start], scorelayerTwo);
            boolean c2 = helper(nums, start, end + 1, false, scorePlayerOne + nums[end], scorelayerTwo);
            return c1 || c2;
        } else {
            boolean c1 = helper(nums, start + 1, end, true, scorePlayerOne, scorelayerTwo + nums[start]);
            boolean c2 = helper(nums, start, end + 1, true, scorePlayerOne, scorelayerTwo + nums[end]);
            return c1 || c2;
        }

    }
}
