package com.github.simonharmonicminor.beholder.core;
class Main {
    public static void main(java.lang.String[] args) {
        spoon.reflect.CtModel ctModel = new spoon.FluentLauncher().inputResource("/Users/kirekov/IdeaProjects/beholder-core/src/main/java").buildModel();
        java.lang.System.out.println("Hello, world!");
        java.lang.System.out.println(ctModel);
    }
}