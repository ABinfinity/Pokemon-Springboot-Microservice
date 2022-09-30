# Pokemon-Springboot-Microservice
A springboot microservice where one service is giving information about a pokemon and contacting another one about it's strength and weakness.

Sample input payload for pokedex-service:

```
http://localhost:8082/pokedex/pokemon/
{
    "name": "Bulbasaur",
    "heightInCMS": 62.18,
    "weightInKGS":6.89,
    "category":"Seed",
    "abilities":"Overgrow",
    "type":"Grass",
    "typeNum":100
}

```

Sample input Payload for stratergy-service:
```
http://localhost:8084/pokedex/type
{
        "typeNum" : 100,
        "type" : "grass",
        "strength" : "water",
        "weakness" : "fire/rock"
}
```

Sample output payload:

```
{
  "pokemon": {
    "seq": 1,
    "name": "Bulbasaur",
    "heightInCMS": 62.18,
    "weightInKGS": 6.89,
    "category": "Seed",
    "abilities": "Overgrow",
    "type": "Grass",
    "typeNum": 100
  },
  "strategy": {
    "typeNum": 100,
    "type": "grass",
    "strength": "water",
    "weakness": "fire/rock"
  }
}
```
