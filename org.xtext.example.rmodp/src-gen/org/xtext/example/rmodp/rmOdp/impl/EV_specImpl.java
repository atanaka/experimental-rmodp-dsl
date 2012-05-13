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

import org.xtext.example.rmodp.rmOdp.CommunityContract;
import org.xtext.example.rmodp.rmOdp.EV_spec;
import org.xtext.example.rmodp.rmOdp.FieldOfApplication;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.EV_specImpl#getFoa <em>Foa</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.EV_specImpl#getGlobalObjects <em>Global Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.EV_specImpl#getCommunityContracts <em>Community Contracts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EV_specImpl extends SpecImpl implements EV_spec
{
  /**
   * The cached value of the '{@link #getFoa() <em>Foa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoa()
   * @generated
   * @ordered
   */
  protected FieldOfApplication foa;

  /**
   * The cached value of the '{@link #getGlobalObjects() <em>Global Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobalObjects()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.rmodp.rmOdp.Object> globalObjects;

  /**
   * The cached value of the '{@link #getCommunityContracts() <em>Community Contracts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommunityContracts()
   * @generated
   * @ordered
   */
  protected EList<CommunityContract> communityContracts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EV_specImpl()
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
    return RmOdpPackage.Literals.EV_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldOfApplication getFoa()
  {
    return foa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFoa(FieldOfApplication newFoa, NotificationChain msgs)
  {
    FieldOfApplication oldFoa = foa;
    foa = newFoa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RmOdpPackage.EV_SPEC__FOA, oldFoa, newFoa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFoa(FieldOfApplication newFoa)
  {
    if (newFoa != foa)
    {
      NotificationChain msgs = null;
      if (foa != null)
        msgs = ((InternalEObject)foa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.EV_SPEC__FOA, null, msgs);
      if (newFoa != null)
        msgs = ((InternalEObject)newFoa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.EV_SPEC__FOA, null, msgs);
      msgs = basicSetFoa(newFoa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.EV_SPEC__FOA, newFoa, newFoa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.rmodp.rmOdp.Object> getGlobalObjects()
  {
    if (globalObjects == null)
    {
      globalObjects = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Object>(org.xtext.example.rmodp.rmOdp.Object.class, this, RmOdpPackage.EV_SPEC__GLOBAL_OBJECTS);
    }
    return globalObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CommunityContract> getCommunityContracts()
  {
    if (communityContracts == null)
    {
      communityContracts = new EObjectContainmentEList<CommunityContract>(CommunityContract.class, this, RmOdpPackage.EV_SPEC__COMMUNITY_CONTRACTS);
    }
    return communityContracts;
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
      case RmOdpPackage.EV_SPEC__FOA:
        return basicSetFoa(null, msgs);
      case RmOdpPackage.EV_SPEC__GLOBAL_OBJECTS:
        return ((InternalEList<?>)getGlobalObjects()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.EV_SPEC__COMMUNITY_CONTRACTS:
        return ((InternalEList<?>)getCommunityContracts()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.EV_SPEC__FOA:
        return getFoa();
      case RmOdpPackage.EV_SPEC__GLOBAL_OBJECTS:
        return getGlobalObjects();
      case RmOdpPackage.EV_SPEC__COMMUNITY_CONTRACTS:
        return getCommunityContracts();
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
      case RmOdpPackage.EV_SPEC__FOA:
        setFoa((FieldOfApplication)newValue);
        return;
      case RmOdpPackage.EV_SPEC__GLOBAL_OBJECTS:
        getGlobalObjects().clear();
        getGlobalObjects().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Object>)newValue);
        return;
      case RmOdpPackage.EV_SPEC__COMMUNITY_CONTRACTS:
        getCommunityContracts().clear();
        getCommunityContracts().addAll((Collection<? extends CommunityContract>)newValue);
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
      case RmOdpPackage.EV_SPEC__FOA:
        setFoa((FieldOfApplication)null);
        return;
      case RmOdpPackage.EV_SPEC__GLOBAL_OBJECTS:
        getGlobalObjects().clear();
        return;
      case RmOdpPackage.EV_SPEC__COMMUNITY_CONTRACTS:
        getCommunityContracts().clear();
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
      case RmOdpPackage.EV_SPEC__FOA:
        return foa != null;
      case RmOdpPackage.EV_SPEC__GLOBAL_OBJECTS:
        return globalObjects != null && !globalObjects.isEmpty();
      case RmOdpPackage.EV_SPEC__COMMUNITY_CONTRACTS:
        return communityContracts != null && !communityContracts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EV_specImpl
