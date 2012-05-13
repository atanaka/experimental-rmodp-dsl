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

import org.xtext.example.rmodp.rmOdp.ActionType;
import org.xtext.example.rmodp.rmOdp.InvariantSchema;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InvariantSchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InvariantSchemaImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InvariantSchemaImpl#getActionTypes <em>Action Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvariantSchemaImpl extends MinimalEObjectImpl.Container implements InvariantSchema
{
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
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.rmodp.rmOdp.Object> objects;

  /**
   * The cached value of the '{@link #getActionTypes() <em>Action Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionTypes()
   * @generated
   * @ordered
   */
  protected EList<ActionType> actionTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvariantSchemaImpl()
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
    return RmOdpPackage.Literals.INVARIANT_SCHEMA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INVARIANT_SCHEMA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.rmodp.rmOdp.Object> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Object>(org.xtext.example.rmodp.rmOdp.Object.class, this, RmOdpPackage.INVARIANT_SCHEMA__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionType> getActionTypes()
  {
    if (actionTypes == null)
    {
      actionTypes = new EObjectContainmentEList<ActionType>(ActionType.class, this, RmOdpPackage.INVARIANT_SCHEMA__ACTION_TYPES);
    }
    return actionTypes;
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
      case RmOdpPackage.INVARIANT_SCHEMA__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.INVARIANT_SCHEMA__ACTION_TYPES:
        return ((InternalEList<?>)getActionTypes()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.INVARIANT_SCHEMA__NAME:
        return getName();
      case RmOdpPackage.INVARIANT_SCHEMA__OBJECTS:
        return getObjects();
      case RmOdpPackage.INVARIANT_SCHEMA__ACTION_TYPES:
        return getActionTypes();
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
      case RmOdpPackage.INVARIANT_SCHEMA__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.INVARIANT_SCHEMA__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Object>)newValue);
        return;
      case RmOdpPackage.INVARIANT_SCHEMA__ACTION_TYPES:
        getActionTypes().clear();
        getActionTypes().addAll((Collection<? extends ActionType>)newValue);
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
      case RmOdpPackage.INVARIANT_SCHEMA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.INVARIANT_SCHEMA__OBJECTS:
        getObjects().clear();
        return;
      case RmOdpPackage.INVARIANT_SCHEMA__ACTION_TYPES:
        getActionTypes().clear();
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
      case RmOdpPackage.INVARIANT_SCHEMA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.INVARIANT_SCHEMA__OBJECTS:
        return objects != null && !objects.isEmpty();
      case RmOdpPackage.INVARIANT_SCHEMA__ACTION_TYPES:
        return actionTypes != null && !actionTypes.isEmpty();
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

} //InvariantSchemaImpl
