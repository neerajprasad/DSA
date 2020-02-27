package java.interview;

public class RemoveSpace {
    public static void main(String ares[]) {
        String whiteSpace = "neeraj is hero";
        String removedSpace = "";
        for (int i = 0; i < whiteSpace.length(); i++) {
            if (whiteSpace.charAt(i) != ' ') {
                removedSpace = removedSpace + whiteSpace.charAt(i);
            }
        }
        System.out.println(removedSpace);
    }
}
