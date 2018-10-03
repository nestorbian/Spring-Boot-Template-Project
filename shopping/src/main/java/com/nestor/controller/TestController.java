package com.nestor.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.common.BizException;
import com.nestor.common.LogHttpInfo;
import com.nestor.entity.Result;

@RestController
public class TestController {
	
	@RequestMapping(value = "/test/{number}", method = RequestMethod.GET)
	@LogHttpInfo
	public Result<Boolean> test(@PathVariable int number) {
		if (number < 0) {
			throw new BizException("number不能小于零");
		}
	    return new Result<>(true);
	}
}
