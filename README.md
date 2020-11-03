<h1>Microsserviços Java com Spring Boot e Spring Cloud</h1>

<br />
 - @Author: Vinicius Torres Pascucci:
 <br></br>
 
 <ul>
  <li>Linkedin: https://www.linkedin.com/in/vinicius-pascucci-b06744b5/</li>
  <li>Facebook: https://www.facebook.com/vinicius.pascucci </li>
  <li>Github: https://github.com/viniciuspascucci1993 </li>
 
# Fase 1: Comunicação simples, Feign, Ribbon

### 1.1 Criar projeto hr-worker

### 1.2 Implementar projeto hr-worker

Script SQL
```sql
INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0);
```

application.properties
```
spring.application.name=hr-worker
server.port=8001

# Database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

### 1.3 Criar projeto hr-payroll

application.properties
```
spring.application.name=hr-payroll
server.port=8101
```

### 1.4 Implementar projeto hr-payroll (mock)

### 1.5 RestTemplate

### 1.6 Feign

### 1.7 Ribbon load balancing

Run configuration
```
-Dserver.port=8002
```

Fase 2: Eureka, Hystrix, Zuul
2.1 Criar projeto hr-eureka-server
2.2 Configurar hr-eureka-server
Porta padrão: 8761

Acessar o dashboard no navegador: http://localhost:8761

2.3 Configurar clientes Eureka
Eliminar o Ribbon de hr-payroll:

Dependência Maven
Annotation no programa principal
Configuração em application.properties
Atenção: aguardar um pouco depois de subir os microsserviços

2.4 Random port para hr-worker
server.port=${PORT:0}

eureka.instance.instance-id=${spring.application.name}:${spring.application.instance_id:${random.value}}
Atenção: deletar as configurações múltiplas de execução de hr-worker

2.5 Tolerância a falhas com Hystrix
2.6 Timeout de Hystrix e Ribbon
Atenção: testar antes sem a annotation do Hystrix

hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=60000
ribbon.ConnectTimeout=10000
ribbon.ReadTimeout=20000
2.7 Criar projeto hr-zuul-server
2.8 Configurar hr-zuul-server
Porta padrão: 8765

2.9 Random port para hr-payroll
2.10 Zuul timeout
Mesmo o timeout de Hystrix e Ribbon configurado em um microsserviço, se o Zuul não tiver seu timeout configurado, para ele será um problema de timeout. Então precisamos configurar o timeout no Zuul.

Se o timeout estiver configurado somente em Zuul, o Hystrix vai chamar o método alternativo no microsserviço específico.
