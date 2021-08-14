/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
   $('select[name=bodegas]').on('change',function(){
      $.ajax({
            type:'GET',
            url:'TablaB',
            data:'codigobodega='+$('select[name=bodegas]').val(),
            success:function (data){
                $('table[name=detalleprod] tr[name!=detail]').remove();
               var detallegen=data.split(":");
                for (var i = 0; i < detallegen.length-1; i++) {
                    var producto=detallegen[i].split("-")[0];
                    var ciudad=detallegen[i].split("-")[1];
                    var cantidad=detallegen[i].split("-")[2];
                    var estado=detallegen[i].split("-")[3];
                    $('table[name=detalleprod]').append('<tr><td>'+producto+'</td><td>'+ciudad+'</td><td>'+cantidad+'</td><td>'+estado+'</td></tr>');
                }
            }
      });
   }); 
});

