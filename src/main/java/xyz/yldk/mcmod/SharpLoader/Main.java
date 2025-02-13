package xyz.yldk.mcmod.SharpLoader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.instrument.Instrumentation;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Hello World!");

    }

    public static void premain(String args, Instrumentation inst) {

    }

    public static void agentmain(String args, Instrumentation inst) {

    }

}