/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Subprocess#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Subprocess#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getSubprocess()
 * @model
 * @generated
 */
public interface Subprocess extends Node
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getSubprocess_Incomings()
   * @model containment="true"
   * @generated
   */
  EList<Incoming> getIncomings();

  /**
   * Returns the value of the '<em><b>Outgoings</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Outgoing}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoings</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getSubprocess_Outgoings()
   * @model containment="true"
   * @generated
   */
  EList<Outgoing> getOutgoings();

} // Subprocess
