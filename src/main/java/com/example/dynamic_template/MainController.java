package com.example.dynamic_template;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final SettingService settingService;

    @GetMapping
    public ModelAndView homepage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(settingService.getActiveTemplateName() + "/index.html");
        return modelAndView;
    }

    @GetMapping("/settings")
    public ModelAndView settings() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("settings");
        return modelAndView;
    }

    @PostMapping("/settings")
    public RedirectView updateTemplate(String templateName) {
        settingService.updateTemplate(templateName);
        return new RedirectView("/");
    }
}
