package com.maven.modelo;

import org.springframework.stereotype.Component;

@Component
public class Operaciones implements Ioperaciones
{

	@Override
	public int calculos(int x, int y) 
	{
		return x*y;
	}
	
}
