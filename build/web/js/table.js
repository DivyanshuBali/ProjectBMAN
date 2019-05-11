$(document).ready( function () {

  	var table = $('#resultData').DataTable({
		  responsive: true
	  });

	$('#search').on( 'keyup', function () {
	    table.search( this.value ).draw();
	});

});
