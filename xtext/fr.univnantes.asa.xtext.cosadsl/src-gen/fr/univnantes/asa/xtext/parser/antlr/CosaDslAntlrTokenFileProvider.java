/*
 * generated by Xtext 2.15.0
 */
package fr.univnantes.asa.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CosaDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/univnantes/asa/xtext/parser/antlr/internal/InternalCosaDsl.tokens");
	}
}
