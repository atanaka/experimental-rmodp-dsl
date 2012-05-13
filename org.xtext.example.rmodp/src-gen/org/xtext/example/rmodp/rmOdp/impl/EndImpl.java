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

import org.xtext.example.rmodp.rmOdp.End;
import org.xtext.example.rmodp.rmOdp.Incoming;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.EndImpl#getIncomings <em>Incomings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndImpl extends NodeImpl implements End
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndImpl()
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
    return RmOdpPackage.Literals.END;
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
      incomings = new EObjectContainmentEList<Incoming>(Incoming.class, this, RmOdpPackage.END__INCOMINGS);
    }
    return incomings;
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
      case RmOdpPackage.END__INCOMINGS:
        return ((InternalEList<?>)getIncomings()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.END__INCOMINGS:
        return getIncomings();
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
      case RmOdpPackage.END__INCOMINGS:
        getIncomings().clear();
        getIncomings().addAll((Collection<? extends Incoming>)newValue);
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
      case RmOdpPackage.END__INCOMINGS:
        getIncomings().clear();
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
      case RmOdpPackage.END__INCOMINGS:
        return incomings != null && !incomings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EndImpl
