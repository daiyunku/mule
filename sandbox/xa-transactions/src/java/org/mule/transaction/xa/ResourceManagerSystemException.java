/* 
 * $Header$
 * $Revision$
 * $Date$
 * ------------------------------------------------------------------------------------------------------
 * 
 * Copyright (c) Cubis Limited. All rights reserved.
 * http://www.cubis.co.uk 
 * 
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file. 
 *
 */
package org.mule.transaction.xa;

/**
 * @author <a href="mailto:gnt@codehaus.org">Guillaume Nodet</a>
 * @version $Revision$
 */
public class ResourceManagerSystemException extends
		ResourceManagerException {

	/**
	 * 
	 */
	public ResourceManagerSystemException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public ResourceManagerSystemException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ResourceManagerSystemException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ResourceManagerSystemException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
