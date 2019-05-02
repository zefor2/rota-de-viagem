package br.com.roteiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("roteiro")
public class RoteiroController {
	
	@GetMapping("/{id}")
    public @ResponseBody String getRoteiro(@PathVariable int id) {
        return "ok";
    }

}
