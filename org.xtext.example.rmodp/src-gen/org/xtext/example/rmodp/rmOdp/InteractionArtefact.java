/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getFromRole <em>From Role</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getToRole <em>To Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteractionArtefact()
 * @model
 * @generated
 */
public interface InteractionArtefact extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteractionArtefact_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>From Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Role</em>' reference.
   * @see #setFromRole(Role)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteractionArtefact_FromRole()
   * @model
   * @generated
   */
  Role getFromRole();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getFromRole <em>From Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Role</em>' reference.
   * @see #getFromRole()
   * @generated
   */
  void setFromRole(Role value);

  /**
   * Returns the value of the '<em><b>To Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Role</em>' reference.
   * @see #setToRole(Role)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteractionArtefact_ToRole()
   * @model
   * @generated
   */
  Role getToRole();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getToRole <em>To Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Role</em>' reference.
   * @see #getToRole()
   * @generated
   */
  void setToRole(Role value);

} // InteractionArtefact
