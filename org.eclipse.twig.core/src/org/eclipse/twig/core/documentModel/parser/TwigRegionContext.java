package org.eclipse.twig.core.documentModel.parser;


/**
 * 
 * The {@link TwigRegionContext} which defines the tokens
 * used in the {@link TwigTokenizer}.
 * 
 * 
 * @see http://code.google.com/p/smartypdt/source/browse/trunk/org.eclipse.php.smarty.core/src/org/eclipse/php/smarty/internal/core/documentModel/parser/SmartyRegionContext.java
 *
 */
public interface TwigRegionContext {
	
	// These are the Twig Tokens generated by the TwigTokenizer
	// see Resources/parserTools/TwigTokenizer.jflex and search 
	// for "START TWIG ADDITIONS"
	
	public static final String TWIG_OPEN 							= "TWIG_OPEN"; //$NON-NLS-1$
	public static final String TWIG_CLOSE 							= "TWIG_CLOSE"; //$NON-NLS-1$

	public static final String TWIG_STMT_OPEN 						= "TWIG_STMT_OPEN"; //$NON-NLS-1$
	public static final String TWIG_STMT_CLOSE 						= "TWIG_STMT_CLOSE"; //$NON-NLS-1$	
	public static final String TWIG_CONTENT 						= "TWIG_CONTENT"; //$NON-NLS-1$
	public static final String TWIG_COMMENT_OPEN 					= "TWIG_COMMENT_OPEN"; //$NON-NLS-1$
	public static final String TWIG_COMMENT_TEXT 					= "TWIG_COMMENT_TEXT"; //$NON-NLS-1$	
	public static final String TWIG_COMMENT_CLOSE 					= "TWIG_COMMENT_CLOSE"; //$NON-NLS-1$	
	public static final String TWIG_COMMENT 						= "TWIG_COMMENT"; //$NON-NLS-1$
	public static final String TWIG_VARIABLE 						= "TWIG_VARIABLE"; //$NON-NLS-1$
	public static final String TWIG_KEYWORD 						= "TWIG_KEYWORD"; //$NON-NLS-1$	
	public static final String TWIG_DELIMITER 						= "TWIG_DELIMITER"; //$NON-NLS-1$
	public static final String TWIG_WHITESPACE 						= "TWIG_WHITESPACE"; //$NON-NLS-1$
	public static final String TWIG_NUMBER 							= "TWIG_NUMBER"; //$NON-NLS-1$	
	public static final String TWIG_LABEL 							= "TWIG_LABEL"; //$NON-NLS-1$
	public static final String TWIG_CONSTANT_ENCAPSED_STRING 		= "TWIG_CONSTANT_ENCAPSED_STRING"; //$NON-NLS-1$
	public static final String TWIG_DOUBLE_QUOTES_CONTENT 			= "TWIG_DOUBLE_QUOTES_CONTENT"; //$NON-NLS-1$	
	public static final String TWIG_DOUBLE_QUOTES_START 			= "TWIG_DOUBLE_QUOTES_START"; //$NON-NLS-1$
	public static final String TWIG_DOUBLE_QUOTES_END 				= "TWIG_DOUBLE_QUOTES_END"; //$NON-NLS-1$
	public static final String TWIG_BACKTICK_END 					= "ST_TWIG_BACKTICK_END"; //$NON-NLS-1$	
	public static final String TWIG_BACKTICK_START 					= "TWIG_BACKTICK_START"; //$NON-NLS-1$		
	
	public static final String TWIG_JSON_START 						= "TWIG_JSON_START"; //$NON-NLS-1$
	public static final String TWIG_JSON_END 						= "TWIG_JSON_END"; //$NON-NLS-1$	

}
