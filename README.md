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

http://restapi.wcaquino.me/users  
Response:  
```JSON
[
  {
    "id": 1,
    "name": "João da Silva",
    "age": 30,
    "salary": 1234.5678
  },
  {
    "id": 2,
    "name": "Maria Joaquina",
    "endereco": {
      "rua": "Rua dos bobos",
      "numero": 0
    },
    "age": 25,
    "salary": 2500
  },
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
]
```
POST http://restapi.wcaquino.me/users  
Response:
```JSON
{
    "name": "Jose",
    "age": 50,
    "id": 1699973036876
}
```
https://restapi.wcaquino.me/usersXML  
Response:  
```xml
<users>
  <user id="1">
    <name>João da Silva</name>
    <age>30</age>
    <salary>1234.5678</salary>
  </user>
  <user id="2">
    <name>Maria Joaquina</name>
    <age>25</age>
    <salary>2500</salary>
    <endereco>
      <rua>Rua dos bobos</rua>
      <numero>0</numero>
    </endereco>
  </user>
  <user id="3">
    <name>Ana Julia</name>
    <age>20</age>
    <filhos>
      <name>Zezinho</name>
      <name>Luizinho</name>
    </filhos>
  </user>
</users>
```
https://restapi.wcaquino.me/usersXML/3  
Response:  
```xml
<user id="3">
  <name>Ana Julia</name>
  <age>20</age>
  <filhos>
    <name>Zezinho</name>
    <name>Luizinho</name>
  </filhos>
</user>
```
https://restapi.wcaquino.me/v2/users  
HTML content (not JSON or XML)  

https://restapi.wcaquino.me/v2/users?format=json  
Response:  
```JSON
[
  {
    "id": 1,
    "name": "João da Silva",
    "age": 30,
    "salary": 1234.5678
  },
  {
    "id": 2,
    "name": "Maria Joaquina",
    "endereco": {
      "rua": "Rua dos bobos",
      "numero": 0
    },
    "age": 25,
    "salary": 2500
  },
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
]
```

https://restapi.wcaquino.me/v2/users?format=xml  
Response:  
```xml
<users>
  <user id="1">
    <name>João da Silva</name>
    <age>30</age>
    <salary>1234.5678</salary>
  </user>
  <user id="2">
    <name>Maria Joaquina</name>
    <age>25</age>
    <salary>2500</salary>
    <endereco>
      <rua>Rua dos bobos</rua>
      <numero>0</numero>
    </endereco>
  </user>
  <user id="3">
    <name>Ana Julia</name>
    <age>20</age>
    <filhos>
      <name>Zezinho</name>
      <name>Luizinho</name>
    </filhos>
  </user>
</users>
```
