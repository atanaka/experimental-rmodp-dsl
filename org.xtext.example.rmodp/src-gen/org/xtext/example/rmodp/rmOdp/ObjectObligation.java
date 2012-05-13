/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Obligation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getObjo <em>Objo</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getObject_obligation <em>Object obligation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectObligation()
 * @model
 * @generated
 */
public interface ObjectObligation extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectObligation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inforce</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inforce</em>' attribute.
   * @see #setInforce(boolean)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectObligation_Inforce()
   * @model
   * @generated
   */
  boolean isInforce();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#isInforce <em>Inforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inforce</em>' attribute.
   * @see #isInforce()
   * @generated
   */
  void setInforce(boolean value);

  /**
   * Returns the value of the '<em><b>Objo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objo</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objo</em>' reference.
   * @see #setObjo(org.xtext.example.rmodp.rmOdp.Object)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectObligation_Objo()
   * @model
   * @generated
   */
  org.xtext.example.rmodp.rmOdp.Object getObjo();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getObjo <em>Objo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objo</em>' reference.
   * @see #getObjo()
   * @generated
   */
  void setObjo(org.xtext.example.rmodp.rmOdp.Object value);

  /**
   * Returns the value of the '<em><b>Object obligation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object obligation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object obligation</em>' attribute.
   * @see #setObject_obligation(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectObligation_Object_obligation()
   * @model
   * @generated
   */
  String getObject_obligation();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getObject_obligation <em>Object obligation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object obligation</em>' attribute.
   * @see #getObject_obligation()
   * @generated
   */
  void setObject_obligation(String value);

} // ObjectObligation
