/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OR Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.OR_Relation#getObject <em>Object</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.OR_Relation#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getOR_Relation()
 * @model
 * @generated
 */
public interface OR_Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference.
   * @see #setObject(org.xtext.example.rmodp.rmOdp.Object)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getOR_Relation_Object()
   * @model
   * @generated
   */
  org.xtext.example.rmodp.rmOdp.Object getObject();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.OR_Relation#getObject <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' reference.
   * @see #getObject()
   * @generated
   */
  void setObject(org.xtext.example.rmodp.rmOdp.Object value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getOR_Relation_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.OR_Relation#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

} // OR_Relation
