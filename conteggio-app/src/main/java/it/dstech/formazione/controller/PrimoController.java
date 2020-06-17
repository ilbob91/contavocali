package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimoController {
	@RequestMapping(value = "/conteggio", method = RequestMethod.POST)
	public ModelAndView operazioni(@RequestParam("testo") String testo, Model model) {
		return new ModelAndView("scelta", "testo", testo);
	}
}
