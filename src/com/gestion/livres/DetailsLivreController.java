package com.gestion.livres;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.livres.db.LivreService;
import com.gestion.livres.models.Livre;

@WebServlet({ "/DetailsLivreController", "/livre" })
public class DetailsLivreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DetailsLivreController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		
		Livre livre = LivreService.findById(id);
		request.setAttribute("livre", livre);
		
		request.getRequestDispatcher("livre.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
