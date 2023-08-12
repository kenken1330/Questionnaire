package test;

import dao.QuestionnaireDAO;
import model.Questionnaire;

public class QuestionnaireDAOtest {

	public static void main(String[] args) {
		testFindByInsert();
	}
	public static void testFindByInsert() {
		//Questionnaire q=new Questionnaire("女",25,"カメラ","テスト","お試し","テストメソッドから入力");
		Questionnaire q=new Questionnaire("女",25,"カメラ","テスト","お試し","テストメソッドから入力");
		QuestionnaireDAO dao=new QuestionnaireDAO();
		dao.findByInsert(q);

	}

}
