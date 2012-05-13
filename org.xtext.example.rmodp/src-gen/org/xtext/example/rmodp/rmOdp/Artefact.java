/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Artefact#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.Artefact#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getArtefact()
 * @model
 * @generated
 */
public interface Artefact extends Node
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference.
   * @see #setIncoming(Node)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getArtefact_Incoming()
   * @model
   * @generated
   */
  Node getIncoming();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Artefact#getIncoming <em>Incoming</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Incoming</em>' reference.
   * @see #getIncoming()
   * @generated
   */
  void setIncoming(Node value);

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference.
   * @see #setOutgoing(Node)
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getArtefact_Outgoing()
   * @model
   * @generated
   */
  Node getOutgoing();

  /**
   * Sets the value of the '{@link org.xtext.example.rmodp.rmOdp.Artefact#getOutgoing <em>Outgoing</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outgoing</em>' reference.
   * @see #getOutgoing()
   * @generated
   */
  void setOutgoing(Node value);

} // Artefact
