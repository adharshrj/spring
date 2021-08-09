package com.assessment.statuscodes.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.assessment.statuscodes.exceptions.NotFoundException;
@Controller
@RequestMapping(value = "re")
public class MyController {

    @GetMapping(value = "/orders/{id}")
    @ResponseBody
    public String getOrder(@PathVariable("id") long id) {

        if (id < 0 || id > 500) {

            var message = String.format("Order %d not found", id);
            throw new NotFoundException(message);
        }

        var message = String.format("Returning order %d", id);

        return message;
    }

    @DeleteMapping(value = "/orders/{id}")
    @ResponseBody
    public String deleteOrder(@PathVariable("id") long id) {

        if (id < 0 || id > 500) {

            var message = String.format("Order %d not found", id);
            throw new NotFoundException(message);
        }

        var message = String.format("Deleted Order %d", id);

        return message;
    }
}