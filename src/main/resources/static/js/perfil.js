///////////////////////////////////////////////////////////
////////////////////GRAPHIC CHART//////////////////////////

// Load the Visualization API and the corechart package.
google.charts.load('current', { 'packages': ['corechart'] });

// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawPerfilChart);
google.charts.setOnLoadCallback(drawPerfilDataTable);


// Callback that creates and populates a data table,
// instantiates the pie chart, passes in the data and
// draws it.
function drawPerfilChart() {
	const data = ['0', '4', '2', '6', '3', '8'];
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
		title: 'Asignaturas realizadas'
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
	const nombre = ['Jessica', 'Bob', 'Frank', 'Fritz', 'Floyd', 'Marcus', 'Renzo', 'Adam', 'Sarah', 'Vero', 'Marta', 'Mery', 'ALvin', 'Peter'];
	const data = ['0', '4', '2', '6', '3', '8', '5', '6', '10', '7', '3', '6', '9', '1'];
	console.log(data);

	var table = document.getElementById('data_profile_table');
	for (let i = 9; i >= 3; i--) {
		// Creando los 'td' que almacenará cada parte de la información del usuario actual
		let name = `<td>${nombre[i]}</td>`;
		let posicion = `<td>${data[i]}</td>`;

		table.innerHTML += `<tr>${name}${posicion}</tr>`;
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
