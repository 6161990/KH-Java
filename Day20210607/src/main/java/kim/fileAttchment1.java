package kim;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

@WebServlet("/fileAttch")
public class fileAttchment1 extends HttpServlet {
	private static final String ATTACHES_DIR = "C:\\attaches";
    private static final int LIMIT_SIZE_BYTES = 1024 * 1024;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		// 보낼 데이터 객체
		String userName = request.getParameter("full_name");
		String email_address = request.getParameter("email_address");
		String message_field = request.getParameter("message_field");
		String fileupload = request.getParameter("fileupload");
		
		File attachesDir = new File(ATTACHES_DIR);
		DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		fileItemFactory.setRepository(attachesDir);
	    fileItemFactory.setSizeThreshold(LIMIT_SIZE_BYTES);
	    ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory);

	    try {
	    	List<FileItem> items = fileUpload.parseRequest((RequestContext) request);
	    	for(FileItem item : items) {
	    		if(item.isFormField()) {
	    			System.out.printf("파라미터 명 : %s, 파라미터 값 :  %s \n", item.getFieldName(), item.getString("utf-8"));
	    		}else {
	    			System.out.printf("파라미터 명 : %s, 파일 명 : %s,  파일 크기 : %s bytes \n", item.getFieldName(),
	    					item.getName(),item.getSize());
	    			if(item.getSize() >0) {
	    				String separator = File.separator;
	    				int index = item.getName().lastIndexOf(separator);
	    				String fileName = item.getName().substring(index +1);
	    				File uploadFile = new File(ATTACHES_DIR + separator+ fileName);
	    				item.write(uploadFile);
	    			}
	    		}
	    	}
	    	
	    	out.println("<h1> 파일 업로드 완료</h1>");
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	out.println("<h1> 파일 업로드 중 오류가 발생하였습니다.</h1>");
	    }


		// 값 출력
		out.println("이름 : " + userName + "<br>");
		out.println("비밀번호 : " + email_address + "<br>");
		out.println("성별 : " + message_field + "<br>");




	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
