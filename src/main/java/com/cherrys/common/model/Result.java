package com.cherrys.common.model;

import lombok.Data;

/**
 * @ClassName Result
 * @Description TODO 统一封装返回信息
 * @Author Wurui
 * @DATE 2019/10/25 10:29
 * @Version 1.0
 **/
@Data
public class Result<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 具体的内容
     */
    private T data;

    /**
     * 无数据返回结果封装
     */
    private static final Result SUCCESS = new Result(CodeEnum.SUCCESS);

    private static final Result ERROR = new Result(CodeEnum.ERROR);

    private static final Result WAIT = new Result(CodeEnum.WAIT);

    public Result(CodeEnum codeEnum){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }

    /**
     * 传入信息返回
     * @param message
     * @return
     */
    public static Result success(String message){
        CodeEnum codeEnum= CodeEnum.SUCCESS;
        codeEnum.setMessage(message);
        return new Result(codeEnum);
    }

    public static Result error(String message){
        CodeEnum codeEnum= CodeEnum.ERROR;
        codeEnum.setMessage(message);
        return new Result(codeEnum);
    }

    public Result(CodeEnum codeEnum,T data){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
        this.data = data;
    }

    public static Result success(Object data){
        return new Result(CodeEnum.SUCCESS,data);
    }

    public static Result error(Object data){
        return new Result(CodeEnum.ERROR,data);
    }


}
