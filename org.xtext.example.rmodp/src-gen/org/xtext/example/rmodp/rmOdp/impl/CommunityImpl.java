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

import org.xtext.example.rmodp.rmOdp.Community;
import org.xtext.example.rmodp.rmOdp.Interaction;
import org.xtext.example.rmodp.rmOdp.OR_Relation;
import org.xtext.example.rmodp.rmOdp.Policy;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Community</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl#getLocalObjects <em>Local Objects</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl#getOr_relations <em>Or relations</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl#getPolicies <em>Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunityImpl extends MinimalEObjectImpl.Container implements Community
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
   * The cached value of the '{@link #getLocalObjects() <em>Local Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalObjects()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.rmodp.rmOdp.Object> localObjects;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getOr_relations() <em>Or relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr_relations()
   * @generated
   * @ordered
   */
  protected EList<OR_Relation> or_relations;

  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.rmodp.rmOdp.Process> processes;

  /**
   * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractions()
   * @generated
   * @ordered
   */
  protected EList<Interaction> interactions;

  /**
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EList<Policy> policies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommunityImpl()
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
    return RmOdpPackage.Literals.COMMUNITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.COMMUNITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.rmodp.rmOdp.Object> getLocalObjects()
  {
    if (localObjects == null)
    {
      localObjects = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Object>(org.xtext.example.rmodp.rmOdp.Object.class, this, RmOdpPackage.COMMUNITY__LOCAL_OBJECTS);
    }
    return localObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<Role>(Role.class, this, RmOdpPackage.COMMUNITY__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OR_Relation> getOr_relations()
  {
    if (or_relations == null)
    {
      or_relations = new EObjectContainmentEList<OR_Relation>(OR_Relation.class, this, RmOdpPackage.COMMUNITY__OR_RELATIONS);
    }
    return or_relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.rmodp.rmOdp.Process> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectContainmentEList<org.xtext.example.rmodp.rmOdp.Process>(org.xtext.example.rmodp.rmOdp.Process.class, this, RmOdpPackage.COMMUNITY__PROCESSES);
    }
    return processes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interaction> getInteractions()
  {
    if (interactions == null)
    {
      interactions = new EObjectContainmentEList<Interaction>(Interaction.class, this, RmOdpPackage.COMMUNITY__INTERACTIONS);
    }
    return interactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Policy> getPolicies()
  {
    if (policies == null)
    {
      policies = new EObjectContainmentEList<Policy>(Policy.class, this, RmOdpPackage.COMMUNITY__POLICIES);
    }
    return policies;
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
      case RmOdpPackage.COMMUNITY__LOCAL_OBJECTS:
        return ((InternalEList<?>)getLocalObjects()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.COMMUNITY__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.COMMUNITY__OR_RELATIONS:
        return ((InternalEList<?>)getOr_relations()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.COMMUNITY__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.COMMUNITY__INTERACTIONS:
        return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
      case RmOdpPackage.COMMUNITY__POLICIES:
        return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.COMMUNITY__NAME:
        return getName();
      case RmOdpPackage.COMMUNITY__LOCAL_OBJECTS:
        return getLocalObjects();
      case RmOdpPackage.COMMUNITY__ROLES:
        return getRoles();
      case RmOdpPackage.COMMUNITY__OR_RELATIONS:
        return getOr_relations();
      case RmOdpPackage.COMMUNITY__PROCESSES:
        return getProcesses();
      case RmOdpPackage.COMMUNITY__INTERACTIONS:
        return getInteractions();
      case RmOdpPackage.COMMUNITY__POLICIES:
        return getPolicies();
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
      case RmOdpPackage.COMMUNITY__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.COMMUNITY__LOCAL_OBJECTS:
        getLocalObjects().clear();
        getLocalObjects().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Object>)newValue);
        return;
      case RmOdpPackage.COMMUNITY__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case RmOdpPackage.COMMUNITY__OR_RELATIONS:
        getOr_relations().clear();
        getOr_relations().addAll((Collection<? extends OR_Relation>)newValue);
        return;
      case RmOdpPackage.COMMUNITY__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends org.xtext.example.rmodp.rmOdp.Process>)newValue);
        return;
      case RmOdpPackage.COMMUNITY__INTERACTIONS:
        getInteractions().clear();
        getInteractions().addAll((Collection<? extends Interaction>)newValue);
        return;
      case RmOdpPackage.COMMUNITY__POLICIES:
        getPolicies().clear();
        getPolicies().addAll((Collection<? extends Policy>)newValue);
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
      case RmOdpPackage.COMMUNITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.COMMUNITY__LOCAL_OBJECTS:
        getLocalObjects().clear();
        return;
      case RmOdpPackage.COMMUNITY__ROLES:
        getRoles().clear();
        return;
      case RmOdpPackage.COMMUNITY__OR_RELATIONS:
        getOr_relations().clear();
        return;
      case RmOdpPackage.COMMUNITY__PROCESSES:
        getProcesses().clear();
        return;
      case RmOdpPackage.COMMUNITY__INTERACTIONS:
        getInteractions().clear();
        return;
      case RmOdpPackage.COMMUNITY__POLICIES:
        getPolicies().clear();
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
      case RmOdpPackage.COMMUNITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.COMMUNITY__LOCAL_OBJECTS:
        return localObjects != null && !localObjects.isEmpty();
      case RmOdpPackage.COMMUNITY__ROLES:
        return roles != null && !roles.isEmpty();
      case RmOdpPackage.COMMUNITY__OR_RELATIONS:
        return or_relations != null && !or_relations.isEmpty();
      case RmOdpPackage.COMMUNITY__PROCESSES:
        return processes != null && !processes.isEmpty();
      case RmOdpPackage.COMMUNITY__INTERACTIONS:
        return interactions != null && !interactions.isEmpty();
      case RmOdpPackage.COMMUNITY__POLICIES:
        return policies != null && !policies.isEmpty();
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

} //CommunityImpl
