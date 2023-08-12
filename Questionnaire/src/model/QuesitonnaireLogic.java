package model;

import dao.QuestionnaireDAO;

public class QuesitonnaireLogic {
	public void execute(Questionnaire q) {
		QuestionnaireDAO dao=new QuestionnaireDAO();
		dao.findByInsert(q);

	}

	//public void deleteExecute(Questionnaire q) {
		//QuestionnaireDAO dao=new QuestionnaireDAO();
		//dao.findByDelete(q);
	//}
}
