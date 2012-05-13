/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.rmodp.rmOdp.Property;
import org.xtext.example.rmodp.rmOdp.PropertyInstance;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PropertyInstanceImpl#getTypeProperty <em>Type Property</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PropertyInstanceImpl#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyInstanceImpl extends MinimalEObjectImpl.Container implements PropertyInstance
{
  /**
   * The cached value of the '{@link #getTypeProperty() <em>Type Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeProperty()
   * @generated
   * @ordered
   */
  protected Property typeProperty;

  /**
   * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyInstanceImpl()
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
    return RmOdpPackage.Literals.PROPERTY_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getTypeProperty()
  {
    if (typeProperty != null && typeProperty.eIsProxy())
    {
      InternalEObject oldTypeProperty = (InternalEObject)typeProperty;
      typeProperty = (Property)eResolveProxy(oldTypeProperty);
      if (typeProperty != oldTypeProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.PROPERTY_INSTANCE__TYPE_PROPERTY, oldTypeProperty, typeProperty));
      }
    }
    return typeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetTypeProperty()
  {
    return typeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeProperty(Property newTypeProperty)
  {
    Property oldTypeProperty = typeProperty;
    typeProperty = newTypeProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.PROPERTY_INSTANCE__TYPE_PROPERTY, oldTypeProperty, typeProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyValue()
  {
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyValue(String newPropertyValue)
  {
    String oldPropertyValue = propertyValue;
    propertyValue = newPropertyValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.PROPERTY_INSTANCE__PROPERTY_VALUE, oldPropertyValue, propertyValue));
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
      case RmOdpPackage.PROPERTY_INSTANCE__TYPE_PROPERTY:
        if (resolve) return getTypeProperty();
        return basicGetTypeProperty();
      case RmOdpPackage.PROPERTY_INSTANCE__PROPERTY_VALUE:
        return getPropertyValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RmOdpPackage.PROPERTY_INSTANCE__TYPE_PROPERTY:
        setTypeProperty((Property)newValue);
        return;
      case RmOdpPackage.PROPERTY_INSTANCE__PROPERTY_VALUE:
        setPropertyValue((String)newValue);
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
      case RmOdpPackage.PROPERTY_INSTANCE__TYPE_PROPERTY:
        setTypeProperty((Property)null);
        return;
      case RmOdpPackage.PROPERTY_INSTANCE__PROPERTY_VALUE:
        setPropertyValue(PROPERTY_VALUE_EDEFAULT);
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
      case RmOdpPackage.PROPERTY_INSTANCE__TYPE_PROPERTY:
        return typeProperty != null;
      case RmOdpPackage.PROPERTY_INSTANCE__PROPERTY_VALUE:
        return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
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
    result.append(" (propertyValue: ");
    result.append(propertyValue);
    result.append(')');
    return result.toString();
  }

} //PropertyInstanceImpl
