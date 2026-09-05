class Solution {
    class Topological_Sort {
    private HashMap<Integer, List<Integer>> map;
        public Topological_Sort(int v) {
            map = new HashMap<>();
            for (int i = 0; i < v; i++) {
                map.put(i, new ArrayList<>());
            }
        }
        public void Addedge(int v1, int v2) {
            map.get(v1).add(v2);
        }
        public int[] indegree() {
            int[] in = new int[map.size()];
            for (int v1 : map.keySet()) {
                for (int v2 : map.get(v1)) {
                    in[v2]++;
                }
            }
            return in;
        }

        public boolean canFinish() {

            Queue<Integer> q = new LinkedList<>();
            int[] in = indegree();

            for (int i = 0; i < in.length; i++) {
                if (in[i] == 0) {
                    q.add(i);
                }
            }

            int count = 0;

            while (!q.isEmpty()) {
                int r = q.poll();
                count++;

                for (int nbr : map.get(r)) {
                    in[nbr]--;
                    if (in[nbr] == 0) {
                        q.add(nbr);
                    }
                }
            }

            return count == map.size();
        }
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Topological_Sort graph = new Topological_Sort(numCourses);

        for (int[] p : prerequisites) {
            graph.Addedge(p[1], p[0]);
        }

        return graph.canFinish();
    }
}