package com.epam.brest.web_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Course controller.
 */
@Controller
public class CourseController {

    /**
     * Goto edit course page.
     *
     * @return view name
     */
    @GetMapping(value = "/courses")
    public final String courses(Model model) {
        return "courses";
    }


    /**
     * Goto edit department page.
     *
     * @return view name
     */
    @GetMapping(value = "/course/{id}")
    public final String gotoEditCoursePage(@PathVariable Integer id, Model model) {
        return "course";
    }

    /**
     * Goto new course page.
     *
     * @return view name
     */
    @GetMapping(value = "/course/add")
    public final String gotoAddCoursePage(Model model) {
        return "course";
    }
}