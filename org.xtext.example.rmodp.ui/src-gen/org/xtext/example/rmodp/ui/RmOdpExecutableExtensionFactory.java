/*
 * generated by Xtext
 */
package org.xtext.example.rmodp.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.rmodp.ui.internal.RmOdpActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RmOdpExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RmOdpActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RmOdpActivator.getInstance().getInjector(RmOdpActivator.ORG_XTEXT_EXAMPLE_RMODP_RMODP);
	}
	
}