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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.rmodp.rmOdp.ObjectInstance;
import org.xtext.example.rmodp.rmOdp.PropertyInstance;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectInstanceImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectInstanceImpl#getPropertyInstances <em>Property Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectInstanceImpl extends MinimalEObjectImpl.Container implements ObjectInstance
{
  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected org.xtext.example.rmodp.rmOdp.Object typeName;

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
   * The cached value of the '{@link #getPropertyInstances() <em>Property Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyInstances()
   * @generated
   * @ordered
   */
  protected EList<PropertyInstance> propertyInstances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectInstanceImpl()
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
    return RmOdpPackage.Literals.OBJECT_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object getTypeName()
  {
    if (typeName != null && typeName.eIsProxy())
    {
      InternalEObject oldTypeName = (InternalEObject)typeName;
      typeName = (org.xtext.example.rmodp.rmOdp.Object)eResolveProxy(oldTypeName);
      if (typeName != oldTypeName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.OBJECT_INSTANCE__TYPE_NAME, oldTypeName, typeName));
      }
    }
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object basicGetTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(org.xtext.example.rmodp.rmOdp.Object newTypeName)
  {
    org.xtext.example.rmodp.rmOdp.Object oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_INSTANCE__TYPE_NAME, oldTypeName, typeName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_INSTANCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyInstance> getPropertyInstances()
  {
    if (propertyInstances == null)
    {
      propertyInstances = new EObjectContainmentEList<PropertyInstance>(PropertyInstance.class, this, RmOdpPackage.OBJECT_INSTANCE__PROPERTY_INSTANCES);
    }
    return propertyInstances;
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
      case RmOdpPackage.OBJECT_INSTANCE__PROPERTY_INSTANCES:
        return ((InternalEList<?>)getPropertyInstances()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.OBJECT_INSTANCE__TYPE_NAME:
        if (resolve) return getTypeName();
        return basicGetTypeName();
      case RmOdpPackage.OBJECT_INSTANCE__NAME:
        return getName();
      case RmOdpPackage.OBJECT_INSTANCE__PROPERTY_INSTANCES:
        return getPropertyInstances();
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
      case RmOdpPackage.OBJECT_INSTANCE__TYPE_NAME:
        setTypeName((org.xtext.example.rmodp.rmOdp.Object)newValue);
        return;
      case RmOdpPackage.OBJECT_INSTANCE__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.OBJECT_INSTANCE__PROPERTY_INSTANCES:
        getPropertyInstances().clear();
        getPropertyInstances().addAll((Collection<? extends PropertyInstance>)newValue);
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
      case RmOdpPackage.OBJECT_INSTANCE__TYPE_NAME:
        setTypeName((org.xtext.example.rmodp.rmOdp.Object)null);
        return;
      case RmOdpPackage.OBJECT_INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT_INSTANCE__PROPERTY_INSTANCES:
        getPropertyInstances().clear();
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
      case RmOdpPackage.OBJECT_INSTANCE__TYPE_NAME:
        return typeName != null;
      case RmOdpPackage.OBJECT_INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.OBJECT_INSTANCE__PROPERTY_INSTANCES:
        return propertyInstances != null && !propertyInstances.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ObjectInstanceImpl
