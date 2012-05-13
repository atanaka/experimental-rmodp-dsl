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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interface#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interface#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interface#getSignatureReferences <em>Signature References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Type</em>' attribute.
   * @see #setInterfaceType(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInterface_InterfaceType()
   * @model
   * @generated
   */
  String getInterfaceType();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interface#getInterfaceType <em>Interface Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Type</em>' attribute.
   * @see #getInterfaceType()
   * @generated
   */
  void setInterfaceType(String value);

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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInterface_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interface#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Signature References</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.SignatureReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature References</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInterface_SignatureReferences()
   * @model containment="true"
   * @generated
   */
  EList<SignatureReference> getSignatureReferences();

} // Interface
