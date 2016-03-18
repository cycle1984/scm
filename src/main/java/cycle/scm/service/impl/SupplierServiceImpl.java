package cycle.scm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cycle.scm.dao.SupplierMapper;
import cycle.scm.entity.Supplier;
import cycle.scm.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierMapper supplierMapper;
	
	@Override
	public void insert(Supplier supplier) throws Exception {
		// TODO Auto-generated method stub
		supplierMapper.insert(supplier);
	}

}
