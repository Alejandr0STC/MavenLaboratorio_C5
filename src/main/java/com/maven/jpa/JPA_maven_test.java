package com.maven.jpa;

import java.util.List;

import javax.persistence.*;


public class JPA_maven_test {

	private EntityManager manager;
	public JPA_maven_test(EntityManager manager) {
		this.manager=manager;
	}
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Proyecto_maven_CibertecIII"); 
		EntityManager manager = factory.createEntityManager();
		JPA_maven_test jpa_test =new JPA_maven_test(manager);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		jpa_test.InsertarAlumno();
		//System.out.println("");
		List<Alumno> listadoA = jpa_test.ListaAlumno();
		for(Alumno listAlumno : listadoA) 
		{
			System.out.println(listAlumno.getNombre() + listAlumno.getApellido() + listAlumno.getDni() + listAlumno.getEmail() + listAlumno.getSexo());
		}
		jpa_test.ActualizaAlumno(1,"Melani", "Barrios", "78945632", "F", "melani2@gmail.com");
		System.out.println("---------------Buscar Alumno-------------");
		List<Alumno> bucarAlumno = jpa_test.BuscarAlumno(2);
		
		for(Alumno alu:bucarAlumno)
		{
			System.out.println(
					" Nombre :" + alu.getNombre() + 
					" Apellido :" + alu.getApellido() + 
					" Sexo :" + alu.getSexo() + " DNI :" + alu.getDni()	+ 
					" E-mail :" + alu.getEmail()
					);
		}
	}

	public void InsertarAlumno() 
	{
		Alumno alumno = new Alumno("Luis Enrique","Gomez","10554488","M","luis@gma");
		Alumno alumno1 = new Alumno("Carlito el lindo","Pro","10654789","M","carlito@gma");
		Alumno alumno2 = new Alumno("Camaleon Danti","Novi","35468426","M","camaleon@gma");
		Alumno alumno3 = new Alumno("Jusepe Ri","Richeti","79865732","M","jusepe@gma");
		
		manager.persist(alumno3);
		manager.persist(alumno2);
		manager.persist(alumno);
		manager.persist(alumno1);
	}
	public List<Alumno> ListaAlumno()
	{
		String consulta ="select a from Alumno a";
		Query querycon = manager.createQuery(consulta,Alumno.class);
		List<Alumno> listAlu = querycon.getResultList();
		return listAlu;
	}
	public void ActualizaAlumno(int id,String nom,String ape,String dn ,String sex,String ema)
	{
		String consul="update Alumno a set a.nombre=:nom,a.apellido=:ape,a.sexo=:sex,a.dni=:dn,a.email=:ema where a.idalumno=:id";
		Query queryCon= manager.createQuery(consul);
		queryCon.setParameter("id", id);
		queryCon.setParameter("nom", nom);
		queryCon.setParameter("ape", ape);
		queryCon.setParameter("dn", dn);
		queryCon.setParameter("sex", sex);
		queryCon.setParameter("ema", ema);
		
		int x =queryCon.executeUpdate();
		if (x>0) 
		{
			System.out.println("Alumno actualizado correctamente");
		}
		else 
		{
			System.out.println("Alumno NO Actualizado");
		}
	}
	public List<Alumno> BuscarAlumno(int id)
	{
		String buscar ="select a from Alumno a where a.idalumno=:codigo";
		
		Query buscarAlumno=manager.createQuery(buscar,Alumno.class).setParameter("codigo", id);
		
		
		List<Alumno> listAlumno=buscarAlumno.getResultList();
		return listAlumno;
	}
	
}
