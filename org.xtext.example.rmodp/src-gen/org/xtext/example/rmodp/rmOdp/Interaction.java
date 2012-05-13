/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interaction#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interaction#getProcess_def <em>Process def</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interaction#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interaction#getInitiator_statemachine <em>Initiator statemachine</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interaction#getResponder <em>Responder</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interaction#getResponder_statemachine <em>Responder statemachine</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Interaction#getInteractionArtefacts <em>Interaction Artefacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interaction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Process def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process def</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process def</em>' reference.
   * @see #setProcess_def(org.xtext.example.rmodp.rmOdp.Process)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction_Process_def()
   * @model
   * @generated
   */
  org.xtext.example.rmodp.rmOdp.Process getProcess_def();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interaction#getProcess_def <em>Process def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process def</em>' reference.
   * @see #getProcess_def()
   * @generated
   */
  void setProcess_def(org.xtext.example.rmodp.rmOdp.Process value);

  /**
   * Returns the value of the '<em><b>Initiator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initiator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initiator</em>' reference.
   * @see #setInitiator(Role)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction_Initiator()
   * @model
   * @generated
   */
  Role getInitiator();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interaction#getInitiator <em>Initiator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initiator</em>' reference.
   * @see #getInitiator()
   * @generated
   */
  void setInitiator(Role value);

  /**
   * Returns the value of the '<em><b>Initiator statemachine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initiator statemachine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initiator statemachine</em>' containment reference.
   * @see #setInitiator_statemachine(StateMachine)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction_Initiator_statemachine()
   * @model containment="true"
   * @generated
   */
  StateMachine getInitiator_statemachine();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interaction#getInitiator_statemachine <em>Initiator statemachine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initiator statemachine</em>' containment reference.
   * @see #getInitiator_statemachine()
   * @generated
   */
  void setInitiator_statemachine(StateMachine value);

  /**
   * Returns the value of the '<em><b>Responder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responder</em>' reference.
   * @see #setResponder(Role)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction_Responder()
   * @model
   * @generated
   */
  Role getResponder();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interaction#getResponder <em>Responder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responder</em>' reference.
   * @see #getResponder()
   * @generated
   */
  void setResponder(Role value);

  /**
   * Returns the value of the '<em><b>Responder statemachine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responder statemachine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responder statemachine</em>' containment reference.
   * @see #setResponder_statemachine(StateMachine)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction_Responder_statemachine()
   * @model containment="true"
   * @generated
   */
  StateMachine getResponder_statemachine();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Interaction#getResponder_statemachine <em>Responder statemachine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responder statemachine</em>' containment reference.
   * @see #getResponder_statemachine()
   * @generated
   */
  void setResponder_statemachine(StateMachine value);

  /**
   * Returns the value of the '<em><b>Interaction Artefacts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.InteractionArtefact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Artefacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Artefacts</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getInteraction_InteractionArtefacts()
   * @model containment="true"
   * @generated
   */
  EList<InteractionArtefact> getInteractionArtefacts();

} // Interaction
