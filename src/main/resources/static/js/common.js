//////////////////////////////////////////////////////////////
////////////////////////////IMPORT JS/////////////////////////
//document.write('<script src="../../static/js/ranking.js"></script>');
//document.write('<script src="../../static/js/perfil.js"></script>');

//////////////////////////////////////////////////////////////
/////////////////////CAMBIAR ICONO IDIOMAS////////////////////
function quitar_en() {
	var eng = document.getElementById("english");
	eng.setAttribute("style", "display:none");

	return eng;
}

function poner_es() {
	var esp = document.getElementById("espana");
	esp.removeAttribute("style");

	return esp;
}

function quitar_es() {
	var esp = document.getElementById("espana");
	esp.setAttribute("style", "display:none");

	return esp;
}

function poner_en() {
	var eng = document.getElementById("english");
	eng.removeAttribute("style");

	return eng;
}