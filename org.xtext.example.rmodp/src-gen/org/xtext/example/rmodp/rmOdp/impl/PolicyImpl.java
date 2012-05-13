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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.rmodp.rmOdp.Interaction;
import org.xtext.example.rmodp.rmOdp.Policy;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getObligations <em>Obligations</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getProhibitions <em>Prohibitions</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getAffectedRole <em>Affected Role</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getAffectedProcess <em>Affected Process</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl#getAffectedInteraction <em>Affected Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy
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
   * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected static final String POLICY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected String policy = POLICY_EDEFAULT;

  /**
   * The cached value of the '{@link #getObligations() <em>Obligations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligations()
   * @generated
   * @ordered
   */
  protected EList<EObject> obligations;

  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<EObject> permissions;

  /**
   * The cached value of the '{@link #getProhibitions() <em>Prohibitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProhibitions()
   * @generated
   * @ordered
   */
  protected EList<EObject> prohibitions;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected org.xtext.example.rmodp.rmOdp.Process process;

  /**
   * The cached value of the '{@link #getAffectedRole() <em>Affected Role</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffectedRole()
   * @generated
   * @ordered
   */
  protected EList<Role> affectedRole;

  /**
   * The cached value of the '{@link #getAffectedProcess() <em>Affected Process</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffectedProcess()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.rmodp.rmOdp.Process> affectedProcess;

  /**
   * The cached value of the '{@link #getAffectedInteraction() <em>Affected Interaction</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffectedInteraction()
   * @generated
   * @ordered
   */
  protected EList<Interaction> affectedInteraction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolicyImpl()
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
    return RmOdpPackage.Literals.POLICY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPolicy()
  {
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicy(String newPolicy)
  {
    String oldPolicy = policy;
    policy = newPolicy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.POLICY__POLICY, oldPolicy, policy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getObligations()
  {
    if (obligations == null)
    {
      obligations = new EObjectContainmentEList<EObject>(EObject.class, this, RmOdpPackage.POLICY__OBLIGATIONS);
    }
    return obligations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EObjectContainmentEList<EObject>(EObject.class, this, RmOdpPackage.POLICY__PERMISSIONS);
    }
    return permissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getProhibitions()
  {
    if (prohibitions == null)
    {
      prohibitions = new EObjectContainmentEList<EObject>(EObject.class, this, RmOdpPackage.POLICY__PROHIBITIONS);
    }
    return prohibitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Process getProcess()
  {
    if (process != null && process.eIsProxy())
    {
      InternalEObject oldProcess = (InternalEObject)process;
      process = (org.xtext.example.rmodp.rmOdp.Process)eResolveProxy(oldProcess);
      if (process != oldProcess)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.POLICY__PROCESS, oldProcess, process));
      }
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Process basicGetProcess()
  {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcess(org.xtext.example.rmodp.rmOdp.Process newProcess)
  {
    org.xtext.example.rmodp.rmOdp.Process oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.POLICY__PROCESS, oldProcess, process));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getAffectedRole()
  {
    if (affectedRole == null)
    {
      affectedRole = new EObjectContainmentEList<Role>(Role.class, this, RmOdpPackage.POLICY__AFFECTED_ROLE);
    }
    return affectedRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.rmodp.rmOdp.Process> getAffectedProcess()
  {
    if (affectedProcess == null)
    {
      affectedProcess = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Process>(org.xtext.example.rmodp.rmOdp.Process.class, this, RmOdpPackage.POLICY__AFFECTED_PROCESS);
    }
    return affectedProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interaction> getAffectedInteraction()
  {
    if (affectedInteraction == null)
    {
      affectedInteraction = new EObjectContainmentEList<Interaction>(Interaction.class, this, RmOdpPackage.POLICY__AFFECTED_INTERACTION);
    }
    return affectedInteraction;
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
      case RmOdpPackage.POLICY__OBLIGATIONS:
        return ((InternalEList<?>)getObligations()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.POLICY__PERMISSIONS:
        return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.POLICY__PROHIBITIONS:
        return ((InternalEList<?>)getProhibitions()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.POLICY__AFFECTED_ROLE:
        return ((InternalEList<?>)getAffectedRole()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.POLICY__AFFECTED_PROCESS:
        return ((InternalEList<?>)getAffectedProcess()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.POLICY__AFFECTED_INTERACTION:
        return ((InternalEList<?>)getAffectedInteraction()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.POLICY__NAME:
        return getName();
      case RmOdpPackage.POLICY__POLICY:
        return getPolicy();
      case RmOdpPackage.POLICY__OBLIGATIONS:
        return getObligations();
      case RmOdpPackage.POLICY__PERMISSIONS:
        return getPermissions();
      case RmOdpPackage.POLICY__PROHIBITIONS:
        return getProhibitions();
      case RmOdpPackage.POLICY__PROCESS:
        if (resolve) return getProcess();
        return basicGetProcess();
      case RmOdpPackage.POLICY__AFFECTED_ROLE:
        return getAffectedRole();
      case RmOdpPackage.POLICY__AFFECTED_PROCESS:
        return getAffectedProcess();
      case RmOdpPackage.POLICY__AFFECTED_INTERACTION:
        return getAffectedInteraction();
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
      case RmOdpPackage.POLICY__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.POLICY__POLICY:
        setPolicy((String)newValue);
        return;
      case RmOdpPackage.POLICY__OBLIGATIONS:
        getObligations().clear();
        getObligations().addAll((Collection<? extends EObject>)newValue);
        return;
      case RmOdpPackage.POLICY__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends EObject>)newValue);
        return;
      case RmOdpPackage.POLICY__PROHIBITIONS:
        getProhibitions().clear();
        getProhibitions().addAll((Collection<? extends EObject>)newValue);
        return;
      case RmOdpPackage.POLICY__PROCESS:
        setProcess((org.xtext.example.rmodp.rmOdp.Process)newValue);
        return;
      case RmOdpPackage.POLICY__AFFECTED_ROLE:
        getAffectedRole().clear();
        getAffectedRole().addAll((Collection<? extends Role>)newValue);
        return;
      case RmOdpPackage.POLICY__AFFECTED_PROCESS:
        getAffectedProcess().clear();
        getAffectedProcess().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Process>)newValue);
        return;
      case RmOdpPackage.POLICY__AFFECTED_INTERACTION:
        getAffectedInteraction().clear();
        getAffectedInteraction().addAll((Collection<? extends Interaction>)newValue);
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
      case RmOdpPackage.POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.POLICY__POLICY:
        setPolicy(POLICY_EDEFAULT);
        return;
      case RmOdpPackage.POLICY__OBLIGATIONS:
        getObligations().clear();
        return;
      case RmOdpPackage.POLICY__PERMISSIONS:
        getPermissions().clear();
        return;
      case RmOdpPackage.POLICY__PROHIBITIONS:
        getProhibitions().clear();
        return;
      case RmOdpPackage.POLICY__PROCESS:
        setProcess((org.xtext.example.rmodp.rmOdp.Process)null);
        return;
      case RmOdpPackage.POLICY__AFFECTED_ROLE:
        getAffectedRole().clear();
        return;
      case RmOdpPackage.POLICY__AFFECTED_PROCESS:
        getAffectedProcess().clear();
        return;
      case RmOdpPackage.POLICY__AFFECTED_INTERACTION:
        getAffectedInteraction().clear();
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
      case RmOdpPackage.POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.POLICY__POLICY:
        return POLICY_EDEFAULT == null ? policy != null : !POLICY_EDEFAULT.equals(policy);
      case RmOdpPackage.POLICY__OBLIGATIONS:
        return obligations != null && !obligations.isEmpty();
      case RmOdpPackage.POLICY__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
      case RmOdpPackage.POLICY__PROHIBITIONS:
        return prohibitions != null && !prohibitions.isEmpty();
      case RmOdpPackage.POLICY__PROCESS:
        return process != null;
      case RmOdpPackage.POLICY__AFFECTED_ROLE:
        return affectedRole != null && !affectedRole.isEmpty();
      case RmOdpPackage.POLICY__AFFECTED_PROCESS:
        return affectedProcess != null && !affectedProcess.isEmpty();
      case RmOdpPackage.POLICY__AFFECTED_INTERACTION:
        return affectedInteraction != null && !affectedInteraction.isEmpty();
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
    result.append(", policy: ");
    result.append(policy);
    result.append(')');
    return result.toString();
  }

} //PolicyImpl
