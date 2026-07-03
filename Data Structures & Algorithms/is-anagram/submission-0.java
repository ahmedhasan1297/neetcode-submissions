// import java.util.stream.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } 
        String ss ="";

        var res = s.chars()
            .mapToObj(c-> (char)c)
            .sorted()
            .collect(
                Collectors.groupingBy(
                    c->c,
                    Collectors.counting()
                )
            );
    var res2 = t.chars()
            .mapToObj(c-> (char)c)
            .sorted()
            .collect(
                Collectors.groupingBy(
                    c->c,
                    Collectors.counting()
                )
            );
            return res.equals(res2);
            // .map(cc -> ss+cc );
            // .toList();
            // .collect(Collectors.joiningBy(""));
    }
}
