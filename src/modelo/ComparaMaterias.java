package modelo;

import java.util.ArrayList;

public class ComparaMaterias{
	
	private static ArrayList<Materia> lista2;	
	private static int aux = 0;	
	private static boolean horarioInproprio = false;
	private static short tamanhoLista;
	private static short max;	
		
	public static void compara2() {
		
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < max; i++) {	//lê linha 
			for(int j = i + 1; j <= max; j++) { //lê coluna
				
				lista2 = new ArrayList<Materia>();
				
				App.var1 = App.lista.get(i);	// pega elemento da memória para comparação
				App.var2 = App.lista.get(j);	// pega elemento seguinte da memória para comparação
				
				lista2.add(App.var1);			// prepara blocagem para comparação
				lista2.add(App.var2);			// prepara blocagem para comparação
				
				// materias iguais (turmas diferentes) - conflito
				for(int a = 0; a < 1; a++) {
					for(int b = a+1; b < 2; b++) {
						if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) ) 
							aux++;
					}
				}
				// FIM materias iguais (turmas diferentes) - conflito
				
				App.mat = App.matriz.preparaMatriz(App.var1);	// preenche matriz global - incrementa 1 na célula correspondente ao tempo de aula
				App.mat = App.matriz.preparaMatriz(App.var2);	// preenche matriz global - incrementa 1 na célula correspondente ao tempo de aula
								
				// conflito de horário
				for(int a = 0; a < 6; a++) {
					for(int b = 0; b < 18; b++) {
						if( App.mat[a][b] > 1 ) 
							aux++;
					}
				}
				// FIM conflito de horário
				
				// horário improprio
				if(aux == 0) {
					for(int a = 0; a < 6; a++) {
						for(int b = 0; b < 18; b++) {
							if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
								aux++;
						}
					}
				}
				// FIM horário improprio
				
				// preenche blocagem				
				int cont = 0;
				if( aux == 0 ) {					
					App.listasComparadas.add(App.var1);
					App.listasComparadas.add(App.var2);
					cont++;
				}				
				// FIM preenche blocagem
				
