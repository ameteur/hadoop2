package org.buaa.suggestion;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Sug extends ActionSupport{
	String query;  //ǰ̨�û����ַ���
	List<String> result;  //������
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public List<String> getResult() {
		System.out.println(query);
		result=new ArrayList<String>();
		result.add("aaa");
		result.add("bbb");
		result.add("ccc");
		result.add("ddd");
		return result;
	}
	public void setResult(List<String> result) {
		this.result = result;
	}
	public String execute() throws Exception{
		return SUCCESS;
	}
	
	

}
