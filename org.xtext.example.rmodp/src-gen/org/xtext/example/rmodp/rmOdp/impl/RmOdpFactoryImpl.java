/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.rmodp.rmOdp.Action;
import org.xtext.example.rmodp.rmOdp.ActionProperty;
import org.xtext.example.rmodp.rmOdp.ActionType;
import org.xtext.example.rmodp.rmOdp.Artefact;
import org.xtext.example.rmodp.rmOdp.CV_spec;
import org.xtext.example.rmodp.rmOdp.Command;
import org.xtext.example.rmodp.rmOdp.Community;
import org.xtext.example.rmodp.rmOdp.CommunityContract;
import org.xtext.example.rmodp.rmOdp.Corr_spec;
import org.xtext.example.rmodp.rmOdp.Decision;
import org.xtext.example.rmodp.rmOdp.DynamicSchema;
import org.xtext.example.rmodp.rmOdp.EV_spec;
import org.xtext.example.rmodp.rmOdp.End;
import org.xtext.example.rmodp.rmOdp.EndPoint;
import org.xtext.example.rmodp.rmOdp.Enumeration;
import org.xtext.example.rmodp.rmOdp.Event;
import org.xtext.example.rmodp.rmOdp.FieldOfApplication;
import org.xtext.example.rmodp.rmOdp.HostNode;
import org.xtext.example.rmodp.rmOdp.IV_spec;
import org.xtext.example.rmodp.rmOdp.IXIT;
import org.xtext.example.rmodp.rmOdp.ImplementableStandard;
import org.xtext.example.rmodp.rmOdp.Import;
import org.xtext.example.rmodp.rmOdp.Incoming;
import org.xtext.example.rmodp.rmOdp.Interaction;
import org.xtext.example.rmodp.rmOdp.InteractionArtefact;
import org.xtext.example.rmodp.rmOdp.Interface;
import org.xtext.example.rmodp.rmOdp.InvariantSchema;
import org.xtext.example.rmodp.rmOdp.Lane;
import org.xtext.example.rmodp.rmOdp.Link;
import org.xtext.example.rmodp.rmOdp.Model;
import org.xtext.example.rmodp.rmOdp.ModelElement;
import org.xtext.example.rmodp.rmOdp.NV_spec;
import org.xtext.example.rmodp.rmOdp.Node;
import org.xtext.example.rmodp.rmOdp.OR_Relation;
import org.xtext.example.rmodp.rmOdp.ObjectInstance;
import org.xtext.example.rmodp.rmOdp.ObjectObligation;
import org.xtext.example.rmodp.rmOdp.ObjectPermission;
import org.xtext.example.rmodp.rmOdp.ObjectProhibition;
import org.xtext.example.rmodp.rmOdp.Objective;
import org.xtext.example.rmodp.rmOdp.Outgoing;
import org.xtext.example.rmodp.rmOdp.PackageDeclaration;
import org.xtext.example.rmodp.rmOdp.Param;
import org.xtext.example.rmodp.rmOdp.Policy;
import org.xtext.example.rmodp.rmOdp.Property;
import org.xtext.example.rmodp.rmOdp.PropertyInstance;
import org.xtext.example.rmodp.rmOdp.RmOdpFactory;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.Role;
import org.xtext.example.rmodp.rmOdp.RoleObligation;
import org.xtext.example.rmodp.rmOdp.RolePermission;
import org.xtext.example.rmodp.rmOdp.RoleProhibition;
import org.xtext.example.rmodp.rmOdp.SignatureDef;
import org.xtext.example.rmodp.rmOdp.SignatureReference;
import org.xtext.example.rmodp.rmOdp.SimpleType;
import org.xtext.example.rmodp.rmOdp.Spec;
import org.xtext.example.rmodp.rmOdp.Start;
import org.xtext.example.rmodp.rmOdp.State;
import org.xtext.example.rmodp.rmOdp.StateMachine;
import org.xtext.example.rmodp.rmOdp.StateTransition;
import org.xtext.example.rmodp.rmOdp.StaticSchema;
import org.xtext.example.rmodp.rmOdp.Subprocess;
import org.xtext.example.rmodp.rmOdp.TV_spec;
import org.xtext.example.rmodp.rmOdp.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RmOdpFactoryImpl extends EFactoryImpl implements RmOdpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RmOdpFactory init()
  {
    try
    {
      RmOdpFactory theRmOdpFactory = (RmOdpFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/rmodp/RmOdp"); 
      if (theRmOdpFactory != null)
      {
        return theRmOdpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RmOdpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RmOdpFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RmOdpPackage.MODEL: return createModel();
      case RmOdpPackage.MODEL_ELEMENT: return createModelElement();
      case RmOdpPackage.TYPE: return createType();
      case RmOdpPackage.SIMPLE_TYPE: return createSimpleType();
      case RmOdpPackage.ENUMERATION: return createEnumeration();
      case RmOdpPackage.IMPORT: return createImport();
      case RmOdpPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case RmOdpPackage.SPEC: return createSpec();
      case RmOdpPackage.OBJECT: return createObject();
      case RmOdpPackage.PROPERTY: return createProperty();
      case RmOdpPackage.STATE_MACHINE: return createStateMachine();
      case RmOdpPackage.EVENT: return createEvent();
      case RmOdpPackage.COMMAND: return createCommand();
      case RmOdpPackage.STATE: return createState();
      case RmOdpPackage.STATE_TRANSITION: return createStateTransition();
      case RmOdpPackage.INTERFACE: return createInterface();
      case RmOdpPackage.SIGNATURE_REFERENCE: return createSignatureReference();
      case RmOdpPackage.SIGNATURE_DEF: return createSignatureDef();
      case RmOdpPackage.PARAM: return createParam();
      case RmOdpPackage.EV_SPEC: return createEV_spec();
      case RmOdpPackage.COMMUNITY_CONTRACT: return createCommunityContract();
      case RmOdpPackage.COMMUNITY: return createCommunity();
      case RmOdpPackage.FIELD_OF_APPLICATION: return createFieldOfApplication();
      case RmOdpPackage.OBJECTIVE: return createObjective();
      case RmOdpPackage.ROLE: return createRole();
      case RmOdpPackage.OR_RELATION: return createOR_Relation();
      case RmOdpPackage.PROCESS: return createProcess();
      case RmOdpPackage.LANE: return createLane();
      case RmOdpPackage.NODE: return createNode();
      case RmOdpPackage.DECISION: return createDecision();
      case RmOdpPackage.INCOMING: return createIncoming();
      case RmOdpPackage.OUTGOING: return createOutgoing();
      case RmOdpPackage.ACTION: return createAction();
      case RmOdpPackage.SUBPROCESS: return createSubprocess();
      case RmOdpPackage.START: return createStart();
      case RmOdpPackage.END: return createEnd();
      case RmOdpPackage.ARTEFACT: return createArtefact();
      case RmOdpPackage.INTERACTION: return createInteraction();
      case RmOdpPackage.INTERACTION_ARTEFACT: return createInteractionArtefact();
      case RmOdpPackage.POLICY: return createPolicy();
      case RmOdpPackage.OBJECT_OBLIGATION: return createObjectObligation();
      case RmOdpPackage.ROLE_OBLIGATION: return createRoleObligation();
      case RmOdpPackage.OBJECT_PERMISSION: return createObjectPermission();
      case RmOdpPackage.ROLE_PERMISSION: return createRolePermission();
      case RmOdpPackage.OBJECT_PROHIBITION: return createObjectProhibition();
      case RmOdpPackage.ROLE_PROHIBITION: return createRoleProhibition();
      case RmOdpPackage.IV_SPEC: return createIV_spec();
      case RmOdpPackage.INVARIANT_SCHEMA: return createInvariantSchema();
      case RmOdpPackage.DYNAMIC_SCHEMA: return createDynamicSchema();
      case RmOdpPackage.STATIC_SCHEMA: return createStaticSchema();
      case RmOdpPackage.OBJECT_INSTANCE: return createObjectInstance();
      case RmOdpPackage.PROPERTY_INSTANCE: return createPropertyInstance();
      case RmOdpPackage.ACTION_TYPE: return createActionType();
      case RmOdpPackage.ACTION_PROPERTY: return createActionProperty();
      case RmOdpPackage.CV_SPEC: return createCV_spec();
      case RmOdpPackage.NV_SPEC: return createNV_spec();
      case RmOdpPackage.HOST_NODE: return createHostNode();
      case RmOdpPackage.LINK: return createLink();
      case RmOdpPackage.TV_SPEC: return createTV_spec();
      case RmOdpPackage.IMPLEMENTABLE_STANDARD: return createImplementableStandard();
      case RmOdpPackage.IXIT: return createIXIT();
      case RmOdpPackage.CORR_SPEC: return createCorr_spec();
      case RmOdpPackage.END_POINT: return createEndPoint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement createModelElement()
  {
    ModelElementImpl modelElement = new ModelElementImpl();
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spec createSpec()
  {
    SpecImpl spec = new SpecImpl();
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine createStateMachine()
  {
    StateMachineImpl stateMachine = new StateMachineImpl();
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateTransition createStateTransition()
  {
    StateTransitionImpl stateTransition = new StateTransitionImpl();
    return stateTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignatureReference createSignatureReference()
  {
    SignatureReferenceImpl signatureReference = new SignatureReferenceImpl();
    return signatureReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignatureDef createSignatureDef()
  {
    SignatureDefImpl signatureDef = new SignatureDefImpl();
    return signatureDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EV_spec createEV_spec()
  {
    EV_specImpl eV_spec = new EV_specImpl();
    return eV_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommunityContract createCommunityContract()
  {
    CommunityContractImpl communityContract = new CommunityContractImpl();
    return communityContract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Community createCommunity()
  {
    CommunityImpl community = new CommunityImpl();
    return community;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldOfApplication createFieldOfApplication()
  {
    FieldOfApplicationImpl fieldOfApplication = new FieldOfApplicationImpl();
    return fieldOfApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective createObjective()
  {
    ObjectiveImpl objective = new ObjectiveImpl();
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OR_Relation createOR_Relation()
  {
    OR_RelationImpl oR_Relation = new OR_RelationImpl();
    return oR_Relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.rmodp.rmOdp.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lane createLane()
  {
    LaneImpl lane = new LaneImpl();
    return lane;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decision createDecision()
  {
    DecisionImpl decision = new DecisionImpl();
    return decision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Incoming createIncoming()
  {
    IncomingImpl incoming = new IncomingImpl();
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outgoing createOutgoing()
  {
    OutgoingImpl outgoing = new OutgoingImpl();
    return outgoing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subprocess createSubprocess()
  {
    SubprocessImpl subprocess = new SubprocessImpl();
    return subprocess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public End createEnd()
  {
    EndImpl end = new EndImpl();
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artefact createArtefact()
  {
    ArtefactImpl artefact = new ArtefactImpl();
    return artefact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interaction createInteraction()
  {
    InteractionImpl interaction = new InteractionImpl();
    return interaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionArtefact createInteractionArtefact()
  {
    InteractionArtefactImpl interactionArtefact = new InteractionArtefactImpl();
    return interactionArtefact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Policy createPolicy()
  {
    PolicyImpl policy = new PolicyImpl();
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectObligation createObjectObligation()
  {
    ObjectObligationImpl objectObligation = new ObjectObligationImpl();
    return objectObligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleObligation createRoleObligation()
  {
    RoleObligationImpl roleObligation = new RoleObligationImpl();
    return roleObligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPermission createObjectPermission()
  {
    ObjectPermissionImpl objectPermission = new ObjectPermissionImpl();
    return objectPermission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RolePermission createRolePermission()
  {
    RolePermissionImpl rolePermission = new RolePermissionImpl();
    return rolePermission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectProhibition createObjectProhibition()
  {
    ObjectProhibitionImpl objectProhibition = new ObjectProhibitionImpl();
    return objectProhibition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleProhibition createRoleProhibition()
  {
    RoleProhibitionImpl roleProhibition = new RoleProhibitionImpl();
    return roleProhibition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IV_spec createIV_spec()
  {
    IV_specImpl iV_spec = new IV_specImpl();
    return iV_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvariantSchema createInvariantSchema()
  {
    InvariantSchemaImpl invariantSchema = new InvariantSchemaImpl();
    return invariantSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicSchema createDynamicSchema()
  {
    DynamicSchemaImpl dynamicSchema = new DynamicSchemaImpl();
    return dynamicSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticSchema createStaticSchema()
  {
    StaticSchemaImpl staticSchema = new StaticSchemaImpl();
    return staticSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectInstance createObjectInstance()
  {
    ObjectInstanceImpl objectInstance = new ObjectInstanceImpl();
    return objectInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyInstance createPropertyInstance()
  {
    PropertyInstanceImpl propertyInstance = new PropertyInstanceImpl();
    return propertyInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionType createActionType()
  {
    ActionTypeImpl actionType = new ActionTypeImpl();
    return actionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionProperty createActionProperty()
  {
    ActionPropertyImpl actionProperty = new ActionPropertyImpl();
    return actionProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CV_spec createCV_spec()
  {
    CV_specImpl cV_spec = new CV_specImpl();
    return cV_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NV_spec createNV_spec()
  {
    NV_specImpl nV_spec = new NV_specImpl();
    return nV_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostNode createHostNode()
  {
    HostNodeImpl hostNode = new HostNodeImpl();
    return hostNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TV_spec createTV_spec()
  {
    TV_specImpl tV_spec = new TV_specImpl();
    return tV_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementableStandard createImplementableStandard()
  {
    ImplementableStandardImpl implementableStandard = new ImplementableStandardImpl();
    return implementableStandard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IXIT createIXIT()
  {
    IXITImpl ixit = new IXITImpl();
    return ixit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Corr_spec createCorr_spec()
  {
    Corr_specImpl corr_spec = new Corr_specImpl();
    return corr_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndPoint createEndPoint()
  {
    EndPointImpl endPoint = new EndPointImpl();
    return endPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RmOdpPackage getRmOdpPackage()
  {
    return (RmOdpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RmOdpPackage getPackage()
  {
    return RmOdpPackage.eINSTANCE;
  }

} //RmOdpFactoryImpl
