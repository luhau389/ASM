/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author congh
 */
public class saveFile {

    public static void write(String  dir, Object object) {
        try {
            ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream(dir));
            oops.writeObject(object);
            oops.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static Object read(String path) {
        try {
            ObjectInputStream oips = new ObjectInputStream(new FileInputStream(path));
            Object object = oips.readObject();
            oips.close();
            return object;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    
}
