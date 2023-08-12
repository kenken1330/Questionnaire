package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.QuesitonnaireLogic;
import model.Questionnaire;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//フォワード
		//request.setCharacterEncoding("UTF-8");
		//String remove=request.getParameter("remove");

		//System.out.println("removeの内容："+remove);

		//HttpSession session=request.getSession();
		//session.getAttribute("questionnaire");

		//QuesitonnaireLogic qL=new QuesitonnaireLogic();

		//if(remove.equals(remove)) {
			//ここでDBから削除するのではなく、ここで登録するようにしてはどう？
			//qL.deleteExecute(null);
		HttpSession session=request.getSession();
		session.removeAttribute("questionnaire");
		response.sendRedirect("/Questionnaire/Welcome");
		//}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		Questionnaire q=(Questionnaire)session.getAttribute("questionnaire");

		//DBにアンケート情報を保存
		QuesitonnaireLogic qL=new QuesitonnaireLogic();
		qL.execute(q);

		//登録完了後、セッション内容を破棄
		session.removeAttribute("questionnaire");

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/register.jsp");
		dispatcher.forward(request, response);

	}

}
