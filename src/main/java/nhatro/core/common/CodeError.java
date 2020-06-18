package nhatro.core.common;

import lombok.Getter;

@Getter
public enum CodeError {

    OK(200, "Success"),
    LOGIN_FALSE(302,"Thông tin đăng nhập sai !"),
    SING_UP_FALSE(303,"Xem lại thông tin đăng ký !"),
    PHONE_EXIT(304,"Số điện thoại đã tồn tại"),
    ;
    private Integer code;
    private String message;

    CodeError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
