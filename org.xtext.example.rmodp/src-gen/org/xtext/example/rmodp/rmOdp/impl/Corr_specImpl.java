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

import org.xtext.example.rmodp.rmOdp.Corr_spec;
import org.xtext.example.rmodp.rmOdp.EndPoint;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Corr spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl#getViewpoint1 <em>Viewpoint1</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl#getEndpoints1 <em>Endpoints1</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl#getViewpoint2 <em>Viewpoint2</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl#getEndpoints2 <em>Endpoints2</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Corr_specImpl extends SpecImpl implements Corr_spec
{
  /**
   * The default value of the '{@link #getViewpoint1() <em>Viewpoint1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoint1()
   * @generated
   * @ordered
   */
  protected static final String VIEWPOINT1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewpoint1() <em>Viewpoint1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoint1()
   * @generated
   * @ordered
   */
  protected String viewpoint1 = VIEWPOINT1_EDEFAULT;

  /**
   * The cached value of the '{@link #getEndpoints1() <em>Endpoints1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndpoints1()
   * @generated
   * @ordered
   */
  protected EList<EndPoint> endpoints1;

  /**
   * The default value of the '{@link #getViewpoint2() <em>Viewpoint2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoint2()
   * @generated
   * @ordered
   */
  protected static final String VIEWPOINT2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewpoint2() <em>Viewpoint2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoint2()
   * @generated
   * @ordered
   */
  protected String viewpoint2 = VIEWPOINT2_EDEFAULT;

  /**
   * The cached value of the '{@link #getEndpoints2() <em>Endpoints2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndpoints2()
   * @generated
   * @ordered
   */
  protected EList<EndPoint> endpoints2;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Corr_specImpl()
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
    return RmOdpPackage.Literals.CORR_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewpoint1()
  {
    return viewpoint1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewpoint1(String newViewpoint1)
  {
    String oldViewpoint1 = viewpoint1;
    viewpoint1 = newViewpoint1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.CORR_SPEC__VIEWPOINT1, oldViewpoint1, viewpoint1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EndPoint> getEndpoints1()
  {
    if (endpoints1 == null)
    {
      endpoints1 = new EObjectContainmentEList<EndPoint>(EndPoint.class, this, RmOdpPackage.CORR_SPEC__ENDPOINTS1);
    }
    return endpoints1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewpoint2()
  {
    return viewpoint2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewpoint2(String newViewpoint2)
  {
    String oldViewpoint2 = viewpoint2;
    viewpoint2 = newViewpoint2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.CORR_SPEC__VIEWPOINT2, oldViewpoint2, viewpoint2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EndPoint> getEndpoints2()
  {
    if (endpoints2 == null)
    {
      endpoints2 = new EObjectContainmentEList<EndPoint>(EndPoint.class, this, RmOdpPackage.CORR_SPEC__ENDPOINTS2);
    }
    return endpoints2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.CORR_SPEC__DESCRIPTION, oldDescription, description));
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
      case RmOdpPackage.CORR_SPEC__ENDPOINTS1:
        return ((InternalEList<?>)getEndpoints1()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.CORR_SPEC__ENDPOINTS2:
        return ((InternalEList<?>)getEndpoints2()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.CORR_SPEC__VIEWPOINT1:
        return getViewpoint1();
      case RmOdpPackage.CORR_SPEC__ENDPOINTS1:
        return getEndpoints1();
      case RmOdpPackage.CORR_SPEC__VIEWPOINT2:
        return getViewpoint2();
      case RmOdpPackage.CORR_SPEC__ENDPOINTS2:
        return getEndpoints2();
      case RmOdpPackage.CORR_SPEC__DESCRIPTION:
        return getDescription();
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
      case RmOdpPackage.CORR_SPEC__VIEWPOINT1:
        setViewpoint1((String)newValue);
        return;
      case RmOdpPackage.CORR_SPEC__ENDPOINTS1:
        getEndpoints1().clear();
        getEndpoints1().addAll((Collection<? extends EndPoint>)newValue);
        return;
      case RmOdpPackage.CORR_SPEC__VIEWPOINT2:
        setViewpoint2((String)newValue);
        return;
      case RmOdpPackage.CORR_SPEC__ENDPOINTS2:
        getEndpoints2().clear();
        getEndpoints2().addAll((Collection<? extends EndPoint>)newValue);
        return;
      case RmOdpPackage.CORR_SPEC__DESCRIPTION:
        setDescription((String)newValue);
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
      case RmOdpPackage.CORR_SPEC__VIEWPOINT1:
        setViewpoint1(VIEWPOINT1_EDEFAULT);
        return;
      case RmOdpPackage.CORR_SPEC__ENDPOINTS1:
        getEndpoints1().clear();
        return;
      case RmOdpPackage.CORR_SPEC__VIEWPOINT2:
        setViewpoint2(VIEWPOINT2_EDEFAULT);
        return;
      case RmOdpPackage.CORR_SPEC__ENDPOINTS2:
        getEndpoints2().clear();
        return;
      case RmOdpPackage.CORR_SPEC__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case RmOdpPackage.CORR_SPEC__VIEWPOINT1:
        return VIEWPOINT1_EDEFAULT == null ? viewpoint1 != null : !VIEWPOINT1_EDEFAULT.equals(viewpoint1);
      case RmOdpPackage.CORR_SPEC__ENDPOINTS1:
        return endpoints1 != null && !endpoints1.isEmpty();
      case RmOdpPackage.CORR_SPEC__VIEWPOINT2:
        return VIEWPOINT2_EDEFAULT == null ? viewpoint2 != null : !VIEWPOINT2_EDEFAULT.equals(viewpoint2);
      case RmOdpPackage.CORR_SPEC__ENDPOINTS2:
        return endpoints2 != null && !endpoints2.isEmpty();
      case RmOdpPackage.CORR_SPEC__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(" (viewpoint1: ");
    result.append(viewpoint1);
    result.append(", viewpoint2: ");
    result.append(viewpoint2);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //Corr_specImpl
