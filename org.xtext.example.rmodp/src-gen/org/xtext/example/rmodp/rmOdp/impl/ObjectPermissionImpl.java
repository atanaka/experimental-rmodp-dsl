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

import org.xtext.example.rmodp.rmOdp.ObjectPermission;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl#getObjp <em>Objp</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl#getObject_permission <em>Object permission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPermissionImpl extends MinimalEObjectImpl.Container implements ObjectPermission
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
   * The default value of the '{@link #isInforce() <em>Inforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInforce()
   * @generated
   * @ordered
   */
  protected static final boolean INFORCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInforce() <em>Inforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInforce()
   * @generated
   * @ordered
   */
  protected boolean inforce = INFORCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjp() <em>Objp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjp()
   * @generated
   * @ordered
   */
  protected org.xtext.example.rmodp.rmOdp.Object objp;

  /**
   * The default value of the '{@link #getObject_permission() <em>Object permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject_permission()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_PERMISSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject_permission() <em>Object permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject_permission()
   * @generated
   * @ordered
   */
  protected String object_permission = OBJECT_PERMISSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectPermissionImpl()
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
    return RmOdpPackage.Literals.OBJECT_PERMISSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PERMISSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInforce()
  {
    return inforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInforce(boolean newInforce)
  {
    boolean oldInforce = inforce;
    inforce = newInforce;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PERMISSION__INFORCE, oldInforce, inforce));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object getObjp()
  {
    if (objp != null && objp.eIsProxy())
    {
      InternalEObject oldObjp = (InternalEObject)objp;
      objp = (org.xtext.example.rmodp.rmOdp.Object)eResolveProxy(oldObjp);
      if (objp != oldObjp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.OBJECT_PERMISSION__OBJP, oldObjp, objp));
      }
    }
    return objp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object basicGetObjp()
  {
    return objp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjp(org.xtext.example.rmodp.rmOdp.Object newObjp)
  {
    org.xtext.example.rmodp.rmOdp.Object oldObjp = objp;
    objp = newObjp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PERMISSION__OBJP, oldObjp, objp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObject_permission()
  {
    return object_permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject_permission(String newObject_permission)
  {
    String oldObject_permission = object_permission;
    object_permission = newObject_permission;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PERMISSION__OBJECT_PERMISSION, oldObject_permission, object_permission));
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
      case RmOdpPackage.OBJECT_PERMISSION__NAME:
        return getName();
      case RmOdpPackage.OBJECT_PERMISSION__INFORCE:
        return isInforce();
      case RmOdpPackage.OBJECT_PERMISSION__OBJP:
        if (resolve) return getObjp();
        return basicGetObjp();
      case RmOdpPackage.OBJECT_PERMISSION__OBJECT_PERMISSION:
        return getObject_permission();
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
      case RmOdpPackage.OBJECT_PERMISSION__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.OBJECT_PERMISSION__INFORCE:
        setInforce((Boolean)newValue);
        return;
      case RmOdpPackage.OBJECT_PERMISSION__OBJP:
        setObjp((org.xtext.example.rmodp.rmOdp.Object)newValue);
        return;
      case RmOdpPackage.OBJECT_PERMISSION__OBJECT_PERMISSION:
        setObject_permission((String)newValue);
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
      case RmOdpPackage.OBJECT_PERMISSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT_PERMISSION__INFORCE:
        setInforce(INFORCE_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT_PERMISSION__OBJP:
        setObjp((org.xtext.example.rmodp.rmOdp.Object)null);
        return;
      case RmOdpPackage.OBJECT_PERMISSION__OBJECT_PERMISSION:
        setObject_permission(OBJECT_PERMISSION_EDEFAULT);
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
      case RmOdpPackage.OBJECT_PERMISSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.OBJECT_PERMISSION__INFORCE:
        return inforce != INFORCE_EDEFAULT;
      case RmOdpPackage.OBJECT_PERMISSION__OBJP:
        return objp != null;
      case RmOdpPackage.OBJECT_PERMISSION__OBJECT_PERMISSION:
        return OBJECT_PERMISSION_EDEFAULT == null ? object_permission != null : !OBJECT_PERMISSION_EDEFAULT.equals(object_permission);
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
    result.append(", inforce: ");
    result.append(inforce);
    result.append(", object_permission: ");
    result.append(object_permission);
    result.append(')');
    return result.toString();
  }

} //ObjectPermissionImpl
