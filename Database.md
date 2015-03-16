### Ceci est une note pour les développeurs. ###
Voici une description rapide de la manière dont les objets 3D et les éléments sont stockés dans la base de données ainsi que la relation qui relie ces différents éléments entre eux.

Chaque élément stocké dans la base de données doit être de type **_object_** et il doit avoir les deux attributs **_obligatoires_** suivants:
  * **name** (String) : le nom **unique** de l'élément simplement **SANS PATTERN `_`obj, `_`type ou `_`attr**. Ce nom sert de clé (ou index).
  * **value** (Object) : un objet contenant les différents attributs de cet élément.


# Les modèles 3D #
Le nom des modèles 3D importés par l'utilisateur est converti pour suivre le pattern suivant:
  * nom**`_`obj** (String)

Ils ont comme attributs:
  * **url** (String) : l'url du fichier 3D physique,
  * **type** (String) : le nom d'un type définit auquel il est rattaché
  * **uid** ((number) : un identifiant unique (un timestamp généralement )

**IMPORTANT:** Les modèles sont stockés dans la base de données avec la fonction **M3D.DB.setObject(o)**. Par exemple:
```
M3D.DB.setObject({
  'name' : 'duck',
  'value' : {
     'url': 'path/to/collada.dae',
     'type': 'Ducks',
     'uid':'1296435932125'
  }
});

// Produit le résultat JSON suivant:
{name:"duck_obj", value:{"url":"assets/dae/free/duck.dae","type":"Ducks", "uid":"1296435932125"}}
```

# Les types #
Les types d'entités correspondent aux nouveaux types crées par l'utilisateur. Le nom de ces types est converti pour suivre le pattern suivant:
  * nom**`_`type** (String)

Ils ont comme attributs:
  * inheritance (Array of String) : un tableau contenant les types parents dont cet objet hérite les attributs

**IMPORTANT:** Les types sont stockés dans la base de données avec la fonction **M3D.DB.setType(o)**. Par exemple:
```
M3D.DB.setType({
  'name': "Ducks",
  'value':{
    'inheritance': ["Object"]
   }
});

// Produit le résultat JSON suivant:
{name:"Ducks_type", value:{"inheritance":["Object","Vehicle"]}}
```

# Les attributs #
Chaque nouveau type ajouté **peut** (c'est optionnel) avoir des attributs. Le nom de ces attributs **DOIT ETRE LE MEME** que celui de son type afin que la relation puisse se faire. Le nom est converti pour suivre le pattern suivant:
  * nom**`_`type** (String)

Ils ont comme attributs:
  * **name** (String) : le nom de l'attribut
  * **type** (String) : le type de l'attribut. Par exemple: string, boolean, number ...
  * **value** (String) : la valeur de l'attribut


Par exemple:
```
M3D.DB.setAttributes({
  'name': "Ducks",
  'value': [{'name': "speed", 'type': "number", 'value': "30"},
            {'name': "isVisible", 'type': "boolean", 'value': "true"}
           ]
});

// Produit le résultat JSON suivant:
{name:"Ducks_attr", value:[{"name":"speed","type":"number","value":"30"},{"name":"isVisible","type":"boolean","value":"true"}]}
```