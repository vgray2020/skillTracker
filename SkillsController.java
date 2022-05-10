package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//At localhost:8080, add text that states the three possible programming languages someone could be working on.
// You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming
//languages of your choosing.
@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String createHomePage() {
        String list =


                        "<h1>Skills Tracker</h1>" +
                            "<h2>Here are the list of Skills:</h2>" +
                            "<ol>" +
                            "<li><h2>Java</h2></li>" +
                            "<li><h2>JavaScript</h2></li>" +
                            "<li><h2>React</h2></li>" +
                            "</ol>";
        return list;
    }


    //At localhost:8080/form, add a form
    // that lets the user enter their name and choose their favorite,
// second favorite, and third favorite programming languages on your list.
// Use select elements for each of the rankings.
// Just as with the exercises, we will use @GetMapping().

    @GetMapping("/form")
    @ResponseBody
    public String createForm () {

        String form =

                "<form>" +

                "<label>Name<input type ='text' name= 'name'></label><br />"+

                "<label> My first language of choice<br />" +
                   " <select name='firstlanguage' id='firstlanguage'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javascript'>JavaScript</option>" +
                        "<option value='react'>React</option>" +
                    "</select></label>" +

                "<label> My second language of choice<br />" +
                " <select name='secondlanguage' id='secondlanguage'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select></label>" +

                "<label> My third language of choice<br />" +
                " <select name='thirdlanguage' id='thirdlanguage'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select></label>" +

                "<input type='submit' value='Submit'><br />" +

                "</form>";
        return form;
    }

    //Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1
    // stating the user’s name and an ol showing the three programming languages in the order they chose.
    @PostMapping("/form")
    @ResponseBody
    public String respondToForm(@RequestParam String name,
                                @RequestParam String firstlanguage,
                                @RequestParam String secondlanguage,
                                @RequestParam String thirdlanguage) {
        return

                "<h1>" + name + "</h1>" +

                "<ol>" +
                "<li>"+ firstlanguage + "</li>" +
                "<li>" + secondlanguage + "</li>" +
                "<li>"+ thirdlanguage + "</li>" +
                "</ol>";
    }


}
