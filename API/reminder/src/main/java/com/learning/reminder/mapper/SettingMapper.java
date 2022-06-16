package com.learning.reminder.mapper;

import java.util.List;

import com.learning.reminder.dto.SettingDTO;
import com.learning.reminder.dto.StatusDTO;
import com.learning.reminder.entities.Setting;

public class SettingMapper {
	
	public SettingDTO toDTO(Setting setting, List<StatusDTO> statuses) {
		SettingDTO settingDTO = new SettingDTO();
		settingDTO.setSettingId(setting.getSettingId());
		settingDTO.setNotiTime(setting.getNotiTime());
		settingDTO.setMode(setting.getMode());
		settingDTO.setRecordPerPage(setting.getRecordPerPage());
		settingDTO.setDateFormat(setting.getDateFormat());
		settingDTO.setStatuses(statuses);
		return settingDTO;
	}
}
