/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author whiwf
 */
public interface Controller {
    public <T> List<T> readFromFile(String File);
    
    public <T> void writeToFile(String File, List<T> list);
}
