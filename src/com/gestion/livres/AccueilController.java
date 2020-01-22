package com.gestion.livres;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.livres.db.LivreService;
import com.gestion.livres.models.Livre;

@WebServlet({ "/AccueilController", "/accueil", "" })
public class AccueilController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AccueilController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Livre> livres = LivreService.findAll();
		request.setAttribute("livres", livres);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
