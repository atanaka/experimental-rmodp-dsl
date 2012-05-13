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

import org.xtext.example.rmodp.rmOdp.DynamicSchema;
import org.xtext.example.rmodp.rmOdp.IV_spec;
import org.xtext.example.rmodp.rmOdp.InvariantSchema;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.StaticSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IV spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.IV_specImpl#getInvariantSchema <em>Invariant Schema</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.IV_specImpl#getDynamicSchema <em>Dynamic Schema</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.IV_specImpl#getStaticSchema <em>Static Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IV_specImpl extends SpecImpl implements IV_spec
{
  /**
   * The cached value of the '{@link #getInvariantSchema() <em>Invariant Schema</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariantSchema()
   * @generated
   * @ordered
   */
  protected EList<InvariantSchema> invariantSchema;

  /**
   * The cached value of the '{@link #getDynamicSchema() <em>Dynamic Schema</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynamicSchema()
   * @generated
   * @ordered
   */
  protected EList<DynamicSchema> dynamicSchema;

  /**
   * The cached value of the '{@link #getStaticSchema() <em>Static Schema</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticSchema()
   * @generated
   * @ordered
   */
  protected EList<StaticSchema> staticSchema;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IV_specImpl()
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
    return RmOdpPackage.Literals.IV_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InvariantSchema> getInvariantSchema()
  {
    if (invariantSchema == null)
    {
      invariantSchema = new EObjectContainmentEList<InvariantSchema>(InvariantSchema.class, this, RmOdpPackage.IV_SPEC__INVARIANT_SCHEMA);
    }
    return invariantSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DynamicSchema> getDynamicSchema()
  {
    if (dynamicSchema == null)
    {
      dynamicSchema = new EObjectContainmentEList<DynamicSchema>(DynamicSchema.class, this, RmOdpPackage.IV_SPEC__DYNAMIC_SCHEMA);
    }
    return dynamicSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StaticSchema> getStaticSchema()
  {
    if (staticSchema == null)
    {
      staticSchema = new EObjectContainmentEList<StaticSchema>(StaticSchema.class, this, RmOdpPackage.IV_SPEC__STATIC_SCHEMA);
    }
    return staticSchema;
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
      case RmOdpPackage.IV_SPEC__INVARIANT_SCHEMA:
        return ((InternalEList<?>)getInvariantSchema()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.IV_SPEC__DYNAMIC_SCHEMA:
        return ((InternalEList<?>)getDynamicSchema()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.IV_SPEC__STATIC_SCHEMA:
        return ((InternalEList<?>)getStaticSchema()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.IV_SPEC__INVARIANT_SCHEMA:
        return getInvariantSchema();
      case RmOdpPackage.IV_SPEC__DYNAMIC_SCHEMA:
        return getDynamicSchema();
      case RmOdpPackage.IV_SPEC__STATIC_SCHEMA:
        return getStaticSchema();
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
      case RmOdpPackage.IV_SPEC__INVARIANT_SCHEMA:
        getInvariantSchema().clear();
        getInvariantSchema().addAll((Collection<? extends InvariantSchema>)newValue);
        return;
      case RmOdpPackage.IV_SPEC__DYNAMIC_SCHEMA:
        getDynamicSchema().clear();
        getDynamicSchema().addAll((Collection<? extends DynamicSchema>)newValue);
        return;
      case RmOdpPackage.IV_SPEC__STATIC_SCHEMA:
        getStaticSchema().clear();
        getStaticSchema().addAll((Collection<? extends StaticSchema>)newValue);
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
      case RmOdpPackage.IV_SPEC__INVARIANT_SCHEMA:
        getInvariantSchema().clear();
        return;
      case RmOdpPackage.IV_SPEC__DYNAMIC_SCHEMA:
        getDynamicSchema().clear();
        return;
      case RmOdpPackage.IV_SPEC__STATIC_SCHEMA:
        getStaticSchema().clear();
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
      case RmOdpPackage.IV_SPEC__INVARIANT_SCHEMA:
        return invariantSchema != null && !invariantSchema.isEmpty();
      case RmOdpPackage.IV_SPEC__DYNAMIC_SCHEMA:
        return dynamicSchema != null && !dynamicSchema.isEmpty();
      case RmOdpPackage.IV_SPEC__STATIC_SCHEMA:
        return staticSchema != null && !staticSchema.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IV_specImpl
