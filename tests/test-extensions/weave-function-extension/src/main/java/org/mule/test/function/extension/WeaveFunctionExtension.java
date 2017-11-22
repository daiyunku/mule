/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.test.function.extension;

import org.mule.runtime.extension.api.annotation.Export;
import org.mule.runtime.extension.api.annotation.ExpressionFunctions;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;



@Extension(name = "Test Functions")
@ExpressionFunctions(GlobalWeaveFunction.class)
@Operations(WeaveTestUtilsOperations.class)
@Xml(prefix = "fn")
@Export(resources = "MUnit-tools.dwl")
public class WeaveFunctionExtension {

}
