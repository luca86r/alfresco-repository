/*
 * Copyright (C) 2005-2011 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.util.schemacomp;

import org.alfresco.util.schemacomp.model.ModelTestSuite;
import org.alfresco.util.schemacomp.validator.ValidatorTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite running all the tests in the schemacomp package - and subpackages.
 * @author Matt Ward
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
{
            ModelTestSuite.class,
            ValidatorTestSuite.class,
            SchemaCompTestSuite.class
})
public class SchemaCompPackagetTestSuite
{
}
