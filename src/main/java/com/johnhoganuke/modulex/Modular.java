package com.johnhoganuke.modulex;

public interface Modular<M extends Module> {

  /**
   * The number of modules installed in this Object.
   *
   * @return the number of modules installed in this Object.
   */
  public int countModules();

  /**
   * Adds the given module to this object, then installs it.
   *
   * @param m the Module to be added to this Object.
   */
  public void addModule(M m);

  /**
   * Uninstalls the given module from this object, then removes it.
   *
   * @param m the Module to be removed from this Object.
   */
  public void removeModule(M m);

  /**
   * Checks to see if the specific Module given has been installed in this
   * Object.
   *
   * @param m The Module whose installation status regarding this Object is in
   *          question.
   * @return true if the given Module has been installed in this Object,
   *         otherwise, false.
   */
  public boolean hasModule(M m);

  /**
   * Finds the indexed location of the Module in question. Returns -1 if the
   * Module has not been installed in this Object.
   *
   * @param m The Module whose index location is being requested.
   * @return The indexed location of the Module in question. (-1 if not present)
   */
  public int indexOfModule(M m);

  /**
   * Returns the Module stored at the specified index.
   *
   * @param n The index whose contents are being requested.
   * @return The Module stored at the given index (or null if not present)
   */
  public M getModuleAtIndex(int n);

  /**
   * Returns all modules that were installed in this object which conform to the
   * given module class.
   *
   * @param modClass The type of Module being requested. (This will be checked
   *                 against each Module's <code>getModClass()</code> method.)
   * @return An array containing all modules of the given module class.
   */
  public M[] getModulesOfType(String modClass);

  /**
   * Checks to see if this Object contains any modules of the given type.
   *
   * @param modClass The type of module whose presence is in question.
   * @return true if this Object contains a Module of the given type, otherwise
   *         false.
   */
  public boolean containsModuleOfType(String modClass);
}
