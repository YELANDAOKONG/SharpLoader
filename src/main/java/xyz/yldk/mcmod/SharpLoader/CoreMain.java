package xyz.yldk.mcmod.SharpLoader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.instrument.Instrumentation;

public class CoreMain {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void agentMain(String args, Instrumentation inst, boolean dynamic) {
        logger.info("CoreMain (args = \"{}\", dynamic = {})", args, dynamic);
    }
}
