function Colordiv1() {
	document.getElementById("navbar").style.backgroundColor = "rgba(45,63,253,1)";
}

function Colordiv2() {
	document.getElementById("navbar").style.backgroundColor = "rgb(255, 0, 0)";
}
function Colordiv3() {
	document.getElementById("navbar").style.backgroundColor = "rgba(22,198,28,1)";
}
function Colordiv4() {
	document.getElementById("navbar").style.backgroundColor = "rgba(224,178,24,1)";
}
function Colordiv5() {
	document.getElementById("navbar").style.backgroundColor = "rgba(161,24,224,1)";
}
function Colordiv6() {
	document.getElementById("navbar").style.backgroundColor = "rgba(255,125,11,1)";
}

function obtenerOfertas() {
	var id_asignatura= document.getElementById("id_asignaturas").value;
	

	fetch('/mostrarPreguntas/'+id_asignatura, { headers: { "Content-Type": "application/json; charset=utf-8" } })
		.then(res => res.json())
		.then(response => {

//			for (let oferta of response) {
//				var tr = crearFila(oferta);
//				//añado fila
//				tbody.appendChild(tr);
//			}
		})
}


document.addEventListener("DOMContentLoaded", function() {
	$("#asignaturas").click(obtenerOfertas);
//	$("#div_2").click(Colordiv2);
//	$("#div_3").click(Colordiv3);
//	$("#div_4").click(Colordiv4);
//	$("#div_5").click(Colordiv5);
//	$("#div_6").click(Colordiv6);

});