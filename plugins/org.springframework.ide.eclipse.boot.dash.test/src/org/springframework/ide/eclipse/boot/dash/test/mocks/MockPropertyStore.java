/*******************************************************************************
 * Copyright (c) 2015 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.boot.dash.test.mocks;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ide.eclipse.boot.dash.metadata.IPropertyStore;

/**
 * @author Kris De Volder
 */
public class MockPropertyStore implements IPropertyStore {

	private Map<String, String> props = new HashMap<>();

	@Override
	public String get(String key) {
		return props.get(key);
	}

	@Override
	public void put(String key, String value) throws Exception {
		props.put(key, value);
	}

}
