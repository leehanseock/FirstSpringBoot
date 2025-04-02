package kr.ac.kopo.leehanseock.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Example06Controller {
    @GetMapping("/exam06")
    public String requestMethod(Model model) {
            model.addAttribute("data1","model 예제~");
            model.addAttribute("data2","웹 요청할 때 URL은 http://localhost:8080/exam06 입니다.");
            return "viewPage06_1";
    }

    @GetMapping("/exam07")
    public String requestMethod2(ModelMap modelMap) {
        modelMap.addAttribute("message","ModelMap 클래스는 Model 인터페이스를 상속 받아서 구현되었다.");
        modelMap.addAttribute("message2","ModelMap 클래스는 Model 인터페이스의 기능과 동일하거나 더 확장된 기능을 사용할 수 있다.");

        List<String> list = new ArrayList<String>();
        list.add("오렌지🍊");
        list.add("딸기🍓");
        list.add("복숭아🍑");

        modelMap.addAttribute("fruitList",list);

        return "viewPageModelMap";
    }

    @GetMapping("/exam08")
    public ModelAndView requestMethod3() {
        ModelAndView modelView = new ModelAndView("viewPageModelAndView");
        //modelView.setViewName("viewPageModelAndView");
        modelView.addObject("msg1","ModelAndView 클래스 예제");
        modelView.addObject("msg2","ModelAndView 클래스는 View의 이름을 생성자 또는 메소드를 통해서 설정할 수 있다");
        modelView.addObject("msg3","ModelAndView 클래스는 값이나 객체 참조값을 전달할 때 사용하는 메소드가 Model, ModelMap과 다르다('addObject')");
        modelView.addObject("msg4","ModelAndView 클래스는 요청 메소드의 매개변수를 통해 사용하는 것이 아니라 객체 생성을 해서 사용해야하며, 리턴 값으로 ModelAndView객체의 참조값을 사용한다.");

        List<String> fList = new ArrayList<String>();
        fList.add("Orange");
        fList.add("Strawberry");
        fList.add("Peach");
        modelView.addObject("fruitList2",fList);
        return modelView;
    }
}
