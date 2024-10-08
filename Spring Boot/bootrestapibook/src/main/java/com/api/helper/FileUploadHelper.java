package com.api.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	public final String UPLOAD_DIR = "C:\\Users\\Tech-Guru\\Documents\\Codes\\bootrestapibook\\src\\main\\resources\\static\\image";

	
	public boolean uploadFile(MultipartFile multipart) {
		boolean f = false;
		
		try {
			//for this we are using io package
			
//			InputStream is  = multipart.getInputStream();
//			byte data[] = new byte[is.available()];
//			
//			is.read(data);
//			
//			//write 
//			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR +"\\"+ multipart.getOriginalFilename());
//			fos.write(data);
//			fos.close();
//			fos.flush();
			
			//OR
			
			// for this nio package is used
			Files.copy(multipart.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipart.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			f = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
