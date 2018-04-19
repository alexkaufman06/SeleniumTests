package com.firsttest.webdriver;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class GridParallelComputerTest {
    @Test
    public void runAllTests() {
        Class<?>[] classes = {ParallelTest1.class,ParallelTest2.class};
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
}
