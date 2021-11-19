package org.yhy.rest_work.util;

import lombok.Getter;
import org.yhy.rest_work.entity.Links;

import java.io.Serializable;
import java.util.List;

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
    private Links links;

    private CommonResponse(int status){
        this.status = status;
    }

    private CommonResponse(int status, String msg){
        this.status = status;
        this.msg = msg;
    }

    private CommonResponse(int status, String msg, T data, Links links){
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.links = links;
    }

    private CommonResponse(int status, T data){
        this.status = status;
        this.data = data;
    }

    public CommonResponse(int status, String msg, Links links) {
        this.status = status;
        this.msg = msg;
        this.links = links;
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

    public static <T> CommonResponse<T> createForSuccessMessage(String msg, T data, Links links){
        return new CommonResponse<T>(ResponseCode.SUCCESSS.getCode(), msg, data, links);
    }

    public static <T> CommonResponse<T> createForSuccessDelete(String msg, Links links){
        return  new CommonResponse<T>(ResponseCode.SUCCESSS.getCode(), msg, links);
    }

    public static <T> CommonResponse<T> createForErrorMessage(String msg){
        return new CommonResponse<T>(ResponseCode.ERROR.getCode(), msg);
    }

}
