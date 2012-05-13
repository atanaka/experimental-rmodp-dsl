/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IV spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.IV_spec#getInvariantSchema <em>Invariant Schema</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.IV_spec#getDynamicSchema <em>Dynamic Schema</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.IV_spec#getStaticSchema <em>Static Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getIV_spec()
 * @model
 * @generated
 */
public interface IV_spec extends Spec
{
  /**
   * Returns the value of the '<em><b>Invariant Schema</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.InvariantSchema}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariant Schema</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant Schema</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getIV_spec_InvariantSchema()
   * @model containment="true"
   * @generated
   */
  EList<InvariantSchema> getInvariantSchema();

  /**
   * Returns the value of the '<em><b>Dynamic Schema</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.DynamicSchema}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic Schema</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic Schema</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getIV_spec_DynamicSchema()
   * @model containment="true"
   * @generated
   */
  EList<DynamicSchema> getDynamicSchema();

  /**
   * Returns the value of the '<em><b>Static Schema</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.StaticSchema}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Schema</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Schema</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getIV_spec_StaticSchema()
   * @model containment="true"
   * @generated
   */
  EList<StaticSchema> getStaticSchema();

} // IV_spec
