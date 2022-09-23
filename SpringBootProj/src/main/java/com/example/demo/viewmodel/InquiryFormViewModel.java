package com.example.demo.viewmodel;

//lombokを使わない場合 ボイラーパネルコード

public class InquiryFormViewModel {
	private String name;
	private String mail;
	private int age;
	private String gender;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}

	public String getMail() {
		return this.mail;
	}

	public int getAge() {
		return this.age;
	}
	public String getGender() {
		return this.gender;
	}

}


//import lombok.Data;
//
//@Data
//public class InquiryFormViewModel {
//
//	/**
//	 * 受付日時
//	 */
//	private String recdt;
//
//	/**
//	 * 受付番号
//	 */
//	private String recno;
//	
//	/**
//	 * 名前
//	 */
//	private String name;
//	
//	/**
//	 * メールアドレス
//	 */
//	private String mail;
//	
//	/**
//	 * 年齢
//	 */
//	private Integer age;
//	
//	/**
//	 * 性別
//	 */
//	private String gender;
//	
//}
