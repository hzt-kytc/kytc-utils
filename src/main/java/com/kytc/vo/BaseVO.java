package com.kytc.vo;

public class BaseVO {
	private Integer id;
	private Integer page;
	private Integer rows;
	private Integer start;
	private String sort;
	private String order;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public void initStart(){
		if(page!=null&&rows!=null){
			this.start = (page-1)*rows;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseVO [id=");
		builder.append(id);
		builder.append(", page=");
		builder.append(page);
		builder.append(", rows=");
		builder.append(rows);
		builder.append(", start=");
		builder.append(start);
		builder.append(", sort=");
		builder.append(sort);
		builder.append(", order=");
		builder.append(order);
		builder.append("]");
		return builder.toString();
	}
}
