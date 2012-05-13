/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Enumeration#getValueItems <em>Value Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type
{
  /**
   * Returns the value of the '<em><b>Value Items</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Items</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Items</em>' attribute list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEnumeration_ValueItems()
   * @model unique="false"
   * @generated
   */
  EList<String> getValueItems();

} // Enumeration
