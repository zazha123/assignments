$(document).ready(function() {

//	console.log("Loaded jQuery!");
	
	$("#ok").click(function() {
		console.log("Inside button click...");
		var appid = "521aaa8dfab3bc351cac657869ec4d53";
		var zipCode = $("#zipcode").val();
//		console.log(zipCode);
	
		$.ajax({
		
			url: `https://api.openweathermap.org/data/2.5/weather?zip=${zipCode}&appid=${appid}`
			
		}).then(function(data) {
//			console.log(data);
			var city = data.name;
			var temp_min = data.main.temp_min;
			var temp_max = data.main.temp_max;
			var response = `city : ${city} temp_max : ${temp_max} temp_min : ${temp_min}`;
//			console.log(response);
//			change text
			$("div").html(response);
		})
	})
	
})