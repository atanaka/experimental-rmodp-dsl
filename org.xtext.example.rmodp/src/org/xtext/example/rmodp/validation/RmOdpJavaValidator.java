package org.xtext.example.rmodp.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.rmodp.rmOdp.CV_spec;
import org.xtext.example.rmodp.rmOdp.Community;
import org.xtext.example.rmodp.rmOdp.CommunityContract;
import org.xtext.example.rmodp.rmOdp.EV_spec;
import org.xtext.example.rmodp.rmOdp.IV_spec;
import org.xtext.example.rmodp.rmOdp.NV_spec;
import org.xtext.example.rmodp.rmOdp.RmOdpPackage;
import org.xtext.example.rmodp.rmOdp.TV_spec;

public class RmOdpJavaValidator extends AbstractRmOdpJavaValidator {

	// Object should not extend itself
	@Check
	public void checkNotInheritFromItself (org.xtext.example.rmodp.rmOdp.Object object) {
		if  (object.getName().equals(object.getSuperObject().getName())) {
			error ("Object cannot extend itself", RmOdpPackage.Literals.OBJECT__NAME);
		}
	}
	
	// Object should not extend object in different viewpoint
	@Check
	public void checkNotInheritedFromDifferentViewpoint (org.xtext.example.rmodp.rmOdp.Object object) {
		if (!object.getSuperObject().getObjectType().equals(object.getObjectType())) {
			error ("Object cannot extend object in other viewpoint", RmOdpPackage.Literals.OBJECT__NAME);
		}
	}

	@SuppressWarnings("rawtypes")
	@Check
	public void checkOnlyOneEVsepc(EV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof EV_spec) count++;
		}
		if (count != 1)
			error("More than one Enterprise_Spec model found in the specification. There should be just one Enterprise specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}

	@SuppressWarnings("rawtypes")
	@Check
	public void checkOnlyOneIVsepc(IV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof IV_spec) count++;
		}
		if (count != 1)
			error("More than one Information _Spec model found in the specification. There should be just one Information specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}
	@SuppressWarnings("rawtypes")
	@Check
	public void checkOnlyOneCVsepc(CV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof CV_spec) count++;
		}
		if (count != 1)
			error("More than one Computational _Spec model found in the specification. There should be just one Computational specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}
	@SuppressWarnings("rawtypes")
	@Check
	public void checkOnlyOneNVsepc(NV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof NV_spec) count++;
		}
		if (count != 1)
			error("More than one Engineering _Spec model found in the specification. There should be just one Engineering specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}
	@SuppressWarnings("rawtypes")
	@Check
	public void checkOnlyOneTVsepc(TV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV_spec) count++;
		}
		if (count != 1)
			error("More than one Technology _Spec model found in the specification. There should be just one Technology specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}

	@SuppressWarnings("rawtypes")
	@Check
	public void checkNoEVsepc(EV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof EV_spec) count++;
		}
		if (count == 0 | spec == null)
			warning("No Enterprise_Spec found in the specification. There should be one.", RmOdpPackage.Literals.SPEC__NAME);
	}

	@SuppressWarnings("rawtypes")
	@Check
	public void checkNoIVsepc(IV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof IV_spec) count++;
		}
		if (count == 0 | spec == null)
			warning("No Information_Spec found in the specification. There should be one Information specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}
	@SuppressWarnings("rawtypes")
	@Check
	public void checkNoCVsepc(CV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof CV_spec) count++;
		}
		if (count == 0 | spec == null)
			warning("No Computational_Spec found in the specification. There should be one Computational specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}
	@SuppressWarnings("rawtypes")
	@Check
	public void checkNoNVsepc(NV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof NV_spec) count++;
		}
		if (count == 0 | spec == null)
			warning("No Engineering_Spec found in the specification. There should be one Engineering specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}
	@SuppressWarnings("rawtypes")
	@Check
	public void checkNoTVsepc(TV_spec spec) {
		int count = 0;
		EList list = spec.eContainer().eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV_spec) count++;
		}
		if (count == 0 | spec == null)
			warning("No Technology_Spec found in the specification. There should be one Technology specification of the system.", RmOdpPackage.Literals.SPEC__NAME);
	}
	
	@SuppressWarnings("rawtypes")
	@Check
	public void checkNoCommunityContract(EV_spec spec) {
		int count = 0;
		EList list = spec.eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof CommunityContract) count++;
		}
		if (count == 0)
			error("No Community Contract found in the specification. You need to specify at least one Community Contract.", RmOdpPackage.Literals.SPEC__NAME);
	}
	
	@SuppressWarnings("rawtypes")
	@Check
	public void checkNoCommunity(CommunityContract community_contract) {
		int count = 0;
		EList list = community_contract.eContents();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Community) count++;
		}
		if (count == 0 | community_contract == null)
			error("No Community found in the Community Contract. You need to specify at least one Community.", RmOdpPackage.Literals.COMMUNITY_CONTRACT__NAME);
	}

	
//	@Check
//	public void checkTypeNameStartsWithCapital(Type type) {
//		if (!Character.isUpperCase(type.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
//		}
//	}

}