				// zera matriz				
				for(int a = 0; a < 6; a++) {		
					for(int b = 0; b < 18; b++) {
						App.mat[a][b] = 0;
					}
				}
				// FIM zera matriz
				aux = 0;
				horarioInproprio = false;
			}
		}
	}
	
	public static void compara3() {	
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		lista2 = new ArrayList<Materia>();		
		for(int i = 0; i < (max - 1); i++) {
			for(int j = i + 1; j < max; j++) {
				for(int k = j + 1; k <= max; k++) {					
					
					App.var1 = App.lista.get(i);
					App.var2 = App.lista.get(j);
					App.var3 = App.lista.get(k);			
										
					lista2.add(App.var1);
					lista2.add(App.var2);
					lista2.add(App.var3);
					
					for(int a = 0; a < 2; a++) {
						for(int b = a+1; b < 3; b++) {
							if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
								aux++;
						}
					}
					
					App.mat = App.matriz.preparaMatriz(App.var1);
					App.mat = App.matriz.preparaMatriz(App.var2);
					App.mat = App.matriz.preparaMatriz(App.var3);
					
					for(int a = 0; a < 6; a++) {
						for(int b = 0; b < 18; b++) {
							if( App.mat[a][b] > 1 )
								aux++;
						}
					}
					
					if(aux == 0) {
						for(int a = 0; a < 6; a++) {
							for(int b = 0; b < 18; b++) {
								if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
									aux++;
							}
						}
					}
					
					if( aux == 0 ) {
						App.listasComparadas.add(App.var1);
						App.listasComparadas.add(App.var2);	
						App.listasComparadas.add(App.var3);	
					}
										
					for(int a = 0; a < 6; a++) {
						for(int b = 0; b < 18; b++) {
							App.mat[a][b] = 0;
						}
					}
					aux = 0;
					horarioInproprio = false;
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	
	public static void compara4() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 2); i++) {
			for(int j = i + 1; j < (max - 1); j++) {
				for(int k = j + 1; k < max; k++) {
					for(int l = k + 1; l <= max; l++) {
						
						App.var1 = App.lista.get(i);
						App.var2 = App.lista.get(j);
						App.var3 = App.lista.get(k);
						App.var4 = App.lista.get(l);
						
						lista2 = new ArrayList<Materia>();
						
						lista2.add(App.var1);
						lista2.add(App.var2);
						lista2.add(App.var3);
						lista2.add(App.var4);
						
						for(int a = 0; a < 3; a++) {
							for(int b = a+1; b < 4; b++) {
								if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
									aux++;
							}
						}
						
						App.mat = App.matriz.preparaMatriz(App.var1);
						App.mat = App.matriz.preparaMatriz(App.var2);
						App.mat = App.matriz.preparaMatriz(App.var3);
						App.mat = App.matriz.preparaMatriz(App.var4);
						
						for(int a = 0; a < 6; a++) {
							for(int b = 0; b < 18; b++) {
								if( App.mat[a][b] > 1 )
									aux++;
							}
						}
												
						if(aux == 0) {
							for(int a = 0; a < 6; a++) {
								for(int b = 0; b < 18; b++) {
									if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
										aux++;
								}
							}
						}
						
						if( aux == 0 ) {
							App.listasComparadas.add(App.var1);
							App.listasComparadas.add(App.var2);	
							App.listasComparadas.add(App.var3);	
							App.listasComparadas.add(App.var4);	
						}
												
						for(int a = 0; a < 6; a++) {
							for(int b = 0; b < 18; b++) {
								App.mat[a][b] = 0;
							}
						}
						aux = 0;
						horarioInproprio = false;
					}
				}
			}
		}	
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}	
	
	public static void compara5() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 3); i++) {
			for(int j = i + 1; j < (max - 2); j++) {
				for(int k = j + 1; k < (max - 1); k++) {
					for(int l = k + 1; l < max; l++) {
						for(int m = l + 1; m <= max; m++) {
						
							App.var1 = App.lista.get(i);
							App.var2 = App.lista.get(j);
							App.var3 = App.lista.get(k);
							App.var4 = App.lista.get(l);
							App.var5 = App.lista.get(m);
							
							lista2 = new ArrayList<Materia>();
							
							lista2.add(App.var1);
							lista2.add(App.var2);
							lista2.add(App.var3);
							lista2.add(App.var4);
							lista2.add(App.var5);
							
							for(int a = 0; a < 4; a++) {
								for(int b = a+1; b < 5; b++) {
									if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
										aux++;
								}
							}
							
							App.mat = App.matriz.preparaMatriz(App.var1);
							App.mat = App.matriz.preparaMatriz(App.var2);
							App.mat = App.matriz.preparaMatriz(App.var3);
							App.mat = App.matriz.preparaMatriz(App.var4);
							App.mat = App.matriz.preparaMatriz(App.var5);
							
							for(int a = 0; a < 6; a++) {
								for(int b = 0; b < 18; b++) {
									if( App.mat[a][b] > 1 )
										aux++;
								}
							}
							
							if(aux == 0) {
								for(int a = 0; a < 6; a++) {
									for(int b = 0; b < 18; b++) {
										if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
											aux++;
									}
								}
							}
							
							if( aux == 0 ) {
								App.listasComparadas.add(App.var1);
								App.listasComparadas.add(App.var2);	
								App.listasComparadas.add(App.var3);	
								App.listasComparadas.add(App.var4);	
								App.listasComparadas.add(App.var5);	
							}
							
							for(int a = 0; a < 6; a++) {
								for(int b = 0; b < 18; b++) {
									App.mat[a][b] = 0;
								}
							}
							aux = 0;
							horarioInproprio = false;
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	
	public static void compara6() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 4); i++) {
			for(int j = i + 1; j < (max - 3); j++) {
				for(int k = j + 1; k < (max - 2); k++) {
					for(int l = k + 1; l < (max - 1); l++) {
						for(int m = l + 1; m < max; m++) {
							for(int n = m + 1; n <= max; n++) {
							
								App.var1 = App.lista.get(i);
								App.var2 = App.lista.get(j);
								App.var3 = App.lista.get(k);
								App.var4 = App.lista.get(l);
								App.var5 = App.lista.get(m);
								App.var6 = App.lista.get(n);
							
								lista2 = new ArrayList<Materia>();
								
								lista2.add(App.var1);
								lista2.add(App.var2);
								lista2.add(App.var3);
								lista2.add(App.var4);
								lista2.add(App.var5);
								lista2.add(App.var6);
								
								for(int a = 0; a < 5; a++) {
									for(int b = a+1; b < 6; b++) {
										if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
											aux++;
									}
								}
								
								App.mat = App.matriz.preparaMatriz(App.var1);
								App.mat = App.matriz.preparaMatriz(App.var2);
								App.mat = App.matriz.preparaMatriz(App.var3);
								App.mat = App.matriz.preparaMatriz(App.var4);
								App.mat = App.matriz.preparaMatriz(App.var5);
								App.mat = App.matriz.preparaMatriz(App.var6);
							
								for(int a = 0; a < 6; a++) {
									for(int b = 0; b < 18; b++) {
										if( App.mat[a][b] > 1 )
											aux++;
									}
								}
							
								if(aux == 0) {
									for(int a = 0; a < 6; a++) {
										for(int b = 0; b < 18; b++) {
											if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
												aux++;
										}
									}
								}
								
								if( aux == 0 ) {
									App.listasComparadas.add(App.var1);
									App.listasComparadas.add(App.var2);	
									App.listasComparadas.add(App.var3);	
									App.listasComparadas.add(App.var4);	
									App.listasComparadas.add(App.var5);	
									App.listasComparadas.add(App.var6);	
								}
							
								for(int a = 0; a < 6; a++) {
									for(int b = 0; b < 18; b++) {
										App.mat[a][b] = 0;
									}
								}
								aux = 0;
								horarioInproprio = false;
							}
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	
	public static void compara7() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 5); i++) {
			for(int j = i + 1; j < (max - 4); j++) {
				for(int k = j + 1; k < (max - 3); k++) {
					for(int l = k + 1; l < (max - 2); l++) {
						for(int m = l + 1; m < (max - 1); m++) {
							for(int n = m + 1; n < max; n++) {
								for(int o = n + 1; o <= max; o++) {
								
									App.var1 = App.lista.get(i);
									App.var2 = App.lista.get(j);
									App.var3 = App.lista.get(k);
									App.var4 = App.lista.get(l);
									App.var5 = App.lista.get(m);
									App.var6 = App.lista.get(n);
									App.var7 = App.lista.get(o);
								
									lista2 = new ArrayList<Materia>();
									
									lista2.add(App.var1);
									lista2.add(App.var2);
									lista2.add(App.var3);
									lista2.add(App.var4);
									lista2.add(App.var5);
									lista2.add(App.var6);
									lista2.add(App.var7);
									
									for(int a = 0; a < 6; a++) {
										for(int b = a+1; b < 7; b++) {
											if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
												aux++;
										}
									}
									
									App.mat = App.matriz.preparaMatriz(App.var1);
									App.mat = App.matriz.preparaMatriz(App.var2);
									App.mat = App.matriz.preparaMatriz(App.var3);
									App.mat = App.matriz.preparaMatriz(App.var4);
									App.mat = App.matriz.preparaMatriz(App.var5);
									App.mat = App.matriz.preparaMatriz(App.var6);
									App.mat = App.matriz.preparaMatriz(App.var7);
								
									for(int a = 0; a < 6; a++) {
										for(int b = 0; b < 18; b++) {
											if( App.mat[a][b] > 1 )
												aux++;
										}
									}
								
									if(aux == 0) {
										for(int a = 0; a < 6; a++) {
											for(int b = 0; b < 18; b++) {
												if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
													aux++;
											}
										}
									}
									
									if( aux == 0 ) {
										App.listasComparadas.add(App.var1);
										App.listasComparadas.add(App.var2);	
										App.listasComparadas.add(App.var3);	
										App.listasComparadas.add(App.var4);	
										App.listasComparadas.add(App.var5);	
										App.listasComparadas.add(App.var6);	
										App.listasComparadas.add(App.var7);	
									}
								
									for(int a = 0; a < 6; a++) {
										for(int b = 0; b < 18; b++) {
											App.mat[a][b] = 0;
										}
									}
									aux = 0;
									horarioInproprio = false;
								}
							}
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	
	public static void compara8() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 6); i++) {
			for(int j = i + 1; j < (max - 5); j++) {
				for(int k = j + 1; k < (max - 4); k++) {
					for(int l = k + 1; l < (max - 3); l++) {
						for(int m = l + 1; m < (max - 2); m++) {
							for(int n = m + 1; n < (max - 1); n++) {
								for(int o = n + 1; o < max; o++) {
									for(int p = o + 1; p <= max; p++) {
									
										App.var1 = App.lista.get(i);
										App.var2 = App.lista.get(j);
										App.var3 = App.lista.get(k);
										App.var4 = App.lista.get(l);
										App.var5 = App.lista.get(m);
										App.var6 = App.lista.get(n);
										App.var7 = App.lista.get(o);
										App.var8 = App.lista.get(p);
										
										lista2 = new ArrayList<Materia>();
										
										lista2.add(App.var1);
										lista2.add(App.var2);
										lista2.add(App.var3);
										lista2.add(App.var4);
										lista2.add(App.var5);
										lista2.add(App.var6);
										lista2.add(App.var7);
										lista2.add(App.var8);
										
										for(int a = 0; a < 7; a++) {
											for(int b = a+1; b < 8; b++) {
												if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
													aux++;
											}
										}
										
										App.mat = App.matriz.preparaMatriz(App.var1);
										App.mat = App.matriz.preparaMatriz(App.var2);
										App.mat = App.matriz.preparaMatriz(App.var3);
										App.mat = App.matriz.preparaMatriz(App.var4);
										App.mat = App.matriz.preparaMatriz(App.var5);
										App.mat = App.matriz.preparaMatriz(App.var6);
										App.mat = App.matriz.preparaMatriz(App.var7);
										App.mat = App.matriz.preparaMatriz(App.var8);
									
										for(int a = 0; a < 6; a++) {
											for(int b = 0; b < 18; b++) {
												if( App.mat[a][b] > 1 )
													aux++;
											}
										}
									
										if(aux == 0) {
											for(int a = 0; a < 6; a++) {
												for(int b = 0; b < 18; b++) {
													if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
														aux++;
												}
											}
										}
										
										if( aux == 0 ) {
											App.listasComparadas.add(App.var1);
											App.listasComparadas.add(App.var2);	
											App.listasComparadas.add(App.var3);	
											App.listasComparadas.add(App.var4);	
											App.listasComparadas.add(App.var5);	
											App.listasComparadas.add(App.var6);	
											App.listasComparadas.add(App.var7);	
											App.listasComparadas.add(App.var8);	
										}
									
										for(int a = 0; a < 6; a++) {
											for(int b = 0; b < 18; b++) {
												App.mat[a][b] = 0;
											}
										}
										aux = 0;
										horarioInproprio = false;
									}
								}
							}
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	public static void compara9() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 7); i++) {
			for(int j = i + 1; j < (max - 6); j++) {
				for(int k = j + 1; k < (max - 5); k++) {
					for(int l = k + 1; l < (max - 4); l++) {
						for(int m = l + 1; m < (max - 3); m++) {
							for(int n = m + 1; n < (max - 2); n++) {
								for(int o = n + 1; o < (max - 1); o++) {
									for(int p = o + 1; p < max; p++) {
										for(int q = p + 1; q <= max; q++) {
										
											App.var1 = App.lista.get(i);
											App.var2 = App.lista.get(j);
											App.var3 = App.lista.get(k);
											App.var4 = App.lista.get(l);
											App.var5 = App.lista.get(m);
											App.var6 = App.lista.get(n);
											App.var7 = App.lista.get(o);
											App.var8 = App.lista.get(p);
											App.var9 = App.lista.get(q);
											
											lista2 = new ArrayList<Materia>();
											
											lista2.add(App.var1);
											lista2.add(App.var2);
											lista2.add(App.var3);
											lista2.add(App.var4);
											lista2.add(App.var5);
											lista2.add(App.var6);
											lista2.add(App.var7);
											lista2.add(App.var8);
											lista2.add(App.var9);
											
											for(int a = 0; a < 8; a++) {
												for(int b = a+1; b < 9; b++) {
													if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
														aux++;
												}
											}
											
											App.mat = App.matriz.preparaMatriz(App.var1);
											App.mat = App.matriz.preparaMatriz(App.var2);
											App.mat = App.matriz.preparaMatriz(App.var3);
											App.mat = App.matriz.preparaMatriz(App.var4);
											App.mat = App.matriz.preparaMatriz(App.var5);
											App.mat = App.matriz.preparaMatriz(App.var6);
											App.mat = App.matriz.preparaMatriz(App.var7);
											App.mat = App.matriz.preparaMatriz(App.var8);
											App.mat = App.matriz.preparaMatriz(App.var9);
										
											for(int a = 0; a < 6; a++) {
												for(int b = 0; b < 18; b++) {
													if( App.mat[a][b] > 1 )
														aux++;
												}
											}
										
											if(aux == 0) {
												for(int a = 0; a < 6; a++) {
													for(int b = 0; b < 18; b++) {
														if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
															aux++;
													}
												}
											}
											
											if( aux == 0 ) {
												App.listasComparadas.add(App.var1);
												App.listasComparadas.add(App.var2);	
												App.listasComparadas.add(App.var3);	
												App.listasComparadas.add(App.var4);	
												App.listasComparadas.add(App.var5);	
												App.listasComparadas.add(App.var6);	
												App.listasComparadas.add(App.var7);	
												App.listasComparadas.add(App.var8);	
												App.listasComparadas.add(App.var9);	
											}
										
											for(int a = 0; a < 6; a++) {
												for(int b = 0; b < 18; b++) {
													App.mat[a][b] = 0;
												}
											}
											aux = 0;
											horarioInproprio = false;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	
	public static void compara10() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 8); i++) {
			for(int j = i + 1; j < (max - 7); j++) {
				for(int k = j + 1; k < (max - 6); k++) {
					for(int l = k + 1; l < (max - 5); l++) {
						for(int m = l + 1; m < (max - 4); m++) {
							for(int n = m + 1; n < (max - 3); n++) {
								for(int o = n + 1; o < (max - 2); o++) {
									for(int p = o + 1; p < (max - 1); p++) {
										for(int q = p + 1; q < max; q++) {
											for(int r = q + 1; r <= max; r++) {
											
												App.var1 = App.lista.get(i);
												App.var2 = App.lista.get(j);
												App.var3 = App.lista.get(k);
												App.var4 = App.lista.get(l);
												App.var5 = App.lista.get(m);
												App.var6 = App.lista.get(n);
												App.var7 = App.lista.get(o);
												App.var8 = App.lista.get(p);
												App.var9 = App.lista.get(q);
												App.var10 = App.lista.get(r);
												
												lista2 = new ArrayList<Materia>();
												
												lista2.add(App.var1);
												lista2.add(App.var2);
												lista2.add(App.var3);
												lista2.add(App.var4);
												lista2.add(App.var5);
												lista2.add(App.var6);
												lista2.add(App.var7);
												lista2.add(App.var8);
												lista2.add(App.var9);
												lista2.add(App.var10);
												
												for(int a = 0; a < 8; a++) {
													for(int b = a+1; b < 9; b++) {
														if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
															aux++;
													}
												}
												
												App.mat = App.matriz.preparaMatriz(App.var1);
												App.mat = App.matriz.preparaMatriz(App.var2);
												App.mat = App.matriz.preparaMatriz(App.var3);
												App.mat = App.matriz.preparaMatriz(App.var4);
												App.mat = App.matriz.preparaMatriz(App.var5);
												App.mat = App.matriz.preparaMatriz(App.var6);
												App.mat = App.matriz.preparaMatriz(App.var7);
												App.mat = App.matriz.preparaMatriz(App.var8);
												App.mat = App.matriz.preparaMatriz(App.var9);
												App.mat = App.matriz.preparaMatriz(App.var10);
												
												for(int a = 0; a < 6; a++) {
													for(int b = 0; b < 18; b++) {
														if( App.mat[a][b] > 1 )
															aux++;
													}
												}
												
												if(aux == 0) {
													for(int a = 0; a < 6; a++) {
														for(int b = 0; b < 18; b++) {
															if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
																aux++;
														}
													}
												}
												
												if( aux == 0 ) {
													App.listasComparadas.add(App.var1);
													App.listasComparadas.add(App.var2);	
													App.listasComparadas.add(App.var3);	
													App.listasComparadas.add(App.var4);	
													App.listasComparadas.add(App.var5);	
													App.listasComparadas.add(App.var6);	
													App.listasComparadas.add(App.var7);	
													App.listasComparadas.add(App.var8);	
													App.listasComparadas.add(App.var9);	
													App.listasComparadas.add(App.var10);	
												}
												
												for(int a = 0; a < 6; a++) {
													for(int b = 0; b < 18; b++) {
														App.mat[a][b] = 0;
													}
												}
												aux = 0;
												horarioInproprio = false;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	
	public static void compara11() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 9); i++) {
			for(int j = i + 1; j < (max - 8); j++) {
				for(int k = j + 1; k < (max - 7); k++) {
					for(int l = k + 1; l < (max - 6); l++) {
						for(int m = l + 1; m < (max - 5); m++) {
							for(int n = m + 1; n < (max - 4); n++) {
								for(int o = n + 1; o < (max - 3); o++) {
									for(int p = o + 1; p < (max - 2); p++) {
										for(int q = p + 1; q < (max - 1); q++) {
											for(int r = q + 1; r < max; r++) {
												for(int s = r + 1; s <= max; s++) {
												
													App.var1 = App.lista.get(i);
													App.var2 = App.lista.get(j);
													App.var3 = App.lista.get(k);
													App.var4 = App.lista.get(l);
													App.var5 = App.lista.get(m);
													App.var6 = App.lista.get(n);
													App.var7 = App.lista.get(o);
													App.var8 = App.lista.get(p);
													App.var9 = App.lista.get(q);
													App.var10 = App.lista.get(r);
													App.var11 = App.lista.get(s);
													
													lista2 = new ArrayList<Materia>();
													
													lista2.add(App.var1);
													lista2.add(App.var2);
													lista2.add(App.var3);
													lista2.add(App.var4);
													lista2.add(App.var5);
													lista2.add(App.var6);
													lista2.add(App.var7);
													lista2.add(App.var8);
													lista2.add(App.var9);
													lista2.add(App.var10);
													lista2.add(App.var11);
													
													for(int a = 0; a < 8; a++) {
														for(int b = a+1; b < 9; b++) {
															if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
																aux++;
														}
													}
													
													App.mat = App.matriz.preparaMatriz(App.var1);
													App.mat = App.matriz.preparaMatriz(App.var2);
													App.mat = App.matriz.preparaMatriz(App.var3);
													App.mat = App.matriz.preparaMatriz(App.var4);
													App.mat = App.matriz.preparaMatriz(App.var5);
													App.mat = App.matriz.preparaMatriz(App.var6);
													App.mat = App.matriz.preparaMatriz(App.var7);
													App.mat = App.matriz.preparaMatriz(App.var8);
													App.mat = App.matriz.preparaMatriz(App.var9);
													App.mat = App.matriz.preparaMatriz(App.var10);
													App.mat = App.matriz.preparaMatriz(App.var11);
													
													for(int a = 0; a < 6; a++) {
														for(int b = 0; b < 18; b++) {
															if( App.mat[a][b] > 1 )
																aux++;
														}
													}
													
													if(aux == 0) {
														for(int a = 0; a < 6; a++) {
															for(int b = 0; b < 18; b++) {
																if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
																	aux++;
															}
														}
													}
													
													if( aux == 0 ) {
														App.listasComparadas.add(App.var1);
														App.listasComparadas.add(App.var2);	
														App.listasComparadas.add(App.var3);	
														App.listasComparadas.add(App.var4);	
														App.listasComparadas.add(App.var5);	
														App.listasComparadas.add(App.var6);	
														App.listasComparadas.add(App.var7);	
														App.listasComparadas.add(App.var8);	
														App.listasComparadas.add(App.var9);	
														App.listasComparadas.add(App.var10);	
														App.listasComparadas.add(App.var11);	
													}
													
													for(int a = 0; a < 6; a++) {
														for(int b = 0; b < 18; b++) {
															App.mat[a][b] = 0;
														}
													}
													aux = 0;
													horarioInproprio = false;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}
	
	public static void compara12() {
		App.tempoInicial = System.currentTimeMillis();
		tamanhoLista = (short)App.lista.size();
		max = (short)(tamanhoLista - 1);
		for(int i = 0; i < (max - 10); i++) {
			for(int j = i + 1; j < (max - 9); j++) {
				for(int k = j + 1; k < (max - 8); k++) {
					for(int l = k + 1; l < (max - 7); l++) {
						for(int m = l + 1; m < (max - 6); m++) {
							for(int n = m + 1; n < (max - 5); n++) {
								for(int o = n + 1; o < (max - 4); o++) {
									for(int p = o + 1; p < (max - 3); p++) {
										for(int q = p + 1; q < (max - 2); q++) {
											for(int r = q + 1; r < (max - 1); r++) {
												for(int s = r + 1; s < max; s++) {
													for(int t = s + 1; t <= max; t++) {													
														App.var1 = App.lista.get(i);
														App.var2 = App.lista.get(j);
														App.var3 = App.lista.get(k);
														App.var4 = App.lista.get(l);
														App.var5 = App.lista.get(m);
														App.var6 = App.lista.get(n);
														App.var7 = App.lista.get(o);
														App.var8 = App.lista.get(p);
														App.var9 = App.lista.get(q);
														App.var10 = App.lista.get(r);
														App.var11 = App.lista.get(s);
														App.var12 = App.lista.get(t);
														
														lista2 = new ArrayList<Materia>();
														
														lista2.add(App.var1);
														lista2.add(App.var2);
														lista2.add(App.var3);
														lista2.add(App.var4);
														lista2.add(App.var5);
														lista2.add(App.var6);
														lista2.add(App.var7);
														lista2.add(App.var8);
														lista2.add(App.var9);
														lista2.add(App.var10);
														lista2.add(App.var11);
														lista2.add(App.var12);
														
														for(int a = 0; a < 8; a++) {
															for(int b = a+1; b < 9; b++) {
																if( lista2.get(a).getNomeMateria().equals( lista2.get(b).getNomeMateria() ) )
																	aux++;
															}
														}
														
														App.mat = App.matriz.preparaMatriz(App.var1);
														App.mat = App.matriz.preparaMatriz(App.var2);
														App.mat = App.matriz.preparaMatriz(App.var3);
														App.mat = App.matriz.preparaMatriz(App.var4);
														App.mat = App.matriz.preparaMatriz(App.var5);
														App.mat = App.matriz.preparaMatriz(App.var6);
														App.mat = App.matriz.preparaMatriz(App.var7);
														App.mat = App.matriz.preparaMatriz(App.var8);
														App.mat = App.matriz.preparaMatriz(App.var9);
														App.mat = App.matriz.preparaMatriz(App.var10);
														App.mat = App.matriz.preparaMatriz(App.var11);
														App.mat = App.matriz.preparaMatriz(App.var12);
														
														for(int a = 0; a < 6; a++) {
															for(int b = 0; b < 18; b++) {
																if( App.mat[a][b] > 1 )
																	aux++;
															}
														}
														
														if(aux == 0) {
															for(int a = 0; a < 6; a++) {
																for(int b = 0; b < 18; b++) {
																	if( ( ( App.mat[a][b] == 1) && (App.listaImpropria[b] != null) ) )  
																		aux++;
																}
															}
														}
														
														if( aux == 0 ) {
															App.listasComparadas.add(App.var1);
															App.listasComparadas.add(App.var2);	
															App.listasComparadas.add(App.var3);	
															App.listasComparadas.add(App.var4);	
															App.listasComparadas.add(App.var5);	
															App.listasComparadas.add(App.var6);	
															App.listasComparadas.add(App.var7);	
															App.listasComparadas.add(App.var8);	
															App.listasComparadas.add(App.var9);	
															App.listasComparadas.add(App.var10);	
															App.listasComparadas.add(App.var11);	
															App.listasComparadas.add(App.var12);	
														}
														
														for(int a = 0; a < 6; a++) {
															for(int b = 0; b < 18; b++) {
																App.mat[a][b] = 0;
															}
														}
														aux = 0;
														horarioInproprio = false;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		App.tempoInicial = System.currentTimeMillis() - App.tempoInicial;
	}

}
