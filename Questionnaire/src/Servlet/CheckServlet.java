package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Questionnaire;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		String gender=request.getParameter("gender");
		String age=request.getParameter("age");
		int intAge=Integer.parseInt(age);
		String product=request.getParameter("product");
		String reason=request.getParameter("reason");
		String cs=request.getParameter("cs");
		String others=request.getParameter("others");


		Questionnaire q=new Questionnaire(gender,intAge,product,reason,cs,others);


		//HttpSessionインスタンスを取得
		HttpSession session=request.getSession();
		//セッションスコープにインスタンスを保存
		session.setAttribute("questionnaire",q);

		//QuestionnaireLogicでDAO経由でDBに入力データを保存
		//QuesitonnaireLogic qL=new QuesitonnaireLogic();
		//qL.execute(q);

		//確認画面にフォワード
		RequestDispatcher rD=request.getRequestDispatcher("/WEB-INF/jsp/check.jsp");
		rD.forward(request, response);



	}

}
