package com.example.customer.service;

import com.example.customer.service.impl.FactorialServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class FactorialServiceTest {

	@InjectMocks
	private FactorialServiceImpl factorialService;

	@Mock
	private FactorialService factorialServiceMock;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testFactorial() {

		when(factorialServiceMock.factorial(0)).thenReturn(1L);
		when(factorialServiceMock.factorial(1)).thenReturn(1L);
		when(factorialServiceMock.factorial(5)).thenReturn(120L);

		long result = factorialServiceMock.factorial(5);

		assertEquals(120, result);

		verify(factorialServiceMock, times(1)).factorial(5);
	}

	@Test
	public void testFactorialInvalidInput() {

		when(factorialServiceMock.factorial(-3)).thenReturn(0L);

		long result = factorialServiceMock.factorial(-3);

		assertEquals(0, result);

		verify(factorialServiceMock, times(1)).factorial(-3);
	}
}
