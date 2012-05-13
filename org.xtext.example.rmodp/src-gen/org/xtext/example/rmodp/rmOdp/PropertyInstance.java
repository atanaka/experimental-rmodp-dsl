/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.PropertyInstance#getTypeProperty <em>Type Property</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.PropertyInstance#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPropertyInstance()
 * @model
 * @generated
 */
public interface PropertyInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Property</em>' reference.
   * @see #setTypeProperty(Property)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPropertyInstance_TypeProperty()
   * @model
   * @generated
   */
  Property getTypeProperty();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.PropertyInstance#getTypeProperty <em>Type Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Property</em>' reference.
   * @see #getTypeProperty()
   * @generated
   */
  void setTypeProperty(Property value);

  /**
   * Returns the value of the '<em><b>Property Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Value</em>' attribute.
   * @see #setPropertyValue(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getPropertyInstance_PropertyValue()
   * @model
   * @generated
   */
  String getPropertyValue();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.PropertyInstance#getPropertyValue <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Value</em>' attribute.
   * @see #getPropertyValue()
   * @generated
   */
  void setPropertyValue(String value);

} // PropertyInstance
