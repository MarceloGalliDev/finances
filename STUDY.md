### Controllers
- Forma de interação do meio externo com nosso servidor
- O SpringBot so reconhece classe se tiver um annotation, caso contrario ele ignora
- O SpringBot so reconhece package se tiver com o caminho do package principal, exemplo com.rootstechnology.spring.finances, ou seja ele so procura packager que tenha essa denotação inicial
- Podemos incluir outros package se usarmos a annotation no arquivo main do projeto
  

### Security
- vamos adicionar a spring security ao arquivo pom.xml
- necessario fazer login, a senha esta no terminal
  - login: user
  - password: {terminal}
- para criar um novo usuario, incluimos nas application.properties