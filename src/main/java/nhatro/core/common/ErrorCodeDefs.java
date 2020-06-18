package nhatro.core.common;

public class ErrorCodeDefs {
    public static final String SECRET = "@nhatro@";
    public static final int CODE_OK = 200;
    public static final int UNKNOWN = 500;
    public static final int TOKEN_FAIL = 401;

    public String getErrDesc(int code) {
        String response = "Lỗi không xác định";
        switch (code) {
            case UNKNOWN:
                break;
            case CODE_OK:
                response = "Success";
                break;
            case TOKEN_FAIL:
                response = "Chưa xác thực";
                break;
            default:
                break;
        }
        return response;
    }
}
