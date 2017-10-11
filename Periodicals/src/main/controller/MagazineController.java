package main.controller;

import main.dao.MagazineDAO;
import main.dao.impl.MagazineDAOImpl;
import main.entities.Category;
import main.entities.Magazine;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MagazineController extends HttpServlet{
    public MagazineController(){
        super();
    }

    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        MagazineDAO magazineDAO = new MagazineDAOImpl();
        List<Category> categoryList = magazineDAO.findAllCategories();
        ServletContext context = config.getServletContext();
        context.setAttribute("categoryList", categoryList);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String base = "/jsp/";
        String url = base + "home.jsp";
        String action = request.getParameter("action");
        String category = request.getParameter("category");
        String keyWord = request.getParameter("keyWord");
        if (action != null) {
            switch (action) {
                case "allBooks":
                    findAllMagazines(request, response);
                    url = base + "listOfMagazines.jsp";
                    break;
                case "category":
                    findAllMagazines(request, response);
                    url = base + "category.jsp?category=" + category;
                    break;
                case "search":
                    searchMagazines(request, response, keyWord);
                    url = base + "searchResult.jsp";
                    break;

            }
        }
        RequestDispatcher requestDispatcher = getServletContext()
                .getRequestDispatcher(url);
        requestDispatcher.forward(request, response);
    }

    private void findAllMagazines(HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {
        try {
            MagazineDAO magazineDAO = new MagazineDAOImpl();
            List<Magazine> magazinesList = magazineDAO.findAll();
            request.setAttribute("magazinesList", magazinesList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchMagazines(HttpServletRequest request,
                             HttpServletResponse response, String keyWord)
            throws ServletException, IOException {
        try {
            MagazineDAO magazineDAO = new MagazineDAOImpl();
            List<Magazine> magazineList = magazineDAO.searchMagazinesByKeyword(keyWord);

            request.setAttribute("magazinesList", magazineList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
