package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.service.Service;

@Controller
public class ParoleController {
	@RequestMapping(value = "/contaParole", method = RequestMethod.POST)
	public ModelAndView operazioni(@RequestParam("testo") String testo, Model model) {
		Service s = new Service(testo);	
		return new ModelAndView("risultato","conteggio",s.contaVocaboli());
	}
}
