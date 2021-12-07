package com.galkin.spring_boot_2.controllers;

import com.galkin.spring_boot_2.Employee;
import com.galkin.spring_boot_2.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.TreeMap;


@Controller
public class MyRestController {

    @GetMapping("/")
    public String inputForm(Model model) {
        Employee emp = new Employee();
        emp.setName("Dmitry");
        emp.setSurname("Galkin");
        emp.setSalary(1500);
        emp.setDepartament("IT");
        model.addAttribute("employee", emp);
        return "form";
    }

    @PostMapping(value = "/showDetails")
    @ResponseBody
    public Request outputForm(HttpServletRequest request, Model model) {
        TreeMap<String, String[]> param = new TreeMap<>(request.getParameterMap());
        Request req = new Request();
        String value = Request.transformMap(param);
        req.setStatus("success");
        req.setResult("signature", Request.getHash(value.getBytes()));
        return req;
    }


}
