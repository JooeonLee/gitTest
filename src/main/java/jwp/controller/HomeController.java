package jwp.controller;

import core.mvc.Controller;
import jwp.dao.QuestionDao;
import jwp.model.Question;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class HomeController implements Controller {
    QuestionDao questionDAO = new QuestionDao();
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Question> questions = questionDAO.findAll();
        req.setAttribute("questions",questions);
        return "/home.jsp";
    }
}
