package com.neusoft.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
            ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        try {
            System.out.println(engine.eval("function aa(){ return 1;} aa();"));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
