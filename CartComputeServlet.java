package com.ust.iics.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.model.CartBean;


@WebServlet("/compute.html")
public class CartComputeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		CartBean bean = new CartBean();
		
		try {
			bean.computeTotal();
		}
		catch(Exception e) {
			
		}
		request.setAttribute("compDetails", bean);
		rd = request.getRequestDispatcher("display.html");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
