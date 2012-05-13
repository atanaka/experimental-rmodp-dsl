/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Outgoing#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Outgoing#getOutCondition <em>Out Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getOutgoing()
 * @model
 * @generated
 */
public interface Outgoing extends EObject
{
  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getOutgoing_Outgoing()
   * @model
   * @generated
   */
  EList<Node> getOutgoing();

  /**
   * Returns the value of the '<em><b>Out Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Condition</em>' attribute.
   * @see #setOutCondition(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getOutgoing_OutCondition()
   * @model
   * @generated
   */
  String getOutCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Outgoing#getOutCondition <em>Out Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Condition</em>' attribute.
   * @see #getOutCondition()
   * @generated
   */
  void setOutCondition(String value);

} // Outgoing
