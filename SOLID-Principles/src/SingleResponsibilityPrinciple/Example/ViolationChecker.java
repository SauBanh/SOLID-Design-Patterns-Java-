package SingleResponsibilityPrinciple.Example;

public class ViolationChecker {
    // we have to return true if the pair components are number
    // otherwise we return false
    public static boolean isValid(Pair pair) {

        String first = pair.getFirst();
        String second = pair.getSecond();

        try {
            Integer.parseInt(first);
        }catch (NumberFormatException nfe) {
            System.out.println("First number is not valid...");
            return false;
        }

        try {
            Integer.parseInt(second);
        }catch (NumberFormatException nfe) {
            System.out.println("First number is not valid...");
            return false;
        }

        return true;
    }
}
