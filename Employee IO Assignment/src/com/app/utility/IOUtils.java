package com.app.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.entity.Employee;

public interface IOUtils {

	@SuppressWarnings("unchecked")
	static Map<Integer, Employee> restoreEmpDetails(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
		
			
			File file = new File(fileName);
			if(file.isFile() && file.canRead()) {
				try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
				return (Map<Integer, Employee>) in.readObject();
			}
			
		}
		return new HashMap<>();
	}
	
	static void storeEmpDetails(Map<Integer, Employee> map,String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		
//		File file = new File(fileName);
//		if(file.isFile() && file.canRead()) {
			try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(map);
		}
		
	}
}
	
	

