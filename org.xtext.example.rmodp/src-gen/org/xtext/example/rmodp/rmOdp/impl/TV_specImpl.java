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

import org.xtext.example.rmodp.rmOdp.IXIT;
import org.xtext.example.rmodp.rmOdp.ImplementableStandard;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.TV_spec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TV spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.TV_specImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.TV_specImpl#getImplementableStandards <em>Implementable Standards</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.TV_specImpl#getIxits <em>Ixits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TV_specImpl extends SpecImpl implements TV_spec
{
  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.rmodp.rmOdp.Object> objects;

  /**
   * The cached value of the '{@link #getImplementableStandards() <em>Implementable Standards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementableStandards()
   * @generated
   * @ordered
   */
  protected EList<ImplementableStandard> implementableStandards;

  /**
   * The cached value of the '{@link #getIxits() <em>Ixits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIxits()
   * @generated
   * @ordered
   */
  protected EList<IXIT> ixits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TV_specImpl()
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
    return RmOdpPackage.Literals.TV_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.rmodp.rmOdp.Object> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Object>(org.xtext.example.rmodp.rmOdp.Object.class, this, RmOdpPackage.TV_SPEC__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImplementableStandard> getImplementableStandards()
  {
    if (implementableStandards == null)
    {
      implementableStandards = new EObjectContainmentEList<ImplementableStandard>(ImplementableStandard.class, this, RmOdpPackage.TV_SPEC__IMPLEMENTABLE_STANDARDS);
    }
    return implementableStandards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IXIT> getIxits()
  {
    if (ixits == null)
    {
      ixits = new EObjectContainmentEList<IXIT>(IXIT.class, this, RmOdpPackage.TV_SPEC__IXITS);
    }
    return ixits;
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
      case RmOdpPackage.TV_SPEC__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.TV_SPEC__IMPLEMENTABLE_STANDARDS:
        return ((InternalEList<?>)getImplementableStandards()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.TV_SPEC__IXITS:
        return ((InternalEList<?>)getIxits()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.TV_SPEC__OBJECTS:
        return getObjects();
      case RmOdpPackage.TV_SPEC__IMPLEMENTABLE_STANDARDS:
        return getImplementableStandards();
      case RmOdpPackage.TV_SPEC__IXITS:
        return getIxits();
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
      case RmOdpPackage.TV_SPEC__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Object>)newValue);
        return;
      case RmOdpPackage.TV_SPEC__IMPLEMENTABLE_STANDARDS:
        getImplementableStandards().clear();
        getImplementableStandards().addAll((Collection<? extends ImplementableStandard>)newValue);
        return;
      case RmOdpPackage.TV_SPEC__IXITS:
        getIxits().clear();
        getIxits().addAll((Collection<? extends IXIT>)newValue);
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
      case RmOdpPackage.TV_SPEC__OBJECTS:
        getObjects().clear();
        return;
      case RmOdpPackage.TV_SPEC__IMPLEMENTABLE_STANDARDS:
        getImplementableStandards().clear();
        return;
      case RmOdpPackage.TV_SPEC__IXITS:
        getIxits().clear();
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
      case RmOdpPackage.TV_SPEC__OBJECTS:
        return objects != null && !objects.isEmpty();
      case RmOdpPackage.TV_SPEC__IMPLEMENTABLE_STANDARDS:
        return implementableStandards != null && !implementableStandards.isEmpty();
      case RmOdpPackage.TV_SPEC__IXITS:
        return ixits != null && !ixits.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TV_specImpl
