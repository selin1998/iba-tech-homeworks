package homework12.exception;

public class FamilyOverflowException extends RuntimeException {
    public FamilyOverflowException(String s) {
        System.out.println(s);
    }
}
