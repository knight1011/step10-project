package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.InquiryService;
import com.example.demo.viewmodel.InquiryFormViewModel;

@Controller
public class InquiryController {
	
	//　業務処理クラス
	@Autowired InquiryService inquiryService;

	@GetMapping("/InquiryForm")
	public String testForm(@ModelAttribute InquiryFormViewModel dataForm,Model model) {
		model.addAttribute("dataForm",new InquiryFormViewModel());
		return "InquiryForm";
	}
 
	@PostMapping("/InquiryResult")
	public String testResult(@ModelAttribute InquiryFormViewModel dataForm,Model model) {
		
		// 業務処理の実施
		if (inquiryService.doInquiryEntry(dataForm))
		{
			// 正常処理
		}
		else
		{
			// 異常処理
		}
			
		model.addAttribute("dataForm",dataForm);
		return "InquiryResult";
	}	
	
}
