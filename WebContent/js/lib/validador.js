/*	ARQUIVO VALIDADOR
 *  Date: 2018-02-10T13:45Z
 *  Copyright 2018 Twitter, Inc.
 * 	Licensed under the ANDRE ALVAREZ license
 * */

function validacao(){
	if(document.form.name.valeu==""){
		alert("Favor preencher o campo nome.");
		document.form.nome.focus();
		return false;
	}
}
