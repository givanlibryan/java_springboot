package com.example.spring.controller;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class MahasiswaController {
	@AutoWired
	private MahasiswaDao mahasiswaDao;
	
	@GetMapping("/index")
	public ModelMap getAll(Pageable pageable) {
		return new ModelMap().addAttribute("mahasiswa", mahasiswaDao.findAll(pageable));
	}
	@GetMapping("/")
	public String index() {
		return "redirect:/index";
	}
}
