/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TV spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.TV_spec#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.TV_spec#getImplementableStandards <em>Implementable Standards</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.TV_spec#getIxits <em>Ixits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getTV_spec()
 * @model
 * @generated
 */
public interface TV_spec extends Spec
{
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getTV_spec_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Object> getObjects();

  /**
   * Returns the value of the '<em><b>Implementable Standards</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.ImplementableStandard}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementable Standards</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementable Standards</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getTV_spec_ImplementableStandards()
   * @model containment="true"
   * @generated
   */
  EList<ImplementableStandard> getImplementableStandards();

  /**
   * Returns the value of the '<em><b>Ixits</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.IXIT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ixits</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ixits</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getTV_spec_Ixits()
   * @model containment="true"
   * @generated
   */
  EList<IXIT> getIxits();

} // TV_spec
