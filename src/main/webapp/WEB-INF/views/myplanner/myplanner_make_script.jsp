<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		const searchBtn = document.getElementById("searchBtn");
		const index = document.getElementById("index");
		const start_date = document.getElementById("start_date");
		const end_date = document.getElementById("end_date");
		const dates = document.getElementById("dates");
		var list = [];
		
		
		
		start_date.onchange = showDates;
		end_date.onchange = showDates;
		
		function added_list_change() {
			
		}
			
		function showDates() {
			list = [];
			while (dates.firstChild) 
            { dates.removeChild(dates.firstChild); }
			
			getDateRange(start_date.value,end_date.value,list);
			console.log(list);
			for(let i=0;i<=list.length-1;i++){
	            let date = document.createElement("input");
	            date.setAttribute("type","text");
	            date.setAttribute("name","date");
	            date.setAttribute("value",list[i]);
	            date.onfocus = ()=>{
	            	index.value = list[i];
	            }
	            dates.appendChild(date);
	           }
		}
		
		function getDateRange(startDate, endDate, listDate)
	    {
	        var dateMove = new Date(startDate);
	        var strDate = startDate;
	        if (startDate == endDate)
	        {
	            var strDate = dateMove.toISOString().slice(0,10);
	            listDate.push(strDate);
	        }
	        else
	        {
	            while (strDate < endDate)
	            {
	                var strDate = dateMove.toISOString().slice(0, 10);
	                listDate.push(strDate);
	                dateMove.setDate(dateMove.getDate() + 1);
	            }
	        }
	        return listDate;
	    };
	   showDates();
	</script>

</body>
</html>