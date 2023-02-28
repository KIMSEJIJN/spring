package common.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUpload {

	public static UUID saveCopyFile(MultipartFile file, HttpServletRequest request) {
		String fileName = file.getOriginalFilename();
		
		UUID random = UUID.randomUUID();
		
	    
		File ff = new File(urlPath(request), random + "_" + fileName);
	
		
			try {
				FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(ff));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	
		
		return random;
	}
	
	public static String urlPath(HttpServletRequest request) {
		String root = request.getSession().getServletContext().getRealPath("/");
		System.out.print("root" + root);
		String saveDirectory = root + "temp" + File.separator;
		
		File fe = new File(saveDirectory);
		if(!fe.exists())
			fe.mkdir();
		return saveDirectory;
	}
}

