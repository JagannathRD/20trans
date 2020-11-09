package com.xworkz.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.xworkz.ecommerce.dao.DaoImpl;
import com.xworkz.ecommerce.dao.DaoInterface;
import com.xworkz.ecommerce.dto.DTO;

@WebServlet("/se")
public class ECommerceServelet extends GenericServlet {

	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling service");
		String item = req.getParameter("item");
		String price = req.getParameter("price");
		String color = req.getParameter("color");

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("select item details " + item + " " + price + " " + color + " ");
		
		DTO dto= new DTO();
		dto.setItem(item);
		dto.setColor(color);
		dto.setPrice(Integer.parseInt(price));
		
		DaoInterface daoInterface= new DaoImpl();
		daoInterface.saveItems(dto);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Calling init");
		super.init();
	}

	@Override
	public void destroy() {
		System.out.println("Calling destroy");
		super.destroy();
	}

}
