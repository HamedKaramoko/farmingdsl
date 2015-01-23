/**
 *
 * $Id$
 */
package activity.validation;

import activity.ResourceType;

/**
 * A sample validator interface for {@link activity.Res_Alloc}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Res_AllocValidator {
	boolean validate();

	boolean validateDuration(Integer value);
	boolean validateRes_type(ResourceType value);
}