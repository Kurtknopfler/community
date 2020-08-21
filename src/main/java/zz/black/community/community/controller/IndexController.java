package zz.black.community.community.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import zz.black.community.community.dto.QuestionDTO;
import zz.black.community.community.mapper.QuestionMapper;
import zz.black.community.community.mapper.UserMapper;
import zz.black.community.community.model.Question;
import zz.black.community.community.model.User;
import zz.black.community.community.service.QuestionService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length != 0)
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals("token"))
                {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if(user != null)
                    {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }

            }

        List<QuestionDTO> questionList = questionService.list();
        model.addAttribute("questions", questionList);
        return "index";
    }
}
