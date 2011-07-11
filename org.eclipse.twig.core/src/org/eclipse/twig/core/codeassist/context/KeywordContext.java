package org.eclipse.twig.core.codeassist.context;

import org.eclipse.dltk.core.CompletionRequestor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.twig.core.documentModel.parser.partitioner.TwigPartitionTypes;
import org.eclipse.twig.core.log.Logger;
import org.eclipse.twig.core.util.text.TwigTextSequenceUtilities;


/**
 * 
 * Context for twig Keywords.
 * 
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
public class KeywordContext extends AbstractTwigCompletionContext {
	
	
	@Override
	public boolean isValid(ISourceModule sourceModule, int offset,
			CompletionRequestor requestor) {
			
		try {
			if (super.isValid(sourceModule, offset, requestor)) {
								
				if (getPartitionType() == TwigPartitionTypes.TWIG_QUOTED_STRING) {
					Logger.debugMSG("No valid partition type for keywordContext " + getPartitionType());
					return false;
				}
				
				String prefix = getStatementText().toString();
				
				if (!prefix.contains(".") && !prefix.contains("\"") && !prefix.contains("'")) {					
					Logger.debugMSG("Valid keyword context.");
					return true;
				}
				
				Logger.debugMSG("invalid prefix '" + prefix + "' for keywordContext.");				
				
			}
		} catch (Exception e) {

			Logger.logException(e);
		}		
		
		return false;
	}
}