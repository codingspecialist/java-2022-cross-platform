package product;

import java.sql.Connection;
import java.util.ArrayList;

import product.db.DBConnection;
import product.domain.customer.CustomerDao;
import product.domain.orders.OrdersDao;
import product.domain.product.ProductDao;
import product.dto.OrderRespDto;
import product.service.OrderService;
import product.service.OrderServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		Connection conn = DBConnection.connection();
		
		CustomerDao customerDao = new CustomerDao(conn);
		ProductDao productDao = new ProductDao(conn);
		OrdersDao orderDao = new OrdersDao(conn);
		
		OrderService orderService = new OrderServiceImpl(conn, productDao, orderDao);
		
		// given
		int customerId = 1;
		
		ArrayList<OrderRespDto> orderRespDtoList = 
				orderService.고객별주문목록보기(customerId);
		
		for (int i = 0; i < orderRespDtoList.size(); i++) {
			System.out.println(orderRespDtoList.get(0).getId());
			System.out.println(orderRespDtoList.get(0).getUsername());
			System.out.println(orderRespDtoList.get(0).getName());
			System.out.println(orderRespDtoList.get(0).getPrice());
		}
	}

}






