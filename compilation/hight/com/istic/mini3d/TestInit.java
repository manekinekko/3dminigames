package com.istic.mini3d;

import com.istic.mini3d.code.SymbolTable;
import com.istic.mini3d.symbols.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10005030
 */
public class TestInit {

     public static void main(String[] args) {

         SymbolTable ts = new SymbolTable();
         Model.init(ts);
         ts.print();
     }

}
