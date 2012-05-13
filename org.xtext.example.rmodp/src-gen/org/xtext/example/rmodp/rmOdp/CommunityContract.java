/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Community Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getCommunity <em>Community</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunityContract()
 * @model
 * @generated
 */
public interface CommunityContract extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunityContract_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Objective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objective</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objective</em>' containment reference.
   * @see #setObjective(Objective)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunityContract_Objective()
   * @model containment="true"
   * @generated
   */
  Objective getObjective();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getObjective <em>Objective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objective</em>' containment reference.
   * @see #getObjective()
   * @generated
   */
  void setObjective(Objective value);

  /**
   * Returns the value of the '<em><b>Community</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Community</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Community</em>' containment reference.
   * @see #setCommunity(Community)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCommunityContract_Community()
   * @model containment="true"
   * @generated
   */
  Community getCommunity();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getCommunity <em>Community</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Community</em>' containment reference.
   * @see #getCommunity()
   * @generated
   */
  void setCommunity(Community value);

} // CommunityContract
