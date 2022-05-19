///////////////////////////////////////////////////////////
////////////////////GRAPHIC CHART//////////////////////////

// Load the Visualization API and the corechart package.
google.charts.load('current', { 'packages': ['corechart'] });

// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawChart);

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

	var chart = new google.visualization.ColumnChart(document.getElementById("graphic_chart"));
	chart.draw(view, options);
	drawDataTable(data);
}

///////////////////////////////////////////////////////////
///////////////////////DATA TABLE//////////////////////////

function drawDataTable(data) {
	// ------- Version 1------------
	// Add rows + data at the same time
	// -----------------------------
	const length = data.length;
	const cuarto = parseInt(data[length - 4]);
	const quinto = parseInt(data[length - 5]);
	const sexto = parseInt(data[length - 6]);
	const septimo = parseInt(data[length - 7]);
	const octavo = parseInt(data[length - 8]);
	const noveno = parseInt(data[length - 9]);
	const decimo = parseInt(data[length - 10]);

	var final_data = new google.visualization.DataTable(
		{
			cols: [{ id: 'task', label: 'Nombre usuario', type: 'string' },
			{ id: 'startDate', label: 'Puntuación', type: 'number' }],
			rows: [
				{ c: [{ v: 'Bob' }, { v: cuarto }] },
				{ c: [{ v: 'Alice' }, { v: quinto }] },
				{ c: [{ v: 'Frank' }, { v: sexto }] },
				{ c: [{ v: 'Floyd' }, { v: septimo }] },
				{ c: [{ v: 'Fritz' }, { v: octavo }] },
				{ c: [{ v: 'Jessica' }, { v: noveno }] },
				{ c: [{ v: 'Sarah' }, { v: decimo }] }
			]
		}
	);

	var view = new google.visualization.DataView(final_data);
	view.setColumns([0, 1,
		{
			calc: "stringify",
			sourceColumn: 1,
			type: "string",
			role: "annotation"
		}]);

	var options = {
		width: 600,
		height: 400,
		border: "none",
		gridlines: { color: "transparent" }, //Elimina las cuadrículas del gráfico
		bar: { groupWidth: "none" },
		legend: { position: "none" },
	};

	var chart = new google.visualization.ColumnChart(document.getElementById("data_table"));
	chart.draw(final_data, options);
}
