package com.test.hello;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: markkelly
 * Date: 15/08/2011
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TestController{
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ModelAndView getTest(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("In the Test Controller");
        Map<String, Object> model = new HashMap<String, Object>();

        return new ModelAndView("test",model);
    }
}
