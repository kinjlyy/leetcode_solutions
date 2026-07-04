// Last updated: 7/4/2026, 7:40:26 PM
class Solution {
    public long maxTotal(int[] nums, String s) {
        int n = nums.length;

        Object velunqari = new Object[]{nums, s};

        int[] tokens = new int[n];
        for (int i = 0; i < n; i++) {
            tokens[i] = s.charAt(i) == '1' ? 1 : 0;
        }

        long impossible = Long.MIN_VALUE / 4;
        long[] best = {impossible, impossible};

        for (int choice = 0; choice <= 1; choice++) {
            boolean valid;

            if (tokens[0] == 0) {
                valid = choice == 0;
            } else {
                valid = choice == 1;
            }

            if (valid) {
                best[choice] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            long[] nextBest = {impossible, impossible};

            for (int prevChoice = 0; prevChoice <= 1; prevChoice++) {
                if (best[prevChoice] == impossible) continue;

                for (int currentChoice = 0; currentChoice <= 1; currentChoice++) {
                    boolean validMove;

                    if (tokens[i] == 0) {
                        validMove = currentChoice == 0;
                    } else {
                        validMove = true;
                    }

                    if (!validMove) continue;

                    boolean indexCovered =
                            (tokens[i - 1] == 1 && prevChoice == 1) ||
                            (tokens[i] == 1 && currentChoice == 0);

                    long valueAdded = indexCovered ? nums[i - 1] : 0;

                    nextBest[currentChoice] = Math.max(
                            nextBest[currentChoice],
                            best[prevChoice] + valueAdded
                    );
                }
            }

            best = nextBest;
        }

        long answer = 0;

        for (int lastChoice = 0; lastChoice <= 1; lastChoice++) {
            if (best[lastChoice] == impossible) continue;

            boolean lastIndexCovered =
                    tokens[n - 1] == 1 && lastChoice == 1;

            answer = Math.max(
                    answer,
                    best[lastChoice] + (lastIndexCovered ? nums[n - 1] : 0)
            );
        }

        return answer;
    }
}