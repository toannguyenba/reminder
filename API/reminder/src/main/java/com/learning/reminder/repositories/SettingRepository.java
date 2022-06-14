package com.learning.reminder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.reminder.entities.Setting;

public interface SettingRepository extends JpaRepository<Setting, Integer> {

	public Setting findFirstByOrderBySettingIdAsc();
}
