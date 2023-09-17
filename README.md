# testando-api-com-rest-assured
Código do curso "Testando API Rest com REST-assured". Link: https://www.udemy.com/course/testando-api-rest-com-rest-assured/  

## Endpoints da API

http://restapi.wcaquino.me/ola  
Response:  
```
Ola Mundo!
```
http://restapi.wcaquino.me/users/1  
Response:  
```JSON
{
  "id": 1,
  "name": "João da Silva",
  "age": 30,
  "salary": 1234.5678
}
```

http://restapi.wcaquino.me/users/2  
Response:
```JSON
{
  "id": 2,
  "name": "Maria Joaquina",
  "endereco": {
    "rua": "Rua dos bobos",
    "numero": 0
  },
  "age": 25,
  "salary": 2500
}
```

https://restapi.wcaquino.me/users/3  
Response:  
```JSON
{
  "id": 3,
  "name": "Ana Júlia",
  "age": 20,
  "filhos": [
    {
      "name": "Zezinho"
    },
    {
      "name": "Luizinho"
    }
  ]
}
```

http://restapi.wcaquino.me/users/4  
Response:  
```JSON
{
  "error": "Usuário inexistente"
}
```
