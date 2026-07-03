class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        var res = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(
                n->n,
                Collectors.counting()
            ))
            .entrySet()
            .stream()
            .sorted(
                Map.Entry.<Integer,Long>comparingByValue().reversed()
            )
            .limit(k)
            .map(e-> e.getKey())
            .toList();
        for(int i=0;i<k;i++) {
            result[i] = res.get(i).intValue();
        }
        System.out.println(res);
        return result;
    }
}
