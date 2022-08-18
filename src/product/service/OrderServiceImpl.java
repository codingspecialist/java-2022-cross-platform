package product.service;

import java.sql.Connection;
import java.util.ArrayList;

import product.domain.orders.OrdersDao;
import product.domain.product.ProductDao;
import product.dto.OrderRespDto;

public class OrderServiceImpl implements OrderService{

	private Connection connection;
	private ProductDao productDao;
	private OrdersDao orderDao;
	
	public OrderServiceImpl(Connection connection, ProductDao productDao, OrdersDao orderDao) {
		this.connection = connection;
		this.productDao = productDao;
		this.orderDao = orderDao;
	}

	@Override
	public void 주문하기(int customerId, int productId) {
		// 1. 재고확인 ( 재고가 0보다 큰가? product findById)
		// 2. 주문하기 ( order insert)
		// 3. 재고 -1 하기 ( product updateByIdToQty)
	}

	@Override
	public void 주문취소하기(int id) {
		// 1. order deleteById
		
		// 2. product qty + 1 하기
	}

	@Override
	public ArrayList<OrderRespDto> 고객별주문목록보기(int customerId) {	
		return orderDao.findByIdToOrderList(customerId);
	}

}
