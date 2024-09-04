function registInout() {
	const inoutForm = document.inoutForm;
	const w_workno = document.getElementById("w_workno");
	const w_lastdate = document.getElementById("w_lastdate");
	const w_lasttime = document.getElementById("w_lasttime");
	
	if(w_workno.value.trim() == ""){
		window.alert("작업지시번호가 입력되지 않았습니다!")
		inoutForm.w_workno.focus();
		return;
	}
	
	var chk = false;
	for(var i = 0; i < inoutForm.p_p1.length; i++){
		if(inoutForm.p_p1[i].checked == true){
			chk = true;
		}
	}if(chk == false) {
		window.alert("재료준비항목이 선택되지 않았습니다!");
		return false;
	}
	
	var chk2 = false;
	for(var i = 0; i < inoutForm.p_p2.length; i++){
		if(inoutForm.p_p2[i].checked == true){
			chk2 = true;
		}
	}if(chk2 == false) {
		window.alert("인쇄공정 항목이 선택되지 않았습니다!");
		return false;
	}
	
	var chk3 = false;
	for(var i = 0; i < inoutForm.p_p3.length; i++){
		if(inoutForm.p_p3[i].checked == true){
			chk3 = true;
		}
	}if(chk3 == false) {
		window.alert("코팅공정 항목이 선택되지 않았습니다!");
		return false;
	}
	
	var chk4 = false;
	for(var i = 0; i < inoutForm.p_p4.length; i++){
		if(inoutForm.p_p4[i].checked == true){
			chk4 = true;
		}
	}if(chk4 == false) {
		window.alert("합지공정 항목이 선택되지 않았습니다!");
		return false;
	}
	
	var chk5 = false;
	for(var i = 0; i < inoutForm.p_p5.length; i++){
		if(inoutForm.p_p5[i].checked == true){
			chk5 = true;
		}
	}if(chk5 == false) {
		window.alert("적합공정 항목이 선택되지 않았습니다!");
		return false;
	}
	
	var chk6 = false;
	for(var i = 0; i < inoutForm.p_p6.length; i++){
		if(inoutForm.p_p6[i].checked == true){
			chk6 = true;
		}
	}if(chk6 == false) {
		window.alert("포장적재 항목이 선택되지 않았습니다!");
		return false;
	}
	
	if(w_lastdate.value.trim() == ""){
		window.alert("최종작업일자가 입력되지 않았습니다!")
		inoutForm.w_lastdate.focus();
		return;
	}
	
	if(w_lasttime.value.trim() == ""){
		window.alert("최종작업시간이 입력되지 않았습니다!")
		inoutForm.w_lasttime.focus();
		return;
	}
	
	window.alert("작업공정입력이 정상적으로 등록되었습니다!");
	inoutForm.submit();
}

function resetInout() {
	const inoutForm = document.inoutForm;

	window.alert("정보를 지우고 처음부터 다시 입력합니다");
	inoutForm.reset();
	inoutForm.p_seno.focus();
}

function upInout(){
	const inoutForm = document.inoutForm;
	
	window.alert("작업공정입력이 정상적으로 수정되었습니다!");
	inoutForm.submit();
}