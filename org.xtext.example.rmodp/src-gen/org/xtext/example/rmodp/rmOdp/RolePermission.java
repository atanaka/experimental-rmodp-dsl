/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RolePermission#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RolePermission#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RolePermission#getRolep <em>Rolep</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RolePermission#getRole_permission <em>Role permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRolePermission()
 * @model
 * @generated
 */
public interface RolePermission extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRolePermission_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RolePermission#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRolePermission_Inforce()
   * @model
   * @generated
   */
  boolean isInforce();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RolePermission#isInforce <em>Inforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inforce</em>' attribute.
   * @see #isInforce()
   * @generated
   */
  void setInforce(boolean value);

  /**
   * Returns the value of the '<em><b>Rolep</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rolep</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rolep</em>' reference.
   * @see #setRolep(Role)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRolePermission_Rolep()
   * @model
   * @generated
   */
  Role getRolep();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RolePermission#getRolep <em>Rolep</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolep</em>' reference.
   * @see #getRolep()
   * @generated
   */
  void setRolep(Role value);

  /**
   * Returns the value of the '<em><b>Role permission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role permission</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role permission</em>' attribute.
   * @see #setRole_permission(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRolePermission_Role_permission()
   * @model
   * @generated
   */
  String getRole_permission();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RolePermission#getRole_permission <em>Role permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role permission</em>' attribute.
   * @see #getRole_permission()
   * @generated
   */
  void setRole_permission(String value);

} // RolePermission
