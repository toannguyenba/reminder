package com.learning.reminder.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.reminder.dto.SettingDTO;
import com.learning.reminder.entities.Setting;
import com.learning.reminder.mapper.SettingMapper;
import com.learning.reminder.repositories.SettingRepository;
import com.learning.reminder.services.SettingService;

@Service
public class SettingServiceImpl implements SettingService {
	
	@Autowired
	private SettingRepository settingRepo;

	@Override
	public List<Setting> getAllSetting() {
		List<Setting> settings = settingRepo.findAll();
		return settings;
	}

	@Override
	public SettingDTO getFirstSetting() {
		Setting setting = settingRepo.findFirstByOrderBySettingIdAsc();
		return new SettingMapper().toDTO(setting, null);
	}

}
