//package com.Springboot.Exception;
//
//import com.Springboot.Controller.Topics;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class ExceptionHelper
//{
//    @ExceptionHandler(value = { BusinessException.class })
//    public ResponseEntity<Topics> handleInvalidInputException(BusinessException ex)
//    {
//        return new ResponseEntity<Topics>(ex.getMessage(), HttpStatus.BAD_REQUEST);
//    }
//}
