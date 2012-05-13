/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Prohibition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObjp <em>Objp</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObject_prohibition <em>Object prohibition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectProhibition()
 * @model
 * @generated
 */
public interface ObjectProhibition extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectProhibition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectProhibition_Inforce()
   * @model
   * @generated
   */
  boolean isInforce();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#isInforce <em>Inforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inforce</em>' attribute.
   * @see #isInforce()
   * @generated
   */
  void setInforce(boolean value);

  /**
   * Returns the value of the '<em><b>Objp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objp</em>' reference.
   * @see #setObjp(org.xtext.example.rmodp.rmOdp.Object)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectProhibition_Objp()
   * @model
   * @generated
   */
  org.xtext.example.rmodp.rmOdp.Object getObjp();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObjp <em>Objp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objp</em>' reference.
   * @see #getObjp()
   * @generated
   */
  void setObjp(org.xtext.example.rmodp.rmOdp.Object value);

  /**
   * Returns the value of the '<em><b>Object prohibition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object prohibition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object prohibition</em>' attribute.
   * @see #setObject_prohibition(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectProhibition_Object_prohibition()
   * @model
   * @generated
   */
  String getObject_prohibition();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObject_prohibition <em>Object prohibition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object prohibition</em>' attribute.
   * @see #getObject_prohibition()
   * @generated
   */
  void setObject_prohibition(String value);

} // ObjectProhibition
