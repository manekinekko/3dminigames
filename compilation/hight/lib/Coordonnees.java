/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;

import code.Code;

/**
 *
 * @author Beben
 */
public class Coordonnees{

public Code x,y,z;

public Coordonnees(Code x, Code y, Code z){
    this.x = x;
    this.y = y;
    this.z = z;
}


public Coordonnees(){
    this.x = new Code();
    this.y = new Code();
    this.z = new Code();
}

public Code getX(){return x;};
public Code getY(){return y;};
public Code getZ(){return z;};


}
