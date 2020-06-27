public class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        System.out.println(err.getErrorInfo(2).msg + " severity: " + err.getErrorInfo(2).severityLevel);
        System.out.println(err.getErrorInfo(20).msg + " severity: " + err.getErrorInfo(20).severityLevel);

    }
}
