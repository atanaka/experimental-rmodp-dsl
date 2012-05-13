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
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getObligations <em>Obligations</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getProhibitions <em>Prohibitions</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getProcess <em>Process</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getAffectedRole <em>Affected Role</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getAffectedProcess <em>Affected Process</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Policy#getAffectedInteraction <em>Affected Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Policy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' attribute.
   * @see #setPolicy(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_Policy()
   * @model
   * @generated
   */
  String getPolicy();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Policy#getPolicy <em>Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' attribute.
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(String value);

  /**
   * Returns the value of the '<em><b>Obligations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obligations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obligations</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_Obligations()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getObligations();

  /**
   * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_Permissions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getPermissions();

  /**
   * Returns the value of the '<em><b>Prohibitions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prohibitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prohibitions</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_Prohibitions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getProhibitions();

  /**
   * Returns the value of the '<em><b>Process</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' reference.
   * @see #setProcess(org.xtext.example.rmodp.rmOdp.Process)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_Process()
   * @model
   * @generated
   */
  org.xtext.example.rmodp.rmOdp.Process getProcess();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Policy#getProcess <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(org.xtext.example.rmodp.rmOdp.Process value);

  /**
   * Returns the value of the '<em><b>Affected Role</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affected Role</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affected Role</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_AffectedRole()
   * @model containment="true"
   * @generated
   */
  EList<Role> getAffectedRole();

  /**
   * Returns the value of the '<em><b>Affected Process</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affected Process</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affected Process</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_AffectedProcess()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Process> getAffectedProcess();

  /**
   * Returns the value of the '<em><b>Affected Interaction</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Interaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affected Interaction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affected Interaction</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPolicy_AffectedInteraction()
   * @model containment="true"
   * @generated
   */
  EList<Interaction> getAffectedInteraction();

} // Policy
