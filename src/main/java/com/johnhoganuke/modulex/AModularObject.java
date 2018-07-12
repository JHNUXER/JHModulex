package com.johnhoganuke.modulex;

/**
 * A basic implementation of the Modular interface.
 */
public class AModularObject implements Modular<E extends Modular> {
  
  protected ArrayList<Module> modules;
  
  /**
   * Adds the module to this modular object.
   * 
   * @param module  the module to add to this modular object.
   */
  @Override
  public void addModule(E module) {
    super.addModule(module);
    modules.add(module);
  }
  
  /**
   * Removes the module from this modular object.
   * 
   * @param module  the module to remove from this modular object.
   */
  @Override
  public void removeModule(E module) {
    super.removeModule(module);
    modules.remove(module);
  }
  
}
