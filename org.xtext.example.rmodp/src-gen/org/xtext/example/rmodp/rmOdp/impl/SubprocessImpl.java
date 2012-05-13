/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.rmodp.rmOdp.Incoming;
import org.xtext.example.rmodp.rmOdp.Outgoing;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.Subprocess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.SubprocessImpl#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.SubprocessImpl#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubprocessImpl extends NodeImpl implements Subprocess
{
  /**
   * The cached value of the '{@link #getIncomings() <em>Incomings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomings()
   * @generated
   * @ordered
   */
  protected EList<Incoming> incomings;

  /**
   * The cached value of the '{@link #getOutgoings() <em>Outgoings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoings()
   * @generated
   * @ordered
   */
  protected EList<Outgoing> outgoings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprocessImpl()
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
    return RmOdpPackage.Literals.SUBPROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Incoming> getIncomings()
  {
    if (incomings == null)
    {
      incomings = new EObjectContainmentEList<Incoming>(Incoming.class, this, RmOdpPackage.SUBPROCESS__INCOMINGS);
    }
    return incomings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Outgoing> getOutgoings()
  {
    if (outgoings == null)
    {
      outgoings = new EObjectContainmentEList<Outgoing>(Outgoing.class, this, RmOdpPackage.SUBPROCESS__OUTGOINGS);
    }
    return outgoings;
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
      case RmOdpPackage.SUBPROCESS__INCOMINGS:
        return ((InternalEList<?>)getIncomings()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.SUBPROCESS__OUTGOINGS:
        return ((InternalEList<?>)getOutgoings()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.SUBPROCESS__INCOMINGS:
        return getIncomings();
      case RmOdpPackage.SUBPROCESS__OUTGOINGS:
        return getOutgoings();
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
      case RmOdpPackage.SUBPROCESS__INCOMINGS:
        getIncomings().clear();
        getIncomings().addAll((Collection<? extends Incoming>)newValue);
        return;
      case RmOdpPackage.SUBPROCESS__OUTGOINGS:
        getOutgoings().clear();
        getOutgoings().addAll((Collection<? extends Outgoing>)newValue);
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
      case RmOdpPackage.SUBPROCESS__INCOMINGS:
        getIncomings().clear();
        return;
      case RmOdpPackage.SUBPROCESS__OUTGOINGS:
        getOutgoings().clear();
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
      case RmOdpPackage.SUBPROCESS__INCOMINGS:
        return incomings != null && !incomings.isEmpty();
      case RmOdpPackage.SUBPROCESS__OUTGOINGS:
        return outgoings != null && !outgoings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubprocessImpl
