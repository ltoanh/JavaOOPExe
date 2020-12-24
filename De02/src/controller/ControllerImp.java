/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whiwf
 */
public class ControllerImp implements Controller{

    @Override
    public <T> List<T> readFromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if(file.length() > 0){
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                Object o = ois.readObject();
                list = (List<T>) o;
                ois.close();
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
        return list;
    }

    @Override
    public <T> void writeToFile(String fileName, List<T> list) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(list);
            oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
