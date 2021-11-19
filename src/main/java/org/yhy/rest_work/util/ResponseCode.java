package org.yhy.rest_work.util;

import lombok.Getter;

/**
 * @ClassName： ResponseCode
 * @Description：
 * @Author: yhy
 * @Date： 2021/11/13 12:59
 **/
@Getter
public enum ResponseCode {

    SUCCESSS(400,"请求成功"),
    ERROR(500, "请求失败");


    private final int code;
    private final String description;

    ResponseCode(int code, String description){
        this.code = code;
        this.description = description;
    }
}
