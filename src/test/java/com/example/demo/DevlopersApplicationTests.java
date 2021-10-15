package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Devloper;
import com.example.demo.entities.Projects;
import com.example.demo.repo.ProjectsRepository;

@SpringBootTest
class DevlopersApplicationTests {
    @Autowired
	ProjectsRepository projectsRepository;
	@Test
	void contextLoads() {
	}
	/*
	@Test
	public void testFindById ()
	{
		List<Projects> projs = projectsRepository.findAll();
		for (Projects p : projs)
		{
		System.out.println(p.toString());
		}
    }
	
	@Test
	public void testFindByNomProduit()
	{
	List<Projects> projs = projectsRepository.findBynomProj("p1");
	for (Projects p : projs)
	{
	System.out.println(p.toString());
	}
	}
	@Test
	public void testFindByNomProduitContains ()
	{
		List<Projects> projs = projectsRepository.findBynomProjContains("p");
		for (Projects p : projs)
		{
		System.out.println(p.toString());
		}
    }
	
	@Test
	public void testFindByNomPrix()
	{
		List<Projects> projs = projectsRepository.findByNomPrix("p",(float) 250.0 );
		for (Projects p : projs)
		{
		System.out.println(p.toString());
		}
    }
	
	@Test
	public void testfindBydevloper() {
		Devloper d=new Devloper();
		d.setIdDev(1L);
		List<Projects> projs = projectsRepository.findByDevloper(d);
		for (Projects p : projs)
		{
		System.out.println(p.toString());
		}
	}

	@Test
	public void testfindBydevloperId() {
		List<Projects> projs = projectsRepository.findByDevloperIdDev(1L);
		for (Projects p : projs)
		{
		System.out.println(p.toString());
		}
	}
		
	@Test
	public void testfindByOrderByNomProjectstAsc() {
		List<Projects> projs = projectsRepository.findByOrderByNomProjAsc();
		for (Projects p : projs)
		{
		System.out.println(p.toString());
		}
	}
	*/
	@Test
	public void testtrierProjsNomsPrix() {
		List<Projects> projs = projectsRepository.trierProjsNomsPrix();
		for (Projects p : projs)
		{
		System.out.println(p.toString());
		}
	}
}
