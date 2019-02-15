/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.argosgrp.loggertest;

import com.package1.Logging1;
import com.package2.Logging2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

/**
 *
 * @author malyshev
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (InputStream fis = NewMain.class.getResourceAsStream("logging.properties")) {
            LogManager.getLogManager().readConfiguration(fis);
        }

        Logging1.log("message to logger 1");
        Logging2.log("message to logger 2");
    }

}
