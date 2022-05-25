package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.RespuestaService;

@Controller
public class RespuestaController {
	@Autowired
	private  RespuestaService respuestaService;
}
