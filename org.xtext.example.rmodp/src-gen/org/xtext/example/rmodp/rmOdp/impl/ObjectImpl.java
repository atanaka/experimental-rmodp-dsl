/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.rmodp.rmOdp.Interface;
import org.xtext.example.rmodp.rmOdp.Property;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getSuperObject <em>Super Object</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getInnerObjects <em>Inner Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl#getNvObject <em>Nv Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends ModelElementImpl implements org.xtext.example.rmodp.rmOdp.Object
{
  /**
   * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectType()
   * @generated
   * @ordered
   */
  protected String objectType = OBJECT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperObject() <em>Super Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperObject()
   * @generated
   * @ordered
   */
  protected org.xtext.example.rmodp.rmOdp.Object superObject;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateMachine()
   * @generated
   * @ordered
   */
  protected StateMachine stateMachine;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<Interface> interfaces;

  /**
   * The cached value of the '{@link #getInnerObjects() <em>Inner Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerObjects()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.rmodp.rmOdp.Object> innerObjects;

  /**
   * The cached value of the '{@link #getNvObject() <em>Nv Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNvObject()
   * @generated
   * @ordered
   */
  protected org.xtext.example.rmodp.rmOdp.Object nvObject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RmOdpPackage.Literals.OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjectType()
  {
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectType(String newObjectType)
  {
    String oldObjectType = objectType;
    objectType = newObjectType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT__OBJECT_TYPE, oldObjectType, objectType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object getSuperObject()
  {
    if (superObject != null && superObject.eIsProxy())
    {
      InternalEObject oldSuperObject = (InternalEObject)superObject;
      superObject = (org.xtext.example.rmodp.rmOdp.Object)eResolveProxy(oldSuperObject);
      if (superObject != oldSuperObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.OBJECT__SUPER_OBJECT, oldSuperObject, superObject));
      }
    }
    return superObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object basicGetSuperObject()
  {
    return superObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperObject(org.xtext.example.rmodp.rmOdp.Object newSuperObject)
  {
    org.xtext.example.rmodp.rmOdp.Object oldSuperObject = superObject;
    superObject = newSuperObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT__SUPER_OBJECT, oldSuperObject, superObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, RmOdpPackage.OBJECT__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine getStateMachine()
  {
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs)
  {
    StateMachine oldStateMachine = stateMachine;
    stateMachine = newStateMachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT__STATE_MACHINE, oldStateMachine, newStateMachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateMachine(StateMachine newStateMachine)
  {
    if (newStateMachine != stateMachine)
    {
      NotificationChain msgs = null;
      if (stateMachine != null)
        msgs = ((InternalEObject)stateMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.OBJECT__STATE_MACHINE, null, msgs);
      if (newStateMachine != null)
        msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.OBJECT__STATE_MACHINE, null, msgs);
      msgs = basicSetStateMachine(newStateMachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT__STATE_MACHINE, newStateMachine, newStateMachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, RmOdpPackage.OBJECT__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.rmodp.rmOdp.Object> getInnerObjects()
  {
    if (innerObjects == null)
    {
      innerObjects = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Object>(org.xtext.example.rmodp.rmOdp.Object.class, this, RmOdpPackage.OBJECT__INNER_OBJECTS);
    }
    return innerObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object getNvObject()
  {
    if (nvObject != null && nvObject.eIsProxy())
    {
      InternalEObject oldNvObject = (InternalEObject)nvObject;
      nvObject = (org.xtext.example.rmodp.rmOdp.Object)eResolveProxy(oldNvObject);
      if (nvObject != oldNvObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.OBJECT__NV_OBJECT, oldNvObject, nvObject));
      }
    }
    return nvObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object basicGetNvObject()
  {
    return nvObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNvObject(org.xtext.example.rmodp.rmOdp.Object newNvObject)
  {
    org.xtext.example.rmodp.rmOdp.Object oldNvObject = nvObject;
    nvObject = newNvObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT__NV_OBJECT, oldNvObject, nvObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RmOdpPackage.OBJECT__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.OBJECT__STATE_MACHINE:
        return basicSetStateMachine(null, msgs);
      case RmOdpPackage.OBJECT__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.OBJECT__INNER_OBJECTS:
        return ((InternalEList<?>)getInnerObjects()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RmOdpPackage.OBJECT__OBJECT_TYPE:
        return getObjectType();
      case RmOdpPackage.OBJECT__NAME:
        return getName();
      case RmOdpPackage.OBJECT__SUPER_OBJECT:
        if (resolve) return getSuperObject();
        return basicGetSuperObject();
      case RmOdpPackage.OBJECT__PROPERTIES:
        return getProperties();
      case RmOdpPackage.OBJECT__STATE_MACHINE:
        return getStateMachine();
      case RmOdpPackage.OBJECT__INTERFACES:
        return getInterfaces();
      case RmOdpPackage.OBJECT__INNER_OBJECTS:
        return getInnerObjects();
      case RmOdpPackage.OBJECT__NV_OBJECT:
        if (resolve) return getNvObject();
        return basicGetNvObject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RmOdpPackage.OBJECT__OBJECT_TYPE:
        setObjectType((String)newValue);
        return;
      case RmOdpPackage.OBJECT__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.OBJECT__SUPER_OBJECT:
        setSuperObject((org.xtext.example.rmodp.rmOdp.Object)newValue);
        return;
      case RmOdpPackage.OBJECT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case RmOdpPackage.OBJECT__STATE_MACHINE:
        setStateMachine((StateMachine)newValue);
        return;
      case RmOdpPackage.OBJECT__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends Interface>)newValue);
        return;
      case RmOdpPackage.OBJECT__INNER_OBJECTS:
        getInnerObjects().clear();
        getInnerObjects().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Object>)newValue);
        return;
      case RmOdpPackage.OBJECT__NV_OBJECT:
        setNvObject((org.xtext.example.rmodp.rmOdp.Object)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RmOdpPackage.OBJECT__OBJECT_TYPE:
        setObjectType(OBJECT_TYPE_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT__SUPER_OBJECT:
        setSuperObject((org.xtext.example.rmodp.rmOdp.Object)null);
        return;
      case RmOdpPackage.OBJECT__PROPERTIES:
        getProperties().clear();
        return;
      case RmOdpPackage.OBJECT__STATE_MACHINE:
        setStateMachine((StateMachine)null);
        return;
      case RmOdpPackage.OBJECT__INTERFACES:
        getInterfaces().clear();
        return;
      case RmOdpPackage.OBJECT__INNER_OBJECTS:
        getInnerObjects().clear();
        return;
      case RmOdpPackage.OBJECT__NV_OBJECT:
        setNvObject((org.xtext.example.rmodp.rmOdp.Object)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RmOdpPackage.OBJECT__OBJECT_TYPE:
        return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
      case RmOdpPackage.OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.OBJECT__SUPER_OBJECT:
        return superObject != null;
      case RmOdpPackage.OBJECT__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case RmOdpPackage.OBJECT__STATE_MACHINE:
        return stateMachine != null;
      case RmOdpPackage.OBJECT__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case RmOdpPackage.OBJECT__INNER_OBJECTS:
        return innerObjects != null && !innerObjects.isEmpty();
      case RmOdpPackage.OBJECT__NV_OBJECT:
        return nvObject != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ObjectType: ");
    result.append(objectType);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ObjectImpl
