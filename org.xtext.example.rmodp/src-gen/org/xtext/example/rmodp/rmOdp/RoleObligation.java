/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Obligation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleObligation#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getRoleo <em>Roleo</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getRole_obligation <em>Role obligation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleObligation()
 * @model
 * @generated
 */
public interface RoleObligation extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleObligation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inforce</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inforce</em>' attribute.
   * @see #setInforce(boolean)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleObligation_Inforce()
   * @model
   * @generated
   */
  boolean isInforce();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#isInforce <em>Inforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inforce</em>' attribute.
   * @see #isInforce()
   * @generated
   */
  void setInforce(boolean value);

  /**
   * Returns the value of the '<em><b>Roleo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roleo</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roleo</em>' reference.
   * @see #setRoleo(Role)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleObligation_Roleo()
   * @model
   * @generated
   */
  Role getRoleo();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getRoleo <em>Roleo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Roleo</em>' reference.
   * @see #getRoleo()
   * @generated
   */
  void setRoleo(Role value);

  /**
   * Returns the value of the '<em><b>Role obligation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role obligation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role obligation</em>' attribute.
   * @see #setRole_obligation(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleObligation_Role_obligation()
   * @model
   * @generated
   */
  String getRole_obligation();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getRole_obligation <em>Role obligation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role obligation</em>' attribute.
   * @see #getRole_obligation()
   * @generated
   */
  void setRole_obligation(String value);

} // RoleObligation
