package com.xt.spring.context.mvc.ajax;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller()
@RequestMapping("/shoppingAction")
public class ShoppingAction {
	
	
	@RequestMapping("/shoppingCarInit")
 public String shoppingCarInit(HttpSession session){
		List<Goods> goodsList = new LinkedList<Goods>();
		 for(int i=0;i<5;i++){
			 goodsList.add(i, new Goods("商品"+(i+1),10.4*(i+1)));
		 }
	 session.setAttribute("goodsList", goodsList);
	 return "ajax/shoppingAction";
 }
	@RequestMapping("/doShoppingAction")
	@ResponseBody()
	public void doShoppingAction(@RequestBody(required=false) StatusPOJO sp,HttpSession session,HttpServletResponse response) throws IOException{
		Map<Integer,Goods> map =new HashMap<Integer,Goods>();
		if(session.getAttribute("tempMap")!=null){
			map=(Map<Integer,Goods>)session.getAttribute("tempMap");
		};
		if(sp.isStatus()){
		System.out.println("这次添加进去的商品编号是:"+sp.getIndex());
			map.put(sp.getIndex(), ((List<Goods>)session.getAttribute("goodsList")).get(sp.getIndex()));
		}else{
			if(map.get(sp.getIndex())!=null){
				System.out.println("这次删除的商品编号是:"+sp.getIndex());
				map.remove(sp.getIndex());
			}
			}
		session.setAttribute("tempMap", map);
		//response.getWriter().write("success");
	}
	@RequestMapping("/finishSettlement")
	public String finishSettlement(Double priceTotal,HttpSession session){
		Map<Integer,Goods> map = (Map<Integer,Goods>)session.getAttribute("tempMap");
		System.out.println(map.size());
		for(Object o :map.keySet()){
			System.out.println(map.get(o));
		}
		System.out.println("priceTotal----->"+priceTotal);
		return "hello";
	}
 }