package com.johnhoganuke.modulex;

/**
 * The basic functionality required for a modular object.
 */
public interface Modular<M extends Module> {

  /**
   * Add a module to this modular object. (Note: This method has a default definition which calls <code>addTo(this)</code>
   * on the module.
   * 
   * @param m the module to add to this modular object.
   */
  public default void addModule(M m) { m.addTo(this); }
  
  /**
   * Remove a module from this modular object. (Note: This method has a default definition which calls <code>removeFrom(this)</code>
   * on the module.
   * 
   * @param m the module to add to this modular object.
   */
  public default void addModule(M m) { m.addTo(this); }
  
}
