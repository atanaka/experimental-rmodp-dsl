/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.rmodp.rmOdp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.rmodp.rmOdp.RmOdpPackage
 * @generated
 */
public class RmOdpSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RmOdpPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RmOdpSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RmOdpPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RmOdpPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseModelElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.SIMPLE_TYPE:
      {
        SimpleType simpleType = (SimpleType)theEObject;
        T result = caseSimpleType(simpleType);
        if (result == null) result = caseType(simpleType);
        if (result == null) result = caseModelElement(simpleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseType(enumeration);
        if (result == null) result = caseModelElement(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseModelElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = caseModelElement(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.SPEC:
      {
        Spec spec = (Spec)theEObject;
        T result = caseSpec(spec);
        if (result == null) result = caseModelElement(spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OBJECT:
      {
        org.xtext.example.rmodp.rmOdp.Object object = (org.xtext.example.rmodp.rmOdp.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = caseModelElement(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.STATE_MACHINE:
      {
        StateMachine stateMachine = (StateMachine)theEObject;
        T result = caseStateMachine(stateMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.STATE_TRANSITION:
      {
        StateTransition stateTransition = (StateTransition)theEObject;
        T result = caseStateTransition(stateTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.SIGNATURE_REFERENCE:
      {
        SignatureReference signatureReference = (SignatureReference)theEObject;
        T result = caseSignatureReference(signatureReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.SIGNATURE_DEF:
      {
        SignatureDef signatureDef = (SignatureDef)theEObject;
        T result = caseSignatureDef(signatureDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.EV_SPEC:
      {
        EV_spec eV_spec = (EV_spec)theEObject;
        T result = caseEV_spec(eV_spec);
        if (result == null) result = caseSpec(eV_spec);
        if (result == null) result = caseModelElement(eV_spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.COMMUNITY_CONTRACT:
      {
        CommunityContract communityContract = (CommunityContract)theEObject;
        T result = caseCommunityContract(communityContract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.COMMUNITY:
      {
        Community community = (Community)theEObject;
        T result = caseCommunity(community);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.FIELD_OF_APPLICATION:
      {
        FieldOfApplication fieldOfApplication = (FieldOfApplication)theEObject;
        T result = caseFieldOfApplication(fieldOfApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OBJECTIVE:
      {
        Objective objective = (Objective)theEObject;
        T result = caseObjective(objective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OR_RELATION:
      {
        OR_Relation oR_Relation = (OR_Relation)theEObject;
        T result = caseOR_Relation(oR_Relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.PROCESS:
      {
        org.xtext.example.rmodp.rmOdp.Process process = (org.xtext.example.rmodp.rmOdp.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.LANE:
      {
        Lane lane = (Lane)theEObject;
        T result = caseLane(lane);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.DECISION:
      {
        Decision decision = (Decision)theEObject;
        T result = caseDecision(decision);
        if (result == null) result = caseNode(decision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.INCOMING:
      {
        Incoming incoming = (Incoming)theEObject;
        T result = caseIncoming(incoming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OUTGOING:
      {
        Outgoing outgoing = (Outgoing)theEObject;
        T result = caseOutgoing(outgoing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = caseNode(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.SUBPROCESS:
      {
        Subprocess subprocess = (Subprocess)theEObject;
        T result = caseSubprocess(subprocess);
        if (result == null) result = caseNode(subprocess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.START:
      {
        Start start = (Start)theEObject;
        T result = caseStart(start);
        if (result == null) result = caseNode(start);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.END:
      {
        End end = (End)theEObject;
        T result = caseEnd(end);
        if (result == null) result = caseNode(end);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ARTEFACT:
      {
        Artefact artefact = (Artefact)theEObject;
        T result = caseArtefact(artefact);
        if (result == null) result = caseNode(artefact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.INTERACTION:
      {
        Interaction interaction = (Interaction)theEObject;
        T result = caseInteraction(interaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.INTERACTION_ARTEFACT:
      {
        InteractionArtefact interactionArtefact = (InteractionArtefact)theEObject;
        T result = caseInteractionArtefact(interactionArtefact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.POLICY:
      {
        Policy policy = (Policy)theEObject;
        T result = casePolicy(policy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OBJECT_OBLIGATION:
      {
        ObjectObligation objectObligation = (ObjectObligation)theEObject;
        T result = caseObjectObligation(objectObligation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ROLE_OBLIGATION:
      {
        RoleObligation roleObligation = (RoleObligation)theEObject;
        T result = caseRoleObligation(roleObligation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OBJECT_PERMISSION:
      {
        ObjectPermission objectPermission = (ObjectPermission)theEObject;
        T result = caseObjectPermission(objectPermission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ROLE_PERMISSION:
      {
        RolePermission rolePermission = (RolePermission)theEObject;
        T result = caseRolePermission(rolePermission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OBJECT_PROHIBITION:
      {
        ObjectProhibition objectProhibition = (ObjectProhibition)theEObject;
        T result = caseObjectProhibition(objectProhibition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ROLE_PROHIBITION:
      {
        RoleProhibition roleProhibition = (RoleProhibition)theEObject;
        T result = caseRoleProhibition(roleProhibition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.IV_SPEC:
      {
        IV_spec iV_spec = (IV_spec)theEObject;
        T result = caseIV_spec(iV_spec);
        if (result == null) result = caseSpec(iV_spec);
        if (result == null) result = caseModelElement(iV_spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.INVARIANT_SCHEMA:
      {
        InvariantSchema invariantSchema = (InvariantSchema)theEObject;
        T result = caseInvariantSchema(invariantSchema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.DYNAMIC_SCHEMA:
      {
        DynamicSchema dynamicSchema = (DynamicSchema)theEObject;
        T result = caseDynamicSchema(dynamicSchema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.STATIC_SCHEMA:
      {
        StaticSchema staticSchema = (StaticSchema)theEObject;
        T result = caseStaticSchema(staticSchema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.OBJECT_INSTANCE:
      {
        ObjectInstance objectInstance = (ObjectInstance)theEObject;
        T result = caseObjectInstance(objectInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.PROPERTY_INSTANCE:
      {
        PropertyInstance propertyInstance = (PropertyInstance)theEObject;
        T result = casePropertyInstance(propertyInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ACTION_TYPE:
      {
        ActionType actionType = (ActionType)theEObject;
        T result = caseActionType(actionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.ACTION_PROPERTY:
      {
        ActionProperty actionProperty = (ActionProperty)theEObject;
        T result = caseActionProperty(actionProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.CV_SPEC:
      {
        CV_spec cV_spec = (CV_spec)theEObject;
        T result = caseCV_spec(cV_spec);
        if (result == null) result = caseSpec(cV_spec);
        if (result == null) result = caseModelElement(cV_spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.NV_SPEC:
      {
        NV_spec nV_spec = (NV_spec)theEObject;
        T result = caseNV_spec(nV_spec);
        if (result == null) result = caseSpec(nV_spec);
        if (result == null) result = caseModelElement(nV_spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.HOST_NODE:
      {
        HostNode hostNode = (HostNode)theEObject;
        T result = caseHostNode(hostNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.TV_SPEC:
      {
        TV_spec tV_spec = (TV_spec)theEObject;
        T result = caseTV_spec(tV_spec);
        if (result == null) result = caseSpec(tV_spec);
        if (result == null) result = caseModelElement(tV_spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.IMPLEMENTABLE_STANDARD:
      {
        ImplementableStandard implementableStandard = (ImplementableStandard)theEObject;
        T result = caseImplementableStandard(implementableStandard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.IXIT:
      {
        IXIT ixit = (IXIT)theEObject;
        T result = caseIXIT(ixit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.CORR_SPEC:
      {
        Corr_spec corr_spec = (Corr_spec)theEObject;
        T result = caseCorr_spec(corr_spec);
        if (result == null) result = caseSpec(corr_spec);
        if (result == null) result = caseModelElement(corr_spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RmOdpPackage.END_POINT:
      {
        EndPoint endPoint = (EndPoint)theEObject;
        T result = caseEndPoint(endPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleType(SimpleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpec(Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.xtext.example.rmodp.rmOdp.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateMachine(StateMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateTransition(StateTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignatureReference(SignatureReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignatureDef(SignatureDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EV spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EV spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEV_spec(EV_spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Community Contract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Community Contract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommunityContract(CommunityContract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Community</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Community</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommunity(Community object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Of Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Of Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldOfApplication(FieldOfApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjective(Objective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OR Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OR Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOR_Relation(OR_Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(org.xtext.example.rmodp.rmOdp.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLane(Lane object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecision(Decision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Incoming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Incoming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncoming(Incoming object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outgoing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outgoing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutgoing(Outgoing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subprocess</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subprocess</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubprocess(Subprocess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStart(Start object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnd(End object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artefact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artefact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtefact(Artefact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteraction(Interaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Artefact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Artefact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionArtefact(InteractionArtefact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolicy(Policy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Obligation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Obligation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectObligation(ObjectObligation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Obligation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Obligation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleObligation(RoleObligation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Permission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Permission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPermission(ObjectPermission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Permission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Permission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRolePermission(RolePermission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Prohibition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Prohibition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectProhibition(ObjectProhibition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Prohibition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Prohibition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleProhibition(RoleProhibition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IV spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IV spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIV_spec(IV_spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invariant Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invariant Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvariantSchema(InvariantSchema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicSchema(DynamicSchema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticSchema(StaticSchema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectInstance(ObjectInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyInstance(PropertyInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionType(ActionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionProperty(ActionProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CV spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CV spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCV_spec(CV_spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NV spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NV spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNV_spec(NV_spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Host Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Host Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHostNode(HostNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TV spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TV spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTV_spec(TV_spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementable Standard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementable Standard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementableStandard(ImplementableStandard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IXIT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IXIT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIXIT(IXIT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Corr spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Corr spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCorr_spec(Corr_spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndPoint(EndPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RmOdpSwitch
