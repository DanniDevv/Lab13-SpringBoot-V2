
package com.miempresa.servicio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miempresa.interfaceServicio.*;
import com.miempresa.interfaces.Iempleado;
import com.miempresa.modelo.Empleado;

@Service
public class EmpleadoServicio implements IEmpleadoServicio{
	
	@Autowired
	private Iempleado repo;
	
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>)repo.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int guardar(Empleado p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		
	}
}

