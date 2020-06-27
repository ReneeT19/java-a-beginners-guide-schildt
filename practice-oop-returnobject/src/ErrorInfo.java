public class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };
    int errorSeverity[] = {3,3,2,4};

    //return an object of type Err
    Err getErrorInfo(int i) {
        if(i >= 0 && i < msgs.length)
            return new Err(msgs[i], errorSeverity[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}
