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
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Objective#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Objective#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Objective#getSubobj <em>Subobj</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjective()
 * @model
 * @generated
 */
public interface Objective extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjective_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Objective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Objective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objective</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objective</em>' attribute.
   * @see #setObjective(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjective_Objective()
   * @model
   * @generated
   */
  String getObjective();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Objective#getObjective <em>Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objective</em>' attribute.
   * @see #getObjective()
   * @generated
   */
  void setObjective(String value);

  /**
   * Returns the value of the '<em><b>Subobj</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Objective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subobj</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subobj</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjective_Subobj()
   * @model containment="true"
   * @generated
   */
  EList<Objective> getSubobj();

} // Objective
