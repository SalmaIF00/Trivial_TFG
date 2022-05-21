///////////////////////////////////////////////////////////
////////////////////GRAPHIC CHART//////////////////////////

// Load the Visualization API and the corechart package.
google.charts.load('current', { 'packages': ['corechart'] });

// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawChart);
google.charts.setOnLoadCallback(drawDataTable);


// Callback that creates and populates a data table,
// instantiates the pie chart, passes in the data and
// draws it.
function drawChart() {
	const data = ['0', '4', '2', '6', '3', '8', '5', '6', '10', '7', '3', '6', '9', '1'];
	data.sort((a, b) => { return a - b });
	console.log(data);

	const length = data.length;
	const primero = parseInt(data[length - 1]);
	const segundo = parseInt(data[length - 2]);
	const tercero = parseInt(data[length - 3]);

	var final_data = google.visualization.arrayToDataTable([
		["Element", "Density", { role: "style" }],
		["Silver", segundo, "silver"],
		["Gold", primero, "gold "],
		["Copper", tercero, "#b87333"]
	]);

	var view = new google.visualization.DataView(final_data);
	view.setColumns([0, 1,
		{
			calc: "stringify",
			sourceColumn: 1,
			type: "string",
			role: "annotation"
		},
		2]);

	var options = {
		width: 600,
		height: 400,
		border: "none",
		gridlines: { color: "transparent" }, //Elimina las cuadrículas del gráfico
		bar: { groupWidth: "none" },
		legend: { position: "none" },
	};

	var chart = new google.visualization.ColumnChart(document.getElementById("graphic_ranking_chart"));
	chart.draw(view, options);
}

///////////////////////////////////////////////////////////
///////////////////////DATA TABLE//////////////////////////

function drawDataTable() {
	// ------- Version 1------------
	// Add rows + data at the same time
	// -----------------------------
	const nombre = ['Jessica', 'Bob', 'Frank', 'Fritz', 'Floyd', 'Marcus', 'Renzo', 'Adam', 'Sarah', 'Vero', 'Marta', 'Mery', 'ALvin', 'Peter'];
	const data = ['0', '4', '2', '6', '3', '8', '5', '6', '10', '7', '3', '6', '9', '1'];
	data.sort((a, b) => { return a - b });
	console.log(data);

	var contador = 4;
	var table = document.getElementById('data_ranking_table');
	for (let i = 9; i >= 3; i--) {
		// Creando los 'td' que almacenará cada parte de la información del usuario actual
		let cont = `<td>${contador}º</td>`;
		let name = `<td>${nombre[i]}</td>`;
		let posicion = `<td>${data[i]}</td>`;

		table.innerHTML += `<tr>${cont}${name}${posicion}</tr>`;
		contador += 1;
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
