package xyz.yldk.mcmod.SharpLoader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.instrument.Instrumentation;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Welcome to SharpLoader!");
        logger.error("SharpLoader does not support direct launch. Please add it to the Java Agent to start.");
        System.err.println("SharpLoader does not support direct launch. Please add it to the Java Agent to start.");
        System.exit(1);
    }

    public static void premain(String args, Instrumentation inst) {
        CoreMain.agentMain(args, inst, false);
    }

    public static void agentmain(String args, Instrumentation inst) {
        CoreMain.agentMain(args, inst, true);
    }



}