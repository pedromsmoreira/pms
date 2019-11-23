## Get Pet By Id

Get pet registered in the country code provided in the headers field.

**URL**: `/v1/pets/{pet-id}`
**Method**: `GET`

**Headers**:
```
X-CountryIsoCode: "PT"
```

### Success Response

**Code**: `200 OK`

**Content Examples:**

For a given `X-CountryIsoCode` header with value `PT` the database will answer with a list of `Pet` resources.


```json
{
    "id": "ABC-123",
    "countryIsoCode": "PT",
    "name": "dummy",
    "birthDate": {
        "year": "2019",
        "month": "11",
        "day": "1"
    },
    "deathDate": "None",
    "gender": "Male",
    "color": "brown",
    "race": "Undefined",
    "healthReportsUrl": "https://localhost:8080/v1/pets/ABC-123/healthReports",
    "healthStatus": "healthy",
    "ownerName": "dummy",
    "ownerInfoUrl": "https://localhost:8080/v1/owners/dummyid",
}
```


## Error Responses

**Condition** : If provided Country ISO Code is invalid or does not exist.

**Code**: `400 BAD REQUEST`

**Content Examples:**

For a non existent Country ISO Code, the endpoint will always answer with an error response.

```json
{
    "error": {
        "code": "1",
        "message": "Invalid Country ISO Code",        
    }
}
```

**Condition** : If provided pet id is invalid or does not exist.

**Code**: `404 NOT FOUND`

**Content Examples:**

For a non existent Pet id, the endpoint will always answer with an error response.

```json
{
    "error": {
        "code": "2",
        "message": "Pet not found.",        
    }
}
```