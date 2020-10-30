<h1>Microsserviços Java com Spring Boot e Spring Cloud</h1>

<br />
 - @Author: Vinicius Torres Pascucci:
 <br></br>
 
 <ul>
  <li>Linkedin: https://www.linkedin.com/in/vinicius-pascucci-b06744b5/</li>
  <li>Facebook: https://www.facebook.com/vinicius.pascucci </li>
  <li>Github: https://github.com/viniciuspascucci1993 </li>
 
<br />

<h1>Fase 1: Comunicação simples, Feign, Ribbon</h1>

<br />

<ol>
  <li>Criar projeto hr-worker</li>
  <li>Implementar projeto hr-worker</li>
</ol>

<br />

Script SQL

<ul>
 <li>INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0);</li>
 <li>INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0);</li>
 <li>INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0);</li>
</ul>

<br></br>

No Arquivo application.properties coloque o seguinte:

<ul>
 <li>spring.application.name=hr-worker</li>
 <li>server.port=8001</li>
 <br</br>
 # Database configuration
 <li>spring.datasource.url=jdbc:h2:mem:testdb</li> 
 <li>spring.datasource.username=sa</li>
 <li>spring.datasource.password=</li>
 <br></br>
 # SCRIPTS SQL
 <li>spring.h2.console.enabled=true</li>
 <br></br>
 # URL Base
 <li>spring.h2.console.path=/h2-console</li>
