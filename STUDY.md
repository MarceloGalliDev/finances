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
- http://localhost:8080/actuator/beans (por exemplo)

### Decorator de Responsabilidades
Diferença entre @Component, @Service, @Repository, e @Controller
Todas essas anotações fazem parte da família de Component Scanning no Spring, o que significa que elas registram automaticamente as classes como beans no Spring Context. A diferença está na semântica e no propósito de uso:

@Component: Uso genérico, marca uma classe como componente gerenciado pelo Spring.
@Service: Semântica específica para classes que contêm a lógica de negócios.
@Repository: Usado para a camada de persistência, além de poder incluir tratamento de exceções relacionadas ao banco de dados.
@Controller: Utilizado na camada de apresentação para controlar e mapear as requisições HTTP (típico em aplicações web).
@RestController: Utilizado na camada de apresentação para controlar e mapear as requisições HTTP (típico em aplicações web) que retorna um JSON geralmente.
@Configuration: Indica como uma fonte the Beans.
@Beans: Indica que o objeto de retorno deve ser considerado como outro Bean qualquer.

@Autowired: usado para injetar dependencias automaticamente

### Interface
- Interface é uma forma de definir um conjunto de métodos que uma classe deve implementar. Em vez de fornecer uma implementação chumbada no código direto, uma interface declara os métodos a serem utilizados através da implements

### Injeção de dependencias
> @Autowired
- Anotação usada para efetuar injeção de dependencias automaticamente quando iniciado o springboot

> @Inject
- Anotação usada pelo JAVA EE e Jakarta EE, para injeção de dependencias.

### Controllers
> @RestController
> @Controller
- Forma de interação do meio externo com nosso servidor
- O SpringBot so reconhece classe se tiver um annotation, caso contrario ele ignora
- O SpringBot so reconhece package se tiver com o caminho do package principal, exemplo com.rootstechnology.spring.finances, ou seja ele so procura packager que tenha essa denotação inicial
- Podemos incluir outros package se usarmos a annotation no arquivo main do projeto

### Ambiguidade
> @Qualifier
> @primary
- Usado para selecionar o primeiro quando há vários beans candidatos a serem injetados
- Permite escolher especificadamente um bean, usamos o @Qualifier

### Repository
> @Repository
- A anotação demarca uma fronteira com as outras camadas, como o @Service e o @Controller
- Os método são tipicamente CRUD

### Distribuição do projeto
> controllers
> services
> repositorys
> models

### Beans Scopes
- Singleton (default)
- Prototype
- Request (web)
- Session (web)
- Application (web)
- WebSocket (web)