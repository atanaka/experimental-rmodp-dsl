/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.rmodp.rmOdp.InteractionArtefact;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Artefact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionArtefactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionArtefactImpl#getFromRole <em>From Role</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionArtefactImpl#getToRole <em>To Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionArtefactImpl extends MinimalEObjectImpl.Container implements InteractionArtefact
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
   * The cached value of the '{@link #getFromRole() <em>From Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromRole()
   * @generated
   * @ordered
   */
  protected Role fromRole;

  /**
   * The cached value of the '{@link #getToRole() <em>To Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToRole()
   * @generated
   * @ordered
   */
  protected Role toRole;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionArtefactImpl()
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
    return RmOdpPackage.Literals.INTERACTION_ARTEFACT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION_ARTEFACT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getFromRole()
  {
    if (fromRole != null && fromRole.eIsProxy())
    {
      InternalEObject oldFromRole = (InternalEObject)fromRole;
      fromRole = (Role)eResolveProxy(oldFromRole);
      if (fromRole != oldFromRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.INTERACTION_ARTEFACT__FROM_ROLE, oldFromRole, fromRole));
      }
    }
    return fromRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetFromRole()
  {
    return fromRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromRole(Role newFromRole)
  {
    Role oldFromRole = fromRole;
    fromRole = newFromRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION_ARTEFACT__FROM_ROLE, oldFromRole, fromRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getToRole()
  {
    if (toRole != null && toRole.eIsProxy())
    {
      InternalEObject oldToRole = (InternalEObject)toRole;
      toRole = (Role)eResolveProxy(oldToRole);
      if (toRole != oldToRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.INTERACTION_ARTEFACT__TO_ROLE, oldToRole, toRole));
      }
    }
    return toRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetToRole()
  {
    return toRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToRole(Role newToRole)
  {
    Role oldToRole = toRole;
    toRole = newToRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION_ARTEFACT__TO_ROLE, oldToRole, toRole));
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
      case RmOdpPackage.INTERACTION_ARTEFACT__NAME:
        return getName();
      case RmOdpPackage.INTERACTION_ARTEFACT__FROM_ROLE:
        if (resolve) return getFromRole();
        return basicGetFromRole();
      case RmOdpPackage.INTERACTION_ARTEFACT__TO_ROLE:
        if (resolve) return getToRole();
        return basicGetToRole();
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
      case RmOdpPackage.INTERACTION_ARTEFACT__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.INTERACTION_ARTEFACT__FROM_ROLE:
        setFromRole((Role)newValue);
        return;
      case RmOdpPackage.INTERACTION_ARTEFACT__TO_ROLE:
        setToRole((Role)newValue);
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
      case RmOdpPackage.INTERACTION_ARTEFACT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.INTERACTION_ARTEFACT__FROM_ROLE:
        setFromRole((Role)null);
        return;
      case RmOdpPackage.INTERACTION_ARTEFACT__TO_ROLE:
        setToRole((Role)null);
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
      case RmOdpPackage.INTERACTION_ARTEFACT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.INTERACTION_ARTEFACT__FROM_ROLE:
        return fromRole != null;
      case RmOdpPackage.INTERACTION_ARTEFACT__TO_ROLE:
        return toRole != null;
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

} //InteractionArtefactImpl
