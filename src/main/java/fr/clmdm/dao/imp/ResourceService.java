package fr.clmdm.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;

import fr.clmdm.dao.ResourceServiceI;
import fr.clmdm.model.Resource;
import fr.clmdm.model.SopraProfil;

public class ResourceService implements ResourceServiceI {

	@Override
	public List<Resource> listAllResources() {
		
		List<Resource> res = new ArrayList<>();
		
		Resource rs1 = new Resource();
		
		rs1.setNom("VALENTIN");
		rs1.setPrenom("Clément");
		rs1.setProfil(SopraProfil.SB);
		
		res.add(rs1);
		
		return res;
	}

}
