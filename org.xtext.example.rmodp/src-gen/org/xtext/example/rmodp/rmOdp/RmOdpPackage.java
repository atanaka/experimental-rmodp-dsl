/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.rmodp.rmOdp.RmOdpFactory
 * @model kind="package"
 * @generated
 */
public interface RmOdpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rmOdp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/rmodp/RmOdp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rmOdp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RmOdpPackage eINSTANCE = org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ModelImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ModelElementImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.TypeImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.SimpleTypeImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__PROPERTIES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.EnumerationImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Value Items</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__VALUE_ITEMS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ImportImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 5;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.PackageDeclarationImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.SpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.SpecImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSpec()
   * @generated
   */
  int SPEC = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ObjectImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 8;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__OBJECT_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__SUPER_OBJECT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__PROPERTIES = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>State Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__STATE_MACHINE = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__INTERFACES = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Inner Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__INNER_OBJECTS = MODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Nv Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NV_OBJECT = MODEL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.PropertyImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__MANY = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.StateMachineImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 10;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__EVENTS = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__COMMANDS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__STATES = 2;

  /**
   * The number of structural features of the '<em>State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.EventImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.CommandImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.StateImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getState()
   * @generated
   */
  int STATE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>State Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.StateTransitionImpl <em>State Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.StateTransitionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStateTransition()
   * @generated
   */
  int STATE_TRANSITION = 14;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TRANSITION__STATE = 1;

  /**
   * The number of structural features of the '<em>State Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.InterfaceImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 15;

  /**
   * The feature id for the '<em><b>Interface Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__INTERFACE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 1;

  /**
   * The feature id for the '<em><b>Signature References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__SIGNATURE_REFERENCES = 2;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.SignatureReferenceImpl <em>Signature Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.SignatureReferenceImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSignatureReference()
   * @generated
   */
  int SIGNATURE_REFERENCE = 16;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_REFERENCE__ROLE = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_REFERENCE__REF = 1;

  /**
   * The number of structural features of the '<em>Signature Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.SignatureDefImpl <em>Signature Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.SignatureDefImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSignatureDef()
   * @generated
   */
  int SIGNATURE_DEF = 17;

  /**
   * The feature id for the '<em><b>Signature Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DEF__SIGNATURE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DEF__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DEF__PARAMS = 2;

  /**
   * The number of structural features of the '<em>Signature Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ParamImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getParam()
   * @generated
   */
  int PARAM = 18;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__DIRECTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__TYPE = 2;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.EV_specImpl <em>EV spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.EV_specImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEV_spec()
   * @generated
   */
  int EV_SPEC = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EV_SPEC__NAME = SPEC__NAME;

  /**
   * The feature id for the '<em><b>Foa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EV_SPEC__FOA = SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Global Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EV_SPEC__GLOBAL_OBJECTS = SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Community Contracts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EV_SPEC__COMMUNITY_CONTRACTS = SPEC_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>EV spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EV_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.CommunityContractImpl <em>Community Contract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.CommunityContractImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCommunityContract()
   * @generated
   */
  int COMMUNITY_CONTRACT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY_CONTRACT__NAME = 0;

  /**
   * The feature id for the '<em><b>Objective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY_CONTRACT__OBJECTIVE = 1;

  /**
   * The feature id for the '<em><b>Community</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY_CONTRACT__COMMUNITY = 2;

  /**
   * The number of structural features of the '<em>Community Contract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY_CONTRACT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl <em>Community</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.CommunityImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCommunity()
   * @generated
   */
  int COMMUNITY = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Local Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY__LOCAL_OBJECTS = 1;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY__ROLES = 2;

  /**
   * The feature id for the '<em><b>Or relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY__OR_RELATIONS = 3;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY__PROCESSES = 4;

  /**
   * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY__INTERACTIONS = 5;

  /**
   * The feature id for the '<em><b>Policies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY__POLICIES = 6;

  /**
   * The number of structural features of the '<em>Community</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNITY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.FieldOfApplicationImpl <em>Field Of Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.FieldOfApplicationImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getFieldOfApplication()
   * @generated
   */
  int FIELD_OF_APPLICATION = 22;

  /**
   * The feature id for the '<em><b>Foa</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OF_APPLICATION__FOA = 0;

  /**
   * The number of structural features of the '<em>Field Of Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OF_APPLICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectiveImpl <em>Objective</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ObjectiveImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjective()
   * @generated
   */
  int OBJECTIVE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Objective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE__OBJECTIVE = 1;

  /**
   * The feature id for the '<em><b>Subobj</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE__SUBOBJ = 2;

  /**
   * The number of structural features of the '<em>Objective</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECTIVE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.RoleImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRole()
   * @generated
   */
  int ROLE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__TARGET = 1;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.OR_RelationImpl <em>OR Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.OR_RelationImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getOR_Relation()
   * @generated
   */
  int OR_RELATION = 25;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_RELATION__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_RELATION__ROLE = 1;

  /**
   * The number of structural features of the '<em>OR Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ProcessImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Process Objective</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS_OBJECTIVE = 1;

  /**
   * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__LANES = 2;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.LaneImpl <em>Lane</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.LaneImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getLane()
   * @generated
   */
  int LANE = 27;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANE__ROLE = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANE__NODES = 1;

  /**
   * The number of structural features of the '<em>Lane</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.NodeImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getNode()
   * @generated
   */
  int NODE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.DecisionImpl <em>Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.DecisionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getDecision()
   * @generated
   */
  int DECISION = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Incomings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__INCOMINGS = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__OUTGOINGS = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.IncomingImpl <em>Incoming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.IncomingImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getIncoming()
   * @generated
   */
  int INCOMING = 30;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOMING__INCOMING = 0;

  /**
   * The feature id for the '<em><b>In Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOMING__IN_CONDITION = 1;

  /**
   * The number of structural features of the '<em>Incoming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.OutgoingImpl <em>Outgoing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.OutgoingImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getOutgoing()
   * @generated
   */
  int OUTGOING = 31;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING__OUTGOING = 0;

  /**
   * The feature id for the '<em><b>Out Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING__OUT_CONDITION = 1;

  /**
   * The number of structural features of the '<em>Outgoing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ActionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getAction()
   * @generated
   */
  int ACTION = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Incomings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__INCOMINGS = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__OUTGOINGS = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.SubprocessImpl <em>Subprocess</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.SubprocessImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSubprocess()
   * @generated
   */
  int SUBPROCESS = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROCESS__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Incomings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROCESS__INCOMINGS = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROCESS__OUTGOINGS = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subprocess</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROCESS_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.StartImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStart()
   * @generated
   */
  int START = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__OUTGOING = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.EndImpl <em>End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.EndImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEnd()
   * @generated
   */
  int END = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Incomings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END__INCOMINGS = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ArtefactImpl <em>Artefact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ArtefactImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getArtefact()
   * @generated
   */
  int ARTEFACT = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTEFACT__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTEFACT__INCOMING = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTEFACT__OUTGOING = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Artefact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTEFACT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl <em>Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.InteractionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInteraction()
   * @generated
   */
  int INTERACTION = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Process def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__PROCESS_DEF = 1;

  /**
   * The feature id for the '<em><b>Initiator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__INITIATOR = 2;

  /**
   * The feature id for the '<em><b>Initiator statemachine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__INITIATOR_STATEMACHINE = 3;

  /**
   * The feature id for the '<em><b>Responder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__RESPONDER = 4;

  /**
   * The feature id for the '<em><b>Responder statemachine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__RESPONDER_STATEMACHINE = 5;

  /**
   * The feature id for the '<em><b>Interaction Artefacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__INTERACTION_ARTEFACTS = 6;

  /**
   * The number of structural features of the '<em>Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.InteractionArtefactImpl <em>Interaction Artefact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.InteractionArtefactImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInteractionArtefact()
   * @generated
   */
  int INTERACTION_ARTEFACT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ARTEFACT__NAME = 0;

  /**
   * The feature id for the '<em><b>From Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ARTEFACT__FROM_ROLE = 1;

  /**
   * The feature id for the '<em><b>To Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ARTEFACT__TO_ROLE = 2;

  /**
   * The number of structural features of the '<em>Interaction Artefact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_ARTEFACT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl <em>Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.PolicyImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getPolicy()
   * @generated
   */
  int POLICY = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__NAME = 0;

  /**
   * The feature id for the '<em><b>Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__POLICY = 1;

  /**
   * The feature id for the '<em><b>Obligations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__OBLIGATIONS = 2;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PERMISSIONS = 3;

  /**
   * The feature id for the '<em><b>Prohibitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PROHIBITIONS = 4;

  /**
   * The feature id for the '<em><b>Process</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PROCESS = 5;

  /**
   * The feature id for the '<em><b>Affected Role</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__AFFECTED_ROLE = 6;

  /**
   * The feature id for the '<em><b>Affected Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__AFFECTED_PROCESS = 7;

  /**
   * The feature id for the '<em><b>Affected Interaction</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__AFFECTED_INTERACTION = 8;

  /**
   * The number of structural features of the '<em>Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl <em>Object Obligation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectObligation()
   * @generated
   */
  int OBJECT_OBLIGATION = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OBLIGATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OBLIGATION__INFORCE = 1;

  /**
   * The feature id for the '<em><b>Objo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OBLIGATION__OBJO = 2;

  /**
   * The feature id for the '<em><b>Object obligation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OBLIGATION__OBJECT_OBLIGATION = 3;

  /**
   * The number of structural features of the '<em>Object Obligation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OBLIGATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl <em>Role Obligation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRoleObligation()
   * @generated
   */
  int ROLE_OBLIGATION = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_OBLIGATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_OBLIGATION__INFORCE = 1;

  /**
   * The feature id for the '<em><b>Roleo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_OBLIGATION__ROLEO = 2;

  /**
   * The feature id for the '<em><b>Role obligation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_OBLIGATION__ROLE_OBLIGATION = 3;

  /**
   * The number of structural features of the '<em>Role Obligation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_OBLIGATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl <em>Object Permission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectPermission()
   * @generated
   */
  int OBJECT_PERMISSION = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PERMISSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PERMISSION__INFORCE = 1;

  /**
   * The feature id for the '<em><b>Objp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PERMISSION__OBJP = 2;

  /**
   * The feature id for the '<em><b>Object permission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PERMISSION__OBJECT_PERMISSION = 3;

  /**
   * The number of structural features of the '<em>Object Permission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PERMISSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.RolePermissionImpl <em>Role Permission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.RolePermissionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRolePermission()
   * @generated
   */
  int ROLE_PERMISSION = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION__INFORCE = 1;

  /**
   * The feature id for the '<em><b>Rolep</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION__ROLEP = 2;

  /**
   * The feature id for the '<em><b>Role permission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION__ROLE_PERMISSION = 3;

  /**
   * The number of structural features of the '<em>Role Permission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PERMISSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl <em>Object Prohibition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectProhibition()
   * @generated
   */
  int OBJECT_PROHIBITION = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROHIBITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROHIBITION__INFORCE = 1;

  /**
   * The feature id for the '<em><b>Objp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROHIBITION__OBJP = 2;

  /**
   * The feature id for the '<em><b>Object prohibition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROHIBITION__OBJECT_PROHIBITION = 3;

  /**
   * The number of structural features of the '<em>Object Prohibition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROHIBITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl <em>Role Prohibition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRoleProhibition()
   * @generated
   */
  int ROLE_PROHIBITION = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__INFORCE = 1;

  /**
   * The feature id for the '<em><b>Rolep</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__ROLEP = 2;

  /**
   * The feature id for the '<em><b>Role prohibition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__ROLE_PROHIBITION = 3;

  /**
   * The number of structural features of the '<em>Role Prohibition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.IV_specImpl <em>IV spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.IV_specImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getIV_spec()
   * @generated
   */
  int IV_SPEC = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IV_SPEC__NAME = SPEC__NAME;

  /**
   * The feature id for the '<em><b>Invariant Schema</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IV_SPEC__INVARIANT_SCHEMA = SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dynamic Schema</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IV_SPEC__DYNAMIC_SCHEMA = SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Static Schema</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IV_SPEC__STATIC_SCHEMA = SPEC_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>IV spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IV_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.InvariantSchemaImpl <em>Invariant Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.InvariantSchemaImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInvariantSchema()
   * @generated
   */
  int INVARIANT_SCHEMA = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_SCHEMA__NAME = 0;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_SCHEMA__OBJECTS = 1;

  /**
   * The feature id for the '<em><b>Action Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_SCHEMA__ACTION_TYPES = 2;

  /**
   * The number of structural features of the '<em>Invariant Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_SCHEMA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.DynamicSchemaImpl <em>Dynamic Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.DynamicSchemaImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getDynamicSchema()
   * @generated
   */
  int DYNAMIC_SCHEMA = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCHEMA__NAME = 0;

  /**
   * The feature id for the '<em><b>State Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCHEMA__STATE_MACHINE = 1;

  /**
   * The number of structural features of the '<em>Dynamic Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_SCHEMA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.StaticSchemaImpl <em>Static Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.StaticSchemaImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStaticSchema()
   * @generated
   */
  int STATIC_SCHEMA = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_SCHEMA__NAME = 0;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_SCHEMA__TIME = 1;

  /**
   * The feature id for the '<em><b>Object Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_SCHEMA__OBJECT_INSTANCES = 2;

  /**
   * The number of structural features of the '<em>Static Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_SCHEMA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ObjectInstanceImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectInstance()
   * @generated
   */
  int OBJECT_INSTANCE = 50;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INSTANCE__TYPE_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Property Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INSTANCE__PROPERTY_INSTANCES = 2;

  /**
   * The number of structural features of the '<em>Object Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.PropertyInstanceImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getPropertyInstance()
   * @generated
   */
  int PROPERTY_INSTANCE = 51;

  /**
   * The feature id for the '<em><b>Type Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_INSTANCE__TYPE_PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_INSTANCE__PROPERTY_VALUE = 1;

  /**
   * The number of structural features of the '<em>Property Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_INSTANCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ActionTypeImpl <em>Action Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ActionTypeImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getActionType()
   * @generated
   */
  int ACTION_TYPE = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Action Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__ACTION_TYPES = 1;

  /**
   * The number of structural features of the '<em>Action Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ActionPropertyImpl <em>Action Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ActionPropertyImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getActionProperty()
   * @generated
   */
  int ACTION_PROPERTY = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROPERTY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROPERTY__MANY = 2;

  /**
   * The number of structural features of the '<em>Action Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.CV_specImpl <em>CV spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.CV_specImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCV_spec()
   * @generated
   */
  int CV_SPEC = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CV_SPEC__NAME = SPEC__NAME;

  /**
   * The feature id for the '<em><b>Cdatatypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CV_SPEC__CDATATYPES = SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Signature Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CV_SPEC__SIGNATURE_DEFS = SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CV_SPEC__OBJECTS = SPEC_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>CV spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CV_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.NV_specImpl <em>NV spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.NV_specImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getNV_spec()
   * @generated
   */
  int NV_SPEC = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NV_SPEC__NAME = SPEC__NAME;

  /**
   * The feature id for the '<em><b>Host Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NV_SPEC__HOST_NODE = SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NV spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NV_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl <em>Host Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getHostNode()
   * @generated
   */
  int HOST_NODE = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_NODE__LINK = 1;

  /**
   * The feature id for the '<em><b>Signature Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_NODE__SIGNATURE_DEFS = 2;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_NODE__OBJECTS = 3;

  /**
   * The number of structural features of the '<em>Host Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_NODE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.LinkImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getLink()
   * @generated
   */
  int LINK = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__NAME = 0;

  /**
   * The feature id for the '<em><b>Host Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__HOST_NODE = 1;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.TV_specImpl <em>TV spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.TV_specImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getTV_spec()
   * @generated
   */
  int TV_SPEC = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TV_SPEC__NAME = SPEC__NAME;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TV_SPEC__OBJECTS = SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Implementable Standards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TV_SPEC__IMPLEMENTABLE_STANDARDS = SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ixits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TV_SPEC__IXITS = SPEC_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>TV spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TV_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.ImplementableStandardImpl <em>Implementable Standard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.ImplementableStandardImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getImplementableStandard()
   * @generated
   */
  int IMPLEMENTABLE_STANDARD = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTABLE_STANDARD__NAME = 0;

  /**
   * The number of structural features of the '<em>Implementable Standard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTABLE_STANDARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.IXITImpl <em>IXIT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.IXITImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getIXIT()
   * @generated
   */
  int IXIT = 60;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IXIT__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>IXIT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IXIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl <em>Corr spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCorr_spec()
   * @generated
   */
  int CORR_SPEC = 61;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORR_SPEC__NAME = SPEC__NAME;

  /**
   * The feature id for the '<em><b>Viewpoint1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORR_SPEC__VIEWPOINT1 = SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Endpoints1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORR_SPEC__ENDPOINTS1 = SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Viewpoint2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORR_SPEC__VIEWPOINT2 = SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Endpoints2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORR_SPEC__ENDPOINTS2 = SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORR_SPEC__DESCRIPTION = SPEC_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Corr spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORR_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.rmodp.rmOdp.impl.EndPointImpl <em>End Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.rmodp.rmOdp.impl.EndPointImpl
   * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEndPoint()
   * @generated
   */
  int END_POINT = 62;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_POINT__TYPE = 0;

  /**
   * The number of structural features of the '<em>End Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_POINT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.SimpleType#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SimpleType#getSuperType()
   * @see #getSimpleType()
   * @generated
   */
  EReference getSimpleType_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.SimpleType#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SimpleType#getProperties()
   * @see #getSimpleType()
   * @generated
   */
  EReference getSimpleType_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.rmodp.rmOdp.Enumeration#getValueItems <em>Value Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value Items</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Enumeration#getValueItems()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_ValueItems();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.xtext.example.rmodp.rmOdp.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.rmodp.rmOdp.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Spec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Spec
   * @generated
   */
  EClass getSpec();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Spec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Spec#getName()
   * @see #getSpec()
   * @generated
   */
  EAttribute getSpec_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Object#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getObjectType()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_ObjectType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Object#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Object#getSuperObject <em>Super Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Object</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getSuperObject()
   * @see #getObject()
   * @generated
   */
  EReference getObject_SuperObject();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Object#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getProperties()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Properties();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.rmodp.rmOdp.Object#getStateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Machine</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getStateMachine()
   * @see #getObject()
   * @generated
   */
  EReference getObject_StateMachine();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Object#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getInterfaces()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Interfaces();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Object#getInnerObjects <em>Inner Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Objects</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getInnerObjects()
   * @see #getObject()
   * @generated
   */
  EReference getObject_InnerObjects();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Object#getNvObject <em>Nv Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nv Object</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Object#getNvObject()
   * @see #getObject()
   * @generated
   */
  EReference getObject_NvObject();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Property#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Property#isMany()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Many();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.StateMachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StateMachine#getEvents()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.StateMachine#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StateMachine#getCommands()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.StateMachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StateMachine#getStates()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_States();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.example.rmodp.rmOdp.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.rmodp.rmOdp.State#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see org.xtext.example.rmodp.rmOdp.State#getActions()
   * @see #getState()
   * @generated
   */
  EReference getState_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.State#getStateTransitions <em>State Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Transitions</em>'.
   * @see org.xtext.example.rmodp.rmOdp.State#getStateTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_StateTransitions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.StateTransition <em>State Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Transition</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StateTransition
   * @generated
   */
  EClass getStateTransition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.StateTransition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StateTransition#getEvent()
   * @see #getStateTransition()
   * @generated
   */
  EReference getStateTransition_Event();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.StateTransition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StateTransition#getState()
   * @see #getStateTransition()
   * @generated
   */
  EReference getStateTransition_State();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Interface#getInterfaceType <em>Interface Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interface#getInterfaceType()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_InterfaceType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Interface#getSignatureReferences <em>Signature References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signature References</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interface#getSignatureReferences()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_SignatureReferences();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.SignatureReference <em>Signature Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature Reference</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SignatureReference
   * @generated
   */
  EClass getSignatureReference();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.SignatureReference#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SignatureReference#getRole()
   * @see #getSignatureReference()
   * @generated
   */
  EAttribute getSignatureReference_Role();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.SignatureReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SignatureReference#getRef()
   * @see #getSignatureReference()
   * @generated
   */
  EReference getSignatureReference_Ref();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.SignatureDef <em>Signature Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature Def</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SignatureDef
   * @generated
   */
  EClass getSignatureDef();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getSignatureType <em>Signature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signature Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SignatureDef#getSignatureType()
   * @see #getSignatureDef()
   * @generated
   */
  EAttribute getSignatureDef_SignatureType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SignatureDef#getName()
   * @see #getSignatureDef()
   * @generated
   */
  EAttribute getSignatureDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.SignatureDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.rmodp.rmOdp.SignatureDef#getParams()
   * @see #getSignatureDef()
   * @generated
   */
  EReference getSignatureDef_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Param#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Param#getDirection()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Param#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Param#getType()
   * @see #getParam()
   * @generated
   */
  EReference getParam_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.EV_spec <em>EV spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EV spec</em>'.
   * @see org.xtext.example.rmodp.rmOdp.EV_spec
   * @generated
   */
  EClass getEV_spec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.rmodp.rmOdp.EV_spec#getFoa <em>Foa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foa</em>'.
   * @see org.xtext.example.rmodp.rmOdp.EV_spec#getFoa()
   * @see #getEV_spec()
   * @generated
   */
  EReference getEV_spec_Foa();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.EV_spec#getGlobalObjects <em>Global Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Global Objects</em>'.
   * @see org.xtext.example.rmodp.rmOdp.EV_spec#getGlobalObjects()
   * @see #getEV_spec()
   * @generated
   */
  EReference getEV_spec_GlobalObjects();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.EV_spec#getCommunityContracts <em>Community Contracts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Community Contracts</em>'.
   * @see org.xtext.example.rmodp.rmOdp.EV_spec#getCommunityContracts()
   * @see #getEV_spec()
   * @generated
   */
  EReference getEV_spec_CommunityContracts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.CommunityContract <em>Community Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Community Contract</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CommunityContract
   * @generated
   */
  EClass getCommunityContract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CommunityContract#getName()
   * @see #getCommunityContract()
   * @generated
   */
  EAttribute getCommunityContract_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getObjective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Objective</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CommunityContract#getObjective()
   * @see #getCommunityContract()
   * @generated
   */
  EReference getCommunityContract_Objective();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.rmodp.rmOdp.CommunityContract#getCommunity <em>Community</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Community</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CommunityContract#getCommunity()
   * @see #getCommunityContract()
   * @generated
   */
  EReference getCommunityContract_Community();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Community <em>Community</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Community</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community
   * @generated
   */
  EClass getCommunity();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Community#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community#getName()
   * @see #getCommunity()
   * @generated
   */
  EAttribute getCommunity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Community#getLocalObjects <em>Local Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local Objects</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community#getLocalObjects()
   * @see #getCommunity()
   * @generated
   */
  EReference getCommunity_LocalObjects();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Community#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community#getRoles()
   * @see #getCommunity()
   * @generated
   */
  EReference getCommunity_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Community#getOr_relations <em>Or relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Or relations</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community#getOr_relations()
   * @see #getCommunity()
   * @generated
   */
  EReference getCommunity_Or_relations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Community#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community#getProcesses()
   * @see #getCommunity()
   * @generated
   */
  EReference getCommunity_Processes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Community#getInteractions <em>Interactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactions</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community#getInteractions()
   * @see #getCommunity()
   * @generated
   */
  EReference getCommunity_Interactions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Community#getPolicies <em>Policies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Policies</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Community#getPolicies()
   * @see #getCommunity()
   * @generated
   */
  EReference getCommunity_Policies();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.FieldOfApplication <em>Field Of Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Of Application</em>'.
   * @see org.xtext.example.rmodp.rmOdp.FieldOfApplication
   * @generated
   */
  EClass getFieldOfApplication();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.FieldOfApplication#getFoa <em>Foa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foa</em>'.
   * @see org.xtext.example.rmodp.rmOdp.FieldOfApplication#getFoa()
   * @see #getFieldOfApplication()
   * @generated
   */
  EAttribute getFieldOfApplication_Foa();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Objective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objective</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Objective
   * @generated
   */
  EClass getObjective();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Objective#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Objective#getName()
   * @see #getObjective()
   * @generated
   */
  EAttribute getObjective_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Objective#getObjective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Objective</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Objective#getObjective()
   * @see #getObjective()
   * @generated
   */
  EAttribute getObjective_Objective();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Objective#getSubobj <em>Subobj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subobj</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Objective#getSubobj()
   * @see #getObjective()
   * @generated
   */
  EReference getObjective_Subobj();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Role#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Role#getTarget()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Target();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.OR_Relation <em>OR Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OR Relation</em>'.
   * @see org.xtext.example.rmodp.rmOdp.OR_Relation
   * @generated
   */
  EClass getOR_Relation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.OR_Relation#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see org.xtext.example.rmodp.rmOdp.OR_Relation#getObject()
   * @see #getOR_Relation()
   * @generated
   */
  EReference getOR_Relation_Object();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.OR_Relation#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see org.xtext.example.rmodp.rmOdp.OR_Relation#getRole()
   * @see #getOR_Relation()
   * @generated
   */
  EReference getOR_Relation_Role();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Process#getProcessObjective <em>Process Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Process Objective</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Process#getProcessObjective()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_ProcessObjective();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Process#getLanes <em>Lanes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lanes</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Process#getLanes()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Lanes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Lane <em>Lane</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lane</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Lane
   * @generated
   */
  EClass getLane();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Lane#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Lane#getRole()
   * @see #getLane()
   * @generated
   */
  EReference getLane_Role();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Lane#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Lane#getNodes()
   * @see #getLane()
   * @generated
   */
  EReference getLane_Nodes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Decision
   * @generated
   */
  EClass getDecision();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Decision#getIncomings <em>Incomings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Incomings</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Decision#getIncomings()
   * @see #getDecision()
   * @generated
   */
  EReference getDecision_Incomings();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Decision#getOutgoings <em>Outgoings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoings</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Decision#getOutgoings()
   * @see #getDecision()
   * @generated
   */
  EReference getDecision_Outgoings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Incoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Incoming</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Incoming
   * @generated
   */
  EClass getIncoming();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.rmodp.rmOdp.Incoming#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Incoming#getIncoming()
   * @see #getIncoming()
   * @generated
   */
  EReference getIncoming_Incoming();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Incoming#getInCondition <em>In Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In Condition</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Incoming#getInCondition()
   * @see #getIncoming()
   * @generated
   */
  EAttribute getIncoming_InCondition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Outgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outgoing</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Outgoing
   * @generated
   */
  EClass getOutgoing();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.rmodp.rmOdp.Outgoing#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Outgoing#getOutgoing()
   * @see #getOutgoing()
   * @generated
   */
  EReference getOutgoing_Outgoing();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Outgoing#getOutCondition <em>Out Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Condition</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Outgoing#getOutCondition()
   * @see #getOutgoing()
   * @generated
   */
  EAttribute getOutgoing_OutCondition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Action#getIncomings <em>Incomings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Incomings</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Action#getIncomings()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Incomings();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Action#getOutgoings <em>Outgoings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoings</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Action#getOutgoings()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Outgoings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Subprocess <em>Subprocess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subprocess</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Subprocess
   * @generated
   */
  EClass getSubprocess();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Subprocess#getIncomings <em>Incomings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Incomings</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Subprocess#getIncomings()
   * @see #getSubprocess()
   * @generated
   */
  EReference getSubprocess_Incomings();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Subprocess#getOutgoings <em>Outgoings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoings</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Subprocess#getOutgoings()
   * @see #getSubprocess()
   * @generated
   */
  EReference getSubprocess_Outgoings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.rmodp.rmOdp.Start#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Start#getOutgoing()
   * @see #getStart()
   * @generated
   */
  EReference getStart_Outgoing();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End</em>'.
   * @see org.xtext.example.rmodp.rmOdp.End
   * @generated
   */
  EClass getEnd();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.End#getIncomings <em>Incomings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Incomings</em>'.
   * @see org.xtext.example.rmodp.rmOdp.End#getIncomings()
   * @see #getEnd()
   * @generated
   */
  EReference getEnd_Incomings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Artefact <em>Artefact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artefact</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Artefact
   * @generated
   */
  EClass getArtefact();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Artefact#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Incoming</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Artefact#getIncoming()
   * @see #getArtefact()
   * @generated
   */
  EReference getArtefact_Incoming();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Artefact#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outgoing</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Artefact#getOutgoing()
   * @see #getArtefact()
   * @generated
   */
  EReference getArtefact_Outgoing();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction
   * @generated
   */
  EClass getInteraction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Interaction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction#getName()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Interaction#getProcess_def <em>Process def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Process def</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction#getProcess_def()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Process_def();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Interaction#getInitiator <em>Initiator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initiator</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction#getInitiator()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Initiator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.rmodp.rmOdp.Interaction#getInitiator_statemachine <em>Initiator statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initiator statemachine</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction#getInitiator_statemachine()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Initiator_statemachine();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Interaction#getResponder <em>Responder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Responder</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction#getResponder()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Responder();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.rmodp.rmOdp.Interaction#getResponder_statemachine <em>Responder statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Responder statemachine</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction#getResponder_statemachine()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Responder_statemachine();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Interaction#getInteractionArtefacts <em>Interaction Artefacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Artefacts</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Interaction#getInteractionArtefacts()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_InteractionArtefacts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact <em>Interaction Artefact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Artefact</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InteractionArtefact
   * @generated
   */
  EClass getInteractionArtefact();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InteractionArtefact#getName()
   * @see #getInteractionArtefact()
   * @generated
   */
  EAttribute getInteractionArtefact_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getFromRole <em>From Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From Role</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InteractionArtefact#getFromRole()
   * @see #getInteractionArtefact()
   * @generated
   */
  EReference getInteractionArtefact_FromRole();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.InteractionArtefact#getToRole <em>To Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Role</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InteractionArtefact#getToRole()
   * @see #getInteractionArtefact()
   * @generated
   */
  EReference getInteractionArtefact_ToRole();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy
   * @generated
   */
  EClass getPolicy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Policy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getName()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Policy#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Policy</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getPolicy()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Policy();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Policy#getObligations <em>Obligations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Obligations</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getObligations()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Obligations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Policy#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Permissions</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getPermissions()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Permissions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Policy#getProhibitions <em>Prohibitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prohibitions</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getProhibitions()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Prohibitions();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Policy#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Process</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getProcess()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Process();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Policy#getAffectedRole <em>Affected Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Affected Role</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getAffectedRole()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_AffectedRole();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Policy#getAffectedProcess <em>Affected Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Affected Process</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getAffectedProcess()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_AffectedProcess();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Policy#getAffectedInteraction <em>Affected Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Affected Interaction</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Policy#getAffectedInteraction()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_AffectedInteraction();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation <em>Object Obligation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Obligation</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectObligation
   * @generated
   */
  EClass getObjectObligation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectObligation#getName()
   * @see #getObjectObligation()
   * @generated
   */
  EAttribute getObjectObligation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#isInforce <em>Inforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inforce</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectObligation#isInforce()
   * @see #getObjectObligation()
   * @generated
   */
  EAttribute getObjectObligation_Inforce();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getObjo <em>Objo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objo</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectObligation#getObjo()
   * @see #getObjectObligation()
   * @generated
   */
  EReference getObjectObligation_Objo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectObligation#getObject_obligation <em>Object obligation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object obligation</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectObligation#getObject_obligation()
   * @see #getObjectObligation()
   * @generated
   */
  EAttribute getObjectObligation_Object_obligation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.RoleObligation <em>Role Obligation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Obligation</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleObligation
   * @generated
   */
  EClass getRoleObligation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleObligation#getName()
   * @see #getRoleObligation()
   * @generated
   */
  EAttribute getRoleObligation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#isInforce <em>Inforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inforce</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleObligation#isInforce()
   * @see #getRoleObligation()
   * @generated
   */
  EAttribute getRoleObligation_Inforce();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getRoleo <em>Roleo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Roleo</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleObligation#getRoleo()
   * @see #getRoleObligation()
   * @generated
   */
  EReference getRoleObligation_Roleo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RoleObligation#getRole_obligation <em>Role obligation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role obligation</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleObligation#getRole_obligation()
   * @see #getRoleObligation()
   * @generated
   */
  EAttribute getRoleObligation_Role_obligation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ObjectPermission <em>Object Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Permission</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectPermission
   * @generated
   */
  EClass getObjectPermission();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectPermission#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectPermission#getName()
   * @see #getObjectPermission()
   * @generated
   */
  EAttribute getObjectPermission_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectPermission#isInforce <em>Inforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inforce</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectPermission#isInforce()
   * @see #getObjectPermission()
   * @generated
   */
  EAttribute getObjectPermission_Inforce();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.ObjectPermission#getObjp <em>Objp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objp</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectPermission#getObjp()
   * @see #getObjectPermission()
   * @generated
   */
  EReference getObjectPermission_Objp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectPermission#getObject_permission <em>Object permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object permission</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectPermission#getObject_permission()
   * @see #getObjectPermission()
   * @generated
   */
  EAttribute getObjectPermission_Object_permission();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.RolePermission <em>Role Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Permission</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RolePermission
   * @generated
   */
  EClass getRolePermission();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RolePermission#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RolePermission#getName()
   * @see #getRolePermission()
   * @generated
   */
  EAttribute getRolePermission_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RolePermission#isInforce <em>Inforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inforce</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RolePermission#isInforce()
   * @see #getRolePermission()
   * @generated
   */
  EAttribute getRolePermission_Inforce();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.RolePermission#getRolep <em>Rolep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rolep</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RolePermission#getRolep()
   * @see #getRolePermission()
   * @generated
   */
  EReference getRolePermission_Rolep();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RolePermission#getRole_permission <em>Role permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role permission</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RolePermission#getRole_permission()
   * @see #getRolePermission()
   * @generated
   */
  EAttribute getRolePermission_Role_permission();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition <em>Object Prohibition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Prohibition</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectProhibition
   * @generated
   */
  EClass getObjectProhibition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectProhibition#getName()
   * @see #getObjectProhibition()
   * @generated
   */
  EAttribute getObjectProhibition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#isInforce <em>Inforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inforce</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectProhibition#isInforce()
   * @see #getObjectProhibition()
   * @generated
   */
  EAttribute getObjectProhibition_Inforce();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObjp <em>Objp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objp</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObjp()
   * @see #getObjectProhibition()
   * @generated
   */
  EReference getObjectProhibition_Objp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObject_prohibition <em>Object prohibition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object prohibition</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectProhibition#getObject_prohibition()
   * @see #getObjectProhibition()
   * @generated
   */
  EAttribute getObjectProhibition_Object_prohibition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition <em>Role Prohibition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Prohibition</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleProhibition
   * @generated
   */
  EClass getRoleProhibition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleProhibition#getName()
   * @see #getRoleProhibition()
   * @generated
   */
  EAttribute getRoleProhibition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#isInforce <em>Inforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inforce</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleProhibition#isInforce()
   * @see #getRoleProhibition()
   * @generated
   */
  EAttribute getRoleProhibition_Inforce();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getRolep <em>Rolep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rolep</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleProhibition#getRolep()
   * @see #getRoleProhibition()
   * @generated
   */
  EReference getRoleProhibition_Rolep();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.RoleProhibition#getRole_prohibition <em>Role prohibition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role prohibition</em>'.
   * @see org.xtext.example.rmodp.rmOdp.RoleProhibition#getRole_prohibition()
   * @see #getRoleProhibition()
   * @generated
   */
  EAttribute getRoleProhibition_Role_prohibition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.IV_spec <em>IV spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IV spec</em>'.
   * @see org.xtext.example.rmodp.rmOdp.IV_spec
   * @generated
   */
  EClass getIV_spec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.IV_spec#getInvariantSchema <em>Invariant Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Invariant Schema</em>'.
   * @see org.xtext.example.rmodp.rmOdp.IV_spec#getInvariantSchema()
   * @see #getIV_spec()
   * @generated
   */
  EReference getIV_spec_InvariantSchema();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.IV_spec#getDynamicSchema <em>Dynamic Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dynamic Schema</em>'.
   * @see org.xtext.example.rmodp.rmOdp.IV_spec#getDynamicSchema()
   * @see #getIV_spec()
   * @generated
   */
  EReference getIV_spec_DynamicSchema();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.IV_spec#getStaticSchema <em>Static Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Schema</em>'.
   * @see org.xtext.example.rmodp.rmOdp.IV_spec#getStaticSchema()
   * @see #getIV_spec()
   * @generated
   */
  EReference getIV_spec_StaticSchema();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.InvariantSchema <em>Invariant Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariant Schema</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InvariantSchema
   * @generated
   */
  EClass getInvariantSchema();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.InvariantSchema#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InvariantSchema#getName()
   * @see #getInvariantSchema()
   * @generated
   */
  EAttribute getInvariantSchema_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.InvariantSchema#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InvariantSchema#getObjects()
   * @see #getInvariantSchema()
   * @generated
   */
  EReference getInvariantSchema_Objects();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.InvariantSchema#getActionTypes <em>Action Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Types</em>'.
   * @see org.xtext.example.rmodp.rmOdp.InvariantSchema#getActionTypes()
   * @see #getInvariantSchema()
   * @generated
   */
  EReference getInvariantSchema_ActionTypes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.DynamicSchema <em>Dynamic Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Schema</em>'.
   * @see org.xtext.example.rmodp.rmOdp.DynamicSchema
   * @generated
   */
  EClass getDynamicSchema();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.DynamicSchema#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.DynamicSchema#getName()
   * @see #getDynamicSchema()
   * @generated
   */
  EAttribute getDynamicSchema_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.rmodp.rmOdp.DynamicSchema#getStateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Machine</em>'.
   * @see org.xtext.example.rmodp.rmOdp.DynamicSchema#getStateMachine()
   * @see #getDynamicSchema()
   * @generated
   */
  EReference getDynamicSchema_StateMachine();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.StaticSchema <em>Static Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Schema</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StaticSchema
   * @generated
   */
  EClass getStaticSchema();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StaticSchema#getName()
   * @see #getStaticSchema()
   * @generated
   */
  EAttribute getStaticSchema_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StaticSchema#getTime()
   * @see #getStaticSchema()
   * @generated
   */
  EAttribute getStaticSchema_Time();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.StaticSchema#getObjectInstances <em>Object Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Instances</em>'.
   * @see org.xtext.example.rmodp.rmOdp.StaticSchema#getObjectInstances()
   * @see #getStaticSchema()
   * @generated
   */
  EReference getStaticSchema_ObjectInstances();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ObjectInstance <em>Object Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Instance</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectInstance
   * @generated
   */
  EClass getObjectInstance();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectInstance#getTypeName()
   * @see #getObjectInstance()
   * @generated
   */
  EReference getObjectInstance_TypeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectInstance#getName()
   * @see #getObjectInstance()
   * @generated
   */
  EAttribute getObjectInstance_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.ObjectInstance#getPropertyInstances <em>Property Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Instances</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ObjectInstance#getPropertyInstances()
   * @see #getObjectInstance()
   * @generated
   */
  EReference getObjectInstance_PropertyInstances();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.PropertyInstance <em>Property Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Instance</em>'.
   * @see org.xtext.example.rmodp.rmOdp.PropertyInstance
   * @generated
   */
  EClass getPropertyInstance();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.PropertyInstance#getTypeProperty <em>Type Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Property</em>'.
   * @see org.xtext.example.rmodp.rmOdp.PropertyInstance#getTypeProperty()
   * @see #getPropertyInstance()
   * @generated
   */
  EReference getPropertyInstance_TypeProperty();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.PropertyInstance#getPropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Value</em>'.
   * @see org.xtext.example.rmodp.rmOdp.PropertyInstance#getPropertyValue()
   * @see #getPropertyInstance()
   * @generated
   */
  EAttribute getPropertyInstance_PropertyValue();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ActionType
   * @generated
   */
  EClass getActionType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ActionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ActionType#getName()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.ActionType#getActionTypes <em>Action Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Types</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ActionType#getActionTypes()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_ActionTypes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ActionProperty <em>Action Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Property</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ActionProperty
   * @generated
   */
  EClass getActionProperty();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ActionProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ActionProperty#getName()
   * @see #getActionProperty()
   * @generated
   */
  EAttribute getActionProperty_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.ActionProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ActionProperty#getType()
   * @see #getActionProperty()
   * @generated
   */
  EReference getActionProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ActionProperty#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ActionProperty#isMany()
   * @see #getActionProperty()
   * @generated
   */
  EAttribute getActionProperty_Many();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.CV_spec <em>CV spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CV spec</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CV_spec
   * @generated
   */
  EClass getCV_spec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.CV_spec#getCdatatypes <em>Cdatatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cdatatypes</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CV_spec#getCdatatypes()
   * @see #getCV_spec()
   * @generated
   */
  EReference getCV_spec_Cdatatypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.CV_spec#getSignatureDefs <em>Signature Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signature Defs</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CV_spec#getSignatureDefs()
   * @see #getCV_spec()
   * @generated
   */
  EReference getCV_spec_SignatureDefs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.CV_spec#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see org.xtext.example.rmodp.rmOdp.CV_spec#getObjects()
   * @see #getCV_spec()
   * @generated
   */
  EReference getCV_spec_Objects();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.NV_spec <em>NV spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NV spec</em>'.
   * @see org.xtext.example.rmodp.rmOdp.NV_spec
   * @generated
   */
  EClass getNV_spec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.NV_spec#getHostNode <em>Host Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Host Node</em>'.
   * @see org.xtext.example.rmodp.rmOdp.NV_spec#getHostNode()
   * @see #getNV_spec()
   * @generated
   */
  EReference getNV_spec_HostNode();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.HostNode <em>Host Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Host Node</em>'.
   * @see org.xtext.example.rmodp.rmOdp.HostNode
   * @generated
   */
  EClass getHostNode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.HostNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.HostNode#getName()
   * @see #getHostNode()
   * @generated
   */
  EAttribute getHostNode_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.HostNode#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Link</em>'.
   * @see org.xtext.example.rmodp.rmOdp.HostNode#getLink()
   * @see #getHostNode()
   * @generated
   */
  EReference getHostNode_Link();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.HostNode#getSignatureDefs <em>Signature Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signature Defs</em>'.
   * @see org.xtext.example.rmodp.rmOdp.HostNode#getSignatureDefs()
   * @see #getHostNode()
   * @generated
   */
  EReference getHostNode_SignatureDefs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.HostNode#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see org.xtext.example.rmodp.rmOdp.HostNode#getObjects()
   * @see #getHostNode()
   * @generated
   */
  EReference getHostNode_Objects();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Link#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Link#getName()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.Link#getHostNode <em>Host Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Host Node</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Link#getHostNode()
   * @see #getLink()
   * @generated
   */
  EReference getLink_HostNode();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.TV_spec <em>TV spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TV spec</em>'.
   * @see org.xtext.example.rmodp.rmOdp.TV_spec
   * @generated
   */
  EClass getTV_spec();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.TV_spec#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see org.xtext.example.rmodp.rmOdp.TV_spec#getObjects()
   * @see #getTV_spec()
   * @generated
   */
  EReference getTV_spec_Objects();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.TV_spec#getImplementableStandards <em>Implementable Standards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implementable Standards</em>'.
   * @see org.xtext.example.rmodp.rmOdp.TV_spec#getImplementableStandards()
   * @see #getTV_spec()
   * @generated
   */
  EReference getTV_spec_ImplementableStandards();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.TV_spec#getIxits <em>Ixits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ixits</em>'.
   * @see org.xtext.example.rmodp.rmOdp.TV_spec#getIxits()
   * @see #getTV_spec()
   * @generated
   */
  EReference getTV_spec_Ixits();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.ImplementableStandard <em>Implementable Standard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementable Standard</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ImplementableStandard
   * @generated
   */
  EClass getImplementableStandard();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.ImplementableStandard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.rmodp.rmOdp.ImplementableStandard#getName()
   * @see #getImplementableStandard()
   * @generated
   */
  EAttribute getImplementableStandard_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.IXIT <em>IXIT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IXIT</em>'.
   * @see org.xtext.example.rmodp.rmOdp.IXIT
   * @generated
   */
  EClass getIXIT();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.IXIT#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.rmodp.rmOdp.IXIT#getDescription()
   * @see #getIXIT()
   * @generated
   */
  EAttribute getIXIT_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.Corr_spec <em>Corr spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corr spec</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Corr_spec
   * @generated
   */
  EClass getCorr_spec();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint1 <em>Viewpoint1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Viewpoint1</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint1()
   * @see #getCorr_spec()
   * @generated
   */
  EAttribute getCorr_spec_Viewpoint1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getEndpoints1 <em>Endpoints1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Endpoints1</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Corr_spec#getEndpoints1()
   * @see #getCorr_spec()
   * @generated
   */
  EReference getCorr_spec_Endpoints1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint2 <em>Viewpoint2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Viewpoint2</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Corr_spec#getViewpoint2()
   * @see #getCorr_spec()
   * @generated
   */
  EAttribute getCorr_spec_Viewpoint2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getEndpoints2 <em>Endpoints2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Endpoints2</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Corr_spec#getEndpoints2()
   * @see #getCorr_spec()
   * @generated
   */
  EReference getCorr_spec_Endpoints2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.rmodp.rmOdp.Corr_spec#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.rmodp.rmOdp.Corr_spec#getDescription()
   * @see #getCorr_spec()
   * @generated
   */
  EAttribute getCorr_spec_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.example.rmodp.rmOdp.EndPoint <em>End Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Point</em>'.
   * @see org.xtext.example.rmodp.rmOdp.EndPoint
   * @generated
   */
  EClass getEndPoint();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.rmodp.rmOdp.EndPoint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.rmodp.rmOdp.EndPoint#getType()
   * @see #getEndPoint()
   * @generated
   */
  EReference getEndPoint_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RmOdpFactory getRmOdpFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ModelImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ModelElementImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.TypeImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.SimpleTypeImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__SUPER_TYPE = eINSTANCE.getSimpleType_SuperType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE__PROPERTIES = eINSTANCE.getSimpleType_Properties();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.EnumerationImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Value Items</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__VALUE_ITEMS = eINSTANCE.getEnumeration_ValueItems();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ImportImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.PackageDeclarationImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.SpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.SpecImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSpec()
     * @generated
     */
    EClass SPEC = eINSTANCE.getSpec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC__NAME = eINSTANCE.getSpec_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ObjectImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__OBJECT_TYPE = eINSTANCE.getObject_ObjectType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

    /**
     * The meta object literal for the '<em><b>Super Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__SUPER_OBJECT = eINSTANCE.getObject_SuperObject();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__PROPERTIES = eINSTANCE.getObject_Properties();

    /**
     * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__STATE_MACHINE = eINSTANCE.getObject_StateMachine();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__INTERFACES = eINSTANCE.getObject_Interfaces();

    /**
     * The meta object literal for the '<em><b>Inner Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__INNER_OBJECTS = eINSTANCE.getObject_InnerObjects();

    /**
     * The meta object literal for the '<em><b>Nv Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__NV_OBJECT = eINSTANCE.getObject_NvObject();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.PropertyImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__MANY = eINSTANCE.getProperty_Many();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.StateMachineImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__EVENTS = eINSTANCE.getStateMachine_Events();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__COMMANDS = eINSTANCE.getStateMachine_Commands();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.EventImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.CommandImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.StateImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

    /**
     * The meta object literal for the '<em><b>State Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATE_TRANSITIONS = eINSTANCE.getState_StateTransitions();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.StateTransitionImpl <em>State Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.StateTransitionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStateTransition()
     * @generated
     */
    EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_TRANSITION__EVENT = eINSTANCE.getStateTransition_Event();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_TRANSITION__STATE = eINSTANCE.getStateTransition_State();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.InterfaceImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__INTERFACE_TYPE = eINSTANCE.getInterface_InterfaceType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Signature References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__SIGNATURE_REFERENCES = eINSTANCE.getInterface_SignatureReferences();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.SignatureReferenceImpl <em>Signature Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.SignatureReferenceImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSignatureReference()
     * @generated
     */
    EClass SIGNATURE_REFERENCE = eINSTANCE.getSignatureReference();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNATURE_REFERENCE__ROLE = eINSTANCE.getSignatureReference_Role();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE_REFERENCE__REF = eINSTANCE.getSignatureReference_Ref();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.SignatureDefImpl <em>Signature Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.SignatureDefImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSignatureDef()
     * @generated
     */
    EClass SIGNATURE_DEF = eINSTANCE.getSignatureDef();

    /**
     * The meta object literal for the '<em><b>Signature Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNATURE_DEF__SIGNATURE_TYPE = eINSTANCE.getSignatureDef_SignatureType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNATURE_DEF__NAME = eINSTANCE.getSignatureDef_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE_DEF__PARAMS = eINSTANCE.getSignatureDef_Params();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ParamImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__DIRECTION = eINSTANCE.getParam_Direction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__TYPE = eINSTANCE.getParam_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.EV_specImpl <em>EV spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.EV_specImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEV_spec()
     * @generated
     */
    EClass EV_SPEC = eINSTANCE.getEV_spec();

    /**
     * The meta object literal for the '<em><b>Foa</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EV_SPEC__FOA = eINSTANCE.getEV_spec_Foa();

    /**
     * The meta object literal for the '<em><b>Global Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EV_SPEC__GLOBAL_OBJECTS = eINSTANCE.getEV_spec_GlobalObjects();

    /**
     * The meta object literal for the '<em><b>Community Contracts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EV_SPEC__COMMUNITY_CONTRACTS = eINSTANCE.getEV_spec_CommunityContracts();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.CommunityContractImpl <em>Community Contract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.CommunityContractImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCommunityContract()
     * @generated
     */
    EClass COMMUNITY_CONTRACT = eINSTANCE.getCommunityContract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMUNITY_CONTRACT__NAME = eINSTANCE.getCommunityContract_Name();

    /**
     * The meta object literal for the '<em><b>Objective</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY_CONTRACT__OBJECTIVE = eINSTANCE.getCommunityContract_Objective();

    /**
     * The meta object literal for the '<em><b>Community</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY_CONTRACT__COMMUNITY = eINSTANCE.getCommunityContract_Community();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.CommunityImpl <em>Community</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.CommunityImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCommunity()
     * @generated
     */
    EClass COMMUNITY = eINSTANCE.getCommunity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMUNITY__NAME = eINSTANCE.getCommunity_Name();

    /**
     * The meta object literal for the '<em><b>Local Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY__LOCAL_OBJECTS = eINSTANCE.getCommunity_LocalObjects();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY__ROLES = eINSTANCE.getCommunity_Roles();

    /**
     * The meta object literal for the '<em><b>Or relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY__OR_RELATIONS = eINSTANCE.getCommunity_Or_relations();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY__PROCESSES = eINSTANCE.getCommunity_Processes();

    /**
     * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY__INTERACTIONS = eINSTANCE.getCommunity_Interactions();

    /**
     * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNITY__POLICIES = eINSTANCE.getCommunity_Policies();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.FieldOfApplicationImpl <em>Field Of Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.FieldOfApplicationImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getFieldOfApplication()
     * @generated
     */
    EClass FIELD_OF_APPLICATION = eINSTANCE.getFieldOfApplication();

    /**
     * The meta object literal for the '<em><b>Foa</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_OF_APPLICATION__FOA = eINSTANCE.getFieldOfApplication_Foa();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectiveImpl <em>Objective</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ObjectiveImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjective()
     * @generated
     */
    EClass OBJECTIVE = eINSTANCE.getObjective();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECTIVE__NAME = eINSTANCE.getObjective_Name();

    /**
     * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECTIVE__OBJECTIVE = eINSTANCE.getObjective_Objective();

    /**
     * The meta object literal for the '<em><b>Subobj</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECTIVE__SUBOBJ = eINSTANCE.getObjective_Subobj();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.RoleImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__TARGET = eINSTANCE.getRole_Target();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.OR_RelationImpl <em>OR Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.OR_RelationImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getOR_Relation()
     * @generated
     */
    EClass OR_RELATION = eINSTANCE.getOR_Relation();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_RELATION__OBJECT = eINSTANCE.getOR_Relation_Object();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_RELATION__ROLE = eINSTANCE.getOR_Relation_Role();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ProcessImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Process Objective</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PROCESS_OBJECTIVE = eINSTANCE.getProcess_ProcessObjective();

    /**
     * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__LANES = eINSTANCE.getProcess_Lanes();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.LaneImpl <em>Lane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.LaneImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getLane()
     * @generated
     */
    EClass LANE = eINSTANCE.getLane();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANE__ROLE = eINSTANCE.getLane_Role();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANE__NODES = eINSTANCE.getLane_Nodes();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.NodeImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.DecisionImpl <em>Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.DecisionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getDecision()
     * @generated
     */
    EClass DECISION = eINSTANCE.getDecision();

    /**
     * The meta object literal for the '<em><b>Incomings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION__INCOMINGS = eINSTANCE.getDecision_Incomings();

    /**
     * The meta object literal for the '<em><b>Outgoings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION__OUTGOINGS = eINSTANCE.getDecision_Outgoings();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.IncomingImpl <em>Incoming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.IncomingImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getIncoming()
     * @generated
     */
    EClass INCOMING = eINSTANCE.getIncoming();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCOMING__INCOMING = eINSTANCE.getIncoming_Incoming();

    /**
     * The meta object literal for the '<em><b>In Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCOMING__IN_CONDITION = eINSTANCE.getIncoming_InCondition();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.OutgoingImpl <em>Outgoing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.OutgoingImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getOutgoing()
     * @generated
     */
    EClass OUTGOING = eINSTANCE.getOutgoing();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTGOING__OUTGOING = eINSTANCE.getOutgoing_Outgoing();

    /**
     * The meta object literal for the '<em><b>Out Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTGOING__OUT_CONDITION = eINSTANCE.getOutgoing_OutCondition();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ActionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Incomings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__INCOMINGS = eINSTANCE.getAction_Incomings();

    /**
     * The meta object literal for the '<em><b>Outgoings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__OUTGOINGS = eINSTANCE.getAction_Outgoings();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.SubprocessImpl <em>Subprocess</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.SubprocessImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getSubprocess()
     * @generated
     */
    EClass SUBPROCESS = eINSTANCE.getSubprocess();

    /**
     * The meta object literal for the '<em><b>Incomings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBPROCESS__INCOMINGS = eINSTANCE.getSubprocess_Incomings();

    /**
     * The meta object literal for the '<em><b>Outgoings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBPROCESS__OUTGOINGS = eINSTANCE.getSubprocess_Outgoings();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.StartImpl <em>Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.StartImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStart()
     * @generated
     */
    EClass START = eINSTANCE.getStart();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__OUTGOING = eINSTANCE.getStart_Outgoing();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.EndImpl <em>End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.EndImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEnd()
     * @generated
     */
    EClass END = eINSTANCE.getEnd();

    /**
     * The meta object literal for the '<em><b>Incomings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference END__INCOMINGS = eINSTANCE.getEnd_Incomings();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ArtefactImpl <em>Artefact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ArtefactImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getArtefact()
     * @generated
     */
    EClass ARTEFACT = eINSTANCE.getArtefact();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTEFACT__INCOMING = eINSTANCE.getArtefact_Incoming();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTEFACT__OUTGOING = eINSTANCE.getArtefact_Outgoing();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.InteractionImpl <em>Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.InteractionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInteraction()
     * @generated
     */
    EClass INTERACTION = eINSTANCE.getInteraction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__NAME = eINSTANCE.getInteraction_Name();

    /**
     * The meta object literal for the '<em><b>Process def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__PROCESS_DEF = eINSTANCE.getInteraction_Process_def();

    /**
     * The meta object literal for the '<em><b>Initiator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__INITIATOR = eINSTANCE.getInteraction_Initiator();

    /**
     * The meta object literal for the '<em><b>Initiator statemachine</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__INITIATOR_STATEMACHINE = eINSTANCE.getInteraction_Initiator_statemachine();

    /**
     * The meta object literal for the '<em><b>Responder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__RESPONDER = eINSTANCE.getInteraction_Responder();

    /**
     * The meta object literal for the '<em><b>Responder statemachine</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__RESPONDER_STATEMACHINE = eINSTANCE.getInteraction_Responder_statemachine();

    /**
     * The meta object literal for the '<em><b>Interaction Artefacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__INTERACTION_ARTEFACTS = eINSTANCE.getInteraction_InteractionArtefacts();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.InteractionArtefactImpl <em>Interaction Artefact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.InteractionArtefactImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInteractionArtefact()
     * @generated
     */
    EClass INTERACTION_ARTEFACT = eINSTANCE.getInteractionArtefact();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_ARTEFACT__NAME = eINSTANCE.getInteractionArtefact_Name();

    /**
     * The meta object literal for the '<em><b>From Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_ARTEFACT__FROM_ROLE = eINSTANCE.getInteractionArtefact_FromRole();

    /**
     * The meta object literal for the '<em><b>To Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_ARTEFACT__TO_ROLE = eINSTANCE.getInteractionArtefact_ToRole();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.PolicyImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getPolicy()
     * @generated
     */
    EClass POLICY = eINSTANCE.getPolicy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

    /**
     * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__POLICY = eINSTANCE.getPolicy_Policy();

    /**
     * The meta object literal for the '<em><b>Obligations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__OBLIGATIONS = eINSTANCE.getPolicy_Obligations();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__PERMISSIONS = eINSTANCE.getPolicy_Permissions();

    /**
     * The meta object literal for the '<em><b>Prohibitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__PROHIBITIONS = eINSTANCE.getPolicy_Prohibitions();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__PROCESS = eINSTANCE.getPolicy_Process();

    /**
     * The meta object literal for the '<em><b>Affected Role</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__AFFECTED_ROLE = eINSTANCE.getPolicy_AffectedRole();

    /**
     * The meta object literal for the '<em><b>Affected Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__AFFECTED_PROCESS = eINSTANCE.getPolicy_AffectedProcess();

    /**
     * The meta object literal for the '<em><b>Affected Interaction</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__AFFECTED_INTERACTION = eINSTANCE.getPolicy_AffectedInteraction();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl <em>Object Obligation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ObjectObligationImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectObligation()
     * @generated
     */
    EClass OBJECT_OBLIGATION = eINSTANCE.getObjectObligation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_OBLIGATION__NAME = eINSTANCE.getObjectObligation_Name();

    /**
     * The meta object literal for the '<em><b>Inforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_OBLIGATION__INFORCE = eINSTANCE.getObjectObligation_Inforce();

    /**
     * The meta object literal for the '<em><b>Objo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_OBLIGATION__OBJO = eINSTANCE.getObjectObligation_Objo();

    /**
     * The meta object literal for the '<em><b>Object obligation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_OBLIGATION__OBJECT_OBLIGATION = eINSTANCE.getObjectObligation_Object_obligation();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl <em>Role Obligation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.RoleObligationImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRoleObligation()
     * @generated
     */
    EClass ROLE_OBLIGATION = eINSTANCE.getRoleObligation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_OBLIGATION__NAME = eINSTANCE.getRoleObligation_Name();

    /**
     * The meta object literal for the '<em><b>Inforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_OBLIGATION__INFORCE = eINSTANCE.getRoleObligation_Inforce();

    /**
     * The meta object literal for the '<em><b>Roleo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_OBLIGATION__ROLEO = eINSTANCE.getRoleObligation_Roleo();

    /**
     * The meta object literal for the '<em><b>Role obligation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_OBLIGATION__ROLE_OBLIGATION = eINSTANCE.getRoleObligation_Role_obligation();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl <em>Object Permission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ObjectPermissionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectPermission()
     * @generated
     */
    EClass OBJECT_PERMISSION = eINSTANCE.getObjectPermission();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PERMISSION__NAME = eINSTANCE.getObjectPermission_Name();

    /**
     * The meta object literal for the '<em><b>Inforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PERMISSION__INFORCE = eINSTANCE.getObjectPermission_Inforce();

    /**
     * The meta object literal for the '<em><b>Objp</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PERMISSION__OBJP = eINSTANCE.getObjectPermission_Objp();

    /**
     * The meta object literal for the '<em><b>Object permission</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PERMISSION__OBJECT_PERMISSION = eINSTANCE.getObjectPermission_Object_permission();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.RolePermissionImpl <em>Role Permission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.RolePermissionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRolePermission()
     * @generated
     */
    EClass ROLE_PERMISSION = eINSTANCE.getRolePermission();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_PERMISSION__NAME = eINSTANCE.getRolePermission_Name();

    /**
     * The meta object literal for the '<em><b>Inforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_PERMISSION__INFORCE = eINSTANCE.getRolePermission_Inforce();

    /**
     * The meta object literal for the '<em><b>Rolep</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_PERMISSION__ROLEP = eINSTANCE.getRolePermission_Rolep();

    /**
     * The meta object literal for the '<em><b>Role permission</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_PERMISSION__ROLE_PERMISSION = eINSTANCE.getRolePermission_Role_permission();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl <em>Object Prohibition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ObjectProhibitionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectProhibition()
     * @generated
     */
    EClass OBJECT_PROHIBITION = eINSTANCE.getObjectProhibition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROHIBITION__NAME = eINSTANCE.getObjectProhibition_Name();

    /**
     * The meta object literal for the '<em><b>Inforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROHIBITION__INFORCE = eINSTANCE.getObjectProhibition_Inforce();

    /**
     * The meta object literal for the '<em><b>Objp</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROHIBITION__OBJP = eINSTANCE.getObjectProhibition_Objp();

    /**
     * The meta object literal for the '<em><b>Object prohibition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROHIBITION__OBJECT_PROHIBITION = eINSTANCE.getObjectProhibition_Object_prohibition();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl <em>Role Prohibition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.RoleProhibitionImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getRoleProhibition()
     * @generated
     */
    EClass ROLE_PROHIBITION = eINSTANCE.getRoleProhibition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_PROHIBITION__NAME = eINSTANCE.getRoleProhibition_Name();

    /**
     * The meta object literal for the '<em><b>Inforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_PROHIBITION__INFORCE = eINSTANCE.getRoleProhibition_Inforce();

    /**
     * The meta object literal for the '<em><b>Rolep</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_PROHIBITION__ROLEP = eINSTANCE.getRoleProhibition_Rolep();

    /**
     * The meta object literal for the '<em><b>Role prohibition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_PROHIBITION__ROLE_PROHIBITION = eINSTANCE.getRoleProhibition_Role_prohibition();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.IV_specImpl <em>IV spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.IV_specImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getIV_spec()
     * @generated
     */
    EClass IV_SPEC = eINSTANCE.getIV_spec();

    /**
     * The meta object literal for the '<em><b>Invariant Schema</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IV_SPEC__INVARIANT_SCHEMA = eINSTANCE.getIV_spec_InvariantSchema();

    /**
     * The meta object literal for the '<em><b>Dynamic Schema</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IV_SPEC__DYNAMIC_SCHEMA = eINSTANCE.getIV_spec_DynamicSchema();

    /**
     * The meta object literal for the '<em><b>Static Schema</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IV_SPEC__STATIC_SCHEMA = eINSTANCE.getIV_spec_StaticSchema();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.InvariantSchemaImpl <em>Invariant Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.InvariantSchemaImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getInvariantSchema()
     * @generated
     */
    EClass INVARIANT_SCHEMA = eINSTANCE.getInvariantSchema();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVARIANT_SCHEMA__NAME = eINSTANCE.getInvariantSchema_Name();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVARIANT_SCHEMA__OBJECTS = eINSTANCE.getInvariantSchema_Objects();

    /**
     * The meta object literal for the '<em><b>Action Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVARIANT_SCHEMA__ACTION_TYPES = eINSTANCE.getInvariantSchema_ActionTypes();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.DynamicSchemaImpl <em>Dynamic Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.DynamicSchemaImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getDynamicSchema()
     * @generated
     */
    EClass DYNAMIC_SCHEMA = eINSTANCE.getDynamicSchema();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_SCHEMA__NAME = eINSTANCE.getDynamicSchema_Name();

    /**
     * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_SCHEMA__STATE_MACHINE = eINSTANCE.getDynamicSchema_StateMachine();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.StaticSchemaImpl <em>Static Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.StaticSchemaImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getStaticSchema()
     * @generated
     */
    EClass STATIC_SCHEMA = eINSTANCE.getStaticSchema();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_SCHEMA__NAME = eINSTANCE.getStaticSchema_Name();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_SCHEMA__TIME = eINSTANCE.getStaticSchema_Time();

    /**
     * The meta object literal for the '<em><b>Object Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_SCHEMA__OBJECT_INSTANCES = eINSTANCE.getStaticSchema_ObjectInstances();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ObjectInstanceImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getObjectInstance()
     * @generated
     */
    EClass OBJECT_INSTANCE = eINSTANCE.getObjectInstance();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_INSTANCE__TYPE_NAME = eINSTANCE.getObjectInstance_TypeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_INSTANCE__NAME = eINSTANCE.getObjectInstance_Name();

    /**
     * The meta object literal for the '<em><b>Property Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_INSTANCE__PROPERTY_INSTANCES = eINSTANCE.getObjectInstance_PropertyInstances();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.PropertyInstanceImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getPropertyInstance()
     * @generated
     */
    EClass PROPERTY_INSTANCE = eINSTANCE.getPropertyInstance();

    /**
     * The meta object literal for the '<em><b>Type Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_INSTANCE__TYPE_PROPERTY = eINSTANCE.getPropertyInstance_TypeProperty();

    /**
     * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_INSTANCE__PROPERTY_VALUE = eINSTANCE.getPropertyInstance_PropertyValue();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ActionTypeImpl <em>Action Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ActionTypeImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getActionType()
     * @generated
     */
    EClass ACTION_TYPE = eINSTANCE.getActionType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_TYPE__NAME = eINSTANCE.getActionType_Name();

    /**
     * The meta object literal for the '<em><b>Action Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_TYPE__ACTION_TYPES = eINSTANCE.getActionType_ActionTypes();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ActionPropertyImpl <em>Action Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ActionPropertyImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getActionProperty()
     * @generated
     */
    EClass ACTION_PROPERTY = eINSTANCE.getActionProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_PROPERTY__NAME = eINSTANCE.getActionProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_PROPERTY__TYPE = eINSTANCE.getActionProperty_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_PROPERTY__MANY = eINSTANCE.getActionProperty_Many();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.CV_specImpl <em>CV spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.CV_specImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCV_spec()
     * @generated
     */
    EClass CV_SPEC = eINSTANCE.getCV_spec();

    /**
     * The meta object literal for the '<em><b>Cdatatypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CV_SPEC__CDATATYPES = eINSTANCE.getCV_spec_Cdatatypes();

    /**
     * The meta object literal for the '<em><b>Signature Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CV_SPEC__SIGNATURE_DEFS = eINSTANCE.getCV_spec_SignatureDefs();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CV_SPEC__OBJECTS = eINSTANCE.getCV_spec_Objects();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.NV_specImpl <em>NV spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.NV_specImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getNV_spec()
     * @generated
     */
    EClass NV_SPEC = eINSTANCE.getNV_spec();

    /**
     * The meta object literal for the '<em><b>Host Node</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NV_SPEC__HOST_NODE = eINSTANCE.getNV_spec_HostNode();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl <em>Host Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.HostNodeImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getHostNode()
     * @generated
     */
    EClass HOST_NODE = eINSTANCE.getHostNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOST_NODE__NAME = eINSTANCE.getHostNode_Name();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOST_NODE__LINK = eINSTANCE.getHostNode_Link();

    /**
     * The meta object literal for the '<em><b>Signature Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOST_NODE__SIGNATURE_DEFS = eINSTANCE.getHostNode_SignatureDefs();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOST_NODE__OBJECTS = eINSTANCE.getHostNode_Objects();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.LinkImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__NAME = eINSTANCE.getLink_Name();

    /**
     * The meta object literal for the '<em><b>Host Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__HOST_NODE = eINSTANCE.getLink_HostNode();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.TV_specImpl <em>TV spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.TV_specImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getTV_spec()
     * @generated
     */
    EClass TV_SPEC = eINSTANCE.getTV_spec();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TV_SPEC__OBJECTS = eINSTANCE.getTV_spec_Objects();

    /**
     * The meta object literal for the '<em><b>Implementable Standards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TV_SPEC__IMPLEMENTABLE_STANDARDS = eINSTANCE.getTV_spec_ImplementableStandards();

    /**
     * The meta object literal for the '<em><b>Ixits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TV_SPEC__IXITS = eINSTANCE.getTV_spec_Ixits();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.ImplementableStandardImpl <em>Implementable Standard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.ImplementableStandardImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getImplementableStandard()
     * @generated
     */
    EClass IMPLEMENTABLE_STANDARD = eINSTANCE.getImplementableStandard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTABLE_STANDARD__NAME = eINSTANCE.getImplementableStandard_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.IXITImpl <em>IXIT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.IXITImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getIXIT()
     * @generated
     */
    EClass IXIT = eINSTANCE.getIXIT();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IXIT__DESCRIPTION = eINSTANCE.getIXIT_Description();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl <em>Corr spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.Corr_specImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getCorr_spec()
     * @generated
     */
    EClass CORR_SPEC = eINSTANCE.getCorr_spec();

    /**
     * The meta object literal for the '<em><b>Viewpoint1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORR_SPEC__VIEWPOINT1 = eINSTANCE.getCorr_spec_Viewpoint1();

    /**
     * The meta object literal for the '<em><b>Endpoints1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CORR_SPEC__ENDPOINTS1 = eINSTANCE.getCorr_spec_Endpoints1();

    /**
     * The meta object literal for the '<em><b>Viewpoint2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORR_SPEC__VIEWPOINT2 = eINSTANCE.getCorr_spec_Viewpoint2();

    /**
     * The meta object literal for the '<em><b>Endpoints2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CORR_SPEC__ENDPOINTS2 = eINSTANCE.getCorr_spec_Endpoints2();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORR_SPEC__DESCRIPTION = eINSTANCE.getCorr_spec_Description();

    /**
     * The meta object literal for the '{@link org.xtext.example.rmodp.rmOdp.impl.EndPointImpl <em>End Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.rmodp.rmOdp.impl.EndPointImpl
     * @see org.xtext.example.rmodp.rmOdp.impl.RmOdpPackageImpl#getEndPoint()
     * @generated
     */
    EClass END_POINT = eINSTANCE.getEndPoint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference END_POINT__TYPE = eINSTANCE.getEndPoint_Type();

  }

} //RmOdpPackage
