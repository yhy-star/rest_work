package org.yhy.rest_work.util;

import lombok.Getter;

import java.io.Serializable;

/**
 * @ClassName： CommonResponse
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/13 12:52
 **/
@Getter
public class CommonResponse<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private CommonResponse(int status){
        this.status = status;
    }

    private CommonResponse(int status, String msg){
        this.status = status;
        this.msg = msg;
    }

    private CommonResponse(int status, String msg, T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private CommonResponse(int status, T data){
        this.status = status;
        this.data = data;
    }


    public static <T> CommonResponse<T> createForSuccess(){
        return new CommonResponse<T>(ResponseCode.SUCCESSS.getCode());
    }

    public static <T> CommonResponse<T> createForSuccess(T data){
        return new CommonResponse<T>(ResponseCode.SUCCESSS.getCode(), data);
    }

    public static <T> CommonResponse<T> createForSuccessMessage(String msg){
        return new CommonResponse<T>(ResponseCode.SUCCESSS.getCode(), msg);
    }

    public static <T> CommonResponse<T> createForSuccessMessage(String msg, T data){
        return new CommonResponse<T>(ResponseCode.SUCCESSS.getCode(), msg, data);
    }

    public static <T> CommonResponse<T> createForSuccessDelete(String msg){
        return  new CommonResponse<T>(ResponseCode.SUCCESSS.getCode(), msg);
    }

    public static <T> CommonResponse<T> createForErrorMessage(String msg){
        return new CommonResponse<T>(ResponseCode.ERROR.getCode(), msg);
    }

}
