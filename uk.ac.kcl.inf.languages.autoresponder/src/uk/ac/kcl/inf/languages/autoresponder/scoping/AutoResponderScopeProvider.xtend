/*
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.inf.languages.autoresponder.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import uk.ac.kcl.inf.languages.autoresponder.autoResponder.ActivityStatement
import uk.ac.kcl.inf.languages.autoresponder.autoResponder.AutoResponderProgram
import uk.ac.kcl.inf.languages.autoresponder.autoResponder.IntVarExpression
import uk.ac.kcl.inf.languages.autoresponder.autoResponder.VariableDeclaration

import static org.eclipse.xtext.scoping.Scopes.*

import static extension org.eclipse.xtext.EcoreUtil2.*

/** 
 * This class contains custom scoping description.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AutoResponderScopeProvider extends AbstractDeclarativeScopeProvider {
	
	def IScope scope_IntVarExpression_var(IntVarExpression context, EReference ref) {
		val containingActivityStatement = context.getContainerOfType(ActivityStatement)
		
		if (containingActivityStatement !== null) {
			containingActivityStatement.visibleVariablesScope
		} else {
			val containingProgram = context.getContainerOfType(AutoResponderProgram)
			
			scopeFor(containingProgram.statements.filter(VariableDeclaration)) 
			// scopeFor(containingProgram.statements.filter(StringVariableDeclaration))
		}
	}
	
	def IScope visibleVariablesScope(EObject context) {
		if (context instanceof ActivityStatement) {
			scopeFor(context.statements.filter(VariableDeclaration), context.eContainer.visibleVariablesScope)
			// scopeFor(context.statements.filter(StringVariableDeclaration), context.eContainer.visibleVariablesScope) 
		} else if (context instanceof AutoResponderProgram) {
			scopeFor(context.statements.filter(VariableDeclaration))
			// scopeFor(context.statements.filter(StringVariableDeclaration)) 
		}
		
	}
	
}