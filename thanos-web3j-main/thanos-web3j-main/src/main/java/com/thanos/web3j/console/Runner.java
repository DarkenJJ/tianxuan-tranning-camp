package com.thanos.web3j.console;

import com.thanos.web3j.codegen.SolidityFunctionWrapperGenerator;
import com.thanos.web3j.utils.Console;
import com.thanos.web3j.utils.Version;

import static com.thanos.web3j.utils.Collection.tail;

/**
 * Main entry point for running command line utilities.
 */
public class Runner {

    private static String USAGE = "Usage: web3j version|solidity ...";

    private static String LOGO = "\n";

    public static void main(String[] args) throws Exception {
        System.out.println(LOGO);

        if (args.length < 1) {
            Console.exitError(USAGE);
        } else {
            switch (args[0]) {
                case "solidity":
                    SolidityFunctionWrapperGenerator.run(tail(args));
                    break;
                case "version":
                    Console.exitSuccess("Version: " + Version.getVersion() + "\n"
                            + "Build timestamp: " + Version.getTimestamp());
                    break;
                default:
                    Console.exitError(USAGE);
            }
        }
    }
}
