/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(
        function(){
         $(".panel").hide();
         $("#main").show();
        
         $(".button.collapse").sideNav({
             menuWidth: 300,//Default is 240
             closeOnClick: true // cierra side-nav
         });
         
       $('.collapsible').collapsible({
        accordion : true
    });
        
});