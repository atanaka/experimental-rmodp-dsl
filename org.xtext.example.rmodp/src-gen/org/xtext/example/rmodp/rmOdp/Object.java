/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getSuperObject <em>Super Object</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getInnerObjects <em>Inner Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Object#getNvObject <em>Nv Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type</em>' attribute.
   * @see #setObjectType(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_ObjectType()
   * @model
   * @generated
   */
  String getObjectType();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Object#getObjectType <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Type</em>' attribute.
   * @see #getObjectType()
   * @generated
   */
  void setObjectType(String value);

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
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Object#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Object</em>' reference.
   * @see #setSuperObject(Object)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_SuperObject()
   * @model
   * @generated
   */
  Object getSuperObject();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Object#getSuperObject <em>Super Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Object</em>' reference.
   * @see #getSuperObject()
   * @generated
   */
  void setSuperObject(Object value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Machine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Machine</em>' containment reference.
   * @see #setStateMachine(StateMachine)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_StateMachine()
   * @model containment="true"
   * @generated
   */
  StateMachine getStateMachine();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Object#getStateMachine <em>State Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Machine</em>' containment reference.
   * @see #getStateMachine()
   * @generated
   */
  void setStateMachine(StateMachine value);

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_Interfaces()
   * @model containment="true"
   * @generated
   */
  EList<Interface> getInterfaces();

  /**
   * Returns the value of the '<em><b>Inner Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Objects</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_InnerObjects()
   * @model containment="true"
   * @generated
   */
  EList<Object> getInnerObjects();

  /**
   * Returns the value of the '<em><b>Nv Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nv Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nv Object</em>' reference.
   * @see #setNvObject(Object)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getObject_NvObject()
   * @model
   * @generated
   */
  Object getNvObject();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Object#getNvObject <em>Nv Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nv Object</em>' reference.
   * @see #getNvObject()
   * @generated
   */
  void setNvObject(Object value);

} // Object
