// Call the dataTables jQuery plugin
$(document).ready(function() {
   //on ready
  });
  async function RegistrarUsuarios(){

    let datos = {};
    
      const request = await fetch('usuarios', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify()
        
      });
      const usuarios = await request.json();
  
  }
  
