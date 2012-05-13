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
 * A representation of the model object '<em><b>Invariant Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.InvariantSchema#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.InvariantSchema#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.InvariantSchema#getActionTypes <em>Action Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInvariantSchema()
 * @model
 * @generated
 */
public interface InvariantSchema extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInvariantSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.InvariantSchema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInvariantSchema_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Object> getObjects();

  /**
   * Returns the value of the '<em><b>Action Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.ActionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Types</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInvariantSchema_ActionTypes()
   * @model containment="true"
   * @generated
   */
  EList<ActionType> getActionTypes();

} // InvariantSchema
