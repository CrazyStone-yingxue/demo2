package com.stone.exception;

import com.stone.bean.OutObject;
import com.stone.bean.ReturnObject;
import com.stone.bean.TestOutputCode;
import org.apache.ibatis.binding.BindingException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*@ControllerAdvice(basePackages = "com.stone.controller")   //定义获取异常的范围,定义所在包
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object bindingExceptionHandler(HttpServletRequest request, HandlerMethod method, BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        List<ObjectError> allErrors = bindingResult.getAllErrors();

        String errorMessage = "";
        for (ObjectError allError : allErrors) {
            errorMessage += allError.getDefaultMessage();
        }
        Object o = buildReturnObject(method, errorMessage);
        return o;
    }

    public Object buildReturnObject(HandlerMethod method, String message) {
        Class returnType = method.getReturnType().getMethod().getReturnType();
        TestOutputCode test = new TestOutputCode();
        if (returnType == TestOutputCode.class) {           //？？？？
            test.setRtnCode(ReturnObject.SUCCESS_CODE);
        } else {
            test.setRtnCode(ReturnObject.FILED_CODE);
        }
        return test;
    }
}*/
