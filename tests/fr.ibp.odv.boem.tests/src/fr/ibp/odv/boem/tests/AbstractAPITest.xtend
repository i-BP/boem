/*******************************************************************************
 * Copyright (c) 2016 I-BP.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Arthur Daussy - initial API and implementation
 *    Jacob Geisel - extending test coverage and documentation
 *******************************************************************************/
package fr.ibp.odv.boem.tests

import fr.ibp.odv.boem.lib.BoemFactory
import java.util.Collection
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.InternalEObject

import static org.junit.Assert.*

/**
 * Abstract class for BOEM API tests
 */
abstract class AbstractAPITest {
	
	/**
	 * Checks that there is not adapter lest in the model (some adapters are added while building the model)
	 */
	protected def assertNoAdapterLeft(EObject eObject) {
		assertTrue(eObject.eAdapters.isEmpty)
		val contentIte = eObject.eAllContents
		while (contentIte.hasNext) {
			val next = contentIte.next
			assertTrue(next.eAdapters.isEmpty)
		}
	}

	/**
	 * Checks that there are no BoemURIs left in the model
	 */
	protected def assertNoBoemUriLeft(EObject eObject) {
		eObject.assertNoRefToBoemURI()
		val contentIte = eObject.eAllContents
		while (contentIte.hasNext){
			val next = contentIte.next
			next. assertNoRefToBoemURI()
		}

	}

	private def void assertNoRefToBoemURI(EObject eObject) {
		for (EReference ref : eObject.eClass.EAllReferences) {
			var Collection<InternalEObject> values;
			if (ref.isMany) {
				values = eObject.eGet(ref, false) as Collection<InternalEObject>
			} else {
				values = Collections.singleton(eObject.eGet(ref, false) as InternalEObject)
			}

			for (EObject value : values) {
				value.assertNoBoemUri
			}
		}
	}

	private def void assertNoBoemUri(EObject eObject) {
		if (eObject instanceof InternalEObject) {
			if (eObject.eIsProxy() && BoemFactory.INTERNAL_URI_SCHEME.equals(eObject.eProxyURI.scheme)) {
				fail("There is still BoemUris in the model");
			}
		}
	}
}
