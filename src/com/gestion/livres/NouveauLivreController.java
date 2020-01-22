package com.gestion.livres;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.livres.db.LivreService;
import com.gestion.livres.models.Livre;

@WebServlet({ "/NouveauLivreController", "/nouveau-livre" })
public class NouveauLivreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public NouveauLivreController() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("nouveauLivre.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre = request.getParameter("titre");
		String isbn = request.getParameter("isbn");
		double prix = Double.parseDouble(request.getParameter("prix"));
		LocalDate datePub = LocalDate.parse(request.getParameter("datePub"));
		String description = request.getParameter("description");
		Livre livre =  new Livre(isbn, description, titre, prix, datePub);
		
		LivreService.save(livre);
		
		doGet(request, response);
	}

}
