package exceptions;

public class BrowserValueIsNotCorrectOrBrowserNotLaunchException extends Exception {

    public BrowserValueIsNotCorrectOrBrowserNotLaunchException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
