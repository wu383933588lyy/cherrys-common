package com.cherrys.common.model;

public enum CodeEnum {

    SUCCESS(0, "成功"),
    ERROR(1, "失败"),
    WAIT(1001, "正在处理结果");






    private Integer code;

    private String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
