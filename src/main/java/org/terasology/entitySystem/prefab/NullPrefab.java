/*
 * Copyright 2013 Moving Blocks
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
package org.terasology.entitySystem.prefab;

import org.terasology.asset.AssetType;
import org.terasology.asset.AssetUri;
import org.terasology.entitySystem.Component;
import org.terasology.utilities.collection.NullIterator;

import java.util.Collections;
import java.util.List;

/**
 * @author Immortius
 */
public class NullPrefab extends Prefab {

    public NullPrefab() {
        super(new AssetUri(AssetType.PREFAB, "engine", "null"));
    }

    @Override
    public Prefab getParent() {
        return null;
    }

    @Override
    public List<Prefab> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public boolean isPersisted() {
        return true;
    }

    @Override
    public boolean isAlwaysRelevant() {
        return false;
    }

    @Override
    public boolean exists() {
        return false;
    }

    @Override
    public void reload(PrefabData data) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isDisposed() {
        return false;
    }

    @Override
    public boolean hasComponent(Class<? extends Component> component) {
        return false;
    }

    @Override
    public <T extends Component> T getComponent(Class<T> componentClass) {
        return null;
    }

    @Override
    public Iterable<Component> iterateComponents() {
        return NullIterator.newInstance();
    }
}
