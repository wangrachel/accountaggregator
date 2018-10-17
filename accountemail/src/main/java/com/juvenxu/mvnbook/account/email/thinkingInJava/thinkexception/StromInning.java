package com.juvenxu.mvnbook.account.email.thinkingInJava.thinkexception;

public class StromInning extends Inning implements Strom {

    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }
    public StromInning() throws RainedOut,BaseballException{}

    public StromInning(String s) throws Foul,BaseballException{}

    @Override
    public void event() {}



}
