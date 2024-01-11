package com.film.constant;

import com.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 捕获全局异常
 */

@Slf4j
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    /**
     * 处理自定义的业务异常
     */
    @ExceptionHandler(value = MyException.class)
    public R bizExceptionHandler(MyException e) {
        log.error("发生业务异常！ msg: ->  "+e.getCode()+" "+e.getErrMsg());
        return R.error(e.getCode(),e.getErrMsg());
    }

}
