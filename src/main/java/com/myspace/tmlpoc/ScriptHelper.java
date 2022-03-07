package com.myspace.tmlpoc;

import org.kie.api.runtime.process.ProcessContext;

public class ScriptHelper {
    public static void init(ProcessContext kcontext) {
        Hello hello = new Hello();
        hello.setPiid(kcontext.getProcessInstance().getId());
        kcontext.setVariable("hello", hello);
    }
}
