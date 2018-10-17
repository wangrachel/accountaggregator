package com.juvenxu.mvnbook.account.email.thinkingInJava.thinkexception;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineTest {
    public static void main(String[] args){
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {

            engine.eval("var a=3; var b=4;print (a+b);");

            // engine.eval("alert(\"js alert\");");    // 不能调用浏览器中定义的js函数 // 错误，会抛出alert引用不存在的异常
        } catch (ScriptException e) {

            e.printStackTrace();
        }
    }



}