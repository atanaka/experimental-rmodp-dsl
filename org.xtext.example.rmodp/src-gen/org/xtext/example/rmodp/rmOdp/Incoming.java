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
 * A representation of the model object '<em><b>Incoming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Incoming#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Incoming#getInCondition <em>In Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getIncoming()
 * @model
 * @generated
 */
public interface Incoming extends EObject
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getIncoming_Incoming()
   * @model
   * @generated
   */
  EList<Node> getIncoming();

  /**
   * Returns the value of the '<em><b>In Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Condition</em>' attribute.
   * @see #setInCondition(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getIncoming_InCondition()
   * @model
   * @generated
   */
  String getInCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Incoming#getInCondition <em>In Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Condition</em>' attribute.
   * @see #getInCondition()
   * @generated
   */
  void setInCondition(String value);

} // Incoming
