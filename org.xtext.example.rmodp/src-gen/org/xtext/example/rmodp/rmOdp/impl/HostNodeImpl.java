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

import org.xtext.example.rmodp.rmOdp.HostNode;
import org.xtext.example.rmodp.rmOdp.Link;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.SignatureDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl#getSignatureDefs <em>Signature Defs</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostNodeImpl extends MinimalEObjectImpl.Container implements HostNode
{
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
   * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected EList<Link> link;

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
  protected HostNodeImpl()
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
    return RmOdpPackage.Literals.HOST_NODE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.HOST_NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Link> getLink()
  {
    if (link == null)
    {
      link = new EObjectContainmentEList<Link>(Link.class, this, RmOdpPackage.HOST_NODE__LINK);
    }
    return link;
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
      signatureDefs = new EObjectContainmentEList<SignatureDef>(SignatureDef.class, this, RmOdpPackage.HOST_NODE__SIGNATURE_DEFS);
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
      objects = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Object>(org.xtext.example.rmodp.rmOdp.Object.class, this, RmOdpPackage.HOST_NODE__OBJECTS);
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
      case RmOdpPackage.HOST_NODE__LINK:
        return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.HOST_NODE__SIGNATURE_DEFS:
        return ((InternalEList<?>)getSignatureDefs()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.HOST_NODE__OBJECTS:
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
      case RmOdpPackage.HOST_NODE__NAME:
        return getName();
      case RmOdpPackage.HOST_NODE__LINK:
        return getLink();
      case RmOdpPackage.HOST_NODE__SIGNATURE_DEFS:
        return getSignatureDefs();
      case RmOdpPackage.HOST_NODE__OBJECTS:
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
      case RmOdpPackage.HOST_NODE__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.HOST_NODE__LINK:
        getLink().clear();
        getLink().addAll((Collection<? extends Link>)newValue);
        return;
      case RmOdpPackage.HOST_NODE__SIGNATURE_DEFS:
        getSignatureDefs().clear();
        getSignatureDefs().addAll((Collection<? extends SignatureDef>)newValue);
        return;
      case RmOdpPackage.HOST_NODE__OBJECTS:
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
      case RmOdpPackage.HOST_NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.HOST_NODE__LINK:
        getLink().clear();
        return;
      case RmOdpPackage.HOST_NODE__SIGNATURE_DEFS:
        getSignatureDefs().clear();
        return;
      case RmOdpPackage.HOST_NODE__OBJECTS:
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
      case RmOdpPackage.HOST_NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.HOST_NODE__LINK:
        return link != null && !link.isEmpty();
      case RmOdpPackage.HOST_NODE__SIGNATURE_DEFS:
        return signatureDefs != null && !signatureDefs.isEmpty();
      case RmOdpPackage.HOST_NODE__OBJECTS:
        return objects != null && !objects.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HostNodeImpl
