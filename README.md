# customer
API REST Servicio de Customer

Se declara los curl para la prueba a continuacion:

## Realizar una solicitud GET - CustomerController

### OBTENER CUSTOMER.

```bash
curl --location 'http://localhost:8090/api/customer?type=C&number=23445322' \
--header 'Content-Type: application/json'
```
## Realizar una solicitud GET - HelloController

### OBTENER HOLA.
```bash
curl --location 'http://localhost:8090/api/hola' \
--header 'Content-Type: application/json'
```

## Realizar una solicitud GET - FactorialController

### OBTENER FACORIAL.
```bash
curl --location 'http://localhost:8090/api/factorial/5' \
--header 'Content-Type: application/json'
```
