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

import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.Role;
import org.xtext.example.rmodp.rmOdp.RoleProhibition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Prohibition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl#getRolep <em>Rolep</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl#getRole_prohibition <em>Role prohibition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleProhibitionImpl extends MinimalEObjectImpl.Container implements RoleProhibition
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
   * The cached value of the '{@link #getRolep() <em>Rolep</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRolep()
   * @generated
   * @ordered
   */
  protected Role rolep;

  /**
   * The default value of the '{@link #getRole_prohibition() <em>Role prohibition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole_prohibition()
   * @generated
   * @ordered
   */
  protected static final String ROLE_PROHIBITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRole_prohibition() <em>Role prohibition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole_prohibition()
   * @generated
   * @ordered
   */
  protected String role_prohibition = ROLE_PROHIBITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleProhibitionImpl()
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
    return RmOdpPackage.Literals.ROLE_PROHIBITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_PROHIBITION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_PROHIBITION__INFORCE, oldInforce, inforce));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getRolep()
  {
    if (rolep != null && rolep.eIsProxy())
    {
      InternalEObject oldRolep = (InternalEObject)rolep;
      rolep = (Role)eResolveProxy(oldRolep);
      if (rolep != oldRolep)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.ROLE_PROHIBITION__ROLEP, oldRolep, rolep));
      }
    }
    return rolep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetRolep()
  {
    return rolep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRolep(Role newRolep)
  {
    Role oldRolep = rolep;
    rolep = newRolep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_PROHIBITION__ROLEP, oldRolep, rolep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRole_prohibition()
  {
    return role_prohibition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole_prohibition(String newRole_prohibition)
  {
    String oldRole_prohibition = role_prohibition;
    role_prohibition = newRole_prohibition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_PROHIBITION__ROLE_PROHIBITION, oldRole_prohibition, role_prohibition));
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
      case RmOdpPackage.ROLE_PROHIBITION__NAME:
        return getName();
      case RmOdpPackage.ROLE_PROHIBITION__INFORCE:
        return isInforce();
      case RmOdpPackage.ROLE_PROHIBITION__ROLEP:
        if (resolve) return getRolep();
        return basicGetRolep();
      case RmOdpPackage.ROLE_PROHIBITION__ROLE_PROHIBITION:
        return getRole_prohibition();
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
      case RmOdpPackage.ROLE_PROHIBITION__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.ROLE_PROHIBITION__INFORCE:
        setInforce((Boolean)newValue);
        return;
      case RmOdpPackage.ROLE_PROHIBITION__ROLEP:
        setRolep((Role)newValue);
        return;
      case RmOdpPackage.ROLE_PROHIBITION__ROLE_PROHIBITION:
        setRole_prohibition((String)newValue);
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
      case RmOdpPackage.ROLE_PROHIBITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.ROLE_PROHIBITION__INFORCE:
        setInforce(INFORCE_EDEFAULT);
        return;
      case RmOdpPackage.ROLE_PROHIBITION__ROLEP:
        setRolep((Role)null);
        return;
      case RmOdpPackage.ROLE_PROHIBITION__ROLE_PROHIBITION:
        setRole_prohibition(ROLE_PROHIBITION_EDEFAULT);
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
      case RmOdpPackage.ROLE_PROHIBITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.ROLE_PROHIBITION__INFORCE:
        return inforce != INFORCE_EDEFAULT;
      case RmOdpPackage.ROLE_PROHIBITION__ROLEP:
        return rolep != null;
      case RmOdpPackage.ROLE_PROHIBITION__ROLE_PROHIBITION:
        return ROLE_PROHIBITION_EDEFAULT == null ? role_prohibition != null : !ROLE_PROHIBITION_EDEFAULT.equals(role_prohibition);
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
    result.append(", role_prohibition: ");
    result.append(role_prohibition);
    result.append(')');
    return result.toString();
  }

} //RoleProhibitionImpl
