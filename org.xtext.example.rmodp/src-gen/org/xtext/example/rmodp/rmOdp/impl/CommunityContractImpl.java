/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.rmodp.rmOdp.Community;
import org.xtext.example.rmodp.rmOdp.CommunityContract;
import org.xtext.example.rmodp.rmOdp.Objective;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Community Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityContractImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityContractImpl#getCommunity <em>Community</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunityContractImpl extends MinimalEObjectImpl.Container implements CommunityContract
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
   * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjective()
   * @generated
   * @ordered
   */
  protected Objective objective;

  /**
   * The cached value of the '{@link #getCommunity() <em>Community</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommunity()
   * @generated
   * @ordered
   */
  protected Community community;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommunityContractImpl()
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
    return RmOdpPackage.Literals.COMMUNITY_CONTRACT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.COMMUNITY_CONTRACT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective getObjective()
  {
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjective(Objective newObjective, NotificationChain msgs)
  {
    Objective oldObjective = objective;
    objective = newObjective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE, oldObjective, newObjective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjective(Objective newObjective)
  {
    if (newObjective != objective)
    {
      NotificationChain msgs = null;
      if (objective != null)
        msgs = ((InternalEObject)objective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE, null, msgs);
      if (newObjective != null)
        msgs = ((InternalEObject)newObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE, null, msgs);
      msgs = basicSetObjective(newObjective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE, newObjective, newObjective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Community getCommunity()
  {
    return community;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommunity(Community newCommunity, NotificationChain msgs)
  {
    Community oldCommunity = community;
    community = newCommunity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY, oldCommunity, newCommunity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommunity(Community newCommunity)
  {
    if (newCommunity != community)
    {
      NotificationChain msgs = null;
      if (community != null)
        msgs = ((InternalEObject)community).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY, null, msgs);
      if (newCommunity != null)
        msgs = ((InternalEObject)newCommunity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY, null, msgs);
      msgs = basicSetCommunity(newCommunity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY, newCommunity, newCommunity));
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
      case RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE:
        return basicSetObjective(null, msgs);
      case RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY:
        return basicSetCommunity(null, msgs);
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
      case RmOdpPackage.COMMUNITY_CONTRACT__NAME:
        return getName();
      case RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE:
        return getObjective();
      case RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY:
        return getCommunity();
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
      case RmOdpPackage.COMMUNITY_CONTRACT__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE:
        setObjective((Objective)newValue);
        return;
      case RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY:
        setCommunity((Community)newValue);
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
      case RmOdpPackage.COMMUNITY_CONTRACT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE:
        setObjective((Objective)null);
        return;
      case RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY:
        setCommunity((Community)null);
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
      case RmOdpPackage.COMMUNITY_CONTRACT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.COMMUNITY_CONTRACT__OBJECTIVE:
        return objective != null;
      case RmOdpPackage.COMMUNITY_CONTRACT__COMMUNITY:
        return community != null;
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

} //CommunityContractImpl
