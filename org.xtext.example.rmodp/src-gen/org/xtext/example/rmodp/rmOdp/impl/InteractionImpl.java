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

import org.xtext.example.rmodp.rmOdp.Interaction;
import org.xtext.example.rmodp.rmOdp.InteractionArtefact;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.Role;
import org.xtext.example.rmodp.rmOdp.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl#getProcess_def <em>Process def</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl#getInitiator_statemachine <em>Initiator statemachine</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl#getResponder <em>Responder</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl#getResponder_statemachine <em>Responder statemachine</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl#getInteractionArtefacts <em>Interaction Artefacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends MinimalEObjectImpl.Container implements Interaction
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
   * The cached value of the '{@link #getProcess_def() <em>Process def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess_def()
   * @generated
   * @ordered
   */
  protected org.xtext.example.rmodp.rmOdp.Process process_def;

  /**
   * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitiator()
   * @generated
   * @ordered
   */
  protected Role initiator;

  /**
   * The cached value of the '{@link #getInitiator_statemachine() <em>Initiator statemachine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitiator_statemachine()
   * @generated
   * @ordered
   */
  protected StateMachine initiator_statemachine;

  /**
   * The cached value of the '{@link #getResponder() <em>Responder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponder()
   * @generated
   * @ordered
   */
  protected Role responder;

  /**
   * The cached value of the '{@link #getResponder_statemachine() <em>Responder statemachine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponder_statemachine()
   * @generated
   * @ordered
   */
  protected StateMachine responder_statemachine;

  /**
   * The cached value of the '{@link #getInteractionArtefacts() <em>Interaction Artefacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionArtefacts()
   * @generated
   * @ordered
   */
  protected EList<InteractionArtefact> interactionArtefacts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionImpl()
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
    return RmOdpPackage.Literals.INTERACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Process getProcess_def()
  {
    if (process_def != null && process_def.eIsProxy())
    {
      InternalEObject oldProcess_def = (InternalEObject)process_def;
      process_def = (org.xtext.example.rmodp.rmOdp.Process)eResolveProxy(oldProcess_def);
      if (process_def != oldProcess_def)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.INTERACTION__PROCESS_DEF, oldProcess_def, process_def));
      }
    }
    return process_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Process basicGetProcess_def()
  {
    return process_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcess_def(org.xtext.example.rmodp.rmOdp.Process newProcess_def)
  {
    org.xtext.example.rmodp.rmOdp.Process oldProcess_def = process_def;
    process_def = newProcess_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__PROCESS_DEF, oldProcess_def, process_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getInitiator()
  {
    if (initiator != null && initiator.eIsProxy())
    {
      InternalEObject oldInitiator = (InternalEObject)initiator;
      initiator = (Role)eResolveProxy(oldInitiator);
      if (initiator != oldInitiator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.INTERACTION__INITIATOR, oldInitiator, initiator));
      }
    }
    return initiator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetInitiator()
  {
    return initiator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitiator(Role newInitiator)
  {
    Role oldInitiator = initiator;
    initiator = newInitiator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__INITIATOR, oldInitiator, initiator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine getInitiator_statemachine()
  {
    return initiator_statemachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitiator_statemachine(StateMachine newInitiator_statemachine, NotificationChain msgs)
  {
    StateMachine oldInitiator_statemachine = initiator_statemachine;
    initiator_statemachine = newInitiator_statemachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE, oldInitiator_statemachine, newInitiator_statemachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitiator_statemachine(StateMachine newInitiator_statemachine)
  {
    if (newInitiator_statemachine != initiator_statemachine)
    {
      NotificationChain msgs = null;
      if (initiator_statemachine != null)
        msgs = ((InternalEObject)initiator_statemachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE, null, msgs);
      if (newInitiator_statemachine != null)
        msgs = ((InternalEObject)newInitiator_statemachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE, null, msgs);
      msgs = basicSetInitiator_statemachine(newInitiator_statemachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE, newInitiator_statemachine, newInitiator_statemachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getResponder()
  {
    if (responder != null && responder.eIsProxy())
    {
      InternalEObject oldResponder = (InternalEObject)responder;
      responder = (Role)eResolveProxy(oldResponder);
      if (responder != oldResponder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.INTERACTION__RESPONDER, oldResponder, responder));
      }
    }
    return responder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetResponder()
  {
    return responder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponder(Role newResponder)
  {
    Role oldResponder = responder;
    responder = newResponder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__RESPONDER, oldResponder, responder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine getResponder_statemachine()
  {
    return responder_statemachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponder_statemachine(StateMachine newResponder_statemachine, NotificationChain msgs)
  {
    StateMachine oldResponder_statemachine = responder_statemachine;
    responder_statemachine = newResponder_statemachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE, oldResponder_statemachine, newResponder_statemachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponder_statemachine(StateMachine newResponder_statemachine)
  {
    if (newResponder_statemachine != responder_statemachine)
    {
      NotificationChain msgs = null;
      if (responder_statemachine != null)
        msgs = ((InternalEObject)responder_statemachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE, null, msgs);
      if (newResponder_statemachine != null)
        msgs = ((InternalEObject)newResponder_statemachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE, null, msgs);
      msgs = basicSetResponder_statemachine(newResponder_statemachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE, newResponder_statemachine, newResponder_statemachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionArtefact> getInteractionArtefacts()
  {
    if (interactionArtefacts == null)
    {
      interactionArtefacts = new EObjectContainmentEList<InteractionArtefact>(InteractionArtefact.class, this, RmOdpPackage.INTERACTION__INTERACTION_ARTEFACTS);
    }
    return interactionArtefacts;
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
      case RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE:
        return basicSetInitiator_statemachine(null, msgs);
      case RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE:
        return basicSetResponder_statemachine(null, msgs);
      case RmOdpPackage.INTERACTION__INTERACTION_ARTEFACTS:
        return ((InternalEList<?>)getInteractionArtefacts()).basicRemove(otherEnd, msgs);
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
      case RmOdpPackage.INTERACTION__NAME:
        return getName();
      case RmOdpPackage.INTERACTION__PROCESS_DEF:
        if (resolve) return getProcess_def();
        return basicGetProcess_def();
      case RmOdpPackage.INTERACTION__INITIATOR:
        if (resolve) return getInitiator();
        return basicGetInitiator();
      case RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE:
        return getInitiator_statemachine();
      case RmOdpPackage.INTERACTION__RESPONDER:
        if (resolve) return getResponder();
        return basicGetResponder();
      case RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE:
        return getResponder_statemachine();
      case RmOdpPackage.INTERACTION__INTERACTION_ARTEFACTS:
        return getInteractionArtefacts();
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
      case RmOdpPackage.INTERACTION__NAME:
        setName((String)newValue);
        return;
      case RmOdpPackage.INTERACTION__PROCESS_DEF:
        setProcess_def((org.xtext.example.rmodp.rmOdp.Process)newValue);
        return;
      case RmOdpPackage.INTERACTION__INITIATOR:
        setInitiator((Role)newValue);
        return;
      case RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE:
        setInitiator_statemachine((StateMachine)newValue);
        return;
      case RmOdpPackage.INTERACTION__RESPONDER:
        setResponder((Role)newValue);
        return;
      case RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE:
        setResponder_statemachine((StateMachine)newValue);
        return;
      case RmOdpPackage.INTERACTION__INTERACTION_ARTEFACTS:
        getInteractionArtefacts().clear();
        getInteractionArtefacts().addAll((Collection<? extends InteractionArtefact>)newValue);
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
      case RmOdpPackage.INTERACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RmOdpPackage.INTERACTION__PROCESS_DEF:
        setProcess_def((org.xtext.example.rmodp.rmOdp.Process)null);
        return;
      case RmOdpPackage.INTERACTION__INITIATOR:
        setInitiator((Role)null);
        return;
      case RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE:
        setInitiator_statemachine((StateMachine)null);
        return;
      case RmOdpPackage.INTERACTION__RESPONDER:
        setResponder((Role)null);
        return;
      case RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE:
        setResponder_statemachine((StateMachine)null);
        return;
      case RmOdpPackage.INTERACTION__INTERACTION_ARTEFACTS:
        getInteractionArtefacts().clear();
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
      case RmOdpPackage.INTERACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RmOdpPackage.INTERACTION__PROCESS_DEF:
        return process_def != null;
      case RmOdpPackage.INTERACTION__INITIATOR:
        return initiator != null;
      case RmOdpPackage.INTERACTION__INITIATOR_STATEMACHINE:
        return initiator_statemachine != null;
      case RmOdpPackage.INTERACTION__RESPONDER:
        return responder != null;
      case RmOdpPackage.INTERACTION__RESPONDER_STATEMACHINE:
        return responder_statemachine != null;
      case RmOdpPackage.INTERACTION__INTERACTION_ARTEFACTS:
        return interactionArtefacts != null && !interactionArtefacts.isEmpty();
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

} //InteractionImpl
