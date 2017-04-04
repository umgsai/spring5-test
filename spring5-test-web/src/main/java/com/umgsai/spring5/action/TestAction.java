package com.umgsai.spring5.action;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shang on 2017-4-4.
 */
@Controller
public class TestAction {

    @Getter
    private String today;

    @RequestMapping(value = "/test")
    public String test (Model model) {
        today = "2017-4-4 19:45:39";
        model.addAttribute("today", today);
        model.addAttribute("xss", "<script>alert('test')</script>");
        return "test";
    }
}
