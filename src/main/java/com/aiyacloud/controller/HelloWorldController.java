package com.aiyacloud.controller;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hx on 2016-12-08.
 */
@Controller
public class HelloWorldController extends BaseController {

    @RequestMapping(value = {"/hello", "/"}, method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        PageHelper.startPage(1, 10);
        return "hello";
    }

    @RequestMapping(value = {"/view"})
    public ModelAndView view() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;

    }
}
