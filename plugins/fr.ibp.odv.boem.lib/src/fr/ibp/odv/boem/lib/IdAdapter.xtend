/*******************************************************************************
 * Copyright (c) 2016 I-BP.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *******************************************************************************/
package fr.ibp.odv.boem.lib

import org.eclipse.emf.common.notify.impl.AdapterImpl

class IdAdapter extends AdapterImpl {

	var String id

	new(String id) {
		this.id = id;
	}

	def getId() {
		return id
	}

	def void setId(String id) {
		this.id = id;
	}

	override isAdapterForType(Object type) {
		return IdAdapter == type
	}

}
