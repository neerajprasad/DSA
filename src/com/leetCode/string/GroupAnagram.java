package leetCode.string;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 */

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = groupAnagrams(input);
        output.stream().forEach(System.out::print);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> stringListMap = new HashMap<>();
        for (String val:strs) {
            String temp = val.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            addingValueInMap(stringListMap, val, temp);
        }
        return new ArrayList(stringListMap.values());
    }

    private static void addingValueInMap(Map<String, List<String>> stringListMap, String val, String temp) {
        if(!stringListMap.containsKey(temp)){
            stringListMap.put(temp,new ArrayList<>());
        }
        stringListMap.get(temp).add(val);

    }
}
