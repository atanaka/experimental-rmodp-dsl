/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.EV_spec#getFoa <em>Foa</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.EV_spec#getGlobalObjects <em>Global Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.EV_spec#getCommunityContracts <em>Community Contracts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEV_spec()
 * @model
 * @generated
 */
public interface EV_spec extends Spec
{
  /**
   * Returns the value of the '<em><b>Foa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foa</em>' containment reference.
   * @see #setFoa(FieldOfApplication)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEV_spec_Foa()
   * @model containment="true"
   * @generated
   */
  FieldOfApplication getFoa();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.EV_spec#getFoa <em>Foa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foa</em>' containment reference.
   * @see #getFoa()
   * @generated
   */
  void setFoa(FieldOfApplication value);

  /**
   * Returns the value of the '<em><b>Global Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Global Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global Objects</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEV_spec_GlobalObjects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.rmodp.rmOdp.Object> getGlobalObjects();

  /**
   * Returns the value of the '<em><b>Community Contracts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.CommunityContract}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Community Contracts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Community Contracts</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getEV_spec_CommunityContracts()
   * @model containment="true"
   * @generated
   */
  EList<CommunityContract> getCommunityContracts();

} // EV_spec
