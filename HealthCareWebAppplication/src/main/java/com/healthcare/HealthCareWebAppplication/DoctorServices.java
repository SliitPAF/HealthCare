package com.healthcare.HealthCareWebAppplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DoctorServices {
	Connection con = null;

	public DoctorServices() {
		String dbURL = "jdbc:mysql://localhost:3306/healthcare_db";
		String dbUsername = "root";
		String dbPassword = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<DoctorDetails> getDoctors() {

		List<DoctorDetails> DoctorDetails = new ArrayList<>();

		String sql = "SELECT * FROM doctors";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				DoctorDetails p = new DoctorDetails();

				p.setDocotr_id(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setSpecialty(rs.getString(4));
				p.setPnumber(rs.getInt(5));

				DoctorDetails.add(p);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return DoctorDetails;
	}

}