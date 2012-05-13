/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Prohibition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getRolep <em>Rolep</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getRole_prohibition <em>Role prohibition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleProhibition()
 * @model
 * @generated
 */
public interface RoleProhibition extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleProhibition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleProhibition_Inforce()
   * @model
   * @generated
   */
  boolean isInforce();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#isInforce <em>Inforce</em>}' attribute.
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleProhibition_Rolep()
   * @model
   * @generated
   */
  Role getRolep();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getRolep <em>Rolep</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolep</em>' reference.
   * @see #getRolep()
   * @generated
   */
  void setRolep(Role value);

  /**
   * Returns the value of the '<em><b>Role prohibition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role prohibition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role prohibition</em>' attribute.
   * @see #setRole_prohibition(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getRoleProhibition_Role_prohibition()
   * @model
   * @generated
   */
  String getRole_prohibition();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getRole_prohibition <em>Role prohibition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role prohibition</em>' attribute.
   * @see #getRole_prohibition()
   * @generated
   */
  void setRole_prohibition(String value);

} // RoleProhibition
