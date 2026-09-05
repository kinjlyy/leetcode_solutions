// Last updated: 9/5/2026, 10:46:00 PM
1class Solution {
2    class Topological_Sort {
3    private HashMap<Integer, List<Integer>> map;
4        public Topological_Sort(int v) {
5            map = new HashMap<>();
6            for (int i = 0; i < v; i++) {
7                map.put(i, new ArrayList<>());
8            }
9        }
10        public void Addedge(int v1, int v2) {
11            map.get(v1).add(v2);
12        }
13        public int[] indegree() {
14            int[] in = new int[map.size()];
15            for (int v1 : map.keySet()) {
16                for (int v2 : map.get(v1)) {
17                    in[v2]++;
18                }
19            }
20            return in;
21        }
22
23        public boolean canFinish() {
24
25            Queue<Integer> q = new LinkedList<>();
26            int[] in = indegree();
27
28            for (int i = 0; i < in.length; i++) {
29                if (in[i] == 0) {
30                    q.add(i);
31                }
32            }
33
34            int count = 0;
35
36            while (!q.isEmpty()) {
37                int r = q.poll();
38                count++;
39
40                for (int nbr : map.get(r)) {
41                    in[nbr]--;
42                    if (in[nbr] == 0) {
43                        q.add(nbr);
44                    }
45                }
46            }
47
48            return count == map.size();
49        }
50    }
51
52    public boolean canFinish(int numCourses, int[][] prerequisites) {
53
54        Topological_Sort graph = new Topological_Sort(numCourses);
55
56        for (int[] p : prerequisites) {
57            graph.Addedge(p[1], p[0]);
58        }
59
60        return graph.canFinish();
61    }
62}