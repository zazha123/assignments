$(document).ready(function() {

//	console.log("Loaded jQuery!");
	
	$("#btn").click(function() {
//		console.log("Inside button click...");
		
		var lon = $("#longitude").val();
		var lat = $("#latitude").val();
		var appid = "521aaa8dfab3bc351cac657869ec4d53";
		
//		console.log(lon + "====>" + lat);
	
		$.ajax({
		
			url: `https://api.openweathermap.org/data/2.5/find?lat=${lat}&lon=${lon}&cnt=10&appid=${appid}`
			
		}).then(function(data) {
//			console.log(data);
			var divTag = $("#content");
		    var list = $("<ul/>").appendTo(divTag);
			$.each(data.list, function(idx) {
				var city = data.list[idx].name;
//				console.log(city);
//				console.log(list);
				var li = $("<li/>")
					.text(city)
					.appendTo(list)
			});
		})
	})
	
})