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
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.State#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.State#getActions <em>Actions</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.State#getStateTransitions <em>State Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getState_Actions()
   * @model
   * @generated
   */
  EList<Command> getActions();

  /**
   * Returns the value of the '<em><b>State Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.StateTransition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Transitions</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getState_StateTransitions()
   * @model containment="true"
   * @generated
   */
  EList<StateTransition> getStateTransitions();

} // State
