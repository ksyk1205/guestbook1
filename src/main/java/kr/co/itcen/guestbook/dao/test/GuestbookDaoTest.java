package kr.co.itcen.guestbook.dao.test;

import java.util.List;

import kr.co.itcen.guestbook.dao.GuestbookDao;
import kr.co.itcen.guestbook.vo.GuestbookVo;



public class GuestbookDaoTest {

	public static void main(String[] args) {
		insertTest();
		getListTest();

	}
	
	
	private static void insertTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("곽세연");
		vo.setPassword("1234");
		vo.setContents("1234");

		
		new GuestbookDao().insert(vo);
	}

	private static void getListTest() {
		List<GuestbookVo> list = new GuestbookDao().getList();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}

}