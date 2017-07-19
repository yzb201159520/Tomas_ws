package com.testdi.bean;

import java.io.PrintStream;

/**
 *
 * Created by thomas on 2017/7/19.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
            stream.println("embark on printStream : "+stream.toString());
    }
}
