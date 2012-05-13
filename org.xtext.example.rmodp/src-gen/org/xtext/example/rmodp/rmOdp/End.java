/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.End#getIncomings <em>Incomings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends Node
{
  /**
   * Returns the value of the '<em><b>Incomings</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Incoming}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incomings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incomings</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEnd_Incomings()
   * @model containment="true"
   * @generated
   */
  EList<Incoming> getIncomings();

} // End
