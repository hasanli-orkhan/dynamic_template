package com.example.dynamic_template;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData implements CommandLineRunner {

    private final SettingRepository settingRepository;

    @Override
    public void run(String... args) throws Exception {
        settingRepository.save(Setting.builder().templateName("template_a").build());
//        settingRepository.save(Setting.builder().templateName("template_b").build());
    }
}
