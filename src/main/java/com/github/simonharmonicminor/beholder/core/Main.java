package com.github.simonharmonicminor.beholder.core;

import spoon.FluentLauncher;
import spoon.reflect.CtModel;

class Main {
    public static void main(String[] args) {
        CtModel ctModel = new FluentLauncher()
                .inputResource("/Users/kirekov/IdeaProjects/beholder-core/src/main/java")
                .buildModel();
        System.out.println("Hello, world!");
        System.out.println(ctModel);
    }
}
