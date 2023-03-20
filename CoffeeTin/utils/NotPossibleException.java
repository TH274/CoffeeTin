package utils;

/**
 * @overview A run-time exception that is (not expected to be) thrown
 * by a method that could not perform its operation due to input 
 * data errors.
 *
 */
public class NotPossibleException extends RuntimeException {
    public NotPossibleException(String s) {
        super(s);
    }
}
