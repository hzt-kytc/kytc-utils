package com.kytc.dto;

import java.util.List;

public class PageDTO<T> {
	private Integer page;
	private Integer pageSize;
	private List<T> rows;
	private Long total;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "PageDTO [page=" + page + ", pageSize=" + pageSize + ", rows="
				+ rows + ", total=" + total + "]";
	}
}
