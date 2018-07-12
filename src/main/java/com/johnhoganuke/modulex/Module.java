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
   * 
   * @param m The modular object that the module is being added to.
   */
  public void addTo(M m);
  
  /**
   * allows the module to revoke changes that were made to the modular object apon the module
   * being added to the modular object (<code>m</code>).
   * 
   * @param m The modular object that the module is being removed from.
   */
  public void removeFrom(M m);
  
}
