package com.spring.pro04.ex02;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*@Controller*/
public class MailController {
	@Autowired
	private MailService mailService;

	@RequestMapping(value = "/sendMail.do", method = RequestMethod.GET)
	public void sendSimpleMail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html:charset=utf-8");
		PrintWriter out = response.getWriter();
		/* StringBuffer ���� sb�� �����մϴ�. */
		StringBuffer sb = new StringBuffer();

		/* ���ڿ��� HTML�±׸� �ۼ����� sb�� �����մϴ�. */
		/*
		  sb.append("<html><body>"); sb.
		  sb.append("<meta http-equiv='Content-Type' content='text/html; charset=euc-kr'>");
		  sb.append("<h1>" + "��ǰ�Ұ�" + "<h1><br>"); sb.append("�Ű� ������ �Ұ��մϴ�.<br><br>");
		  sb.append(
		  "<a href='http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9788956746425&orderClick=LAG&Kc=#N'>"
		  ); sb.
		  append("<img  src='http://image.kyobobook.co.kr/images/book/xlarge/425/x9788956746425.jpg' /> </a><br>"
		  ); sb.append("</a>"); sb.append(
		  "<a href='http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9788956746425&orderClick=LAG&Kc=#N'>��ǰ����</a>"
		 ); sb.append("</body></html>");
		 */
		
		sb.append("<html><body>");
		sb.append("<meta http-equiv='Content-Type' content='text/html; charset=euc-kr'>");
		sb.append("<h1>" + "�粿ġ" + "<h1><br>");
		sb.append("����޴� �粿ġ.<br><br>");
		sb.append(
				"<a href='https://www.siksinhot.com/theme/magazine/1360?mid=1360'>");
		sb.append("<img  src='https://img.siksinhot.com/article/1505966107595408.jpg' /> </a><br>");
		sb.append("</a>");
		sb.append(
				"<a href='https://www.siksinhot.com/theme/magazine/1360?mid=1360'>���뺸��</a>");
		sb.append("</body></html>");

		/* ���ڿ��� ��ȯ�մϴ�. */
		String str = sb.toString();

		/* ������// HTML ������ ������ ���Ϸ� �����ϴ�. */
		mailService.sendMail("${user.email}", "�Ż�ǰ�� �Ұ��մϴ�.", str);

		out.print("������ ���½��ϴ�!!");
	}
}
