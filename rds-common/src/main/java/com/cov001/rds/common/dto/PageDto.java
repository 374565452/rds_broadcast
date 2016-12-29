package com.cov001.rds.common.dto;

import java.util.List;

public class PageDto {

	private List<?> data;
	
	private PageModel pageModel;
	
	public PageModel getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}
	
}
