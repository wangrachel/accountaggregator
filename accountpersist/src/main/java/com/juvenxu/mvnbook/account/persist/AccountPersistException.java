package com.juvenxu.mvnbook.account.persist;

public class AccountPersistException extends Exception {
    public AccountPersistException(){super();}
    public AccountPersistException(String msg){super(msg);}
    public AccountPersistException(String msg, Throwable throwable){super(msg, throwable);}
    public AccountPersistException(Throwable throwable){super(throwable);}

}
