/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.istic.mini3d.lib;

import com.istic.mini3d.code.Code;

/**
 *
 * @author Beben
 */
public class Coordonnees{

    public Code x,y,z;

/**
 *
 * @param x
 * @param y
 * @param z
 */
public Coordonnees(Code x, Code y, Code z){
    this.x = x;
    this.y = y;
    this.z = z;
}


/**
 *
 */
public Coordonnees(){
    this.x = new Code();
    this.y = new Code();
    this.z = new Code();
}

/**
 *
 * @return
 */
public Code getX(){return x;};
/**
 *
 * @return
 */
public Code getY(){return y;};
/**
 *
 * @return
 */
public Code getZ(){return z;};


}
