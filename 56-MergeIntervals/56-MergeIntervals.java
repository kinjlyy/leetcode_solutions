// Last updated: 8/9/2026, 9:41:30 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4        List<int[]> list = new ArrayList<>();
5        if (intervals.length == 1) return intervals;
6        int start = intervals[0][0];
7        int end = intervals[0][1];
8        for (int i = 0; i < intervals.length - 1; i++) {
9            if (intervals[i + 1][0] > end) {
10                list.add(new int[]{start, end});
11                start = intervals[i + 1][0];
12                end = intervals[i + 1][1];
13            } else {
14                end = Math.max(end, intervals[i + 1][1]);
15            }
16        }
17        list.add(new int[]{start, end});
18        return list.toArray(new int[list.size()][]);
19    }
20}
21