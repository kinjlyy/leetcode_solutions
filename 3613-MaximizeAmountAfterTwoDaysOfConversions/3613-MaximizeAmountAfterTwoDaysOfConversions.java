// Last updated: 7/4/2026, 7:42:30 PM
class Solution {
    public double maxAmount(String initialCurrency, List<List<String>> pairs1, double[] rates1, List<List<String>> pairs2, double[] rates2) {
        Map<String, Double> best = new HashMap<>();
        best.put(initialCurrency, 1.0);

        bellman(best, pairs1, rates1);
        bellman(best, pairs2, rates2);

        return best.getOrDefault(initialCurrency, 0.0);
    }
    private void bellman(Map<String, Double> best, List<List<String>> pairs, double[] rates) {
        for (int k = 0; k < pairs.size(); k ++) {
            for (int i = 0; i < pairs.size(); i ++) {
                String from = pairs.get(i).get(0), to = pairs.get(i).get(1);
                double rate = rates[i];

                best.put(to, Math.max(best.getOrDefault(to, 0.0), best.getOrDefault(from, 0.0) * rate));
                best.put(from, Math.max(best.getOrDefault(from, 0.0), best.getOrDefault(to, 0.0) / rate));
            }
        }
    }
}