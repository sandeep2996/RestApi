package soni.sandeep;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Service
public class ListOfClasses {
    List<Course> list = new ArrayList<>();

    public String add(Course c){
        list.add(c);
        return "Successful";
    }

    public List<Course> getCourse(){
        return list;
    }
    @RequestMapping("/course/{id}")
    public Course specificCourse(@PathVariable String id) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).id.equals(id)){
                return list.get(i);
            }
        }
        return list.get(0);

    }
}
