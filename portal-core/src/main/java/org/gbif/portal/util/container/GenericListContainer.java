/***************************************************************************
 * Copyright (C) 2005 Global Biodiversity Information Facility Secretariat.
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
package org.gbif.portal.util.container;

import java.util.List;

/**
 * Wraps a List.  This is particularly useful should you wish to define a
 * generic list in (for example) Spring Config files.
 * 
 * @deprecated Use util:map in config
 * http://www.springframework.org/docs/reference/xsd-config.html#xsd-config-body-schemas-util-list
 * 
 * @author trobertson
 */
public class GenericListContainer {
	/**
	 * The wrapped up list
	 */
	protected List<Object> list;

	/**
	 * @return Returns the list.
	 */
	public List<Object> getList() {
		return list;
	}

	/**
	 * @param list The list to set.
	 */
	public void setList(List<Object> list) {
		this.list = list;
	}
}