package ca.uhn.fhir.empi.api;

/*-
 * #%L
 * HAPI FHIR - Enterprise Master Patient Index
 * %%
 * Copyright (C) 2014 - 2020 University Health Network
 * %%
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
 * #L%
 */

import org.hl7.fhir.instance.model.api.IBaseResource;

public class MatchedTarget {

	private final IBaseResource myTarget;
	private final EmpiMatchResultEnum myMatchResult;

	public MatchedTarget(IBaseResource theTarget, EmpiMatchResultEnum theMatchResult) {
		myTarget = theTarget;
		myMatchResult = theMatchResult;
	}

	public IBaseResource getTarget() {
		return myTarget;
	}

	public EmpiMatchResultEnum getMatchResult() {
		return myMatchResult;
	}
}