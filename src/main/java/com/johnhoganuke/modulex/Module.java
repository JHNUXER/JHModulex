package com.johnhoganuke.modulex

/**
 * The bare minimum functionality of any Module.
 */
public interface Module<M extends Modular> {

  /**
   * @return the name of this module, or rather, the name of the Type of module.
   */
  public String getModuleName();
  
  /**
   * allows the module to change or alter the modular object apon being added to the module.
   * @param m The modular object that the module is being added to.
   */
  public void addTo(M m);
  
}
