package model;

import java.io.Serializable;

public class Questionnaire implements Serializable{
	//性別
	private String gender;
	//年齢
	private int age;
	//製品名
	private String product;
	//製品使用理由
	private String reason;
	//満足度
	private String cs;
	//その他
	private String others;

	public Questionnaire() {

	}

	public Questionnaire(String gender,int age,String product,String reason,String cs,String others) {
		this.gender=gender;
		this.age=age;
		this.product=product;
		this.reason=reason;
		this.cs=cs;
		this.others=others;

	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getProduct() {
		return product;
	}

	public String getReason() {
		return reason;
	}

	public String getCs() {
		return cs;
	}

	public String getOthers() {
		return others;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setCs(String cs) {
		this.cs = cs;
	}

	public void setOthers(String others) {
		this.others = others;
	}


}
