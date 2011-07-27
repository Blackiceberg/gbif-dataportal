/*
 * Copyright 2011 Global Biodiversity Information Facility (GBIF)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gbif.portal.action.dataset;

import org.gbif.portal.action.BaseAction;
import org.gbif.portal.client.RegistryClient;

import java.util.List;

import com.google.inject.Inject;
import org.w3c.dom.stylesheets.LinkStyle;

public class DatasetAction extends BaseAction {
  @Inject
  private RegistryClient registry;
  // search
  private String q;
  private List<?> datasets;
  // detail
  private Object dataset;

  @Override
  public String execute() throws Exception {
    return SUCCESS;
  }

  public String search() throws Exception {

    return SUCCESS;
  }

  public List<?> getDatasets() {
    return datasets;
  }

  public Object getDataset() {
    return dataset;
  }

  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }
}