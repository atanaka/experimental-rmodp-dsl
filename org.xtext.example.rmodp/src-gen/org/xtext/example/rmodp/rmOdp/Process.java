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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Process#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Process#getProcessObjective <em>Process Objective</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Process#getLanes <em>Lanes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getProcess_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Process#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Process Objective</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Objective</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Objective</em>' reference.
   * @see #setProcessObjective(Objective)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getProcess_ProcessObjective()
   * @model
   * @generated
   */
  Objective getProcessObjective();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Process#getProcessObjective <em>Process Objective</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Objective</em>' reference.
   * @see #getProcessObjective()
   * @generated
   */
  void setProcessObjective(Objective value);

  /**
   * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Lane}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lanes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lanes</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getProcess_Lanes()
   * @model containment="true"
   * @generated
   */
  EList<Lane> getLanes();

} // Process
