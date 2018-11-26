/*
 * generated by Xtext 2.15.0
 */
package fr.univnantes.asa.xtext.formatting2

import com.google.inject.Inject
import fr.univnantes.asa.cosa.Component
import fr.univnantes.asa.cosa.CompositeConfiguration
import fr.univnantes.asa.xtext.services.CosaDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class CosaDslFormatter extends AbstractFormatter2 {
	
	@Inject extension CosaDslGrammarAccess

	def dispatch void format(CompositeConfiguration compositeConfiguration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (component : compositeConfiguration.components) {
			component.format
		}
		for (connector : compositeConfiguration.connectors) {
			connector.format
		}
		for (port : compositeConfiguration.ports) {
			port.format
		}
		for (binding : compositeConfiguration.bindings) {
			binding.format
		}
		for (attachement : compositeConfiguration.attachements) {
			attachement.format
		}
		for (configuration : compositeConfiguration.configurations) {
			configuration.format
		}
	}

	def dispatch void format(Component component, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (port : component.ports) {
			port.format
		}
		for (service : component.services) {
			service.format
		}
	}
	
	// TODO: implement for Connector, Binding, Attachement, Configuration, SimpleConfiguration
}
