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
 * A representation of the model object '<em><b>Signature Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getSignatureType <em>Signature Type</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getSignatureDef()
 * @model
 * @generated
 */
public interface SignatureDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Signature Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature Type</em>' attribute.
   * @see #setSignatureType(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getSignatureDef_SignatureType()
   * @model
   * @generated
   */
  String getSignatureType();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getSignatureType <em>Signature Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature Type</em>' attribute.
   * @see #getSignatureType()
   * @generated
   */
  void setSignatureType(String value);

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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getSignatureDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getSignatureDef_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

} // SignatureDef