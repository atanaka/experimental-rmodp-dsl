
package org.xtext.example.rmodp;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RmOdpStandaloneSetup extends RmOdpStandaloneSetupGenerated{

	public static void doSetup() {
		new RmOdpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

