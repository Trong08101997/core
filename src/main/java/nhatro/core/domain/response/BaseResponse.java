package nhatro.core.domain.response;

import lombok.Data;
import nhatro.core.common.CodeError;

@Data
public class BaseResponse {
    private String message;
    private Integer code;
    private Object data;

    public void setSuccess(Object data) {
        this.message = CodeError.OK.getMessage();
        this.code = CodeError.OK.getCode();
        this.data = data;
    }

    public void setErrCode(CodeError data) {
        this.message = data.getMessage();
        this.code = data.getCode();
    }
}
