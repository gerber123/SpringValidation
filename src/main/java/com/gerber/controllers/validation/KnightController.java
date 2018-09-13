package com.gerber.controllers.validation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class KnightController
{
    @RequestMapping("/")
    public String menu()
    {
        return "menu";
    }

    @RequestMapping("/creator")
    public String kreatowanie(Model model)
    {
        model.addAttribute("knight",new Knight());
        return "creatorForm";
    }
    @RequestMapping("/creatingProcess")
    public String Tworzenie(@Valid @ModelAttribute("knight") Knight knight, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "creatorForm";
        }
        else {
            return "completeKnight";
        }
        }

}
