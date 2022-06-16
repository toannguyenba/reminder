package com.learning.reminder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.reminder.entities.Setting;
import com.learning.reminder.services.SettingService;

@RestController
public class SettingController {
	
	@Autowired
	private SettingService settingService;

	@GetMapping("/settings")
	public List<Setting> getAllSetting() {
		
		List<Setting> settings = settingService.getAllSetting();
		return settings;
	}
}
