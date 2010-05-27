package com.aptana.editor.php.internal.parser;

import org.eclipse.php.internal.core.PHPVersion;

import com.aptana.parsing.ParseState;

/**
 * A PHP parse state implementation with the ability to set and get a PHP version.
 * 
 * @author Shalom Gibly <sgibly@aptana.com>
 */
public class PHPParseState extends ParseState implements IPHPParseState
{

	private PHPVersion phpVersion;

	/*
	 * (non-Javadoc)
	 * @see com.aptana.editor.php.internal.parser.IPHPParseState#getPHPVersion()
	 */
	@Override
	public PHPVersion getPHPVersion()
	{
		return phpVersion;
	}

	@Override
	public void phpVersionChanged(PHPVersion newVersion)
	{
		this.phpVersion = newVersion;
	}
}
