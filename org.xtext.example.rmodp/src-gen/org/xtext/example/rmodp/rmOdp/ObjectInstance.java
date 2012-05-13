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
 * A representation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getPropertyInstances <em>Property Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectInstance()
 * @model
 * @generated
 */
public interface ObjectInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' reference.
   * @see #setTypeName(org.xtext.example.rmodp.rmOdp.Object)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectInstance_TypeName()
   * @model
   * @generated
   */
  org.xtext.example.rmodp.rmOdp.Object getTypeName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getTypeName <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(org.xtext.example.rmodp.rmOdp.Object value);

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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Property Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.PropertyInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Instances</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObjectInstance_PropertyInstances()
   * @model containment="true"
   * @generated
   */
  EList<PropertyInstance> getPropertyInstances();

} // ObjectInstance
