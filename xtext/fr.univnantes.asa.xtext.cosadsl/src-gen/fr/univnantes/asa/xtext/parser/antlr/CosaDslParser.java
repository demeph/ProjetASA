/*
 * generated by Xtext 2.15.0
 */
package fr.univnantes.asa.xtext.parser.antlr;

import com.google.inject.Inject;
import fr.univnantes.asa.xtext.parser.antlr.internal.InternalCosaDslParser;
import fr.univnantes.asa.xtext.services.CosaDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CosaDslParser extends AbstractAntlrParser {

	@Inject
	private CosaDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCosaDslParser createParser(XtextTokenStream stream) {
		return new InternalCosaDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CompositeConfiguration";
	}

	public CosaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CosaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
