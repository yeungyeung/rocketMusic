package cn.xhfc.rocketmusic.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.xhfc.rocketmusic.service.impl.AdminServiceImpl;


/**
 * Servlet implementation class UserShowServlet
 */
@WebServlet("/user_login.action")
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//    private static UserServer us=new UserServerImp(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		System.out.println(request.getParameter("adName"));
		//查询一个管理员，，返回给页面、
		request.setAttribute("admin", new AdminServiceImpl().selectByPrimaryKey(1));
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
//		response.sendRedirect("");
	}

}
