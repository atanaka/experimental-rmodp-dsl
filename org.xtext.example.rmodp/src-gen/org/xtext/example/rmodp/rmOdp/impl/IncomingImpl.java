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

import org.xtext.example.rmodp.rmOdp.Incoming;
import org.xtext.example.rmodp.rmOdp.Node;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.IncomingImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.IncomingImpl#getInCondition <em>In Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncomingImpl extends MinimalEObjectImpl.Container implements Incoming
{
  /**
   * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncoming()
   * @generated
   * @ordered
   */
  protected EList<Node> incoming;

  /**
   * The default value of the '{@link #getInCondition() <em>In Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInCondition()
   * @generated
   * @ordered
   */
  protected static final String IN_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInCondition() <em>In Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInCondition()
   * @generated
   * @ordered
   */
  protected String inCondition = IN_CONDITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncomingImpl()
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
    return RmOdpPackage.Literals.INCOMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getIncoming()
  {
    if (incoming == null)
    {
      incoming = new EObjectResolvingEList<Node>(Node.class, this, RmOdpPackage.INCOMING__INCOMING);
    }
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInCondition()
  {
    return inCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInCondition(String newInCondition)
  {
    String oldInCondition = inCondition;
    inCondition = newInCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INCOMING__IN_CONDITION, oldInCondition, inCondition));
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
      case RmOdpPackage.INCOMING__INCOMING:
        return getIncoming();
      case RmOdpPackage.INCOMING__IN_CONDITION:
        return getInCondition();
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
      case RmOdpPackage.INCOMING__INCOMING:
        getIncoming().clear();
        getIncoming().addAll((Collection<? extends Node>)newValue);
        return;
      case RmOdpPackage.INCOMING__IN_CONDITION:
        setInCondition((String)newValue);
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
      case RmOdpPackage.INCOMING__INCOMING:
        getIncoming().clear();
        return;
      case RmOdpPackage.INCOMING__IN_CONDITION:
        setInCondition(IN_CONDITION_EDEFAULT);
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
      case RmOdpPackage.INCOMING__INCOMING:
        return incoming != null && !incoming.isEmpty();
      case RmOdpPackage.INCOMING__IN_CONDITION:
        return IN_CONDITION_EDEFAULT == null ? inCondition != null : !IN_CONDITION_EDEFAULT.equals(inCondition);
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
    result.append(" (inCondition: ");
    result.append(inCondition);
    result.append(')');
    return result.toString();
  }

} //IncomingImpl
