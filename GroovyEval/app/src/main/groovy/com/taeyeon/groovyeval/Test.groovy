package com.taeyeon.groovyeval

import groovy.transform.CompileStatic

@CompileStatic
class Test {
    public static int testInt = 0
    public static String testEval() {
        return Eval.me("3 + 2")
    }
}