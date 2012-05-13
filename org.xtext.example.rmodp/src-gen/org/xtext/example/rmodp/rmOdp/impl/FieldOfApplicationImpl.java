/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.rmodp.rmOdp.FieldOfApplication;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Of Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.FieldOfApplicationImpl#getFoa <em>Foa</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldOfApplicationImpl extends MinimalEObjectImpl.Container implements FieldOfApplication
{
  /**
   * The default value of the '{@link #getFoa() <em>Foa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoa()
   * @generated
   * @ordered
   */
  protected static final String FOA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFoa() <em>Foa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoa()
   * @generated
   * @ordered
   */
  protected String foa = FOA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldOfApplicationImpl()
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
    return RmOdpPackage.Literals.FIELD_OF_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFoa()
  {
    return foa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFoa(String newFoa)
  {
    String oldFoa = foa;
    foa = newFoa;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.FIELD_OF_APPLICATION__FOA, oldFoa, foa));
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
      case RmOdpPackage.FIELD_OF_APPLICATION__FOA:
        return getFoa();
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
      case RmOdpPackage.FIELD_OF_APPLICATION__FOA:
        setFoa((String)newValue);
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
      case RmOdpPackage.FIELD_OF_APPLICATION__FOA:
        setFoa(FOA_EDEFAULT);
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
      case RmOdpPackage.FIELD_OF_APPLICATION__FOA:
        return FOA_EDEFAULT == null ? foa != null : !FOA_EDEFAULT.equals(foa);
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
    result.append(" (foa: ");
    result.append(foa);
    result.append(')');
    return result.toString();
  }

} //FieldOfApplicationImpl
