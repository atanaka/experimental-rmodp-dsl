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

import org.xtext.example.rmodp.rmOdp.ObjectProhibition;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Prohibition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl#getObjp <em>Objp</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl#getObject_prohibition <em>Object prohibition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectProhibitionImpl extends MinimalEObjectImpl.Container implements ObjectProhibition
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
   * The default value of the '{@link #getObject_prohibition() <em>Object prohibition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject_prohibition()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_PROHIBITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject_prohibition() <em>Object prohibition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject_prohibition()
   * @generated
   * @ordered
   */
  protected String object_prohibition = OBJECT_PROHIBITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectProhibitionImpl()
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
    return RmOdpPackage.Literals.OBJECT_PROHIBITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PROHIBITION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PROHIBITION__INFORCE, oldInforce, inforce));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.OBJECT_PROHIBITION__OBJP, oldObjp, objp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PROHIBITION__OBJP, oldObjp, objp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObject_prohibition()
  {
    return object_prohibition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject_prohibition(String newObject_prohibition)
  {
    String oldObject_prohibition = object_prohibition;
    object_prohibition = newObject_prohibition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_PROHIBITION__OBJECT_PROHIBITION, oldObject_prohibition, object_prohibition));
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
      case RmOdpPackage.OBJECT_PROHIBITION__NAME:
        return getName();
      case RmOdpPackage.OBJECT_PROHIBITION__INFORCE:
        return isInforce();
      case RmOdpPackage.OBJECT_PROHIBITION__OBJP:
        if (resolve) return getObjp();
        return basicGetObjp();
      case RmOdpPackage.OBJECT_PROHIBITION__OBJECT_PROHIBITION:
        return getObject_prohibition();
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
      case RmOdpPackage.OBJECT_PROHIBITION__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.OBJECT_PROHIBITION__INFORCE:
        setInforce((Boolean)newValue);
        return;
      case RmOdpPackage.OBJECT_PROHIBITION__OBJP:
        setObjp((org.xtext.example.rmodp.rmOdp.Object)newValue);
        return;
      case RmOdpPackage.OBJECT_PROHIBITION__OBJECT_PROHIBITION:
        setObject_prohibition((String)newValue);
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
      case RmOdpPackage.OBJECT_PROHIBITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT_PROHIBITION__INFORCE:
        setInforce(INFORCE_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT_PROHIBITION__OBJP:
        setObjp((org.xtext.example.rmodp.rmOdp.Object)null);
        return;
      case RmOdpPackage.OBJECT_PROHIBITION__OBJECT_PROHIBITION:
        setObject_prohibition(OBJECT_PROHIBITION_EDEFAULT);
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
      case RmOdpPackage.OBJECT_PROHIBITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.OBJECT_PROHIBITION__INFORCE:
        return inforce != INFORCE_EDEFAULT;
      case RmOdpPackage.OBJECT_PROHIBITION__OBJP:
        return objp != null;
      case RmOdpPackage.OBJECT_PROHIBITION__OBJECT_PROHIBITION:
        return OBJECT_PROHIBITION_EDEFAULT == null ? object_prohibition != null : !OBJECT_PROHIBITION_EDEFAULT.equals(object_prohibition);
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
    result.append(", object_prohibition: ");
    result.append(object_prohibition);
    result.append(')');
    return result.toString();
  }

} //ObjectProhibitionImpl
