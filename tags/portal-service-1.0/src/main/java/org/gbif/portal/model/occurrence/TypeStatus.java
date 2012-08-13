/***************************************************************************
 * Copyright (C) 2006 Global Biodiversity Information Facility Secretariat.
 * All Rights Reserved.
 *
 * The contents of this file are subject to the Mozilla Public
 * License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 ***************************************************************************/
package org.gbif.portal.model.occurrence;

import org.gbif.portal.model.BaseObject;

/**
 * A light weight object for retrieving the type status associated with a occurrence record.
 * 
 * @author dmartin
 * @see TypificationRecord
 */
public class TypeStatus extends BaseObject {

	/** The associated OccurrenceRecord */
	protected Long occurrenceRecordId;
	/** The type status */
	protected String typeStatus;
	/**
	 * @return the occurrenceRecordId
	 */
	public Long getOccurrenceRecordId() {
		return occurrenceRecordId;
	}
	/**
	 * @param occurrenceRecordId the occurrenceRecordId to set
	 */
	public void setOccurrenceRecordId(Long occurrenceRecordId) {
		this.occurrenceRecordId = occurrenceRecordId;
	}
	/**
	 * @return the typeStatus
	 */
	public String getTypeStatus() {
		return typeStatus;
	}
	/**
	 * @param typeStatus the typeStatus to set
	 */
	public void setTypeStatus(String typeStatus) {
		this.typeStatus = typeStatus;
	}
}