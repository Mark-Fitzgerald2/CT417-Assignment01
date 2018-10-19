/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1;

import java.util.Comparator;

/**
 *
 * @author Mark Fitzgerald, NUI Galway
 */
public class ModuleComparator implements Comparator<Module> {
    @Override
    public int compare(Module m1, Module m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
