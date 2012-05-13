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

import org.xtext.example.rmodp.rmOdp.Artefact;
import org.xtext.example.rmodp.rmOdp.Node;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ArtefactImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.impl.ArtefactImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtefactImpl extends NodeImpl implements Artefact
{
  /**
   * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncoming()
   * @generated
   * @ordered
   */
  protected Node incoming;

  /**
   * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoing()
   * @generated
   * @ordered
   */
  protected Node outgoing;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtefactImpl()
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
    return RmOdpPackage.Literals.ARTEFACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getIncoming()
  {
    if (incoming != null && incoming.eIsProxy())
    {
      InternalEObject oldIncoming = (InternalEObject)incoming;
      incoming = (Node)eResolveProxy(oldIncoming);
      if (incoming != oldIncoming)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.ARTEFACT__INCOMING, oldIncoming, incoming));
      }
    }
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetIncoming()
  {
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncoming(Node newIncoming)
  {
    Node oldIncoming = incoming;
    incoming = newIncoming;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ARTEFACT__INCOMING, oldIncoming, incoming));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getOutgoing()
  {
    if (outgoing != null && outgoing.eIsProxy())
    {
      InternalEObject oldOutgoing = (InternalEObject)outgoing;
      outgoing = (Node)eResolveProxy(oldOutgoing);
      if (outgoing != oldOutgoing)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmOdpPackage.ARTEFACT__OUTGOING, oldOutgoing, outgoing));
      }
    }
    return outgoing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetOutgoing()
  {
    return outgoing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutgoing(Node newOutgoing)
  {
    Node oldOutgoing = outgoing;
    outgoing = newOutgoing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RmOdpPackage.ARTEFACT__OUTGOING, oldOutgoing, outgoing));
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
      case RmOdpPackage.ARTEFACT__INCOMING:
        if (resolve) return getIncoming();
        return basicGetIncoming();
      case RmOdpPackage.ARTEFACT__OUTGOING:
        if (resolve) return getOutgoing();
        return basicGetOutgoing();
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
      case RmOdpPackage.ARTEFACT__INCOMING:
        setIncoming((Node)newValue);
        return;
      case RmOdpPackage.ARTEFACT__OUTGOING:
        setOutgoing((Node)newValue);
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
      case RmOdpPackage.ARTEFACT__INCOMING:
        setIncoming((Node)null);
        return;
      case RmOdpPackage.ARTEFACT__OUTGOING:
        setOutgoing((Node)null);
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
      case RmOdpPackage.ARTEFACT__INCOMING:
        return incoming != null;
      case RmOdpPackage.ARTEFACT__OUTGOING:
        return outgoing != null;
    }
    return super.eIsSet(featureID);
  }

} //ArtefactImpl
