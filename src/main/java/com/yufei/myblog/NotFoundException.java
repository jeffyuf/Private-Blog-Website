package com.yufei.myblog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Yufei on 10/12/19 4:52 PM
 * for project myblog
 */
@ResponseStatus(HttpStatus.NOT_FOUND) //标识状态码404，跳转到404页面
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
