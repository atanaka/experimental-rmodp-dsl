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

import org.xtext.example.rmodp.rmOdp.CV_spec;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.SignatureDef;
import org.xtext.example.rmodp.rmOdp.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CV spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CV_specImpl#getCdatatypes <em>Cdatatypes</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CV_specImpl#getSignatureDefs <em>Signature Defs</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CV_specImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CV_specImpl extends SpecImpl implements CV_spec
{
  /**
   * The cached value of the '{@link #getCdatatypes() <em>Cdatatypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCdatatypes()
   * @generated
   * @ordered
   */
  protected EList<Type> cdatatypes;

  /**
   * The cached value of the '{@link #getSignatureDefs() <em>Signature Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignatureDefs()
   * @generated
   * @ordered
   */
  protected EList<SignatureDef> signatureDefs;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CV_specImpl()
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
    return RmOdpPackage.Literals.CV_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getCdatatypes()
  {
    if (cdatatypes == null)
    {
      cdatatypes = new EObjectContainmentEList<Type>(Type.class, this, RmOdpPackage.CV_SPEC__CDATATYPES);
    }
    return cdatatypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SignatureDef> getSignatureDefs()
  {
    if (signatureDefs == null)
    {
      signatureDefs = new EObjectContainmentEList<SignatureDef>(SignatureDef.class, this, RmOdpPackage.CV_SPEC__SIGNATURE_DEFS);
    }
    return signatureDefs;
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
      objects = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Object>(org.xtext.example.rmodp.rmOdp.Object.class, this, RmOdpPackage.CV_SPEC__OBJECTS);
    }
    return objects;
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
      case RmOdpPackage.CV_SPEC__CDATATYPES:
        return ((InternalEList<?>)getCdatatypes()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.CV_SPEC__SIGNATURE_DEFS:
        return ((InternalEList<?>)getSignatureDefs()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.CV_SPEC__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.CV_SPEC__CDATATYPES:
        return getCdatatypes();
      case RmOdpPackage.CV_SPEC__SIGNATURE_DEFS:
        return getSignatureDefs();
      case RmOdpPackage.CV_SPEC__OBJECTS:
        return getObjects();
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
      case RmOdpPackage.CV_SPEC__CDATATYPES:
        getCdatatypes().clear();
        getCdatatypes().addAll((Collection<? extends Type>)newValue);
        return;
      case RmOdpPackage.CV_SPEC__SIGNATURE_DEFS:
        getSignatureDefs().clear();
        getSignatureDefs().addAll((Collection<? extends SignatureDef>)newValue);
        return;
      case RmOdpPackage.CV_SPEC__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Object>)newValue);
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
      case RmOdpPackage.CV_SPEC__CDATATYPES:
        getCdatatypes().clear();
        return;
      case RmOdpPackage.CV_SPEC__SIGNATURE_DEFS:
        getSignatureDefs().clear();
        return;
      case RmOdpPackage.CV_SPEC__OBJECTS:
        getObjects().clear();
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
      case RmOdpPackage.CV_SPEC__CDATATYPES:
        return cdatatypes != null && !cdatatypes.isEmpty();
      case RmOdpPackage.CV_SPEC__SIGNATURE_DEFS:
        return signatureDefs != null && !signatureDefs.isEmpty();
      case RmOdpPackage.CV_SPEC__OBJECTS:
        return objects != null && !objects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CV_specImpl
