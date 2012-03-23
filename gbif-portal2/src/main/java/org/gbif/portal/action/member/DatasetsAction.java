package org.gbif.portal.action.member;

import org.gbif.portal.action.BaseAction;

public class DatasetsAction extends BaseAction {

  // detail
  private Integer id;

  @Override
  public String execute() {
    if (id != null) {
      log.debug("Getting datasets for member id [{}]", id);
      /** TODO: implement member lookup */
      return SUCCESS;
    }
    return NOT_FOUND;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }
}