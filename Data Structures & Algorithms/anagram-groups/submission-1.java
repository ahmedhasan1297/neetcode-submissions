class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> temp = new HashMap<>();

        var res = Arrays.asList(strs)
            .stream()
            .collect(Collectors.groupingBy(c -> c.length()));

        for (String str : strs) {
            var tempStr = str.toCharArray();
            Arrays.sort(tempStr);
            System.out.println(tempStr);
            var sortedString = String.valueOf(tempStr);
            temp.computeIfAbsent(sortedString, v-> new ArrayList<>())
                .add(str);
            System.out.println(tempStr);
        }
        System.out.println(temp);
        for(Map.Entry<String, List<String>> e : temp.entrySet()) {
            result.add(e.getValue());
        }

        System.out.println(result);
        return result;





        // for(Map.Entry<Long, List<String> e: res) {
        //     var ents = e.getValue();
        //     Map<String, List<String>> temp = new HashMap<>();
        //     for(String en: ents) {

        //     }
        // }
        //     .entrySet()
        //     .stream()
        //     .forEach(e-> {
        //         e.value()
        //     });

        // System.out.println(res);
        // return new ArrayList<>();
    }
}
