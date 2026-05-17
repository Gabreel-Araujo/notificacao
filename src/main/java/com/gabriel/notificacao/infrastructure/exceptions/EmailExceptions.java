package com.gabriel.notificacao.infrastructure.exceptions;

public class EmailExceptions extends RuntimeException{
    public EmailExceptions(String msg){
        super(msg);
    }

    public EmailExceptions(String msg, Throwable throwable){
        super(msg, throwable);
    }

}
