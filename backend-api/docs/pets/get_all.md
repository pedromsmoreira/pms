# Get All Pets

Get all pets registered in the country code provided in the headers field.

**URL**: `/v1/pets`
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
    "entries":
    [
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
        },
        {
            "id": "ABC-1234",
            "countryIsoCode": "PT",
            "name": "dummy2",
            "birthDate": {
                "year": "2019",
                "month": "11"                
            },
            "deathDate": "None",
            "gender": "Female",
            "color": "black",
            "race": "Labrador",
            "healthReportsUrl": "https://localhost:8080/v1/pets/ABC-1234/healthReports",
            "healthStatus": "healthy",
            "ownerName": "dummy2",
            "ownerInfoUrl": "https://localhost:8080/v1/owners/dummyid",
        }
    ],
    "page": "1",
    "pageSize": "2",
    "totalEntries": "4"
}
```


## Error Response

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