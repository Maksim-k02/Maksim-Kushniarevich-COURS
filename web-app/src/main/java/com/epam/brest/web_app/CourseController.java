package com.epam.brest.web_app;

import com.epam.brest.service.CourseDtoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Course controller.
 */
@Controller
public class CourseController {

    private final CourseDtoService courseDtoService;

    public CourseController(CourseDtoService courseDtoService) {
        this.courseDtoService = courseDtoService;
    }

    /**
     * Goto edit course page.
     *
     * @return view name
     */
    @GetMapping(value = "/courses")
    public final String courses(Model model) {
        model.addAttribute("courses", courseDtoService.findAllWithAvgSalary());
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