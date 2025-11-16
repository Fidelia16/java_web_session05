package com.session05.Controller;

import com.session05.Model.Student;
import com.session05.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/studentController")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("listStudent", studentService.findAll());
        return "students";
    }
    @GetMapping("/search")
    public String findByName(@RequestParam(required = false) String keyword, Model model) {
        List<Student> students = studentService.findByName(keyword);
        model.addAttribute("listStudent", students);
        model.addAttribute("keyword", keyword);
        return "search";
    }
    @GetMapping("/initCreate")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("isUpdate", false);
        return "newStudent";
    }
    @PostMapping("/createStudent")
    public String save(Student student) {
        boolean result= studentService.create(student);
        if (result){
            return "redirect:/studentController/findAll";
        }
        return "error";
    }
    @GetMapping("initUpdate")
    public String initUpadte(@RequestParam String id , Model model) {
        Student student= studentService.findById(id);
        model.addAttribute("student", student);
        model.addAttribute("isUpdate", true);
        return "newStudent";
    }

    @PostMapping("updateStudent")
    public String update(Student student) {
        boolean result= studentService.update(student);
        if (result){
            return "redirect:/studentController/findAll";
        }
        return "error";
    }
    @GetMapping("initDelete")
    public String initDelete(@RequestParam String id, Model model) {
        Student student= studentService.findById(id);
        model.addAttribute("student", student);
        studentService.delete(id);
        return "redirect:/studentController/findAll";
    }
}
