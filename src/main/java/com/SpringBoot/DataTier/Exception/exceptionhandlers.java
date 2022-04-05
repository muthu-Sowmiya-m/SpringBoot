package com.SpringBoot.DataTier.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.NoSuchElementException;

@ControllerAdvice
public class exceptionhandlers extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<Object> handleServiceException(ServiceException e)
    {
      ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,"401",
              e.getMessage(), LocalDateTime.now(ZoneOffset.UTC));
      return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> handleNullPointerException(NullPointerException e)
    {
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler({NoSuchMethodException.class,NoSuchElementException.class,IllegalArgumentException.class})
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException e)
    {
        return new ResponseEntity<>(e.getMessage(),HttpStatus.NO_CONTENT);
    }

}
