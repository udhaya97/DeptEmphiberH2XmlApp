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
import com.deptemphiberxmlh2dbapp.service.DeptEmpServImpl;
import com.deptemphiberxmlh2dbapp.service.DeptEmpService;

/**
 * Servlet implementation class DeleteDepartment
 */
@WebServlet("/deledept")
public class DeleteDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDepartment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int depId = Integer.parseInt(request.getParameter("deptId"));
		
		DeptEmpService edf = new DeptEmpServImpl();
		edf.delteDeptServ(depId);
		
		HttpSession sep = request.getSession();
		sep.setAttribute("deleteDoneDept","done");
		response.sendRedirect("homeserv");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
