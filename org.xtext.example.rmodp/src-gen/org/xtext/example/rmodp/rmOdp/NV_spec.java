/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NV spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.rmodp.rmOdp.NV_spec#getHostNode <em>Host Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getNV_spec()
 * @model
 * @generated
 */
public interface NV_spec extends Spec
{
  /**
   * Returns the value of the '<em><b>Host Node</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.rmodp.rmOdp.HostNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host Node</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host Node</em>' containment reference list.
   * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage#getNV_spec_HostNode()
   * @model containment="true"
   * @generated
   */
  EList<HostNode> getHostNode();

} // NV_spec
