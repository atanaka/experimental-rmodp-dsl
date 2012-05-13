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
import org.xtext.example.rmodp.rmOdp.RoleObligation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Obligation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl#isInforce <em>Inforce</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl#getRoleo <em>Roleo</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl#getRole_obligation <em>Role obligation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleObligationImpl extends MinimalEObjectImpl.Container implements RoleObligation
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
   * The cached value of the '{@link #getRoleo() <em>Roleo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleo()
   * @generated
   * @ordered
   */
  protected Role roleo;

  /**
   * The default value of the '{@link #getRole_obligation() <em>Role obligation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole_obligation()
   * @generated
   * @ordered
   */
  protected static final String ROLE_OBLIGATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRole_obligation() <em>Role obligation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole_obligation()
   * @generated
   * @ordered
   */
  protected String role_obligation = ROLE_OBLIGATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleObligationImpl()
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
    return RmOdpPackage.Literals.ROLE_OBLIGATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_OBLIGATION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_OBLIGATION__INFORCE, oldInforce, inforce));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getRoleo()
  {
    if (roleo != null && roleo.eIsProxy())
    {
      InternalEObject oldRoleo = (InternalEObject)roleo;
      roleo = (Role)eResolveProxy(oldRoleo);
      if (roleo != oldRoleo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.ROLE_OBLIGATION__ROLEO, oldRoleo, roleo));
      }
    }
    return roleo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetRoleo()
  {
    return roleo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoleo(Role newRoleo)
  {
    Role oldRoleo = roleo;
    roleo = newRoleo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_OBLIGATION__ROLEO, oldRoleo, roleo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRole_obligation()
  {
    return role_obligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole_obligation(String newRole_obligation)
  {
    String oldRole_obligation = role_obligation;
    role_obligation = newRole_obligation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ROLE_OBLIGATION__ROLE_OBLIGATION, oldRole_obligation, role_obligation));
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
      case RmOdpPackage.ROLE_OBLIGATION__NAME:
        return getName();
      case RmOdpPackage.ROLE_OBLIGATION__INFORCE:
        return isInforce();
      case RmOdpPackage.ROLE_OBLIGATION__ROLEO:
        if (resolve) return getRoleo();
        return basicGetRoleo();
      case RmOdpPackage.ROLE_OBLIGATION__ROLE_OBLIGATION:
        return getRole_obligation();
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
      case RmOdpPackage.ROLE_OBLIGATION__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.ROLE_OBLIGATION__INFORCE:
        setInforce((Boolean)newValue);
        return;
      case RmOdpPackage.ROLE_OBLIGATION__ROLEO:
        setRoleo((Role)newValue);
        return;
      case RmOdpPackage.ROLE_OBLIGATION__ROLE_OBLIGATION:
        setRole_obligation((String)newValue);
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
      case RmOdpPackage.ROLE_OBLIGATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.ROLE_OBLIGATION__INFORCE:
        setInforce(INFORCE_EDEFAULT);
        return;
      case RmOdpPackage.ROLE_OBLIGATION__ROLEO:
        setRoleo((Role)null);
        return;
      case RmOdpPackage.ROLE_OBLIGATION__ROLE_OBLIGATION:
        setRole_obligation(ROLE_OBLIGATION_EDEFAULT);
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
      case RmOdpPackage.ROLE_OBLIGATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.ROLE_OBLIGATION__INFORCE:
        return inforce != INFORCE_EDEFAULT;
      case RmOdpPackage.ROLE_OBLIGATION__ROLEO:
        return roleo != null;
      case RmOdpPackage.ROLE_OBLIGATION__ROLE_OBLIGATION:
        return ROLE_OBLIGATION_EDEFAULT == null ? role_obligation != null : !ROLE_OBLIGATION_EDEFAULT.equals(role_obligation);
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
    result.append(", role_obligation: ");
    result.append(role_obligation);
    result.append(')');
    return result.toString();
  }

} //RoleObligationImpl
