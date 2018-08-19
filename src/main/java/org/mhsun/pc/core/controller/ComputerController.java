package org.mhsun.pc.core.controller;

import java.util.List;

import org.mhsun.pc.core.model.MbgComputer;
import org.mhsun.pc.core.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerController {
	
	@Autowired
	private ComputerService computerService;
	@RequestMapping(value="/computer/all", method = RequestMethod.GET)
	public ResponseEntity<List<MbgComputer>> getAllComputers() {
		List<MbgComputer> mbgComputerList = computerService.getAllComputers();
		return new ResponseEntity<List<MbgComputer>>(mbgComputerList, HttpStatus.OK);
	}
}
