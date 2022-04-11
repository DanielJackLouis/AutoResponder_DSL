/*
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.inf.languages.autoresponder.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.languages.autoresponder.AutoResponderRuntimeModule;
import uk.ac.kcl.inf.languages.autoresponder.AutoResponderStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class AutoResponderIdeSetup extends AutoResponderStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AutoResponderRuntimeModule(), new AutoResponderIdeModule()));
	}
	
}