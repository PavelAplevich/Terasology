/*
 * Copyright 2019 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.reflection.internal;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertTrue;

public class TypeRegistryImplTest {
    private TypeRegistryImpl typeRegistry = new TypeRegistryImpl();

    @Test
    public void testRegistry() {
        assertTrue(typeRegistry.getSubtypesOf(Object.class).size() > 0);
        assertTrue(typeRegistry.getSubtypesOf(Set.class).contains(TreeSet.class));
    }
}