/*
 * generated by Xtext 2.15.0
 */
package fr.univnantes.asa.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CosaDslStandaloneSetup extends CosaDslStandaloneSetupGenerated {

	def static void doSetup() {
		new CosaDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}