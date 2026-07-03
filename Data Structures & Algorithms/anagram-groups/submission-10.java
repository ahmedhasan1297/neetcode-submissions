class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> temp = new HashMap<>();

        var res = Arrays.asList(strs)
            .stream()
            .collect(Collectors.groupingBy(c -> c.length()));

        for (String str : strs) {
            var tempStr = str.toCharArray();
            Arrays.sort(tempStr);
            var sortedString = String.valueOf(tempStr);
            temp.computeIfAbsent(sortedString, v-> new ArrayList<>())
                .add(str);
        }
        // for(Map.Entry<String, List<String>> e : temp.entrySet()) {
        //     result.add(e.getValue());
        // }

        return new ArrayList<>(temp.values());

    }
}
