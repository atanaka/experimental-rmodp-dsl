/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.rmodp.rmOdp.Node;
import org.xtext.example.rmodp.rmOdp.Outgoing;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.OutgoingImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.OutgoingImpl#getOutCondition <em>Out Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutgoingImpl extends MinimalEObjectImpl.Container implements Outgoing
{
  /**
   * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoing()
   * @generated
   * @ordered
   */
  protected EList<Node> outgoing;

  /**
   * The default value of the '{@link #getOutCondition() <em>Out Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutCondition()
   * @generated
   * @ordered
   */
  protected static final String OUT_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutCondition() <em>Out Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutCondition()
   * @generated
   * @ordered
   */
  protected String outCondition = OUT_CONDITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutgoingImpl()
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
    return RmOdpPackage.Literals.OUTGOING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getOutgoing()
  {
    if (outgoing == null)
    {
      outgoing = new EObjectResolvingEList<Node>(Node.class, this, RmOdpPackage.OUTGOING__OUTGOING);
    }
    return outgoing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutCondition()
  {
    return outCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutCondition(String newOutCondition)
  {
    String oldOutCondition = outCondition;
    outCondition = newOutCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.OUTGOING__OUT_CONDITION, oldOutCondition, outCondition));
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
      case RmOdpPackage.OUTGOING__OUTGOING:
        return getOutgoing();
      case RmOdpPackage.OUTGOING__OUT_CONDITION:
        return getOutCondition();
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
      case RmOdpPackage.OUTGOING__OUTGOING:
        getOutgoing().clear();
        getOutgoing().addAll((Collection<? extends Node>)newValue);
        return;
      case RmOdpPackage.OUTGOING__OUT_CONDITION:
        setOutCondition((String)newValue);
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
      case RmOdpPackage.OUTGOING__OUTGOING:
        getOutgoing().clear();
        return;
      case RmOdpPackage.OUTGOING__OUT_CONDITION:
        setOutCondition(OUT_CONDITION_EDEFAULT);
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
      case RmOdpPackage.OUTGOING__OUTGOING:
        return outgoing != null && !outgoing.isEmpty();
      case RmOdpPackage.OUTGOING__OUT_CONDITION:
        return OUT_CONDITION_EDEFAULT == null ? outCondition != null : !OUT_CONDITION_EDEFAULT.equals(outCondition);
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
    result.append(" (outCondition: ");
    result.append(outCondition);
    result.append(')');
    return result.toString();
  }

} //OutgoingImpl
