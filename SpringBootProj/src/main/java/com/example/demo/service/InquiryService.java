package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.viewmodel.InquiryFormViewModel;

@Service
public class InquiryService {
	

	/***
	 * 問い合わせ内容受付処理
	 * @param dataForm
	 * @return
	 */
	public Boolean doInquiryEntry(InquiryFormViewModel dataForm)
	{
		
//		//　受付日時の生成・設定
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		dataForm.setRecdt(dtf.format(LocalDateTime.now()));
//		
//		//　受付番号の生成・設定
//		DateTimeFormatter dtNo = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//		dataForm.setRecno("NO" + dtNo.format(LocalDateTime.now()));
		
		// 登録チェック
		if (!checkInquiry(dataForm))
		{
			return false;
		}
		
		// 登録処理
		if (!insertInquiry(dataForm))
		{
			return false;
		}
		
		// その他
		if (!otherInquiry(dataForm))
		{
			return false;
		}
		
		
		return true;
	}
	
	
	/**
	 * 登録チェック
	 * @return 
	 */
	private Boolean checkInquiry(InquiryFormViewModel dataForm)
	{
		return true;
	}
	
	/**
	 * 登録処理
	 * @return 
	 */
	private Boolean insertInquiry(InquiryFormViewModel dataForm)
	{
		return true;
	}
	
	/**
	 * その他
	 * @return 
	 */
	private Boolean otherInquiry(InquiryFormViewModel dataForm)
	{
		return true;
	}
	
}
