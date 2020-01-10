function memberLogin(){
	if(document.getElementsById("right").style.display=="none"){
		document.getElementsById("right").style.display="block";
		document.getElementsById("left").style.display="none";
	}

}
function staffLogin(){
	if(document.getElementsById("left").style.display=="none"){
		document.getElementsById("right").style.display="none";
		document.getElementsById("left").style.display="block";
	}
}