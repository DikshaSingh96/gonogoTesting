package com.softcell.jpmshello;

import com.softcell.jpmshi.HiModules;
import sun.nio.ch.IOUtil;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

public class HelloModules {

    public static void main(String[] args) {
        System.out.println("Hello Modules!");
        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);
        HiModules hiModules;
        hiModules = new HiModules();
        System.out.println(hiModules.getHi());
    }

}
