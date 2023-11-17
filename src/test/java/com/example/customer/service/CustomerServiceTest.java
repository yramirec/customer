package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.service.impl.CustomerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class CustomerServiceTest {

	@InjectMocks
	private CustomerServiceImpl customerService;

	@Mock
	private CustomerServiceImpl customerServiceMock;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testGetCustomer() {

		when(customerServiceMock.getCustomer("C", "23445322")).thenReturn(
				new Customer("John", "Doe", "Doe", "John", "987654321", "Street 200", "Lima")
		);

		Customer result = customerServiceMock.getCustomer("C", "23445322");

		assertEquals("John", result.getPrimerNombre());
		assertEquals("Doe", result.getPrimerApellido());
		assertEquals("Doe", result.getSegundoNombre());
		assertEquals("John", result.getSegundoApellido());
		assertEquals("987654321", result.getTelefono());
		assertEquals("Street 200", result.getDireccion());
		assertEquals("Lima", result.getCiudadResidencia());

		verify(customerServiceMock, times(1)).getCustomer("C", "23445322");
	}

	@Test
	public void testGetCustomerInvalidInput() {

		when(customerServiceMock.getCustomer("X", "999999999")).thenReturn(null);

		Customer result = customerServiceMock.getCustomer("X", "999999999");

		assertNull(result);

		verify(customerServiceMock, times(1)).getCustomer("X", "999999999");
	}

}
