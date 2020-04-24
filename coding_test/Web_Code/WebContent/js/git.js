$(document).ready(function() {
	
	$.ajax({
	
		url: "https://api.github.com/users"
		
	}).then(function(data) {
		
		var table = $("#usersTable");
		var contents = "";
		$.each(data, function(idx) {
			
			contents +=  "<tr>";
			contents += "<td>" + "<div class=\"bt\">" +  data[idx].login + "</div>" + "</td>";
			contents += "<td><div id=" + "\"" + data[idx].login + "\"" + ">" + "</td>"
			// contents += "<td>" + data[idx].followers_url + "</td>";
			// contents += "<td> 0 </td>";
			// contents += "<td> <img src='" + data[idx].avatar_url + "' width=50 height=50 /></td>";
			contents += "</tr>";
		})
		
		console.log(contents);
		table.append(contents);

		$(".bt").click(function() {
			console.log("Inside button click...");
			var user_name = $(this).text()
			console.log(`https://api.github.com/users/${user_name}/followers`);
			$.ajax({
			
				url: `https://api.github.com/users/${user_name}/followers`
				
			}).then(function(data) {
				console.log(data);
				var divTag = $(`#${user_name}`);
				console.log(divTag);
				var contents = ""
				$.each(data, function(idx) {
					contents += "<img src='" + data[idx].avatar_url + "' width=50 height=50 />";
				});
				divTag.append(contents);
				
			})
		})
		
	});
	
	
});