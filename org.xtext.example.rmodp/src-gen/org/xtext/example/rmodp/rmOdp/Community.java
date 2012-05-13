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
 * A representation of the model object '<em><b>Community</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Community#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Community#getLocalObjects <em>Local Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Community#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Community#getOr_relations <em>Or relations</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Community#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Community#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Community#getPolicies <em>Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity()
 * @model
 * @generated
 */
public interface Community extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Community#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Local Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Objects</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity_LocalObjects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Object> getLocalObjects();

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Or relations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.OR_Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or relations</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity_Or_relations()
   * @model containment="true"
   * @generated
   */
  EList<OR_Relation> getOr_relations();

  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity_Processes()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Process> getProcesses();

  /**
   * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Interaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactions</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity_Interactions()
   * @model containment="true"
   * @generated
   */
  EList<Interaction> getInteractions();

  /**
   * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Policy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policies</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunity_Policies()
   * @model containment="true"
   * @generated
   */
  EList<Policy> getPolicies();

} // Community
