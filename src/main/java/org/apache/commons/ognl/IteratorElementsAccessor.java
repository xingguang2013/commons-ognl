package org.apache.commons.ognl;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.apache.commons.ognl.IteratorEnumeration.newEnumeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Implementation of the ElementsAccessor interface for Iterators, which simply returns the target iterator itself.
 * 
 * @author Luke Blanshard (blanshlu@netscape.net)
 * @author Drew Davidson (drew@ognl.org)
 */
public class IteratorElementsAccessor
    implements ElementsAccessor
{
    /**
     * {@inheritDoc}
     */
    public Enumeration<?> getElements( Object target )
    {
        return newEnumeration( (Iterator<?>) target );
    }
}
