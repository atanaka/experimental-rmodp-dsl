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
 * A representation of the model object '<em><b>Host Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.HostNode#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.HostNode#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.HostNode#getSignatureDefs <em>Signature Defs</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.HostNode#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getHostNode()
 * @model
 * @generated
 */
public interface HostNode extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getHostNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.HostNode#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Link}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getHostNode_Link()
   * @model containment="true"
   * @generated
   */
  EList<Link> getLink();

  /**
   * Returns the value of the '<em><b>Signature Defs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.SignatureDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature Defs</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getHostNode_SignatureDefs()
   * @model containment="true"
   * @generated
   */
  EList<SignatureDef> getSignatureDefs();

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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getHostNode_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Object> getObjects();

} // HostNode
