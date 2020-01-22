package com.gestion.livres.db;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestion.livres.models.Livre;

public class LivreService {
	public static void save(Livre livre) {
		String sql = "insert into livre(titre, isbn, prix, description, date_pub)"
				+ "	values(?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
			ps.setString(1, livre.getTitre());
			ps.setString(2, livre.getIsbn());
			ps.setDouble(3, livre.getPrix());
			ps.setString(4, livre.getDescription());
			ps.setDate(5, Date.valueOf(livre.getDatePub()));
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static List<Livre> findAll(){
		try {
			String sql = "select * from livre";
			PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Livre> livres = new ArrayList<Livre>();
			while(rs.next()) {
				livres.add(new Livre(rs.getLong("id"), 
								rs.getString("titre"), 
								rs.getDouble("prix")));
			}
			return livres;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static Livre findById(Long id) {
		try {
			String sql = "select * from livre where id = ?";
			PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			Livre livre = new Livre();
			while(rs.next()) {
				livre.setDatePub(rs.getDate("date_pub").toLocalDate());
				livre.setDescription(rs.getString("description"));
				livre.setPrix(rs.getDouble("prix"));
				livre.setIsbn(rs.getString("isbn"));
				livre.setId(id);
				livre.setTitre(rs.getString("titre"));
			}
			return livre;
		} catch (Exception e) {
			
		}
		return null;
	}
}
