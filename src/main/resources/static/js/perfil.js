///////////////////////////////////////////////////////////
////////////////////GRAPHIC CHART//////////////////////////

// Load the Visualization API and the corechart package.
google.charts.load('current', { 'packages': ['corechart'] });

// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawPerfilChart);
google.charts.setOnLoadCallback(drawPerfilDataTable);

var arrRandom = [];

function createDate() {
	for (var i = 0; i <= 20; i++) {
		var random = Math.floor(Math.random() * 10 + 1);
		arrRandom.push(random);
	}
	console.log(arrRandom);
	return arrRandom;

}
// Callback that creates and populates a data table,
// instantiates the pie chart, passes in the data and
// draws it.
function drawPerfilChart() {
	const data = ['7', '4', '2', '6', '3', '8'];
	console.log(data);

	let asig_1 = parseInt(data[0]);
	let asig_2 = parseInt(data[1]);
	let asig_3 = parseInt(data[2]);
	let asig_4 = parseInt(data[3]);
	let asig_5 = parseInt(data[4]);
	let asig_6 = parseInt(data[5]);

	var final_data = google.visualization.arrayToDataTable([
		['Asignatura', 'Test'],
		['asignatura_1', asig_1],
		['asignatura_2', asig_2],
		['asignatura_3', asig_3],
		['asignatura_4', asig_4],
		['asignatura_5', asig_5],
		['asignatura_6', asig_6]
	]);

	var options = {

	};

	var chart = new google.visualization.PieChart(document.getElementById('graphic_profile_chart'));

	chart.draw(final_data, options);
}

///////////////////////////////////////////////////////////
///////////////////////DATA TABLE//////////////////////////

function drawPerfilDataTable() {
	// ------- Version 1------------
	// Add rows + data at the same time
	// -----------------------------
	random = createDate();
	console.log(random);
	var table = document.getElementById('data_profile_table');
	for (let i = 0; i <= random.length; i++) {
		// Creando los 'td' que almacenará cada parte de la información del usuario actual
		let name = `<td>Usuario</td>`;
		let subject = `<td>Asignatura</td>`;
		let posicion = `<td>${arrRandom[i]}</td>`;

		table.innerHTML += `<tr>${name}${subject}${posicion}</tr>`;
	}

	//	var final_data = google.visualization.arrayToDataTable([
	//		['Usuario', 'Puntuación'],
	//		['Bob', cuarto],
	//		['Alice', quinto],
	//		['Frank', sexto],
	//		['Floyd', septimo],
	//		['Fritz', octavo],
	//		['Jessica', noveno],
	//		['Sarah', decimo]
	//	], false);
	//
	//	var view = new google.visualization.DataView(final_data);
	//	view.setRows(view.getFilteredRows([{ column: 1, minValue: decimo }]));
	//
	//
	//
	//	var table = new google.visualization.Table(document.getElementById('data_table'));
	//	table.draw(view, { sortColumn: 1 });
}

///////////////////////////////////////////////////////////
////////////////////CAMBIOS//////////////////////////
function tabla(){
	var tabla = document.getElementById("tabla");
	tabla.removeAttribute("style");
	
	var donut = document.getElementById("donut");
	donut.setAttribute("style","display:none");
}

function grafico(){
	var donut = document.getElementById("donut");
	donut.removeAttribute("style");
	
	var tabla = document.getElementById("tabla");
	tabla.setAttribute("style","display:none");
}
