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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.rmodp.rmOdp.Param;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.SignatureDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.SignatureDefImpl#getSignatureType <em>Signature Type</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.SignatureDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.SignatureDefImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureDefImpl extends MinimalEObjectImpl.Container implements SignatureDef
{
  /**
   * The default value of the '{@link #getSignatureType() <em>Signature Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignatureType()
   * @generated
   * @ordered
   */
  protected static final String SIGNATURE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSignatureType() <em>Signature Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignatureType()
   * @generated
   * @ordered
   */
  protected String signatureType = SIGNATURE_TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Param> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignatureDefImpl()
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
    return RmOdpPackage.Literals.SIGNATURE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSignatureType()
  {
    return signatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignatureType(String newSignatureType)
  {
    String oldSignatureType = signatureType;
    signatureType = newSignatureType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.SIGNATURE_DEF__SIGNATURE_TYPE, oldSignatureType, signatureType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.SIGNATURE_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Param> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Param>(Param.class, this, RmOdpPackage.SIGNATURE_DEF__PARAMS);
    }
    return params;
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
      case RmOdpPackage.SIGNATURE_DEF__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.SIGNATURE_DEF__SIGNATURE_TYPE:
        return getSignatureType();
      case RmOdpPackage.SIGNATURE_DEF__NAME:
        return getName();
      case RmOdpPackage.SIGNATURE_DEF__PARAMS:
        return getParams();
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
      case RmOdpPackage.SIGNATURE_DEF__SIGNATURE_TYPE:
        setSignatureType((String)newValue);
        return;
      case RmOdpPackage.SIGNATURE_DEF__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.SIGNATURE_DEF__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Param>)newValue);
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
      case RmOdpPackage.SIGNATURE_DEF__SIGNATURE_TYPE:
        setSignatureType(SIGNATURE_TYPE_EDEFAULT);
        return;
      case RmOdpPackage.SIGNATURE_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.SIGNATURE_DEF__PARAMS:
        getParams().clear();
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
      case RmOdpPackage.SIGNATURE_DEF__SIGNATURE_TYPE:
        return SIGNATURE_TYPE_EDEFAULT == null ? signatureType != null : !SIGNATURE_TYPE_EDEFAULT.equals(signatureType);
      case RmOdpPackage.SIGNATURE_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.SIGNATURE_DEF__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (signatureType: ");
    result.append(signatureType);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SignatureDefImpl
