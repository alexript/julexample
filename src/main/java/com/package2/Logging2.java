/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.package2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author malyshev
 */
public class Logging2 {
public static void log(String msg) {
        Logger LOGGER = Logger.getLogger(Logging2.class.getName());
        LOGGER.log(Level.SEVERE, msg);
    }
}
