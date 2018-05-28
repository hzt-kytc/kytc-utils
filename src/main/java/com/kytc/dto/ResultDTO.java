package com.kytc.dto;

public class ResultDTO<T> {
	private String code;
	private String reason;
	private T data;
	private Long timeLength;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Long getTimeLength() {
		return timeLength;
	}
	public void setTimeLength(Long timeLength) {
		this.timeLength = timeLength;
	}
	@Override
	public String toString() {
		return "ResultDTO [code=" + code + ", reason=" + reason + ", data="
				+ data + ", timeLength=" + timeLength + "]";
	}
	public ResultDTO(){
		this.code = "00000";
		this.reason = "";
	}
	public ResultDTO(T data){
		this.code = "00000";
		this.reason = "";
		this.data = data;
	}
}
