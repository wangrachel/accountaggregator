package com.juvenxu.mvnbook.account.email;

public class AccountEmailException extends Exception{
    public AccountEmailException(){super();}

    public AccountEmailException(String msg){super(msg);}

    public AccountEmailException(String msg, Throwable cause){super(msg,cause);}

    public AccountEmailException(Throwable cause){super(cause);}
}
