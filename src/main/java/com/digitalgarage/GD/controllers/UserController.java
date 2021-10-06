package com.digitalgarage.GD.controllers;

import com.digitalgarage.GD.entities.User;
import com.digitalgarage.GD.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private IUserService iUserService;

    @PostMapping("/createuser")
    public void CreatePost( @ModelAttribute("user") User user, BindingResult result, ModelAndView model)
    {
        iUserService.createUser(user);
    }
}
