package com.kibeom.springbootstudy.controller.error;

import com.kibeom.springbootstudy.constant.ErrorCode;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class BaseErrorController implements ErrorController {
    @RequestMapping("/error")
    public ModelAndView error(HttpServletResponse response){
        HttpStatus status = HttpStatus.valueOf(response.getStatus());
        ErrorCode errorCode = status.is4xxClientError() ? ErrorCode.BAD_REQUEST : ErrorCode.INTERNAL_ERROR;

        return new ModelAndView("error",
                Map.of(
                        "statusCode", status.value(),
                        "errorCode", errorCode,
                        "massage", errorCode.getMessage(status.getReasonPhrase())
                ),
                status
        );
    }
}
