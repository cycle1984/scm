package cycle.scm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cycle.scm.entity.Supplier;
import cycle.scm.service.SupplierService;

@Controller
@RequestMapping("/supplier")
public class SupplierController {
	
	@Resource
	private SupplierService supplierService;
	
	@RequestMapping("/insert")
	public String insert(Supplier supplier){
		System.out.println("---SupplierController:"+supplier);
		try {
			supplierService.insert(supplier);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "forward:/jsp/main.jsp";
	}
}
