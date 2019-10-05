package soni.sandeep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    ListOfClasses listOfClasses;

    @RequestMapping("/course")
    public List<Course> allCourse(){
        return listOfClasses.getCourse();
    }
    @RequestMapping("/course/{id}")
    public Course allCourse(@PathVariable String id){
        return listOfClasses.specificCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addcourse" )
    public String addCourse(@RequestBody Course c){
        return listOfClasses.add(c);

    }

}
