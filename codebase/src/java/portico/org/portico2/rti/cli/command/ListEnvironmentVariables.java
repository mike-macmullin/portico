/*
 *   Copyright 2018 The Portico Project
 *
 *   This file is part of portico.
 *
 *   portico is free software; you can redistribute it and/or modify
 *   it under the terms of the Common Developer and Distribution License (CDDL) 
 *   as published by Sun Microsystems. For more information see the LICENSE file.
 *   
 *   Use of this software is strictly AT YOUR OWN RISK!!!
 *   If something bad happens you do not have permission to come crying to me.
 *   (that goes for your lawyer as well)
 *
 */
package org.portico2.rti.cli.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.portico2.common.utils.TextDevice;
import org.portico2.rti.cli.EnvironmentVariables;
import org.portico2.rti.cli.RtiCli;

/**
 * Lists the CLI's environment variables
 */
public class ListEnvironmentVariables implements ICommand
{
	//----------------------------------------------------------
	//                    STATIC VARIABLES
	//----------------------------------------------------------

	//----------------------------------------------------------
	//                   INSTANCE VARIABLES
	//----------------------------------------------------------

	//----------------------------------------------------------
	//                      CONSTRUCTORS
	//----------------------------------------------------------

	//----------------------------------------------------------
	//                    INSTANCE METHODS
	//----------------------------------------------------------
	@Override
	public void execute( RtiCli container, String... args )
	{
		TextDevice console = container.getConsole();
		EnvironmentVariables env = container.getEnvironmentVariables();
		List<String> keys = new ArrayList<>( env.getKeys() );
		Collections.sort( keys );
		for( String envvar : keys )
			console.printf( "%s=%s\n", envvar, env.get(envvar) );
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	///  Accessors and Mutators   //////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////
	

	//----------------------------------------------------------
	//                     STATIC METHODS
	//----------------------------------------------------------
}
