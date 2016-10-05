$(function(){
	$('.button').click(function(){
		$('.div-add').load("add", "id="+$('.id').val(),
				function(){
			alert("Load successful. Click OK to ditect to success-page");
		})
	})
})