package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PostReceiptServlet extends HttpServlet {
 
	//doPost()メソッド
 	public void doPost(HttpServletRequest request, HttpServletResponse response)
 	throws ServletException, IOException {
 
 		//パラメータの取得
 		String name = request.getParameter("onamae");
 
 		//コンテンツタイプの設定
 		response.setContentType("text/html; charset=UTF-8");
 
 		//画面出力
 		PrintWriter out = response.getWriter();
 		out.println("お名前は" + name + "さんですね。");
 	}
}
