/*******************************************************************************
 * This file is part of the Twig eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.twig.core;

import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.compiler.problem.ProblemSeverity;

public class TwigCorePreferences {

	/**
	 * Get the severity level for annotation problems.
	 * 
	 * 
	 * @return {@link ProblemSeverity}
	 */
	public static ProblemSeverity getSyntaxErrorSeverity() {

		try {

			// see https://github.com/pulse00/Twig-Eclipse-Plugin/issues/8

			// TODO: check if there's a cleaner way to get the preferences from
			// the ui
			// plugin than hardcoding the ID
			String severity = Platform.getPreferencesService().getString("com.dubture.twig.ui",
					TwigCoreConstants.SYNTAX_PROBLEM_SEVERITY, TwigCoreConstants.SYNTAX_WARNING, null);

			if (severity == null) {
				severity = TwigCoreConstants.SYNTAX_WARNING;
			}

			if (severity.equals(TwigCoreConstants.SYNTAX_ERROR)) {
				return ProblemSeverity.ERROR;

			} else if (severity.equals(TwigCoreConstants.SYNTAX_WARNING)) {
				return ProblemSeverity.WARNING;
			}

			return ProblemSeverity.IGNORE;

		} catch (Exception e) {

		}

		return null;
	}
}
