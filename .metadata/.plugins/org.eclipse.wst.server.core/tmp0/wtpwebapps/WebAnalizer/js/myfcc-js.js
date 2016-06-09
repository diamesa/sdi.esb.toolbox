window.addEventListener('load', function()
										{
											document.getElementById('send').addEventListener('click', function()
																										{var  nombre = document.getElementById('txt-user').value;
																										 var password= document.getElementById('txt-pass').value;
																										 
																										 var bandera= false;
																										 
																										 if(nombre.length > 0 && password.length > 0){bandera = true}
																										 
																										 if(bandera){document.getElementById('log-in-form').submit()}
																										 else{ alert('There is some informatioln missing,\n please check and try again');}
																										});
										});