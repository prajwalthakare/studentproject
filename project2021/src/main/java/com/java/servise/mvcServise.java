package com.java.servise;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.mvcDao;
import com.java.entity.Project;
import com.java.entity.User;

@Service
public class mvcServise {
	
	@Autowired
	mvcDao mvcd;

public boolean checklogin(User user) {
	System.out.println("111566");
		// TODO Auto-generated method stub
		boolean result=mvcd.checklogin(user);
		return result;
	}

	public List<User> getuser() {
		 List<User> listuser=mvcd.getuser();
		return listuser;
	}

	public boolean deleteuser(int userid) {
		
		// TODO Auto-generated method stub
		return mvcd.deleteuser(userid);
	}

	public List<User> getUser(int userid) {
		List<User> listuser=mvcd.getuser(userid);
		return listuser;
	}
	


	public boolean updateuser(User user) {
		// TODO Auto-generated method stub
		return mvcd.updateuser(user);
	}

	public boolean adduser(User user) {
		// TODO Auto-generated method stub
		return mvcd.adduser(user);
	}

	public List<Project> getpro() {
		 List<Project> listp=mvcd.getpro();
		 System.out.println("33333");
			return listp;
	}

	public boolean deletepro(int proid) {
		// TODO Auto-generated method stub
		return mvcd.deletepro(proid);
	}

	public List<Project> getpro(int proid) {
		List<Project> listpro=mvcd.getpro(proid);
		return listpro;
	}

	public boolean updatepro(Project pro) {
		// TODO Auto-generated method stub
		return mvcd.updatepro(pro);
	}

	public boolean addpro(Project pro) {
		// TODO Auto-generated method stub
		return mvcd.addpro(pro);
	}


}
