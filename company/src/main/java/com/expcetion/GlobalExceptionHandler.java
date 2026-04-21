package com.expcetion;

import com.result.Result;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handValidException(MethodArgumentNotValidException e){
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        return Result.error(message);
    }

   @ExceptionHandler(BusinessException.class)
    public Result handleBusiness(BusinessException e){
        return Result.error(e.getCode(), e.getMessage());
   }
   @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        return Result.error(500,"服务器内部错误");
   }

}
