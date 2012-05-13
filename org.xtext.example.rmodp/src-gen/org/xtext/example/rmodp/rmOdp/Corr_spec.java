/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corr spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint1 <em>Viewpoint1</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getEndpoints1 <em>Endpoints1</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint2 <em>Viewpoint2</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getEndpoints2 <em>Endpoints2</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCorr_spec()
 * @model
 * @generated
 */
public interface Corr_spec extends Spec
{
  /**
   * Returns the value of the '<em><b>Viewpoint1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewpoint1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewpoint1</em>' attribute.
   * @see #setViewpoint1(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCorr_spec_Viewpoint1()
   * @model
   * @generated
   */
  String getViewpoint1();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint1 <em>Viewpoint1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewpoint1</em>' attribute.
   * @see #getViewpoint1()
   * @generated
   */
  void setViewpoint1(String value);

  /**
   * Returns the value of the '<em><b>Endpoints1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.EndPoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endpoints1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endpoints1</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCorr_spec_Endpoints1()
   * @model containment="true"
   * @generated
   */
  EList<EndPoint> getEndpoints1();

  /**
   * Returns the value of the '<em><b>Viewpoint2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewpoint2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewpoint2</em>' attribute.
   * @see #setViewpoint2(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCorr_spec_Viewpoint2()
   * @model
   * @generated
   */
  String getViewpoint2();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint2 <em>Viewpoint2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewpoint2</em>' attribute.
   * @see #getViewpoint2()
   * @generated
   */
  void setViewpoint2(String value);

  /**
   * Returns the value of the '<em><b>Endpoints2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.EndPoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endpoints2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endpoints2</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCorr_spec_Endpoints2()
   * @model containment="true"
   * @generated
   */
  EList<EndPoint> getEndpoints2();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getCorr_spec_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Corr_spec
