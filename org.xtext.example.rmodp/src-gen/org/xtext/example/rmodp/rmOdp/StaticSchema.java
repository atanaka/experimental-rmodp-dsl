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
 * A representation of the model object '<em><b>Static Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getObjectInstances <em>Object Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getStaticSchema()
 * @model
 * @generated
 */
public interface StaticSchema extends EObject
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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getStaticSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getStaticSchema_Time()
   * @model
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

  /**
   * Returns the value of the '<em><b>Object Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.ObjectInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Instances</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getStaticSchema_ObjectInstances()
   * @model containment="true"
   * @generated
   */
  EList<ObjectInstance> getObjectInstances();

} // StaticSchema
