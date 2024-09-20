### Controllers
- Forma de interação do meio externo com nosso servidor
- O SpringBot so reconhece classe se tiver um annotation, caso contrario ele ignora
- O SpringBot so reconhece package se tiver com o caminho do package principal, exemplo com.rootstechnology.spring.finances, ou seja ele so procura packager que tenha essa denotação inicial
- Podemos incluir outros package se usarmos a annotation no arquivo main do projeto
  

### Security
- vamos adicionar a spring security ao arquivo pom.xml
- necessario fazer login, a senha vai estar no terminal
  - login: user
  - password: {terminal}
- para criar um novo usuario, incluimos nas application.properties
  - spring.security.user.name=marcelogalli
  - spring.security.user.password=m1432654425
  - spring.security.user.roles=admin,devops

### Actuator
- usado para demonstrar a saude do projeto
- gera 3 links de acessos, que podem ser usados pelo kubernets

### Decorator de Responsabilidades
Diferença entre @Component, @Service, @Repository, e @Controller
Todas essas anotações fazem parte da família de Component Scanning no Spring, o que significa que elas registram automaticamente as classes como beans no Spring Context. A diferença está na semântica e no propósito de uso:

@Component: Uso genérico, marca uma classe como componente gerenciado pelo Spring.
@Service: Semântica específica para classes que contêm a lógica de negócios.
@Repository: Usado para a camada de persistência, além de poder incluir tratamento de exceções relacionadas ao banco de dados.
@Controller: Utilizado na camada de apresentação para controlar e mapear as requisições HTTP (típico em aplicações web).