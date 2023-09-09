package com.example.dynamic_template;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SettingService {

    private final SettingRepository settingRepository;

    public void updateTemplate(String templateName) {
        Setting setting = settingRepository.getReferenceById(1);
        setting.setTemplateName(templateName);
        settingRepository.save(setting);
    }

    public String getActiveTemplateName() {
        return settingRepository.getReferenceById(1).getTemplateName();
    }
}
