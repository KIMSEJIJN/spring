package board.dto;

import java.sql.Date; // util 꺼말고 sql

import org.springframework.web.multipart.MultipartFile;

import members.dto.MembersDTO;

public class BoardDTO {
	private int num, readcount, ref, re_step, re_level;
	private String subject, content, ip, memberEmail;
	private Date reg_date;
	private MembersDTO membersDTO;
	//board테이블의 파일 첨부를 처리해주는 멤버변수
	private String upload;
	
	//form페이지에서 파일첨부를 받아 처리해주는 멤버변수
	private MultipartFile filename; //첨부파일받기위해
	//클라이언트한테 첨부파일을 받기위해 자바에서 이렇게 받아야하는데 
	//오라클에서 안되서 받기위해 스트링으로 받아야함
	
	public BoardDTO() {
	
	}
	public MembersDTO getMembersDTO() {
		return membersDTO;
	}
	
	public void setMembersDTO(MembersDTO membersDTO) {
		this.membersDTO = membersDTO;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getRe_step() {
		return re_step;
	}

	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}

	public int getRe_level() {
		return re_level;
	}

	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public MultipartFile getFilename() {
		return filename;
	}

	public void setFilename(MultipartFile filename) {
		this.filename = filename;
	}
	
	
	
}