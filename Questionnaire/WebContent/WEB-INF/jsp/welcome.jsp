<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>製品アンケート</title>
</head>
<body>
<h1>製品アンケートのお願い</h1>

<form action="/Questionnaire/CheckServlet" method="post" name="form">
Q1:性別を選択してください<br>
<!-- <select name="gender">
	<option value="">--性別を選択してください--</option>
	<option value="male">男性</option>
	<option value="female">女性</option>
	<option value="none">どちらでもない</option>
</select> -->
<label><input type="radio"  name="gender" value="男性" checked>男性</label>
<label><input type="radio"  name="gender" value="女性">女性</label>
<label><input type="radio"  name="gender" value="どちらでもない">どちらでもない</label><br><br>

Q2:年齢を入力してください<br>
<input type="text" name="age" id="age"  placeholder="年齢を入力してください" required><br><br>

Q3:ご使用中の製品を選択してください<br>
<select name="product" required>
	<option value="">--製品名を選択してください--</option>
	<option value="α〇">XXXX社 α〇</option>
	<option value="α〇3">XXXX社 α〇3</option>
	<option value="α〇3">XXXX社 α〇S3</option>
	<option value="α〇R3">XXXX社 α〇R3</option>
	<option value="α〇R4">XXXX社 α〇R4</option>
	<option value="α〇R5">XXXX社 α〇R5</option>
</select><br><br>

Q4:製品ご使用の理由をお答えください<br>
<select name="reason" required>
	<option value="">--選択してください--</option>
	<option value="デザインが気に入っているから">デザインが気に入っているから</option>
	<option value="機能が優れているから">機能が優れているから</option>
	<option value="その他">その他</option>
</select><br><br>

Q5:製品満足度をお答えください<br>
<label><input type="radio" name="cs"  value="満足している" checked>満足している</label>
<label><input type="radio" name="cs"  name="まあまあ満足している">まあまあ満足している</label>
<label><input type="radio" name="cs"  name="普通">普通</label>
<label><input type="radio" name="cs" name="少し不満">少し不満</label>
<label><input type="radio" name="cs" name="とても不満">とても不満</label><br><br>

Q6:その他ご要望等ございましたら、ご自由にお書きください<br>
<textarea name="others" cols="50" rows="10" maxlength=400></textarea><br><br>

<input type="submit" value="次に進む">

</form>

<script>
function gender(){
	//バリデーションチェック・アラート処理
	//let gender=document.getElementById('gender');
	//let age=document.getElementById('age');
	//let product=document.getElementById('product');
	//let reason=document.getElementById('reason');
	//let cs=document.getElementById('cs');


	if(form.gender.value==""){
		alert("性別を選択してください");
		return false;
	}

	if(form.age.value==""){
		alert("年齢を入力してください");
		return false;
	}

	if(form.product.value==""){
		alert("製品名を選んでください");
		return false;
	}

	if(form.reason.value==""){
		alert("ご使用理由を回答してください");
		return false;
	}

	if(form.cs.value==""){
		alert("製品満足度を選択してください");
		return false;
	}



}
</script>
</body>
</html>