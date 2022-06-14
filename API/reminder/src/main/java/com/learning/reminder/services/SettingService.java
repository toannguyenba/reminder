package com.learning.reminder.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.reminder.entities.Setting;

@Service
public interface SettingService {

	public List<Setting> getAllSetting();
	
	public Setting getFirstSetting();
}
