package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Questionnaire;

public class QuestionnaireDAO {
	//データベース接続に使用する情報
	private final String JDBC_URL="jdbc:h2:tcp://localhost/~/questionnaire";
	private final String DB_USER="sa";
	private final String DB_PASS="";

	public void findByInsert(Questionnaire q) {
		//データベースへ接続
		try(Connection conn=DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			//INSERT文の準備
			String sql="INSERT INTO QUESTIONNAIRE(GENDER,AGE,PRODUCT,REASON,CS,OTHERS) VALUES(?,?,?,?,?,?)";
			PreparedStatement pSmt=conn.prepareStatement(sql);
			pSmt.setString(1,q.getGender());
			pSmt.setInt(2,q.getAge());
			pSmt.setString(3,q.getProduct());
			pSmt.setString(4,q.getReason());
			pSmt.setString(5,q.getCs());
			pSmt.setString(6,q.getOthers());

			//INSERT文を実行
			int rs=pSmt.executeUpdate();

			System.out.println(q.getGender());
			System.out.println(q.getAge());
			System.out.println(q.getProduct());
			System.out.println(q.getReason());
			System.out.println(q.getCs());
			System.out.println(q.getOthers());



		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	//public void findByDelete(Questionnaire q) {
		//データベースへ接続
		//try(Connection conn=DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			//DELETE文の準備
			//String sql="DELETE FROM QUESTIONNAIRE WHERE "
		//}
	//}
}
