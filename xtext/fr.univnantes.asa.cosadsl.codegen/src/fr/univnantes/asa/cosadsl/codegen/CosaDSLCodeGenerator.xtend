package fr.univnantes.asa.cosadsl.codegen

import fr.univnantes.asa.cosa.*

class CosaDSLCodeGenerator {

	def static String generateCode(CompositeConfiguration cc) {
		return '''
			public class <<cc.name>> {
				«FOR c : cc.components»
					«IF c instanceof Component»
						«generateCode(c as Component)»
					«ENDIF»
				«ENDFOR»
				«FOR c : cc.connectors»
					«IF c instanceof Connector»
						«generateCode(c as Connector)»
					«ENDIF»
				«ENDFOR»
			}			
		'''		
	}
	
	def static String generateCode(Component c) {
		return '''
			public class «c.name» {
				«FOR port: c.ports»
					«IF port instanceof RequiredPort»
						«generateCode(port as RequiredPort)»
					«ELSEIF port instanceof ProvidedPort»
						«generateCode(port as ProvidedPort)»
					«ENDIF»
				«ENDFOR»
				«FOR service : c.services»
					«IF service instanceof RequiredService»
						«generateCode(service as RequiredService)»
					«ELSEIF service instanceof ProvidedService»
						«generateCode(service as ProvidedService)»
					«ENDIF»
				«ENDFOR»
			}
		'''
	}
	
	def static String generateCode(Connector rp) {
		return '''
			
		'''
	}
	
	def static String generateCode(RequiredPort rp) {
		return '''
			
		'''
	}
	
		
	def static String generateCode(ProvidedPort pp) {
		return '''
			
		'''
	}
	
	def static String generateCode(RequiredService rs) {
		return '''
			
		'''
	}
	
	def static String generateCode(ProvidedService ps) {
		return '''
			
		'''
	}
		
}
