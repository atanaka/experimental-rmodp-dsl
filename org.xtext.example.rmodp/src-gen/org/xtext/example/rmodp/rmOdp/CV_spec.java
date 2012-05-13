/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.CV_spec#getCdatatypes <em>Cdatatypes</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.CV_spec#getSignatureDefs <em>Signature Defs</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.CV_spec#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCV_spec()
 * @model
 * @generated
 */
public interface CV_spec extends Spec
{
  /**
   * Returns the value of the '<em><b>Cdatatypes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cdatatypes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cdatatypes</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCV_spec_Cdatatypes()
   * @model containment="true"
   * @generated
   */
  EList<Type> getCdatatypes();

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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCV_spec_SignatureDefs()
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCV_spec_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Object> getObjects();

} // CV_spec
