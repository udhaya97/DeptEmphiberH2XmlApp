package com.deptemphiberxmlh2dbapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deptemphiberxmlh2dbapp.dao.DeptEmpDao;
import com.deptemphiberxmlh2dbapp.dao.DeptEmpDaoImpl;
import com.deptemphiberxmlh2dbapp.model.Department;
import com.deptemphiberxmlh2dbapp.service.DeptEmpServImpl;
import com.deptemphiberxmlh2dbapp.service.DeptEmpService;

/**
 * Servlet implementation class SaveDept
 */
@WebServlet("/savedept")
public class SaveDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String deptName=request.getParameter("deptName");
		String deptLoc=request.getParameter("deptLoc");
		Department dt = new Department();
		
		//dt.setDeptId(0);
		dt.setDeptName(deptName);
		dt.setDeptLoc(deptLoc);
		DeptEmpService df = new DeptEmpServImpl();
		
		df.createDeptServ(dt);
		HttpSession sem = request.getSession();
		sem.setAttribute("submitDoneDept","done");
		response.sendRedirect("homeserv");
		
	}

}
