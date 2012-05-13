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

import org.xtext.example.rmodp.rmOdp.ObjectObligation;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Obligation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl#getObjo <em>Objo</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl#getObject_obligation <em>Object obligation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectObligationImpl extends MinimalEObjectImpl.Container implements ObjectObligation
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
   * The cached value of the '{@link #getObjo() <em>Objo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjo()
   * @generated
   * @ordered
   */
  protected org.xtext.example.rmodp.rmOdp.Object objo;

  /**
   * The default value of the '{@link #getObject_obligation() <em>Object obligation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject_obligation()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_OBLIGATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject_obligation() <em>Object obligation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject_obligation()
   * @generated
   * @ordered
   */
  protected String object_obligation = OBJECT_OBLIGATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectObligationImpl()
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
    return RmOdpPackage.Literals.OBJECT_OBLIGATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_OBLIGATION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_OBLIGATION__INFORCE, oldInforce, inforce));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object getObjo()
  {
    if (objo != null && objo.eIsProxy())
    {
      InternalEObject oldObjo = (InternalEObject)objo;
      objo = (org.xtext.example.rmodp.rmOdp.Object)eResolveProxy(oldObjo);
      if (objo != oldObjo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.OBJECT_OBLIGATION__OBJO, oldObjo, objo));
      }
    }
    return objo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object basicGetObjo()
  {
    return objo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjo(org.xtext.example.rmodp.rmOdp.Object newObjo)
  {
    org.xtext.example.rmodp.rmOdp.Object oldObjo = objo;
    objo = newObjo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_OBLIGATION__OBJO, oldObjo, objo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObject_obligation()
  {
    return object_obligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject_obligation(String newObject_obligation)
  {
    String oldObject_obligation = object_obligation;
    object_obligation = newObject_obligation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OBJECT_OBLIGATION__OBJECT_OBLIGATION, oldObject_obligation, object_obligation));
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
      case RmOdpPackage.OBJECT_OBLIGATION__NAME:
        return getName();
      case RmOdpPackage.OBJECT_OBLIGATION__INFORCE:
        return isInforce();
      case RmOdpPackage.OBJECT_OBLIGATION__OBJO:
        if (resolve) return getObjo();
        return basicGetObjo();
      case RmOdpPackage.OBJECT_OBLIGATION__OBJECT_OBLIGATION:
        return getObject_obligation();
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
      case RmOdpPackage.OBJECT_OBLIGATION__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.OBJECT_OBLIGATION__INFORCE:
        setInforce((Boolean)newValue);
        return;
      case RmOdpPackage.OBJECT_OBLIGATION__OBJO:
        setObjo((org.xtext.example.rmodp.rmOdp.Object)newValue);
        return;
      case RmOdpPackage.OBJECT_OBLIGATION__OBJECT_OBLIGATION:
        setObject_obligation((String)newValue);
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
      case RmOdpPackage.OBJECT_OBLIGATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT_OBLIGATION__INFORCE:
        setInforce(INFORCE_EDEFAULT);
        return;
      case RmOdpPackage.OBJECT_OBLIGATION__OBJO:
        setObjo((org.xtext.example.rmodp.rmOdp.Object)null);
        return;
      case RmOdpPackage.OBJECT_OBLIGATION__OBJECT_OBLIGATION:
        setObject_obligation(OBJECT_OBLIGATION_EDEFAULT);
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
      case RmOdpPackage.OBJECT_OBLIGATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.OBJECT_OBLIGATION__INFORCE:
        return inforce != INFORCE_EDEFAULT;
      case RmOdpPackage.OBJECT_OBLIGATION__OBJO:
        return objo != null;
      case RmOdpPackage.OBJECT_OBLIGATION__OBJECT_OBLIGATION:
        return OBJECT_OBLIGATION_EDEFAULT == null ? object_obligation != null : !OBJECT_OBLIGATION_EDEFAULT.equals(object_obligation);
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
    result.append(", object_obligation: ");
    result.append(object_obligation);
    result.append(')');
    return result.toString();
  }

} //ObjectObligationImpl
